package com.example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@RestController
public class HelloController {

  @RequestMapping("/")
  public String index() {
    RestTemplate restTemplate = new RestTemplate();
    String url = "http://api.icndb.com/jokes/random?exclude=[explicit]";

    return restTemplate.getForObject(url, String.class);
  }
}