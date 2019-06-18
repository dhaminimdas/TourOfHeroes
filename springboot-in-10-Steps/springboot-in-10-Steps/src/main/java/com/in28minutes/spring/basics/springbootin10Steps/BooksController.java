package com.in28minutes.spring.basics.springbootin10Steps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class BooksController 
{
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return Arrays.asList(new Book(1, "ABCD", "EFGH"));
	}
}
