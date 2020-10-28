package com.miloszmomot.filesystem;

public abstract class FileComponent {

    protected String fileComponentName;

    public void tree() {
        throw new UnsupportedOperationException();
    }

    public void tree(int indent) {
        throw new UnsupportedOperationException();
    }

    public void add(FileComponent newFileComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(FileComponent newFileComponent) {
        throw new UnsupportedOperationException();
    }

    public void ls() {
        throw new UnsupportedOperationException();
    }

    public void more() {
        throw new UnsupportedOperationException();
    }

    public boolean isNameValid() {
        throw new UnsupportedOperationException();
    }
}
