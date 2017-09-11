package com.wbz.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by 王炳智 on 2017/8/23.
 */
@Aspect
public class MyBook {
    //在方法上面使用注解完成增强的配置
    @Before(value = "execution(* com.wbz.aop.Book.*(..))")
    public void before1(){
        System.out.println("before....... ");
    }

    @After(value = "execution(* com.wbz.aop.Book.*(..))")
    public void after1(){
        System.out.println("after........");
    }
}
