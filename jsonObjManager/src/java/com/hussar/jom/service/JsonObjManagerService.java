package com.hussar.jom.service;

import java.util.List;

import com.hussar.jom.response.KeyJsonVO;

/**
 * @author yi.xiao
 * Created on 2016年5月11日 上午11:52:43
 * © 2015 Fanli.com
 * 
 */
public interface JsonObjManagerService {
    
    List<KeyJsonVO> getKeyJsonList(String keyFilter, String name, int startIndex, int endIndex);

}