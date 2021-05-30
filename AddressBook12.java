import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class AddressBook12 {

	public static List<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
	Collection<AddressBook> addressBooks = new LinkedHashSet<AddressBook>();
	//	List<AddressBook> addBook = new ArrayList<AddressBook>();

	public static String addingWithoutDuplicate() {
		Scanner sc = new Scanner(System.in);
		String firstName;
		String lastName;
		String city;
		String state;
		String pin;
		String mobileNo;
		String email;
		System.out.println("Enter Address Details you want to add");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {

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

			HashMap<String, String> addDetails = new HashMap<String, String>();
			addDetails.put("fName",firstName);
			addDetails.put("lName",lastName);
			addDetails.put("city",city);
			addDetails.put("state",state);
			addDetails.put("pin",pin);
			addDetails.put("contact",mobileNo);
			addDetails.put("email",email);
			
			boolean checkUser = false;
			for(HashMap<String, String> l : list) {
				String emailId = l.get("email");
				if(emailId.equalsIgnoreCase(email)) {
					checkUser = true;
				}
			}
			if(checkUser) {
			}else {
				list.add(addDetails);
			}
		}
		return "";
	}

	public static void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Search person by it's city or state");
		String search = sc.next();
		for(HashMap<String, String> check : list) {
			if(search.equals(check.get("city")) || search.equals(check.get("state"))){
				System.out.println(check.get("fName"));
				System.out.println(check.get("lName"));
				System.out.println(check.get("city"));
				System.out.println(check.get("state"));
				System.out.println(check.get("pin"));
				System.out.println(check.get("contact"));
				System.out.println(check.get("email"));

			}
		}
	}

		public static void main(String[] args) {
			addingWithoutDuplicate();	
			getDetails();
		}
	}


