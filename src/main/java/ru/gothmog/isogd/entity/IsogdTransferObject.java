package ru.gothmog.isogd.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IsogdTransferObject<T extends IsogdEntity> {

    private Long id;

    public IsogdTransferObject(IsogdEntity entity) {
        if (entity == null)
            return;
        setId(entity.getId());
    }

    public IsogdTransferObject(Long entityId) {
        if (entityId == null)
            return;
        setId(entityId);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof IsogdTransferObject))
            return false;

        IsogdTransferObject<?> tObj = (IsogdTransferObject<?>) obj;

        return super.equals(obj)
                || (this.getClass().getName().equals(obj.getClass().getName()) && this
                .getId().equals(tObj.getId()));
    }

    public Boolean getIsVirtual() {
        return getId() == null;
    }

    public Boolean getIsNotVirtual() {
        return !getIsVirtual();
    }
}
