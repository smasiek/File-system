package com.miloszmomot.filesystem;

public class Main {
    public static void main(String[] args) {
        FileComponent folderGlowny= new FileCatalog("Folder 1");
        FileComponent folder2= new FileCatalog("Folder 2");
        FileComponent folder3= new FileCatalog("Folder 3");
        FileComponent folder4= new FileCatalog("Folder 4");
        FileComponent wszystkiePliki=new FileCatalog("Wszystko");
        wszystkiePliki.add(folderGlowny);

        folderGlowny.add(new File("Plik nr 1","zawartosc 1"));
        folderGlowny.add(new File("Plik nr 2","zawartosc 2"));

        folderGlowny.add(folder2);
        folder2.add(new File("Plik nr 3","zawartosc 3"));
        folderGlowny.add(folder3);
        folder3.add(new File("Plik nr 4","zawartosc 4"));
        folder3.add(new File("Plik nr 5","zawartosc 5"));

        folder3.add(folder4);
        folder4.add(new File("Plik nr 6","zawartosc 6"));

        FileComposite systemPlikow= new FileComposite(wszystkiePliki);

        systemPlikow.getFileList();
    }
}
