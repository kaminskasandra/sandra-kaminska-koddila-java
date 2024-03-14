package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> booksSet = new HashSet<>();
        booksSet.add(new Book("ABC", "title1", 2010, "11O3M"));
        booksSet.add(new Book("DEF", "title2", 2015, "22O3L"));
        booksSet.add(new Book("GHI", "title3", 1990, "44O3M"));
        booksSet.add(new Book("JKL", "title4", 1995, "1589I"));
        booksSet.add(new Book("MNO", "title5", 2000, "1589I"));
        //When
        int result = medianAdapter.publicationYearMedian(booksSet);
        //Then
        assertEquals(2000,result);
    }
}

