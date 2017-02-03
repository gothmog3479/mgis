package ru.gothmog.isogd.entity.common;

import ru.gothmog.isogd.model.RegistryItem;

public interface Keyword extends RegistryItem {

    String getWord();

    void setWord(String word);
}
