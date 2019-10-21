package cn.itsource.aigou.client.impl;

import cn.itsource.aigou.client.RedisClient;

/**
 * @author solargen
 * @version 1.0
 * @description TODO
 * @date 2019/10/14 11:17
 */
public class RedisClientImpl implements RedisClient {

    @Override
    public String get(String key) {
        return "{\"message\":\"服务器异常!\"}";
    }

    @Override
    public void set(String key, String value) {

    }
}
