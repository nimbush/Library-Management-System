package Project;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class Library{
    ArrayList<Book> books = new  ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addBooks(Book book){
        if (book != null){
            books.add(book);
            System.out.println("Book added: "+ book.getTitle());
        }else{
            System.out.println("Can't add");
        }
    }

    public void addBooks(){
        System.out.println("Enter the title:");
        String title = sc.nextLine();
        books.add(new Book(title,true));
        System.out.println("The data is added");
    }

    public void addBooks(int a){
        System.out.println("Enter the title:");
        String title = sc.nextLine();
        System.out.println("Enter the author:");
        String author = sc.nextLine();
        System.out.println("Enter the ISBN");
        String ISBN = sc.nextLine();
        System.out.println("Enter the borrowed person name:");
        String borrowedName= "";
        books.add(new Book(title, author, ISBN, true, borrowedName));
        System.out.println("The data is added");
    }

    public void readBooks(){
        for(Book book: books){
            System.out.println("Name of the book: "+ book.getTitle());
            System.out.println("Author of the book: "+ book.getAuthor());
            System.out.println("ISBN of the book: "+book.getISBN());
            System.out.println("Availability of the book: "+book.isAvailable());
            System.out.println("Borrowed Person name: "+ book.getBorrowedName());
            System.out.println("----------------------------");
        }
    }

    public void searchBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of the books: ");
        String readBook = sc.nextLine();
        for(Book book: books){
            if (readBook.equalsIgnoreCase(book.getTitle())){
                System.out.println("Name of the book: "+ book.getTitle());
                System.out.println("Author of the book: "+ book.getAuthor());
                System.out.println("ISBN of the book: "+book.getISBN());
                System.out.println("Availability of the book: "+book.isAvailable());
                System.out.println("Borrowed by: "+ book.getBorrowedName());
            }
        }
    }

    public void searchBook(int a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of the books: ");
        String readBook = sc.nextLine();
        System.out.println("Enter the ISBN of the books: ");
        String readISBN = sc.nextLine();
        for(Book book: books){
            if (readBook.equalsIgnoreCase(book.getTitle()) && readISBN.equalsIgnoreCase(book.getISBN())){
                System.out.println("Name of the book: "+ book.getTitle());
                System.out.println("Author of the book: "+ book.getAuthor());
                System.out.println("ISBN of the book: "+book.getISBN());
                System.out.println("Availability of the book: "+book.isAvailable());
            }
        }
    }

    public void checkOutBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book");
        String readBook = sc.nextLine();
        for(Book book: books){
            if (readBook.equalsIgnoreCase(book.getTitle()) && book.isAvailable()){
                book.setAvailable(false);
                System.out.println("Successfully borrowed!!");
            }else{
                System.out.println("Book is not available and is borrowed by: "+ book.getBorrowedName());
            }
        }
    }

    public void checkOutBook(String n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book");
        String readBook = sc.nextLine();
        for(Book book: books){
            if (readBook.equalsIgnoreCase(book.getTitle()) && book.isAvailable()){
                System.out.println("Enter your name:");
                String name = sc.nextLine();
                book.setBorrowedName(name);
                book.setAvailable(false);
                System.out.println("Successfully borrowed!!");
            }else{
                System.out.println("Book is not available and is borrowed by: "+ book.getBorrowedName());
            }
            System.out.println("Book borrowed by: " +book.getBorrowedName());
        }
    }

    public void returnBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book you want to return");
        String readBook = sc.nextLine();
        for(Book book: books){
            if (readBook.equalsIgnoreCase(book.getTitle())){
                if (!book.isAvailable()){
                    book.setAvailable(true);
                    System.out.println("Successfully Returned");
                }
            }
        }
    }
}