package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.*;
import org.springframework.web.*;


import org.springframework.core.Ordered;

@RestController
public class ProductController {

	
@Autowired
private RestTemplate rt ;
	
//@Autowired
//private DiscoveryClient dc;


	//String url = dc.getNextServerFromEureka("details-service", false).getHomePageUrl();
	//return rt.getForObject(url, DetailsDTO.class);
	
}
