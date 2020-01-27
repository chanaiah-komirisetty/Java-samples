import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.JsonObject;

/**
 * @author Chanaiah
 *
 * 
 */

/**
 * @author Chanaiah
 *
 */
public class SoJsonAnswer {
	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
		
	
	String fileToRead = "D://documents//Kigali//Integrations//Interbank-NIBBS//InterBank.json"; // Your JSON here
	JSONParser parser = new JSONParser(); // Can cause ParseException
	JSONObject obj = (JSONObject) parser.parse(new FileReader(fileToRead)); // Can cause
														// ClassCastException}
	
	
	
	JSONObject mobileData = (JSONObject) obj.get("Branches");
	JSONArray info = (JSONArray) mobileData.get("Branch");
	
	ArrayList<Map<String, Object>> data = new ArrayList<>(info.size());
	List<BankParams> list=null;
	Map<String, List<BankParams>> map = new HashMap<String, List<BankParams>>();
	
	Map<String, BankParams> newmap = new HashMap<String, BankParams>();
	JSONArray responsearr1 = new JSONArray();
	JSONObject current;
	for (int i = 0; i < info.size(); i++) {
	  
	  current = (JSONObject) info.get(i);
	  BankParams bank=new BankParams((String) current.get("BranchCode"), (String) current.get("BranchName"), (String) current.get("BankCode"), (String) current.get("BankName"));
	 //System.out.println(map.containsKey((String) current.get("BankCode")));
	
	 //System.out.println(((String) current.get("BankCode")));
	 List<BankParams> value = map.get((String) current.get("BankCode"));
	  if(value!=null){
		 list=(List<BankParams>) map.get((String) current.get("BankCode"));
		 list.add(bank);
		 map.put((String) current.get("BankCode"), list);
	 }else{
		 list=new ArrayList<BankParams>();
		 list.add(bank);
		 map.put((String) current.get("BankCode"), list);
		 responsearr1.add(bank);
	 }
	  newmap.put(bank.getBankName(), bank);
	// System.out.println(responsearr1);
	 
	 for(Map.Entry m:map.entrySet()){  
   	  //System.out.println("##"+m.getKey()+" "+m.getValue());  
   	  }  
	}
	//System.out.println(data);
	 JSONObject dataObj = new JSONObject();
	 JSONObject statusObj = new JSONObject();
		JSONArray responsearr = new JSONArray();
	 dataObj.putAll( map );
	 dataObj.put("banks", responsearr1);
	 
	 
	    if (dataObj != null) {
			statusObj.put("success", true);
			statusObj.put("message", "Get Emoney Operator Successfully");
			JSONObject dataobj = new JSONObject();
			dataobj.put("interBankCodes", dataObj);
			responsearr.add(dataobj);
			statusObj.put("response", dataobj);
		} else {
			statusObj.put("success", false);
			statusObj.put("errorCode", 404);
			statusObj.put("errorMessage", "Service Not Found");
		}
	    System.out.println(dataObj);
	}


}
    
