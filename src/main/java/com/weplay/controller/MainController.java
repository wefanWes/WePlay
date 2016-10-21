package com.weplay.controller;

import com.weplay.Pojo.User;
import com.weplay.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by Wenbo on 16/10/19.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ApplicationContext ctx=null;
        ctx=new ClassPathXmlApplicationContext("classpath:conf/spring-mybatis.xml");

        UserDao userDao=(UserDao) ctx.getBean("userDao");

        User user=null;
        //添加两条数据
        //user.setUserId("d4c774319ad04f38a124c0993fbc1234");
        //userDao.insert(user);
        user = userDao.selectByPrimaryKey("d4c774319ad04f38a124c0993fbc19a9");
        ModelAndView mav = new ModelAndView();
        mav.addObject("username",user.getUsername());
        mav.setViewName("/index");
        return mav;
    }
}