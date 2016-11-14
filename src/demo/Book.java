

package demo;


import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.io.PrintWriter;

@Path("/book")

public class Book {
    String title;
    String description;
    String author;
    int year;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getResource() {
        Gson gson = new Gson();
        return gson.toJson(new Book());
    }

    public Book() {
        this.title = "Java Made Easy";
        this.description = "A book about how to learn Java in a painless manner";
        this.author = "Java Duke";
        this.year = 2016;
    }

   public String doGet(){
       Book book = new Book();
       book.title = "Java Made Difficult";
       book.description = "A book about how not to learn Java";
       book.author = "Neo Wei Hong";
       book.year = 2016;

       Gson gson = new Gson();
       String json = gson.toJson(book);
       return json;
   }
}
