package com.diegocelafabian.books.data;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.wordnik.swagger.annotations.ApiModel;

/**
 * @author Diego Cela
 */

@Entity
@ApiModel("Book object")
public class Book {

	@Id
    private Long id;

	private String title;
    
	@Index
    private String author;
    
    private int publicationYear;
    
    private String genre;
    
    public Book() {
		super();
	}

	public Book(Long id, String title, String author, int publicationYear, String genre) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
		this.genre = genre;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setName(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publicationYear=" + publicationYear
				+ ", genre=" + genre + "]";
	}
    
}
