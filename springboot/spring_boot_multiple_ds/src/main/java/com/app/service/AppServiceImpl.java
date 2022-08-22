package com.app.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.book.repository.Book;
import com.app.book.repository.BookRepository;
import com.app.user.repository.User;
import com.app.user.repository.UserRepository;
@Service
public class AppServiceImpl implements AppService{

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private BookRepository bookRepo;
	
	
	@PostConstruct
	public void addData2DB() {
		userRepo.saveAll(Stream.of(new User(744, "raj"), 
				new User(455, "ekta")).collect(Collectors.toList()));
		bookRepo.saveAll(
				Stream.of(new Book(111, "Core Java"), 
					new Book(222, "Spring Boot")).collect(Collectors.toList()));
	}
	
	@Override
	public void addUser(User user) {
	}

	@Override
	public void addBook(Book book) {
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

}
