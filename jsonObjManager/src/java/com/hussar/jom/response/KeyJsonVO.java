package com.hussar.jom.response;

/**
 * @author yi.xiao
 * Created on 2016年5月11日 上午11:46:25
 * © 2015 Fanli.com
 */
public class KeyJsonVO {
    
    private String key;
    private String json;
    
    public KeyJsonVO(String key, String json){
        this.key = key;
        this.json = json;
    }
    
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getJson() {
        return json;
    }
    public void setJson(String json) {
        this.json = json;
    }
    
}
