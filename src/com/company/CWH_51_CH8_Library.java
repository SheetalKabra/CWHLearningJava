package com.company;
class Library{
    int noOfBooks;
    String[] books;
    Library(){
        this.books = new String[100];
        this.noOfBooks = 0;
    }
    public void addBook(String book){
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book + " has been added!!!!");
    }
    public void showAvailableBooks(){
        System.out.println("Available books are:");
        for (String book: this.books){
            if(book == null){
                continue;
            }
            System.out.println("* "+book);
        }
    }

    public void issueBook(String issuedBook){
        System.out.println(this.books.length);
        for(int i=0;i<this.noOfBooks;i++){
            if(this.books[i].equals(issuedBook)){
                this.books[i] = null;
                System.out.println(issuedBook + " has been issued");
                return;
            }
        }
        System.out.println("The book does not exists");
    }
    public void returnBook(String book){
        addBook(book);
    }
}

public class CWH_51_CH8_Library {
    // You have to implement a library using Java Class "Library"
    // Methods: addBook, issueBook, returnBook, showAvailableBooks
    // Properties: Array to store the available books,
    // Array to store the issued books
    public static void main(String[] args) {
        Library l = new Library();
        l.addBook("Atomic Habits");
        l.addBook("CodeWithHarry");
        l.showAvailableBooks();
        l.issueBook("CodeWithHarry");
        l.showAvailableBooks();
        l.issueBook("Atomic Habits");
        l.showAvailableBooks();

        l.returnBook("Atomic Habits");
        l.showAvailableBooks();
    }

}
