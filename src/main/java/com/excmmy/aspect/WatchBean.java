package com.excmmy.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class WatchBean {

    @Around("within(com.excmmy.service.impl..*)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        StopWatch watch = new StopWatch();
        watch.start();
        Object obj = proceedingJoinPoint.proceed(); // 执行连接点关联的目标对象
        watch.stop();
        System.out.println("服务执行时间:" + watch.getTotalTimeMillis() + "ms");
        return obj;
    }

}
