package com.bo.cloud.springcloudcustomer1.controller;

import com.bo.cloud.springcloudcustomer1.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IIndexService indexService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return indexService.hiService(name);
    }
}
