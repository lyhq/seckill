package com.yangrun.exception;

/**
 * Created by yangrun on 21:31 2017/11/29
 *
 * 重复秒杀异常（运行期异常）
 */
public class RepeatKillException extends SeckillException{

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
