package com.shopping.shoppingwebsite.controller;

import com.shopping.shoppingwebsite.entities.Book;
import com.shopping.shoppingwebsite.entities.User;
import com.shopping.shoppingwebsite.services.libraryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/libraryManager")
@RestController
public class LibraryManager {

    @Autowired
    private libraryServices libraryServicesObject;

    @GetMapping(path = "/createUser")
    public ResponseEntity<String> createUser(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "password") String password ){
        //return new ResponseEntity<>(this.libraryServices.createUser(name, password), HttpStatus.OK);
        //return new ResponseEntity<>("Got the username and Password as: " + name + " password as: " + password, HttpStatus.OK);
        return new ResponseEntity<>(this.libraryServicesObject.createUser(name, password), HttpStatus.OK);
    }

    @GetMapping(path = "/getAllUsers")
    public ResponseEntity<?> getAllUsers(){
        return new ResponseEntity<>(this.libraryServicesObject.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping(path = "/addBook")
    public ResponseEntity<String> addBooks(
            @RequestParam(name = "bookname") String bookname,
            @RequestParam(name = "authorname") String authorname,
            @RequestParam(name = "publishingYear") String publishingYear,
            @RequestParam(name = "price") double price
    ){
        return new ResponseEntity<>(this.libraryServicesObject.addBook(bookname, authorname, publishingYear, price), HttpStatus.OK);
    }

    @GetMapping(path = "/getAllBooks")
    public ResponseEntity<?> getAllBooks(){
        return new ResponseEntity<>(this.libraryServicesObject.getAllBooks(), HttpStatus.OK);
    }

    @GetMapping(path = "/findSpecificBook")
    public ResponseEntity<Book> findSpecificBook(
            @RequestParam(name = "bookName") String bookname
    ){
        return new ResponseEntity<>(this.libraryServicesObject.findSpecificBook(bookname), HttpStatus.OK);
    }

    @GetMapping(path = "/deleteBook")
    public ResponseEntity<String> deleteBook(
            @RequestParam(name = "bookName") String bookname
    ){
        return new ResponseEntity<>(this.libraryServicesObject.deleteBook(bookname), HttpStatus.OK);
    }

    @GetMapping(path = "/dummy")
    public String dummy(){
        return "Hello World!";
    }

}
