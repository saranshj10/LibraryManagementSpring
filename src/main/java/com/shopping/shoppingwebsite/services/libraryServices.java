package com.shopping.shoppingwebsite.services;

import com.shopping.shoppingwebsite.entities.Book;
import com.shopping.shoppingwebsite.entities.User;

import java.util.List;

public interface libraryServices {

    /** Create a new User */
    String createUser(String name, String password);

    /** Fetch all the Users */
    List<User> getAllUsers();

    /** Add new book */
    String addBook(String bookname, String authorName, String publishingYear, double Price);

    /** Fetch all the books */
    List<Book> getAllBooks();

    /** Fetch Specific Book */
    Book findSpecificBook(String bookName);
    /** Delete particular Book */
    String deleteBook(String bookname);

}
