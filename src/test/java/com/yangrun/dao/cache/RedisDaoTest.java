package com.yangrun.dao.cache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangrun.dao.SeckillDao;
import com.yangrun.dao.cache.RedisDao;
import com.yangrun.entity.Seckill;

import static org.junit.Assert.*;

/**
 * Created by yangrun on 11:19 2017/12/4
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告知junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class RedisDaoTest {
    private long id = 1002;
    @Autowired
    private RedisDao redisDao;

    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void testSeckill() throws Exception {
        //测试get和put方法
        Seckill seckill = redisDao.getSeckill(id);
        if (seckill==null){
            seckill = seckillDao.queryById(id);
            if (seckill!=null){
                String result = redisDao.putSeckill(seckill);
                System.out.println(result);
                seckill = redisDao.getSeckill(id);
                System.out.println(seckill);
            }
        }
    }
}