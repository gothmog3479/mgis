package ru.gothmog.isogd.entity.settings;


import lombok.Getter;

/**
 * Ключи системных настроек должны быть записаны в этот enum. Так задается
 * однозначность ключей для IsogdSetting, чтобы не использовать строковые
 * константы
 *
 * @author d.grushetskiy
 */
@Getter
public enum Setting {

    FILES_UPLOAD_DIR("upload.dir", String.class, "Каталог загрузки файлов"),
    // true, то тип документа можно выбрать прямо на карточке,
    // иначе только на форме "Дополнительные параметры"
    DOCUMENT_TYPE_SELECT(
            "document.type_select",
            Boolean.class,
            "Возможность выбора типа документа из справочника на карточке документа."
                    + "Если true, то тип документа можно выбрать прямо на карточке,"
                    + " иначе только на форме 'Дополнительные параметры'"),

    REPORT_PERMITBUILDING_JOB("report.permitbuilding.job", String.class,
            "Должность уполномоченного сотрудника органа,"
                    + " осуществляющего выдачу разрешения на строительство"),

    GIS_BUILTIN(
            "gis.builtin",
            Boolean.class,
            "Тип используемой ГИС-системы для переходов с объектов (адреса, КН, документы)."
                    + " True - используется встроенная карта, false - внешняя ГИС-система(ArcGIS,MapInfo)"),

    GIS_BUILTIN_URL("gis.builtin.url", String.class, "Путь до внутренней карты"),

    GIS_BUILTIN_REDIRECT_URL("gis.builtin.redirect.url", String.class,
            "Путь до внутренней карты (внутри приложения)"),

    GIS_URL("gis.url", String.class, "Путь до плагина внешней карты на локальном компьютере"),

    SECURITY_TYPE("security.type", Boolean.class,
            "Тип системы безопасности (true-сложная, false-простая)"),

    RF_SUBJECT("report.rf_subject_name", String.class,
            "Наименование субъекта Российской федерации"),

    MO_SUBJECT("report.mo_subject_name", String.class,
            "Наименование муниципального образования или городского округа"),

    GEO_SERVICE_URL("report.geo.service_url", String.class,
            "Адрес сервера, на котором развернут сервис для формирования графических отчетов (например http://192.168.0.1:8888/repservice)");

    private Class<?> valueClass;
    private String description;
    private String resourceKey;

    Setting(String resourceKey, Class<?> valueClass, String description) {
        this.resourceKey = resourceKey;
        this.valueClass = valueClass;
        this.description = description;
    }


}
