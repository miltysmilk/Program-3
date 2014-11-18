/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinay
 */
public class BookDetails extends Book implements booklist
{
    private String genre;

    public BookDetails(String genre, String name, String isbn, double price)
    {
        super(name, isbn, price);
        this.genre = genre;
    }

    @Override
    public void sortBooks()
    {
        
    }

    @Override
    public void addBook(Book book)
    {
     
    }
    
}
