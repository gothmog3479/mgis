package ru.gothmog.isogd.entity.common;

import org.hibernate.annotations.Index;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;
import ru.gothmog.isogd.core.audit.AuditAnnotation;
import ru.gothmog.isogd.entity.registry.RegistryItem;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "file_object")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Audited
@AuditAnnotation(visibleInHistory = false)
public class File implements RegistryItem{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "original_name", nullable = false)
    private String originalName;

    @Column(length = 1024)
    private String description;

    @Column(name = "mime_type", length = 128)
    private String mimeType;

    @Column
    private Integer size;

    @Column(name = "storage_format")
    private String storageFormat;

    @OneToOne(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "content_id", foreignKey = @ForeignKey(name = "fki_file_object_content"))
    @NotAudited
    @Index(name = "fki_file_object_content")
    private FileContent fileContent;

    @Column(name = "create_date")
    private Date createDate;

    ;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginalName() {
        return this.originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getStorageFormat() {
        return this.storageFormat;
    }

    public void setStorageFormat(String storageFormat) {
        this.storageFormat = storageFormat;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public boolean equals(Object obj) {
        File f = (File) obj;
        boolean result = super.equals(f);
        if (!result) {
            result = f.getId() != null && this.getId() != null && f.getId().equals(this.getId());
        }

        return result;
    }

    public FileContent getFileContent() {
        return this.fileContent;
    }

    public void setFileContent(FileContent fileContent) {
        this.fileContent = fileContent;
    }

    public void setSizeByContent() {
        if (this.getFileContent() != null && this.getFileContent().getContent() != null) {
            this.setSize(Integer.valueOf(this.getFileContent().getContent().length));
        }

    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String getTitle() {
        return null;
    }
}
