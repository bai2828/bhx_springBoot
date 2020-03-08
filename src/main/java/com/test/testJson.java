package com.test;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class testJson {
    private  static   Logger logger = LoggerFactory.getLogger(testJson.class);
    public static void main(String[] args) {

        String text ="{\"access_token\":\"af18489907f181ccd836ee29b8974b9f\"}";
        JSONObject jsonObject = JSON.parseObject(text);
        if (jsonObject.containsKey("access_token")){
            logger.info(jsonObject.getString("access_token"));
        }
    }
}
