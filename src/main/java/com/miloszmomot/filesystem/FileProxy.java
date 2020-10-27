package com.miloszmomot.filesystem;

public class FileProxy implements DisplayableTree, DisplayableLs, DisplayableMore {
    private FileComponent fileComponent;
    public FileProxy(FileComponent fileComponent){
        this.fileComponent=fileComponent;
    }

    public void displayTreeLine(int wciecie) {
        fileComponent.displayTreeLine(wciecie);
    }

    public void ls() {
        fileComponent.ls();
    }
    public void more(){
        fileComponent.more();
    }
}
