import org.sikuli.script.FindFailed;
import java.util.Scanner;

public class Amazon {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		Scanner userChoice = new Scanner(System.in);
	    int choice = 0;
		
	    while(choice != 6) {
	    	
	    	System.out.println();
	    	System.out.println();
	    	System.out.println("Test Cases : ");
			System.out.println("1. Check cart");
			System.out.println("2. Change delivery address");
			System.out.println("3. Change country");
			System.out.println("4. Adding a book to cart");
			System.out.println("5. Buy now option on book");
			System.out.println("6. Exit");
			System.out.println();
		    System.out.println("Which test case you want to run? ");
		    choice = Integer.parseInt(userChoice.nextLine());
		    
		    if(choice==1) { TC01.tc01(); };
		    if(choice==2) { TC02.tc02(); };
		    if(choice==3) { TC03.tc03(); };
		    if(choice==4) { TC04.tc04(); };
		    if(choice==5) { TC05.tc05(); };
		    
	    }
	    
	    userChoice.close();
		
	}

}
