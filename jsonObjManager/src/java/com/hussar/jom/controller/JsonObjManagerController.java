package com.hussar.jom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hussar.jom.logic.service.JsonObjManagerService;

/**
 * @author yi.xiao
 * Created on 2016年5月10日 下午5:12:36
 * © 2015 Fanli.com
 * 
 */
@Controller
@RequestMapping("/json")
public class JsonObjManagerController {
    
    @Autowired
    private JsonObjManagerService jsonObjManagerService;
    
    @RequestMapping(path="/list.action", method=RequestMethod.GET)
    public String getKeyValueList(@RequestParam String keyFilter, @RequestParam Integer startIndex, @RequestParam Integer endIndex,  Model mode){
        mode.addAttribute("keyJsonList", jsonObjManagerService.getKeyJsonList(keyFilter, startIndex, endIndex));
        return "/jom/keyJsonList";
    }

    public JsonObjManagerService getJsonObjManagerService() {
        return jsonObjManagerService;
    }

    public void setJsonObjManagerService(JsonObjManagerService jsonObjManagerService) {
        this.jsonObjManagerService = jsonObjManagerService;
    }
    
    
    
}
