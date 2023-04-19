public class APICode {
    public static void main(String[] args) throws IOException{
        String url = "https://api.etherscan.io/api?module=proxy&action=eth_getBlockByNumber&tag=0xC36B3C&boolean=true&apikey=YourApiKeyToken"; 
        String FileName = "storedAPI1.json";
        
        FileWriter fileWriter = new FileWriter(FileName);

        URL apiURL = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) apiURL.openConnection();
        connection.setRequestMethod("GET");
        
        BufferedReader buffRead = new BufferedReader(new InputStreamReader((connection.getInputStream())));
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
