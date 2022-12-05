package com.ia.machineleraning_faces.service.steven;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

@Service
public class CosumirClienteHttpsImpl implements CosumirClienteHttpsIface {
  @Override
  public String getCosumirCliente() throws NoSuchAlgorithmException, KeyManagementException {
    System.setProperty("jsse.enableSNIExtension", "false");
    SSLContext context = SSLContext.getInstance("TLSv1.3");

    context.init(null, null, null);
    CloseableHttpClient httpClient = HttpClientBuilder.create().setSSLContext(context)
        .build();
    HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(httpClient);
    factory.setReadTimeout(10000);
    factory.setConnectTimeout(10000);
    RestTemplate restTemplate = new RestTemplate(factory);
    HttpHeaders headers = new HttpHeaders();
    headers.set("Content-Type", "text/plain");
    headers.set("Authorization", "Bearer eyJhbGciOiJIUzM4NCIsInR5cCI6IkpXVCJ9.eyJlbWFpbCI6ImluZm9hZGFwdGFkb3JAbnVtcm90LmNvbSIsInJvbGUiOiJDbGllbnRlIiwibmJmIjoxNjYxMjk5ODk5LCJleHAiOjE3MjQzNzE4OTksImlhdCI6MTY2MTI5OTg5OSwiaXNzIjoibnVtcm90IiwiYXVkIjoicmVhZGVycyJ9.gTrKSXLLDi1phmEJXke6YcJZCSGMFiIA-ajjPUFBUu_WVO03rh2WuwlcGwUuHliH");
    headers.set("Connection", "keep-alive");
    headers.set("Content-Length", String.valueOf("Hola".length()));
    HttpEntity<String> request = new HttpEntity<String>("Hola", headers);
    ResponseEntity<String> response = restTemplate.exchange("https://nra_api_dllo.numrotapi.net/api/SendENR/900313349DS/SETT195",
                                                                HttpMethod.POST,
                                                                request,
                                                                String.class);
    return response.getBody();
  }
}
