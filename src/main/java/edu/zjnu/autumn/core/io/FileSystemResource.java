package edu.zjnu.autumn.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @description: 从文件系统加载
 * @author: 杨海波
 * @date: 2022-01-10
 **/
public class FileSystemResource implements Resource {

    private final String path;

    private final File file;

    public FileSystemResource(String path) {
        this(path, null);
    }

    public String getPath() {
        return path;
    }

    public FileSystemResource(String path, File file) {
        assert path != null;
        this.path = path;
        this.file = file;
    }

    @Override
    public InputStream getInputSteam() throws IOException {
        return new FileInputStream(path);
    }
}
