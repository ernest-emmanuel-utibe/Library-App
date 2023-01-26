package com.example.library.controllers;

import com.example.library.model.Book;
import com.example.library.services.LibraryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class LibraryController {

    @Autowired
    LibraryService libraryService;

    @GetMapping
    public Book searchBookById(@PathVariable String id) {
        return libraryService.getBookById(id);
    }

    @GetMapping
    public List<Book> searchBookByAuthor(@PathVariable String author) {
        return libraryService.getBookByAuthor(author);
    }

    @GetMapping
    public List<Book> searchBookByTitle(@PathVariable String title) {
        return libraryService.getBookByTitle(title);
    }
}
