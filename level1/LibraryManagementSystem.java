public class LibraryManagementSystem {
       static class Book{
            static String libraryName="Egrs";
            private String title;
            private String author;
            final String isbn;
            static void displayLibraryName(){
                System.out.println(libraryName);
            }
            Book(String author,String title,String isbn){
                this.author=author;
                this.title=title;
                this.isbn=isbn;
            }

            void display(Object b){
                if(b instanceof Book){
                    Book ba = (Book) b;
                    System.out.println(ba.author);
                    System.out.println(ba.title);
                    System.out.println(ba.isbn);
                }
            }
       } 
       public static void main(String[] args) {
        Book c= new Book("rachit", "agr", "ibsn");

        c.display(c);
        Book.displayLibraryName();


       }
}
