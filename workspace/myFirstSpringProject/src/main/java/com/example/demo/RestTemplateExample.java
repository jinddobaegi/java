package com.example.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class RestTemplateExample {
    public static void main(String[] args) {
        String apiUrl = "https://dapi.kakao.com/v2/local/search/keyword.json?query=naver"; // 원하는 API 엔드포인트 및 쿼리
        String apiKey = "d52d05faef81aa9fa337ccb9dd2f1989"; // 여기에 카카오 API 키를 넣어주세요.

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "KakaoAK " + apiKey);

        RequestEntity<?> requestEntity;
        try {
            requestEntity = new RequestEntity<>(headers, HttpMethod.GET, new URI(apiUrl));
        } catch (URISyntaxException e) {
            throw new RuntimeException("Error creating request URI", e);
        }

        ResponseEntity<String> responseEntity = new RestTemplate().exchange(requestEntity, String.class);
        System.out.println(responseEntity.getBody());
    }
}
