import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class AddressBookSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashSet<AddressBook> addressBooks = new LinkedHashSet<AddressBook>();
		List<AddressBook> addBook = new ArrayList<AddressBook>();

		int count = 0;
		int addbookId;
		String firstName;
		String lastName;
		String city;
		String state;
		String pin;
		String mobileNo;
		String email;
		int choice=0;

		do {
			System.out.println("1. Add Details\n2. Update Details"
					+ "\n3. Delete Details\n4.Show All Details"
					+ "\n5. Add Address Books\n6. List of All Address Books\n7. Read From file");
			System.out.println("Enter your choice");
			choice = sc.nextInt();

			switch(choice) {

			case 1:
				System.out.println("Enter how many Address Details you want to add");
				int num=sc.nextInt();
				for(int i=0;i<num;i++) {
					System.out.println("Enter Book id");
					addbookId = sc.nextInt();
					System.out.println("Enter first and last name");
					firstName = sc.next();
					lastName = sc.next();
					System.out.println("Enter city");
					city = sc.next();
					System.out.println("Enter state");
					state = sc.next();
					System.out.println("Enter pin");
					pin = sc.next();
					System.out.println("Enter Mobile number");
					mobileNo = sc.next();
					System.out.println("Enter Email Id");
					email = sc.next();

					addBook.add(new AddressBook(addbookId,firstName, lastName, city, state, pin, mobileNo, email)); 
					count++;

					try {
						FileWriter fw=new FileWriter("AddressFile.txt");
						fw.write(addbookId);
						fw.write(firstName);
						fw.write(lastName);
						fw.write(city);
						fw.write(state);
						fw.write(pin);
						fw.write(mobileNo);
						fw.write(email);
						fw.close();

					} catch (IOException e) {
						e.printStackTrace();
					}    

				}
				System.out.println("Details added successfully");

				break;

			case 2:
				System.out.println("Update Details");
				System.out.println("Enter book id which you want to update");
				addbookId = sc.nextInt();
				for(int i = 0; i < count; i++) {
					if(addBook != null && addbookId == addbookId) {

						System.out.println("Enter first name"); 
						firstName = sc.next();

						System.out.println("Enter last name");
						lastName = sc.next();

						System.out.println("Enter city");
						city = sc.next();

						System.out.println("Enter state");
						state = sc.next();

						System.out.println("Enter pin");
						pin = sc.next();

						System.out.println("Enter Mobile number");
						mobileNo = sc.next();	

						System.out.println("Enter Email Id");
						email = sc.next();

						addBook.set(i,new AddressBook(addbookId,firstName, lastName, city, state, pin, mobileNo, email)); 			
					}
				}
				System.out.println("Details updated successfully");
				break; 

			case 3: 
				System.out.println("Delete Details");
				System.out.println("Enter book id which you want to update");
				addbookId = sc.nextInt();
				for(int i = 0; i < count; i++) {
					if(addBook != null && addbookId == addbookId) {
						addBook.set(i, null);
					}
				}System.out.println("Details deleted successfully");
				break;
			case 4:
				System.out.println("All Details");			
				for(AddressBook list: addBook) {
					System.out.println(list);
				}
				break;
			case 5: 
				for(int i=0; i<addressBooks.size(); i++) {
					addressBooks.addAll(addBook);
				}
				System.out.println("Address Book Added");
				break;

			case 6: 
				System.out.println("List of Address Books");
				for(AddressBook add : addressBooks) {
					System.out.println();
				}
				break;

			case 7: 
				System.out.println("Read Address Books Details From file");
				try {
					Reader fileRead = new FileReader("AddressFile.txt");
					int i;    
					while((i = fileRead.read()) != -1) { 
						System.out.print((char)i);    
					}
					fileRead.close();

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;

			default: 
				System.out.println("You entered invalid choice");
				break;
			}
		}while(choice!=0);
	}
}



