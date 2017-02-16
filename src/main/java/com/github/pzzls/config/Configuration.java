package com.github.pzzls.config;

import org.apache.commons.configuration.XMLConfiguration;

/**
 * Created by mosl on 2017/2/16.
 */
public class Configuration {

    private static XMLConfiguration xmlConf;

    public void setXmlConf(XMLConfiguration xmlConf) {
        Configuration.xmlConf = xmlConf;
    }

    public static boolean getBoolean(String key) {
        return xmlConf.getBoolean(key);
    }

    public static int getInt(String key) {
        return xmlConf.getInt(key);
    }

    public static long getLong(String key) {
        return xmlConf.getLong(key);
    }

    public static float getFloat(String key) {
        return xmlConf.getFloat(key);
    }

    public static double getDouble(String key) {
        return xmlConf.getDouble(key);
    }

    public static String getString(String key) {
        return xmlConf.getString(key);
    }
}
