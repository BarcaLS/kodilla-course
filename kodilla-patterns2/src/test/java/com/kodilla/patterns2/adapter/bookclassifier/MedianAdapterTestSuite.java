package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        // Given
        Set<Book> books = new HashSet<>();
        Book book1 = new Book("A B", "Jakiś tytuł", 1920, "sdfsef3");
        Book book2 = new Book("C D", "Inny tytuł", 1943, "sdfoht3324234");
        Book book3 = new Book("E F", "Coś tam", 1978, "sdg78sf7wug3j");
        Book book4 = new Book("G H", "Test Driven Development", 1993, "fsdf78etrsd3");
        Book book5 = new Book("I J", "Lalalalala", 2012, "sdg86773ytiysd");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        MedianAdapter medianAdapter = new MedianAdapter();

        // When
        int median = medianAdapter.publicationYearMedian(books);

        // Then
        System.out.println(median);
        assertEquals(1978, median, 0);
    }
}
