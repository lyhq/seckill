package com.yangrun.service;

import java.util.List;

import com.yangrun.dto.Exposer;
import com.yangrun.dto.SeckillExecution;
import com.yangrun.entity.Seckill;
import com.yangrun.exception.RepeatKillException;
import com.yangrun.exception.SeckillCloseException;
import com.yangrun.exception.SeckillException;

/**
 * Created by yangrun on 21:10 2017/11/29
 * <p>
 * 业务接口：站在“使用者”角度设计接口
 * 三个方面：方法定义的粒度，参数，返回类型（return类型/异常）
 */
public interface SeckillService {
    //查询所有秒杀记录
    List<Seckill> getSeckillList();

    //查询单个秒杀记录
    Seckill getById(long seckillId);

    //秒杀开始时候输出秒杀接口地址，否则输出秒杀开始时间和系统时间
    Exposer exportSeckillUrl(long seckillId);

    //执行秒杀操作
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5) throws SeckillException, RepeatKillException, SeckillCloseException;

    //执行秒杀操作by存储过程
    SeckillExecution executeSeckillProcedure(long seckillId, long userPhone, String md5);
}
