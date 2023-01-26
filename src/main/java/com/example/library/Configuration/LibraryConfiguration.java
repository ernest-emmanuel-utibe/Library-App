package com.example.library.Configuration;

import com.example.library.model.Book;
import com.example.library.model.Category;
import com.example.library.repositories.LibraryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.List;

public class LibraryConfiguration {
    @Bean
    CommandLineRunner runner(LibraryRepository libraryRepository) {
        return args -> {

            Book book = new Book(
                    "Social Science",
                    List.of("Ernest creativeness", "It is what it is"),
                    Category.ART,
                    LocalDateTime.now(),
                    120,
                    2000
            );
            libraryRepository.save(book);
        };
    }
}
