package edu.zjnu.autumn.core.io;

import sun.jvm.hotspot.ui.tree.FieldTreeNodeAdapter;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @description: UrlResource
 * @author: 杨海波
 * @date: 2022-01-10
 **/
public class UrlResource implements Resource {

    private final URL url;

    public UrlResource(URL url) {
        assert null != url;
        this.url = url;
    }

    @Override
    public InputStream getInputSteam() throws IOException {
        URLConnection connection = this.url.openConnection();

        try {
            return connection.getInputStream();
        } catch (IOException ex) {
            if (connection instanceof HttpURLConnection) {
                ((HttpURLConnection) connection).disconnect();
            }
            throw ex;
        }

    }
}
