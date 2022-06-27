package com.example.bookapplication;

import com.example.bookapplication.controllers.BookController;
import com.example.bookapplication.models.Book;
import com.example.bookapplication.services.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookControllerTest {
    @InjectMocks
    private BookController bookController;
    @Mock
    private BookService bookService;


    @Test
    void returnAllBookList(){
        List<Book> books = new ArrayList<Book>();
        books.add(Book.builder().title("title1").author("author1").cost(7).build());
        when(bookService.getAllBooks()).thenReturn(books);
        List<Book> booksAct = bookController.getAllBooks().getBody();
        assertThat(booksAct).isEqualTo(books);
    }
}
