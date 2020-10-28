package com.miloszmomot.filesystem;

import java.util.regex.Pattern;

public class File extends FileComponent implements DisplayableTree, DisplayableLs {


    private String fileText;

    public File(String fileName, String fileText) {
        fileComponentName = fileName;
        this.fileText = fileText;
    }

    public void tree(int indent) {

        System.out.printf("--" + fileComponentName + "\n");
    }

    public void more() {
        System.out.println("Zawartosc pliku " + fileComponentName + ": " + fileText);
    }

    public void ls() {
        System.out.printf(fileComponentName + ", ");
    }

    public boolean isNameValid() {
        return (Pattern.matches("[a-zA-Z_0-9_.]*", fileComponentName));
    }
}
