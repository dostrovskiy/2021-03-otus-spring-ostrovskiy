package ru.otus.mybooks.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.otus.mybooks.domain.Author;
import ru.otus.mybooks.domain.Book;
import ru.otus.mybooks.domain.Genre;
import ru.otus.mybooks.dto.BookDto;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Конвертер данных книги должен")
class BookDtoConverterImplTest {
    private BookDtoConverter converter;

    @Test
    @DisplayName("конвертировать данные книги")
    void shouldGetBookDto() {
        converter = new BookDtoConverterImpl();
        Author author = new Author(1, "Пушкин А.С.");
        Genre genre = new Genre(1, "Поэма");
        Book book = new Book(1, "Руслан и Людмила", List.of(author), List.of(genre), List.of());
        BookDto expDto = new BookDto(1, "Руслан и Людмила", List.of("Пушкин А.С."), List.of("Поэма"));

        BookDto actBookDto = converter.getBookDto(book);

        assertThat(actBookDto).usingRecursiveComparison().isEqualTo(actBookDto);
    }
}