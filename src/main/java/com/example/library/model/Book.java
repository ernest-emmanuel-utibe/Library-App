package com.example.library.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class Book {
    @Id
    private String id;
    private String title;
    private List<String> authors = new ArrayList<>();
    private Category category;
    private LocalDateTime publicationYear;
    private Integer numberOfCopies;
    private Integer numberOfPages;

    public Book(String title, List<String> authors, Category category, LocalDateTime publicationYear, Integer numberOfCopies, Integer numberOfPages) {
        this.title = title;
        this.authors = authors;
        this.category = category;
        this.publicationYear = publicationYear;
        this.numberOfCopies = numberOfCopies;
        this.numberOfPages = numberOfPages;
    }
}
