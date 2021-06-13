import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWriter {

	public static void main(String[] args) {
      
		JSONObject obj = new JSONObject();
		obj.put("firstName", "Riya");
		obj.put("lastName", "K");
		obj.put("city", "Mumbai");
		obj.put("state", "Maharashtra");
		obj.put("pin", "400100");
		obj.put("contact", "9348357455");
		obj.put("email", "riya@gmail.com");
		
		JSONObject addressBook1 = new JSONObject();
		addressBook1.put("addressBook", obj);
		
		JSONObject obj1 = new JSONObject();
		obj1.put("firstName", "Disha");
		obj1.put("lastName", "S");
		obj1.put("city", "Pune");
		obj1.put("state", "Maharashtra");
		obj1.put("pin", "400000");
		obj1.put("contact", "74365746");
		obj1.put("email", "disha@gmail.com");

		JSONObject addressBook2 = new JSONObject();
		addressBook2.put("addressBook", obj);

        
		JSONArray addressList = new JSONArray();
		addressList.add(addressBook1);
		addressList.add(addressBook2);
		
		try(FileWriter file = new FileWriter("MyFile.json")){
			file.write(addressList.toJSONString());
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
