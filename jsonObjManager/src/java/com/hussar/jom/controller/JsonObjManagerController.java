package com.hussar.jom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    
    @RequestMapping(path="/list/keyFilter/{keyFilter}/startIndex/{startIndex}/endIndex/{endIndex}", method=RequestMethod.GET)
    public String getKeyValueList(@PathVariable String keyFilter, @PathVariable Integer startIndex, Integer endIndex,  Model mode){
        mode.addAttribute("keyJsonList", jsonObjManagerService.getKeyJsonList(keyFilter, startIndex, endIndex));
        return "/jom/keyJsonList";
    }
    
    
    
}
