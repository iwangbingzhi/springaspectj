package com.wbz.aop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by 王炳智 on 2017/8/23.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = (Book) ctx.getBean("book");
        book.add();
    }
}
