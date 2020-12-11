package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;

import java.util.Arrays;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    public int publicationYearMedian(Set<Book> bookSet) {
        if(bookSet.size() == 0) return 0;
        int[] years = new int[bookSet.size()];
        int n = 0;
        for(Book currentBook : bookSet) {
            years[n] = currentBook.getPublicationYear();
            n++;
        }
        Arrays.sort(years);
        System.out.println(Arrays.toString(years));
        if(years.length % 2 == 0) {
            return years[(int)(years.length / 2 + 0.5)];
        } else {
            return years[years.length / 2];
        }
    }
}
