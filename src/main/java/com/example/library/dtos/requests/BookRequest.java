package com.example.library.dtos.requests;

import com.example.library.model.Author;
import com.example.library.model.Category;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class BookRequest {
    private String id;
    private Author author;
    private String title;
    private Category category;
}
