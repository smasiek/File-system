package com.miloszmomot.filesystem;

public class Main {
    public static void main(String[] args) {
        //Przygotowanie plików i folderow
        FileComponent folder1= new FileCatalog("Folder 1");
        FileComponent folder2= new FileCatalog("Folder 2");
        FileComponent folder3= new FileCatalog("Folder 3");
        FileComponent folder4= new FileCatalog("Folder 4");
        FileComponent folder5= new FileCatalog("Folder 5");
        FileComponent wszystkiePliki=new FileCatalog("Wszystko");

        FileComponent plik1= new File("Plik nr 1","zawartosc 1");
        FileComponent plik2= new File("Plik nr 2","zawartosc 2");
        FileComponent plik3= new File("Plik nr 3","zawartosc 3");
        FileComponent plik4= new File("Plik nr 4","zawartosc 4");
        FileComponent plik5= new File("Plik nr 5","zawartosc 5");
        FileComponent plik6= new File("Plik nr 6","zawartosc 6");
        FileComponent plik7= new File("Plik nr 7","zawartosc 7");



        wszystkiePliki.add(folder1);

        folder1.add(plik1);
        folder1.add(plik2);

        folder1.add(folder2);

        folder2.add(plik3);
        folder1.add(folder3);
        folder3.add(plik4);
        folder3.add(plik5);

        folder3.add(folder4);
        folder4.add(plik6);

        wszystkiePliki.add(folder5);
        folder5.add(plik7);


        FileComposite systemPlikow= new FileComposite(wszystkiePliki);

        systemPlikow.tree();
        systemPlikow.ls();
        System.out.printf("\n");
        folder3.ls();
        System.out.printf("\n");
        plik3.more();
    }
}
