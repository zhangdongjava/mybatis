package com.zzz.study.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/2/7.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        SqlSessionFactory sqlSessionFactory=(SqlSessionFactory) context.getBean("sqlSessionFactory");
        SqlSession session = sqlSessionFactory.openSession();
        Object blog = session.selectList("com.zzz.demo.mapper.DaiLiMapper.getCount");
        System.out.println(blog);
    }
}
