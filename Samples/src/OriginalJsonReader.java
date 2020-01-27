import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

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
 *         modified by @author Chanaiah last on 2019-06-26 17:59:26.845
 */
public class OriginalJsonReader {
	public static void main(String[] args) {
		getOffersData();
	}

	private static JsonObject getOffersData() {
		JsonParser parser = new JsonParser();
		JsonElement jsonElement = null;
		JsonObject offersData = new JsonObject();
		try {

			String fileToRead = "D://documents//Kigali//Integrations//Interbank-NIBBS//customers.json";
			 jsonElement = parser.parse(new FileReader(fileToRead));
	            JsonObject jsonObject = jsonElement.getAsJsonObject();
	            if (jsonObject.has("JNTUH")) {
	            	offersData = jsonObject.getAsJsonObject("JNTUH");
	            }

		} catch (JsonIOException e) {

		} catch (JsonSyntaxException e) {

		} catch (FileNotFoundException e) {

		}
		System.out.println("######"+offersData);
		return offersData;
	}

}
