package com.miloszmomot.filesystem;

public class FileComposite {
    private FileComponent fileList;

    public FileComposite(FileComponent fileComponent) {
        fileList = fileComponent;
    }

    public void tree() {
        fileList.tree();
    }

    public void ls() {
        fileList.ls();
    }

}
