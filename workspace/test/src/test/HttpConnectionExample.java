package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpConnectionExample {
    public static void main(String[] args) {
        try {
            String apiUrl = "https://dapi.kakao.com/v2/local/search/keyword.json?query=naver"; // 원하는 API 엔드포인트 및 쿼리

            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "KakaoAK d52d05faef81aa9fa337ccb9dd2f1989"); // 여기에 카카오 API 키를 넣어주세요.

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }

                in.close();
                System.out.println(response.toString());
            } else {
                System.out.println("HTTP GET request failed: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
