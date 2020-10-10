package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.repository.AuthorRepository;
import guru.springframework.spring5webapp.repository.BookRepository;

import java.util.Iterator;

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
		System.out.println("Saved -----> id : "+retId);
		Iterable iterable = bookRepo.findAll();
		Iterator itr = iterable.iterator();
		while (itr.hasNext()) {
			System.out.println("value is "+itr.next());
		}


		

		
		
		/*
		Author firstAuthor = new Author();
		
		firstAuthor.setName("First Author");
	    Set<Author> books = new HashSet<>(); 
	    books.add(firstAuthor);
		firstBook.setAuthors(books);
		*/
	}

}
