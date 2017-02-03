package ru.gothmog.isogd.entity;

import ru.gothmog.isogd.entity.common.File;

import java.util.List;

/**
 * Интерфейс для всех сущностей, к которым могут быть привязаны файлы
 *
 * @author d.grushetskiy
 */
public interface HasFiles {

    public static final String FILE_ALRADY_EXSISTS_MSG = "такой файл уже присутствует в списке";

    List<File> getFiles();

    public void setFiles(List<File> files);

    public void addFile(File file) throws Exception;

    public void removeFile(File file);

    /**
     * Относительный путь до файлов от корня каталога с файлами
     *
     * @return
     */
    public String getRelativeFolderPath();

}
