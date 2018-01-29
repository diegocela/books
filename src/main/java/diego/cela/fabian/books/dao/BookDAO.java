package diego.cela.fabian.books.dao;

import com.googlecode.objectify.ObjectifyService;
import diego.cela.fabian.books.data.Book;

import java.util.List;
import java.util.logging.Logger;

/**
 *  @author Diego Cela
 */
public class BookDAO {

    private static final Logger LOGGER = Logger.getLogger(BookDAO.class.getName());

    /**
     * @return list of books
     */
    public List<Book> list() {
        LOGGER.info("Retrieving list of beans");
        
        return ObjectifyService.ofy().load().type(Book.class).list();
    }

    /**
     * @param id
     * @return book with given id
     */
    public Book get(Long id) {
        LOGGER.info("Retrieving book " + id);
        
        return ObjectifyService.ofy().load().type(Book.class).id(id).now();
    }

    /**
     * Saves given book
     * @param book
     */
    public void save(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("null book object");
        }
        
        LOGGER.info("Saving book " + book.getId());
        
        ObjectifyService.ofy().save().entity(book).now();
    }

    /**
     * Deletes given book
     * @param book
     */
    public void delete(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("null book object");
        }
        
        LOGGER.info("Deleting book " + book.getId());
        
        ObjectifyService.ofy().delete().entity(book);
    }
}
