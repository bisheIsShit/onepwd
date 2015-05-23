package com.pwd.onepwd.entity;

import com.pwd.onepwd.entity.StringPK;

/**
 * Created by CheerS17 on 5/21/15.
 */
public class UserToken extends StringPK {

    private long userId;

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String token) {
        this.key = token;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public UserToken(long userId) {
        this.userId = userId;
    }

    public UserToken() {
        super();
    }
}