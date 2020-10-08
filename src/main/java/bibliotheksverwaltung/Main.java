package bibliotheksverwaltung;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {

	public static void main(String[] args) throws IOException, JSONException {
	    Google_API api = new Google_API();
	    JSONObject json = api.readJsonFromUrl();
	    JSONObject json1 = json.getJSONArray("items").getJSONObject(0);
	    JSONObject json2 = json1.getJSONObject("volumeInfo");
	    //JSONObject json3 = json2.getJSONObject("authors");
	    
	    
	    
	    
	    
	    
	    System.out.println(json.toString());
	    System.out.println(json2.get("authors"));
	  }

}
