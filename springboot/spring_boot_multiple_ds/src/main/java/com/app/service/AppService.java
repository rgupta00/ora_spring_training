package com.app.service;
import java.util.*;
import com.app.book.repository.Book;
import com.app.user.repository.User;

public interface AppService {
	public void addUser(User user);
	public void addBook(Book book);
	
	public List<Book> getAllBooks();
	public List<User> getAllUsers();
	
	
}
