//Create Author Class
class Author {
  //Instance Variables for Author Class
  private String fname;
  private String lname;
  //Constructor for Author Class
Author(String fname,String lname){
  this.fname = fname;
  this.lname = lname;
}
//Instance Menthods for Author Class
public String getFname() {
  return fname;
}
public String getLname() {
  return lname;
}
public void setFname(String fname) {
  this.fname = fname;
}
public void setLname(String lname) {
  this.lname = lname;
}
public String toString() {
  return this.fname+" "+this.lname;
}
}
//Create a Book Class
class Book {
  //Instance Variables for Book Class
  private String title;
  private String Author;
  private double price;
  //Constructor for Book Class
Book(String title,String Author,double price){
  this.title = title;
  this.Author = Author;
  this.price = price;
}
//Instance Menthods for Book Class
public String getTitle() {
  return title;
}
public void setTitle(String title) {
  this.title = title;
}
public String getAuthor() {
  return Author;
}
public void setAuthor(String Author) {
  this.Author = Author;
}
public void setPrice(double price) {
  this.price = price;
}
public String toString() {
  return "Book title is "+this.title+" and the author is "+this.Author+ " cost of this book is "+this.price;
}
}
//Main Class
public class BookGroup {
  public static void main(String... args) {
    Author writer = new Author("Herbert", "Schildert");

    String Aldetails = writer.toString();
    System.out.println("Author is "+Aldetails);
    System.out.println();
    Book book1 = new Book("Object Oriented Programming Systems", "Herbert Schildert", 1000);
    String details = book1.toString();
    System.out.println(details);
}
}
