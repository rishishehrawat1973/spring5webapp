package guru.springframework.bootstrap;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.domain.Author;
import guru.springframework.domain.Book;
import guru.springframework.repository.AuthorRepository;
import guru.springframework.repository.BookRepository;

@Component
public class BootStrapData implements CommandLineRunner {
	
	private AuthorRepository authorRepo;

	public BootStrapData(AuthorRepository authorRepo, BookRepository bookRepo) {
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
	}

	private BookRepository bookRepo;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Starting ***********----->");
		Book firstBook = new Book();
		firstBook.setBookName("First Book");
		firstBook.setIsbnCode("23456");
		Long retId = bookRepo.save(firstBook).getId();
		System.out.println("Saved ----->");		
		System.out.println("Reterieving saved id ----->"+bookRepo.findById(retId));
		

		

		
		
		/*
		Author firstAuthor = new Author();
		
		firstAuthor.setName("First Author");
	    Set<Author> books = new HashSet<>(); 
	    books.add(firstAuthor);
		firstBook.setAuthors(books);
		*/
	}

}
