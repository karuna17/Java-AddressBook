import java.util.Scanner;

class AddressBook {
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String pin;
	private String mobileNo;
	private String email;
	public AddressBook(String firstName, String lastName, String city, String state, String pin, String mobileNo,
			String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.pin = pin;
		this.mobileNo = mobileNo;
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AddressBook [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state=" + state
				+ ", pin=" + pin + ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}

}

public class AddressBookSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		AddressBook add[] = new AddressBook[10];
		int count = 0;
		String firstName;
		String lastName;
		String city;
		String state;
		String pin;
		String mobileNo;
		String email;

		System.out.println("Enter your choice");
		int choice = sc.nextInt();

		System.out.println("1. Add Details 2. Update Details 3. Delete Details");

		while(true) {
			switch(choice) {
			case 1: System.out.println("Add Details");
			System.out.println("Enter how many no of address you want to add");
			int num=sc.nextInt();

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

				add[count] = new AddressBook(firstName, lastName, city, state, pin, mobileNo, email); 
				count++;
				break; }
			System.out.println("Details added successfully");

			case 2: System.out.println("Update Details");
			System.out.println("Enter first name which you want to update");
			firstName = sc.next();
			for(int i = 0; i < count; i++) {
				if(add[i] != null && add[i].getFirstName()==firstName) {

					System.out.println("Enter first name and last name");
					firstName = sc.next();
					add[i].setFirstName(firstName);

					lastName = sc.next();
					add[i].setLastName(lastName);

					System.out.println("Enter city");
					city = sc.next();
					add[i].setCity(city);

					System.out.println("Enter state");
					state = sc.next();
					add[i].setState(state);

					System.out.println("Enter pin");
					pin = sc.next();
					add[i].setPin(pin);

					System.out.println("Enter Mobile number");
					mobileNo = sc.next();
					add[i].setMobileNo(mobileNo);

					System.out.println("Enter Email Id");
					email = sc.next();
					add[i].setEmail(email);
					break; 
				}
			}
			System.out.println("Details updated successfully");

			}
		}

	}

}
