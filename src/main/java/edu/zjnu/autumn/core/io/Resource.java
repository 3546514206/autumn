package edu.zjnu.autumn.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description: 资源解析模块顶层接口
 *
 * @author: 杨海波
 * @date: 2022-01-10
 **/
public interface Resource {

    InputStream getInputSteam() throws IOException;
}
