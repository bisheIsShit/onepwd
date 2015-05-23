package com.pwd.onepwd.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.pwd.onepwd.entity.Key;

/**
 * Created by fanngyuan on 5/23/14.
 */

public class StringPK implements Key {

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String token) {
        this.key = token;
    }

    public StringPK(){}

    public StringPK(String key){
        this.key = key;
    }

    @Override
    public String marshal() {
        return key;
    }

    @Override
    public void unMarshal(String keyString) {
        key =keyString;
    }

    @Override
    @JSONField(serialize = false,deserialize = false)
    public String getInKey() {
        StringBuilder sb = new StringBuilder();
        sb.append("'");
        sb.append(key);
        sb.append("'");
        return sb.toString();
    }
}
