package com.example.library.services;

import com.example.library.model.Book;
import com.example.library.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    @Autowired
    LibraryRepository libraryRepository;

    public List<Book> getBookByAuthor(String author) {
        List<Book> books = libraryRepository.findAll();
        for (int i = 0; i < books.size(); i++) {
            if (!books.get(i).getAuthors().contains(author)) {
                books.remove(i);
            }
        }
        return books;
    }

    public Book getBookById(String id) {
        Optional<Book> optionalBook = libraryRepository.findById(id);
        if (optionalBook.isPresent()) {
            return libraryRepository.findById(id).get();
        }
        throw new IllegalArgumentException("Book does not exists");
    }

    public List<Book> getBookByTitle(String title) {
        List<Book> books = libraryRepository.findAll();
        for (int i = 0; i < books.size(); i++) {
            if (!books.get(i).getTitle().equals(title)) {
                books.remove(i);
            }
        }
        return books;
    }

}
