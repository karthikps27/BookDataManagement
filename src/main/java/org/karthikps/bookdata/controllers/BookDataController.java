package org.karthikps.bookdata.controllers;

import java.util.List;

import org.karthikps.bookdata.models.BookDataItems;
import org.karthikps.bookdata.repository.BookDataAccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BookDataController {

	@Autowired
	private BookDataAccessRepository bookDataAccessRepository;
	
	//@Cacheable("booksCache")
	@GetMapping("/books/{bookid}")
	public ResponseEntity<BookDataItems> getBookDataById(@PathVariable(value = "bookid") String bookid) throws Exception {
		
		BookDataItems bookData = bookDataAccessRepository.findById(bookid)
			.orElseThrow(()  -> 
				new Exception("Book data for " + bookid + " is not found"));
		return ResponseEntity.ok().body(bookData);		
	}
	
	//@Cacheable("booksCache")
	@GetMapping("/books")
	public ResponseEntity<List<BookDataItems>> getAllBooksData() {
		List<BookDataItems> allBookData = bookDataAccessRepository.findAll();
		
		return ResponseEntity.ok().body(allBookData);
	}
	
}
