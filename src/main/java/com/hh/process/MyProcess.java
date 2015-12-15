package com.hh.process;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Administrator on 15-12-15.
 */
public abstract class MyProcess {
    abstract public OutputStream getOutputStream();   //获取进程的输出流

    abstract public InputStream getInputStream();    //获取进程的输入流

    abstract public InputStream getErrorStream();   //获取进程的错误流

    abstract public int waitFor() throws InterruptedException;   //让进程等待

    abstract public int exitValue();   //获取进程的退出标志

    abstract public void destroy();   //摧毁进程
}
