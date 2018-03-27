package com.bo.cloud.springcloudcustomer2.service.impl;

import com.bo.cloud.springcloudcustomer2.extService.SchedualServiceHi;
import com.bo.cloud.springcloudcustomer2.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IIndexService {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @Override
    public String hiService(String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
