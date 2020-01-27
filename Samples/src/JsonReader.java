import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
public class JsonReader {
	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		String SearchKey="Branches";
		 JsonParser parser = new JsonParser();
	        JsonElement jsonElement = null;
	        JsonObject operators = null;
	        String fileToRead = "D://documents//Kigali//Integrations//Interbank-NIBBS//customers.json";
		jsonElement = parser.parse(new FileReader(fileToRead));
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        if (jsonObject.has(SearchKey)) {
        	System.out.println(jsonObject.getAsJsonObject(SearchKey)
                     .has("JNTUH"));
        	 if (jsonObject.getAsJsonObject(SearchKey)
                     .has("JNTUH")) {
                     operators = jsonObject.getAsJsonObject(SearchKey)
                         .getAsJsonObject("JNTUH");
                     System.out.println(operators);
                 } /*else if (jsonObject.getAsJsonObject(SearchKey)
                     .has(all)) {
                     operators = jsonObject.getAsJsonObject(SearchKey)
                         .getAsJsonObject(all);
                 }*/ else {
                     operators = jsonObject.getAsJsonObject(SearchKey);
                     JsonArray jsonarra1y = jsonObject.getAsJsonObject(SearchKey).getAsJsonArray("Branch");
                     System.out.println("#####jsonarra1y"+jsonarra1y);
                     List<Object> jsonarray = new JSONArray();
                     jsonarray.add(jsonarra1y);
                     Map<String, String> map = (Map) jsonarray.stream().map(Object::toString).collect(Collectors.toMap(s -> s, s -> "value"));   
                     //System.out.println("##"+map);
                     for(Map.Entry m:map.entrySet()){  
                    	  // System.out.println("##"+m.getKey()+" "+m.getValue());  
                    	  }  
                     JsonElement obj = (JsonElement)jsonarray.get(0);
                     JsonObject jsonObject1 = jsonElement.getAsJsonObject();
                     System.out.println(jsonObject1);
                     System.out.println( jsonObject1.getAsJsonArray("routes").get(0));
                    ;
                     System.out.println(obj);
                     for (JsonElement jsonElement2 : jsonarra1y) {
                    	 //System.out.println(jsonElement2);
                    	
                    	 
						
					}
                     //System.out.println(operators1);

                    // System.out.println(operators);
                 }
            
        }
       
	}

}
