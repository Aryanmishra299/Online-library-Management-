import java.util.*;

class Library{
    String library[];
    int no_of_books;
    public Library(){
        this.library = new String[100];
        this.no_of_books =0;
    }
    void addBook(String Book){
        this.library[no_of_books] = Book;
        no_of_books++;
        System.out.println(Book+" is Added now: ");
    }
    void AvailableBoook(){
        System.out.println("Available books are:-\n");
        for(String book : this.library){
            if(book== null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void IssueBook(String book){
        for (int i=0; i<this.library.length; i++) {
            if(this.library[i].equals(book)){
                System.out.println(book+" the book is issued!!");
                this.library[i] = null;
                return;
            }
        }
    }
    void ReturnBook(String book){
        addBook(book); 
    }
}





public class online_library_pracSet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library clib = new Library();
        while(true){
        System.out.println("\n1. Add books \n2. available books \n3.issued books \n4. Return book:");
        System.out.println("enter your choice or press 0 to exit");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
           
                System.out.println("Enter your Book:");
                sc.nextLine();
                String aBook = sc.nextLine();
                clib.addBook(aBook);
                break;
            case 2:
            clib.AvailableBoook();
            break;

            case 3:
            System.out.println("which book want to issue: \n");
                sc.nextLine();
                String isBook = sc.nextLine();
                clib.IssueBook(isBook);
                break;
            case 4:
                System.out.println("Which  book you want to return? ");
                sc.nextLine();
                String rBook=sc.nextLine();
                clib.ReturnBook(rBook);
                break;
            
            case 0: 
                System.out.println("Thank You for using Online Library Management System!");
                System.exit(0);
                break;
            default :  
                System.out.println("Invalid Choice! Please enter again."); 
                
        }
    }
        
    }
}