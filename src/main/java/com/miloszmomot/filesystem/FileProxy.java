package com.miloszmomot.filesystem;

public class FileProxy implements DisplayableTree, DisplayableLs {
    private FileComponent fileComponent;

    public FileProxy(FileComponent fileComponent) {
        this.fileComponent = fileComponent;
    }

    public void tree(int indent) {
        fileComponent.tree(indent);
    }

    public void ls() {
        fileComponent.ls();
    }
}
