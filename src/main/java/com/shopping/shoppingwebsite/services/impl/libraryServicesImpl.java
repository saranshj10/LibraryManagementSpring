package com.shopping.shoppingwebsite.services.impl;

import com.shopping.shoppingwebsite.entities.Book;
import com.shopping.shoppingwebsite.entities.User;
import com.shopping.shoppingwebsite.repositories.BookRepo;
import com.shopping.shoppingwebsite.services.libraryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class libraryServicesImpl implements libraryServices {

    List<User> userList = new ArrayList<>();
    List<Book> bookList = new ArrayList<>();
    @Override
    public String createUser(String name, String password) {
        User user = new User(name, password);
        userList.add(user);
        return "Successfully Created User: " + user.getUserName() + " password: " + user.getPassword();
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    @Override
    public String addBook(String bookname, String authorName, String publishingYear, double price) {
        Book book = new Book(bookname, authorName, publishingYear, price);
        bookList.add(book);
        return "Successfully Added Book";
    }

    @Override
    public List<Book> getAllBooks() {
        return bookList;
    }

    @Override
    public Book findSpecificBook(String bookName) {
        for(Book book: bookList){
            if(book.getBookName().equals(bookName))
                return book;
        }
        return null;
    }

    @Override
    public String deleteBook(String bookname) {
        for(Book book: bookList){
            if(book.getBookName().equals(bookname)){
                bookList.remove(book);
            }
        }
        return "Successfully Deleted Book";
    }
}
