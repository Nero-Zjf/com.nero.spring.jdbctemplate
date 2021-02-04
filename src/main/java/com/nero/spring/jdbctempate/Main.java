package com.nero.spring.jdbctempate;

import com.nero.spring.jdbctempate.service.impl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl bean = applicationContext.getBean(UserServiceImpl.class);
        bean.save(new User(0, "jdbctemplate", 18));
        List<User> users = bean.getUsers();
        System.out.println(Arrays.toString(users.toArray()));
    }
}
