package com.miloszmomot.filesystem;

public abstract class FileComponent{

    private String fileComponentName;

    public  String getName(){ throw new UnsupportedOperationException(); }

    public  void tree(){ throw new UnsupportedOperationException();}
    public  void displayTreeLine(int wciecie){ throw new UnsupportedOperationException(); }

    public void add(FileComponent newFileComponent){ throw new UnsupportedOperationException(); }
    public void remove(FileComponent newFileComponent){ throw new UnsupportedOperationException(); }

    public FileComponent getComponent(int componentIndex){ throw new UnsupportedOperationException(); }


    public void ls(){throw new UnsupportedOperationException();}

    public void more(){throw new UnsupportedOperationException();}
}
