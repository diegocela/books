package com.diegocelafabian.books.rest;

import com.diegocelafabian.books.dao.BookDAO;
import com.diegocelafabian.books.data.Book;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * @author Diego Cela
 */
@Path("/book")
@Produces("application/json;charset=utf-8")
@Api(value = "book", description = "Library management service")
public class BookResource {

    private BookDAO bookDAO;

    public BookResource() {
        this.bookDAO = new BookDAO();
    }

    @GET
    @ApiOperation("Obtains a list of all books")
    public Response list() {
        return Response.ok(this.bookDAO.list()).build();
    }

    @GET
    @Path("/{id}")
    @ApiOperation("Obtains a book given its ID")
    public Response get(@PathParam("id") @ApiParam("Book identifier") Long id) {
        Book book = this.bookDAO.get(id);
        
        if (book == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        
        return Response.ok(book).build();
    }

    @POST
    @Consumes("application/json;charset=utf-8")
    @ApiOperation("Saves a book given its information")
    public Response save(@ApiParam("Detailed book information") Book book) {
        this.bookDAO.save(book);
        
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    @ApiOperation("Deletes a book given its ID")
    public Response delete(@PathParam("id") @ApiParam("Book identifier") Long id) {
        Book book = this.bookDAO.get(id);
        
        if (book == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        
        this.bookDAO.delete(book);
        
        return Response.ok().build();
    }
}
