package ru.gothmog.isogd.entity.settings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Index;
import ru.gothmog.isogd.entity.registry.RegistryItem;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "_settings", schema = "public", catalog = "mgis")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class IsogdSetting implements RegistryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    @Index(name = "idx_settings_key")
    private Setting key;

    @Column
    private String value;


    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Transient
    public String getDescription() {
        return key.getDescription();
    }

    @Transient
    public void setDescription(String s) {

    }

    @Override
    public String getTitle() {
        return getKey() + "=" + getValue();
    }
}
