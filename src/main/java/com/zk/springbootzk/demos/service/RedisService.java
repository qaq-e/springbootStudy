package com.zk.springbootzk.demos.service;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RedisService {
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    /**
     * set redis: string类型
     * @param key key
    该对象操作的是 string，我们也可以存实体类，只需要将实体类转换成 json 字符串即可。下面来测试
    一下：
    先启动 redis，然后运行这个测试用例，观察控制台打印的日志如下：
    3.3.2 redis:hash 类型
    hash 类型其实原理和 string 一样的，但是有两个 key，使用 stringRedisTemplate.opsForHash()
    可以获取 HashOperations<String, Object, Object> 对象。比如我们要存储订单信息，所有订单
    信息都放在 order 下，针对不同用户的订单实体，可以通过用户的 id 来区分，这就相当于两个 key
    了。
     * @param value value
     */
    public void setString(String key, String value){
        ValueOperations<String, String> valueOperations =
                stringRedisTemplate.opsForValue();
        valueOperations.set(key, value);
    }
    /**
     * get redis: string类型
     * @param key key
     * @return
     */
    public String getString(String key){
        return stringRedisTemplate.opsForValue().get(key);
    }
}
