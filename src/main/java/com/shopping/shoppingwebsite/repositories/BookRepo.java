package com.shopping.shoppingwebsite.repositories;

import com.shopping.shoppingwebsite.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {

}
