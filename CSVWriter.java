import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {  


/*	public static List<String[]> CsvFileData(String filePath) {
		String[] header = {"id","firstName","lastName","city","state","pin","mobileNo","email"};
		String[] data1 = {"101", "Priya", "Joshi", "Pune","Maharashtra", "100200", "8734857565", "priya@gmail.com"};
		String[] data2 = {"102", "Raj", "J", "Mumbai","Maharashtra", "100300", "7487483878", "raj@gmail.com"};

		List<String[]> list = new ArrayList<String[]>();
		list.add(header);
		list.add(data1);
		list.add(data2);

		System.out.println("welcome to csv file");
		return list;

	}*/
	
	public static void write(String filePath) {
		List<AddressBook> list = new ArrayList<AddressBook>();

		AddressBook addressBook1 = new AddressBook(101, "Priya", "Joshi", "Pune","Maharashtra", "100200", "8734857565", "priya@gmail.com");
		AddressBook addressBook2 = new AddressBook(102, "Raj", "Jadhav", "Mumbai","Maharashtra", "100300", "7665544545", "raj@gmail.com");

		list.add(addressBook1);
		list.add(addressBook2);
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(filePath);
			writer.append("ID,FirstName,LastName,City,State,Pin,Mobile No,Email ID");
			writer.append("\n");
			for(AddressBook addressList : list) {
				writer.append(String.valueOf(addressList.getId()));
				writer.append(",");
				writer.append(addressList.getFirstName());
				writer.append(",");
				writer.append(addressList.getLastName());
				writer.append(",");
				writer.append(addressList.getCity());
				writer.append(",");
				writer.append(addressList.getState());
				writer.append(",");
				writer.append(addressList.getPin());
				writer.append(",");
				writer.append(addressList.getMobileNo());
				writer.append(",");
				writer.append(addressList.getEmail());
				writer.append("\n");
			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				writer.flush();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		String path = "E:\\CSVFile\\File.csv";
		write(path);
		System.out.println("file created");

	}
}
