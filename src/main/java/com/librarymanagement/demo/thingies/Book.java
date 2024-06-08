package com.librarymanagement.demo.thingies;

public class Book extends Item {
    private String author;
    private String ISBN;
    private String genre;
    private int numPage;

    public Book(int id, String title, int publishedYear, boolean availability, String author, String ISBN, String genre, int numPage) {
        super(id, title, publishedYear, availability);
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
        this.numPage = numPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }
}
