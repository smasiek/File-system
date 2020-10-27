package com.miloszmomot.filesystem;

import java.util.ArrayList;

public class FileCatalog extends FileComponent implements DisplayableTree,DisplayableLs {

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


    public void tree() {
        int wciecie=0;
        this.displayTreeLine(wciecie);
    }

    public void displayTreeLine(int wciecie){
        //DO ZAIMPLEMENTOWANIA PROXY DLA FILE I FILEKATALOG I DODANIE TU OBSLUGI
        //Węzłów w petli do wyswietlania info o nich
        System.out.print("--" + catalogName + "\n");
        //for (FileComponent fileComponent : fileComponents) {
        wciecie+=1;
        for (int i=0;i<fileComponents.size();i++) {
            // TU MOZE BYC BłĄD przy cascie do DisplayFileInfo
            for(int j=0;j<wciecie;j++) System.out.print("\t");
                DisplayableTree fileComponentInfo = new FileProxy(fileComponents.get(i));
                fileComponentInfo.displayTreeLine(wciecie);
        }
    }


    public void ls(){

        System.out.printf(catalogName + ", ");
        for (FileComponent fileComponent : fileComponents) {
            DisplayableLs fileComponentInfo = new FileProxy(fileComponent);
            fileComponentInfo.ls();
        }
    }

}
