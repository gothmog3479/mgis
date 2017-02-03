package ru.gothmog.isogd.entity.registry;

import java.util.List;

public interface RegistryTreeItem<T extends RegistryTreeItem<T>> extends RegistryItem {

    T getParent();

    void setParent(T parent);

    List<T> getChildren();
}
