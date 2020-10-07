import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

import org.json.simple.JSONObject;

import java.io.*;

public class Google_API {

	/**
	 * Büchersuche per API + ISBN
	 * 
	 * https://www.googleapis.com/books/v1/volumes?q=isbn:9783442714964
	 * 
	 */
	private String inputLine;
	ArrayList<String> api_json = new ArrayList<>();
	private String isbn = "9783800650002";
	String url = "https://www.googleapis.com/books/v1/volumes?q=isbn:" + this.isbn;

	String json_google;

	public Google_API() throws IOException {

		URL open_json = new URL(url);

		BufferedReader api_input = new BufferedReader(new InputStreamReader(open_json.openStream()));

		while ((inputLine = api_input.readLine()) != null) {
			// System.out.println(inputLine);
			// api_json.add(inputLine);
			json_google = inputLine;
			System.out.println(json_google);
		}
		api_input.close();
	}
	
	public void get_Book_Information() {
		
		
	}
}

/*
 * 
 * package org.eclipse.json.provisonnal.com.eclipsesource.json;
 * 
 * import java.io.BufferedReader; import java.io.FileInputStream; import
 * java.io.FileNotFoundException; import java.io.FileReader; import
 * java.io.IOException; import java.io.InputStream; import
 * java.io.InputStreamReader; import java.net.MalformedURLException; import
 * java.net.URL; import java.text.ParseException; import java.util.Iterator;
 * import java.util.logging.Logger;
 * 
 * import org.json.JSONArray; import org.json.JSONObject; import
 * org.json.JSONTokener; import org.json.simple.parser.JSONParser;
 * 
 * 
 * 
 * 
 * 
 * public class BFReader {
 * 
 * 
 * public BFReader(String isbn) {
 * 
 * JSONParser parser = new JSONParser();
 * 
 * try {
 * 
 * Object obj = null; try { obj = parser.parse(new
 * FileReader("c:\\wroehrl.json")); } catch
 * (org.json.simple.parser.ParseException e) { // TODO Auto-generated catch
 * block e.printStackTrace(); }
 * 
 * JSONObject jsonObject = (JSONObject) obj; System.out.println(jsonObject);
 * 
 * String name = (String) jsonObject.get("name"); System.out.println(name);
 * 
 * 
 * 
 * 
 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
 * e) { e.printStackTrace(); }
 * 
 * } }
 * 
 * 
 * // BufferedReader bfr; // String url =
 * "https://www.googleapis.com/books/v1/volumes?q=isbn:";
 * 
 * /* InputStream is = null; try { is = new FileInputStream("C:\\JSON.json"); }
 * catch (FileNotFoundException e1) { // TODO Auto-generated catch block
 * e1.printStackTrace(); } JSONObject json = new JSONObject(new
 * JSONTokener(is));
 * 
 * /* try { bfr = new BufferedReader(new InputStreamReader(new
 * URL(url+isbn).openStream())); Leser l = new Leser(isbn);
 * 
 * } catch (MalformedURLException e) { // TODO Auto-generated catch block
 * e.printStackTrace();
 * 
 * } catch (IOException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 */

/*
 * BufferedReader bfr; String url =
 * "https://www.googleapis.com/books/v1/volumes?q=isbn:";
 * 
 * 
 * try { bfr = new BufferedReader(new InputStreamReader(new
 * URL(url+isbn).openStream())); Leser l = new Leser(isbn);
 * 
 * } catch (MalformedURLException e) { // TODO Auto-generated catch block
 * e.printStackTrace();
 * 
 * } catch (IOException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 * 
 * System.out.println(Leser.name);
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * // JSONParser jsonParser = new JSONParser();
 * 
 * 
 * /* StringBuffer buffer = new StringBuffer();
 * 
 * BufferedReader br = null; try { while (br.ready()) {
 * buffer.append(br.readLine());
 * 
 * } } catch (IOException e) { // TODO Auto-generated catch block
 * e.printStackTrace();
 * 
 * }try{ br.close();
 * 
 * 
 * } catch (IOException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 */
