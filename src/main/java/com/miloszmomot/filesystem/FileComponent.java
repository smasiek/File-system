package com.miloszmomot.filesystem;

public abstract class FileComponent{

    private String fileComponentName;

    public  String getName(){
        throw new UnsupportedOperationException();
    }
    public  void displayFileInfo(){
        throw new UnsupportedOperationException();
    }
    public void add(FileComponent newFileComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(FileComponent newFileComponent){
        throw new UnsupportedOperationException();
    }

    public FileComponent getComponent(int componentIndex){
        throw new UnsupportedOperationException();
    }


}
