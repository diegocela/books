package diego.cela.fabian.books.data;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.wordnik.swagger.annotations.ApiModel;

/**
 * @author Diego Cela
 */

@Entity
@ApiModel("Book object")
public class Book {

	@Id
    private Long id;

	private String name;
    
    private String author;
    
    private int publicationYear;
    
    private String genre;
    
    public Book() {
		super();
	}

	public Book(Long id, String name, String author, int publicationYear, String genre) {
		super();
		this.id = id;
		this.name = name;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publicationYear=" + publicationYear
				+ ", genre=" + genre + "]";
	}
    
}
