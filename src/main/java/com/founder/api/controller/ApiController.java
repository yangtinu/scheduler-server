package com.founder.api.controller;

import com.founder.api.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: api接口controller层
 * @Author: yang_yi1@founder.com.cn
 * @Date: Created in 9:15 2018/5/18
 */
@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @Autowired
    ApiService apiService;

    @RequestMapping(value = "/reload")
    public void reload(){
        apiService.reload();
    }
}
