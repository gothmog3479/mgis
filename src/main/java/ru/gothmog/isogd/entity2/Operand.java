package ru.gothmog.isogd.entity2;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Operand {
    private Long id;
    private String title;
    private Double value;
    private String operator;
    private String property;
    private Long operationId;
    private Long typeId;
    private String dictType;
    private Long propertyId;
    private String code;

    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "value", nullable = true, precision = 0)
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Basic
    @Column(name = "operator", nullable = true, length = 255)
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Basic
    @Column(name = "property", nullable = true, length = 255)
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Basic
    @Column(name = "operation_id", nullable = true)
    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

    @Basic
    @Column(name = "type_id", nullable = true)
    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "dict_type", nullable = false, length = 31)
    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    @Basic
    @Column(name = "property_id", nullable = true)
    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    @Basic
    @Column(name = "code", nullable = true, length = 255)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Operand operand = (Operand) o;

        if (id != null ? !id.equals(operand.id) : operand.id != null) return false;
        if (title != null ? !title.equals(operand.title) : operand.title != null) return false;
        if (value != null ? !value.equals(operand.value) : operand.value != null) return false;
        if (operator != null ? !operator.equals(operand.operator) : operand.operator != null) return false;
        if (property != null ? !property.equals(operand.property) : operand.property != null) return false;
        if (operationId != null ? !operationId.equals(operand.operationId) : operand.operationId != null) return false;
        if (typeId != null ? !typeId.equals(operand.typeId) : operand.typeId != null) return false;
        if (dictType != null ? !dictType.equals(operand.dictType) : operand.dictType != null) return false;
        if (propertyId != null ? !propertyId.equals(operand.propertyId) : operand.propertyId != null) return false;
        if (code != null ? !code.equals(operand.code) : operand.code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (property != null ? property.hashCode() : 0);
        result = 31 * result + (operationId != null ? operationId.hashCode() : 0);
        result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
        result = 31 * result + (dictType != null ? dictType.hashCode() : 0);
        result = 31 * result + (propertyId != null ? propertyId.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }
}
