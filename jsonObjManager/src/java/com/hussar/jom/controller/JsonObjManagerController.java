package com.hussar.jom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hussar.jom.service.JsonObjManagerService;

/**
 * @author yi.xiao
 * Created on 2016年5月10日 下午5:12:36
 * © 2015 Fanli.com
 * 
 */
@Controller("/obj/json")
public class JsonObjManagerController {
    
    @Autowired
    private JsonObjManagerService jsonObjManagerService;
    
    
    
}
