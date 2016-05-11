package com.hussar.jom.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hussar.jom.response.KeyJsonVO;

/**
 * @author yi.xiao
 * Created on 2016年5月11日 上午11:54:01
 * © 2015 Fanli.com
 */
@Service
public class JsonObjManagerServiceImpl implements JsonObjManagerService {

    @Override
    public List<KeyJsonVO> getKeyJsonList(String keyFilter, String name, int startIndex, int endIndex) {
        List<KeyJsonVO> list = new ArrayList<KeyJsonVO>();
        list.add(new KeyJsonVO("app.servet", "111111111111"));
        list.add(new KeyJsonVO("app.gew", "222222"));
        return list;
    }

}
