package com.example.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;

public class WebClientExample {
    public static void main(String[] args) {
        String apiUrl = "https://dapi.kakao.com/v2/local/search/keyword.json?query=naver"; // 원하는 API 엔드포인트 및 쿼리
        String apiKey = "d52d05faef81aa9fa337ccb9dd2f1989"; // 여기에 카카오 API 키를 넣어주세요.

        String responseBody = WebClient.create()
                .get()
                .uri(apiUrl)
                .header(HttpHeaders.AUTHORIZATION, "KakaoAK " + apiKey)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        System.out.println(responseBody);
    }
}
