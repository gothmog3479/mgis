package ru.gothmog.isogd.core.gis;

/**
 * Помечает объекты, для которых возможен переход на карту
 *
 * @author d.grushetskiy
 *
 */
public interface GisObject<T extends GisTransferObject> {

    public static final String CADASTR_TYPE = "Cadastr";
    public static final String ADDRESS_TYPE = "Address";

    /**
     * @return строка идентифицирующая объекта на карте (это может быть
     *         кадастровый номер, адрес или еще что-то)
     */
    T getGisIdentifier();

    String getGisType();
}
