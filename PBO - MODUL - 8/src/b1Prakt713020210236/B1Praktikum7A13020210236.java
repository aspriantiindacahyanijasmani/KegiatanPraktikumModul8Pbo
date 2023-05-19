/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1Prakt713020210236;
import book.Book;
import book.BookService;
import book.BookServiceImpl;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class B1Praktikum7A13020210236 {

    private static String authorName;
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        BookService bookService = (BookService) new BookServiceImpl();
        int menuInput = 0;
        
        System.out.println("Libary Program");
        System.out.println("==============");
        
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Add Book");
            System.out.println("2. Find Book List");
            System.out.println("3. Find Book By Id");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            
            System.out.print("\nSelect Menu : ");
            int menuInput = scanner.nextInt();
        
        switch (menuInput) {
            case 1 -> {
                ;
                System.out.println("========");
                System.out.println("Add Book");
                System.out.println("==========");
                
                scanner.nextLine();
                
                System.out.print("Book Title : ");
                String title = scanner.nextLine();
                
                Book newBook = new Book(title, authorName);
                bookService.addBook(newBook);
                }
            case 2 -> {
                ;
                System.out.println("============");
                System.out.println("Find Book List");
                System.out.println("===============");
                List<Book> books = bookService.findBookList();
                    if (books.size() < 1) {
                        System.out.println("No books yet\n");
                    } else {
                        for (Book book : books) {
                            System.out.println("ID           : "+ book.getId());
                            System.out.println("Title        :"+ book.getTitle());
                            System.out.println("Authorname   :" + book.getAuthorName());
                            System.out.println("\n");
                        }    }
                }
             }
while (menuInput !=6);
        }
    }
}
    
   
                      
         
                     
       
                         
   
    

