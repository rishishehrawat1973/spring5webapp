package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.*;
import guru.springframework.spring5webapp.domain.*;
//import guru.springframework.spring5webapp.domain.*;
import guru.springframework.spring5webapp.repository.AuthorRepository;
import guru.springframework.spring5webapp.repository.BookRepository;

import java.util.Iterator;

@Component
public class BootStrapData implements CommandLineRunner {
	
	private AuthorRepository authorRepo;
	private BookRepository bookRepo;
	private PublisherRepository pubRepo;

	public BootStrapData(AuthorRepository authorRepo, BookRepository bookRepo,PublisherRepository pubRepo ) {
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
		this.pubRepo = pubRepo;
	}


	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Starting ***********----->");
		Book firstBook = new Book();
		firstBook.setBookName("First Book");
		firstBook.setIsbnCode("23456");
		Author firstAuthor = new Author();
		firstAuthor.setName("First Author");
	    Set<Author> books = new HashSet<>(); 
	    books.add(firstAuthor);
		Publisher pub = new Publisher("LiberalBooks","NDSE");
		firstBook.setAuthors(books);
		firstBook.setPublisher(pub);
		Long retId2 = pubRepo.save(pub).getId();

		System.out.println("Saved -----> pub id : "+retId2);
		Long retId1 = authorRepo.save(firstAuthor).getId();
		Long retId = bookRepo.save(firstBook).getId();
		System.out.println("Saved -----> id : "+retId+"id1"+retId1);


	}

}
