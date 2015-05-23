package com.pwd.onepwd.web;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fanngyuan on 5/23/14.
 */
//@ApplicationPath("/")
public class OnepwdApplication extends ResourceConfig {

    public OnepwdApplication() {
        super(AccountWebService.class);
//        WebUtils.isDev = false;
        //Map<String, Object> properties = new HashMap<String, Object>();
        //properties.put(ServerProperties.MONITORING_STATISTICS_MBEANS_ENABLED, true);
        //setProperties(properties);
    }

}
