package ru.gothmog.isogd.entity.common;

import org.hibernate.annotations.Type;
import ru.gothmog.isogd.model.RegistryItem;

import javax.persistence.*;

@Entity
@Table(name = "file_content", indexes = {@Index(name = "fki_file_object_content", columnList = "id, content")})
public class FileContent implements RegistryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    private byte[] content;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getContent() {
        return this.content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public String getTitle() {
        return null;
    }
}
