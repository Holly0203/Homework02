package com.example.demo.annotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Component
@Aspect
public class FirstAspect {
    /*@Pointcut("@annotation(com.example.demo.annotation.Annotation)")
    public void cutMethod(){
    }*/

    @Before(value="@annotation(annotation)")
    public void beforeMethod(JoinPoint joinpoint,Annotation annotation){
        log.info("annotation value:"+annotation.value()+"method param:"+ Arrays.toString(joinpoint.getArgs()));
        System.out.println("niubi");
    }
}
