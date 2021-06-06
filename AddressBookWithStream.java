import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookWithStream {
	List<AddressBook> addBook = new ArrayList<AddressBook>();
	
	public String addDetails()
	{
		Scanner sc = new Scanner(System.in);

		int addbookId;
		String firstName;
		String lastName;
		String city;
		String state;
		String pin;
		String mobileNo;
		String email;

		System.out.println("Add All Details Here...");
		
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

		addBook.add(new AddressBook(addbookId, firstName, lastName, city, state, pin, mobileNo, email));
		return "All Details Inserted Successfully";
	}
	
	public void PrintDetails() {
		addBook.stream().forEach(fname -> System.out.println("First Name - " + fname.getFirstName()));
		addBook.stream().forEach(lname -> System.out.println("Last Name - " + lname.getLastName()));
		addBook.stream().forEach(city -> System.out.println("City - " + city.getCity()));
		addBook.stream().forEach(state -> System.out.println("State - " + state.getState()));
		addBook.stream().forEach(pin -> System.out.println("Pin - " + pin.getPin()));
		addBook.stream().forEach(mobile -> System.out.println("Mobile Number - " + mobile.getMobileNo()));
		addBook.stream().forEach(email -> System.out.println("Email-Id - " + email.getEmail()));
	}
	
	public static void main(String[] args) {
     
		AddressBookWithStream ad = new AddressBookWithStream();
		ad.addDetails();
		
		System.out.println("\nGet All Details\n");
		ad.PrintDetails();

	}

}
