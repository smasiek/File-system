package com.miloszmomot.filesystem;

import java.util.ArrayList;

public class FileCatalog extends FileComponent implements DisplayableTree, DisplayableLs {

    private ArrayList<FileComponent> fileComponents = new ArrayList<FileComponent>();

    public FileCatalog(String newCatalogName) {
        fileComponentName = newCatalogName;
    }

    public void add(FileComponent newFileComponent) {
        fileComponents.add(newFileComponent);
    }

    public void remove(FileComponent newFileComponent) {
        fileComponents.remove(newFileComponent);
    }

    public void tree() {
        int wciecie = 0;
        this.tree(wciecie);
    }

    public void tree(int indent) {
        System.out.print("--" + fileComponentName + "\n");
        indent += 1;
        for (int i = 0; i < fileComponents.size(); i++) {
            for (int j = 0; j < indent; j++) System.out.print("\t");
            DisplayableTree fileComponentInfo = new FileProxy(fileComponents.get(i));
            fileComponentInfo.tree(indent);
        }
    }


    public void ls() {

        System.out.printf(fileComponentName + ", ");
        for (FileComponent fileComponent : fileComponents) {
            DisplayableLs fileComponentInfo = new FileProxy(fileComponent);
            fileComponentInfo.ls();
        }
    }

}
