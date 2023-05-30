import java.io.*;
import java.net.*;

public class APICodeNoUsIn {
    public static void main(int minArgs, int maxArgs) throws IOException{
       if (maxArgs < 2) {
            System.out.println("Enter the minimum and maximum block numbers as arguments: ");
            return;
        }
       int startBNumber = minArgs;
       int endBNumber = maxArgs;
        for (int bNumber = startBNumber; bNumber <= endBNumber; bNumber++) {
        String hexBNumber = Integer.toHexString(bNumber);
        String url = "https://api.etherscan.io/api?module=proxy&action=eth_getBlockByNumber&tag=0x" + hexBNumber + "&boolean=true&apikey=YourApiKeyToken"; 
        String FileName = "savedAPI_" + hexBNumber + ".json";
        
        
        FileWriter fileWriter = new FileWriter(FileName);

        URL apiURL = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) apiURL.openConnection();
        connection.setRequestMethod("GET");
        
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String response = "";
        String output;
        
        while ((output = buffRead.readLine()) != null) {
            response += output;
        }

        fileWriter.write(response);
        fileWriter.close();
        connection.disconnect();

        System.out.println("API stored in file: " + FileName);
       }
    }
}
