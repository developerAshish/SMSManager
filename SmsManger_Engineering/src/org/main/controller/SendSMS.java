package org.main.controller;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;

public class SendSMS {

    final static String URL_HOST = "http://sms.hspsms.com";

    public static String SMSSender(String user, String apikey, String sender, String service, String mobile, String message) {
        String strTemp = "";
        try {
            // Construct The Post Data
            String data = "/sendSMS?username=" + user;
            data += "&" + "apikey=" + apikey;
            data += "&" + "sendername=EEWTEC";
            data += "&" + "smstype=" + service;
            data += "&" + "numbers=" + mobile;
            data += "&" + "message=" + URLEncoder.encode(message, "UTF-8");

            URL url = new URL(URL_HOST + data);
            System.out.println(URL_HOST + data);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = br.readLine()) != null) {

                strTemp += line;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return strTemp;
    }
 public static void send(String mobileNom, String message) {
       String response = SMSSender("eewtechnologies@gmail.com", "511b4b8f-a743-47bf-a70d-ebb158ecde26", "EEWTEC", "TRANS",mobileNom, message);
       System.out.println(response);
   }
    public static void main(String[] args) {
        send("9527114329", " ashish");
        
    }
}
