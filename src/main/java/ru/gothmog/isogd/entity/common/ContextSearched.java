package ru.gothmog.isogd.entity.common;

/**
 * Интерфейс с параметрами поиска
 */
public interface ContextSearched {
    void refreshContextSearchField();//обновление контекста поля поиска

    String getContextSearchField();

    void setContextSearchField(String searchField);
}
