package com.miloszmomot.filesystem;

public class FileProxy implements DisplayFileInfo {
    private FileComponent fileComponent;
    public FileProxy(FileComponent fileComponent){
        this.fileComponent=fileComponent;
    }

    public void displayFileInfo() {
        fileComponent.displayFileInfo();
    }
}
