package com.miloszmomot.filesystem;

public class FileComposite {
    FileComponent fileList;

    public FileComposite(FileComponent fileComponent){
        fileList=fileComponent;
    }

    public void getFileList(){
        fileList.displayFileInfo();
    }
}
