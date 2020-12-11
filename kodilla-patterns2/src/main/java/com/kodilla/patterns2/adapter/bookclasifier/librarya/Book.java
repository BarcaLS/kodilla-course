package com.kodilla.patterns2.adapter.bookclasifier.librarya;

public class Book {
    private final String author;
    private final String title;
    private final int publicationYear;
    private final String signature;

    public Book(final String author, final String title,
                final int publicationYear, final String signature) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public boolean equals(Object o) {
        Book e = (Book) o;
        return (author.equals(e.getAuthor())) &&
                (title.equals(e.getTitle())) &&
                (publicationYear == e.getPublicationYear()) &&
                (signature.equals(e.getSignature()));
    }

    @Override
    public int hashCode() {
        return publicationYear * 100;
    }
}
