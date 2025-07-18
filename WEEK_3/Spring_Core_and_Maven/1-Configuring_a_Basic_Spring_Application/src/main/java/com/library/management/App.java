package com.library.management;

import com.library.serices.BookService;
import com.library.repository.BookRepository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean(BookService.class);
        BookRepository bookRepo = context.getBean(BookRepository.class);

        bookService.serviceMethod();
        bookRepo.repoMethod();
    }
}
