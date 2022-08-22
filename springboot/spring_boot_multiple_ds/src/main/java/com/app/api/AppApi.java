package com.app.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.book.repository.Book;
import com.app.book.repository.BookRepository;
import com.app.service.AppService;
import com.app.user.repository.User;
import com.app.user.repository.UserRepository;

@RestController
public class AppApi {

	@Autowired
	private AppService appService;
	

	@GetMapping("/users")
	public List<User> getUsers() {
		return appService.getAllUsers();
	}

	@GetMapping("/books")
	public List<Book> getBooks() {
		return appService.getAllBooks();
	}
}
