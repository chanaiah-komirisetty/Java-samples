import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

/**
 * @author Chanaiah
 *
 * 
 */

/**
 * @author Chanaiah
 *
 */
public class SimpleJson {
	public static void main(String[] args) {

		JsonParser parser = new JsonParser();
		JsonElement jsonElement = null;
		JsonObject emoneyarray = null;
		Map<String,String> map=null;
		try {
			 String fileToRead = "D://documents//Kigali//Integrations//Interbank-NIBBS//InterBank.json";
			jsonElement = parser.parse(new FileReader(fileToRead));
			JsonObject jsonObject = jsonElement.getAsJsonObject();
			emoneyarray = jsonObject.getAsJsonObject("Branches");
			JsonElement jsonElement1 =emoneyarray.get("Branch");
			JsonArray array=jsonElement1.getAsJsonArray();
			map=new HashMap<String,String>();
			for(int i=0;i<array.size();i++){
				JsonObject json_obj = array.get(i).getAsJsonObject();

                String name = (String)json_obj.get("BankName").toString();
                String code = (String)json_obj.get("BankCode").toString();
                map.put(code.replaceAll("\"", ""), name.replaceAll("\"", ""));
			}
	
		} catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(map);
	
	}

}
