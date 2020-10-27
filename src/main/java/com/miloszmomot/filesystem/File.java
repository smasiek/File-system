package com.miloszmomot.filesystem;

public class File extends FileComponent implements DisplayFileInfo {

    String fileName;
    String fileText;

    public File(String fileName,String fileText){
        this.fileName=fileName;
        this.fileText=fileText;
    }

    public String getFileText() {
        return fileText;
    }

    public String getFileName(){
        return fileName;
    }

    public void displayFileInfo(){
        System.out.println("Zawartosc pliku "+fileName +": "+fileText);
    }

}
