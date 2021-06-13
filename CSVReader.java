import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) {
		String path = "E:\\CSVFile\\File.csv";
		String line = "";

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while((line = br.readLine()) != null) {
				String values[] = line.split(",");
				System.out.println("Id: "+ values[0] +" FirstName: "+ values[1] + " LastName: "+ values[2]
						+" City: "+values[3]+" State: "+values[4]+" Pin: "+values[5]+" Mobile: "+values[6]
						+" Email ID: "+values[7]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
