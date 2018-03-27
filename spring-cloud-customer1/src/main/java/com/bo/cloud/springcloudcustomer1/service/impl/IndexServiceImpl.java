package com.bo.cloud.springcloudcustomer1.service.impl;

import com.bo.cloud.springcloudcustomer1.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IndexServiceImpl implements IIndexService {

    @Autowired
    private RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://service-client1/hi?name="+name,String.class);
    }
}
