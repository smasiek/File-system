package com.miloszmomot.filesystem;

public class File extends FileComponent implements DisplayableTree,DisplayableLs {

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

    public void displayTreeLine(int wciecie){
       // for(int i=0;i<wciecie;i++) System.out.print("\t");
        System.out.printf("--"+fileName+"\n");
    }
    public void tree(){
        System.out.printf("--"+fileName+"\n");
    }

    public void more(){
        System.out.println("Zawartosc pliku "+fileName +": "+fileText);
    }

    public void ls() {
        System.out.printf(fileName+", ");
    }
}
