package br.com.ffs.client;

import lombok.AllArgsConstructor;
import lombok.val;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@AllArgsConstructor
public class HttpClient {

    private final RestTemplate restTemplate;

    public <REQUEST, RESPONSE> RESPONSE doGet(
        final Class<RESPONSE> responseClass){

        val headers = getHeaders();
        val entity = new HttpEntity<>(headers);
        return restTemplate.exchange(HttpMethod.GET, entity, responseClass);
    }

    public void doPost(){}

    private HttpHeaders getHeaders() {
        return new HttpHeaders();
    }

}
