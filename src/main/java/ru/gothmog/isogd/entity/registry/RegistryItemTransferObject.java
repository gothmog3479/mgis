package ru.gothmog.isogd.entity.registry;

import lombok.Getter;
import lombok.Setter;
import ru.gothmog.isogd.core.utils.EntityUtils;
import ru.gothmog.isogd.entity.IsogdEntity;
import ru.gothmog.isogd.entity.IsogdTransferObject;

@Getter
@Setter
public abstract class RegistryItemTransferObject<T extends RegistryItem> extends IsogdTransferObject<T> {

    private String title;

    public RegistryItemTransferObject(IsogdEntity entity) {
        super(entity);
    }

    @Override
    public boolean equals(Object obj) {
        return EntityUtils.defaultEquals(this, obj);
    }
}
