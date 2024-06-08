package com.librarymanagement.demo.thingies;

public class Journal extends Item {
    private String editor;
    private String ISSN;

    public Journal(int id, String title, int publishedYear, boolean availability, String editor, String ISSN) {
        super(id, title, publishedYear, availability);
        this.editor = editor;
        this.ISSN = ISSN;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getISSN() {
        return ISSN;
    }

    public void setISSN(String ISSN) {
        this.ISSN = ISSN;
    }
}
