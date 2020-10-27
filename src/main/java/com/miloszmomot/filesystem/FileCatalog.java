package com.miloszmomot.filesystem;

import java.util.ArrayList;
import java.util.Iterator;

public class FileCatalog extends FileComponent implements DisplayFileInfo {

    ArrayList<FileComponent> fileComponents= new ArrayList<FileComponent>();

    String catalogName;
    String catalogDescription; // Możliwe ze do usuniecia w katalogi nie maja opisów

    public FileCatalog(String newCatalogName){
        catalogName=newCatalogName;
    }

    public String getCatalogName(){
        return catalogName;
    }

    public void add(FileComponent newFileComponent){
        fileComponents.add(newFileComponent);
    }

    public void remove(FileComponent newFileComponent){
        fileComponents.remove(newFileComponent);
    }

    public FileComponent getComponent(int componentIndex){
        return (FileComponent)fileComponents.get(componentIndex);
    }

    public void displayFileInfo(){
        //DO ZAIMPLEMENTOWANIA PROXY DLA FILE I FILEKATALOG I DODANIE TU OBSLUGI
        //Węzłów w petli do wyswietlania info o nich
        System.out.println("\nWchodze do katalogu: " + catalogName+"...\n");

        for (FileComponent fileComponent : fileComponents) {
            // TU MOZE BYC BłĄD przy cascie do DisplayFileInfo
                DisplayFileInfo fileComponentInfo = new FileProxy(fileComponent);
                fileComponentInfo.displayFileInfo();
        }
    }

}
