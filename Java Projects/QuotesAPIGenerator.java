package Projects;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class QuotesAPIGenerator {
    public static void main(String[] args) {
        try {
        	String apiKey ="YOUR API KEY";
            URL url = new URL("https://api.api-ninjas.com/v1/quotes?category=happiness");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("X-Api-Key", apiKey);
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            JSONArray jsonArray = new JSONArray(response.toString());
            JSONObject jsonObject = jsonArray.getJSONObject(0);
            String quote = jsonObject.getString("quote");
            System.out.println();
            System.out.println("Quote of the Day!!!!!");
            System.out.println();
            System.out.println(quote);
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
