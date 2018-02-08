package com.zzz.study.test;

import com.zzz.study.dao.DaiLiMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2018/2/7.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        SqlSessionFactory sqlSessionFactory=(SqlSessionFactory) context.getBean("sqlSessionFactory");
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
        List<String> list = sqlSessionTemplate.getMapper(DaiLiMapper.class).getCount();
        System.out.println(list);
    }
}
