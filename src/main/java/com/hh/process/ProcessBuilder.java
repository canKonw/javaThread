package com.hh.process;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 15-12-15.
 */
public final class ProcessBuilder {
    private List<String> command;
    private File directory;
    private Map<String,String> environment;
    private boolean redirectErrorStream;

    public ProcessBuilder(List<String> command) {
        if (command == null)
            throw new NullPointerException();
        this.command = command;
    }

    public ProcessBuilder(String... command) {
        this.command = new ArrayList<String>(command.length);
        for (String arg : command)
            this.command.add(arg);
    }
}
