package com.qss.study.controller;

import com.qss.study.entity.BookInfo;
import com.qss.study.entity.UserInfo;
import com.qss.study.service.BookService;
import com.qss.study.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class TestController {
    /**
     * 通过@Resource(name="")来指定不同的实现类，例如TestService类有两个不同的实现类MajorTestServiceImpl和SecondaryTestServiceImpl,
     * 利用@Resource(name = "SecondaryTestServiceImpl")指定调用的方法是实现类SecondaryTestServiceImpl中的方法
     * MajorTestServiceImpl上的注解@DS("major")指定数据源为yml配置文件中的major数据源
     * SecondaryTestServiceImpl的注解@DS("secondary")指定数据源为yml配置文件中的secondary数据源
     */
    @Resource(name = "SecondaryTestServiceImpl")
    private TestService testService;

    @Resource
    private BookService bookService;

    @GetMapping("/ceshi1")
    public List<UserInfo> getUserInfo(){
        return testService.getUserInfo();
    }

    /**
     * @DS注解用在方法上，实现获取不同数据源下的数据
     * @DS注解用在方法上优先级大于用在类上
     */
    @GetMapping("/ceshi2")
    public void getBookInfo(){
        List<BookInfo> majorBooks = bookService.getBookInfoByMajor();
        log.info("major数据源结果:{}",majorBooks);
        List<BookInfo> secondaryBooks = bookService.getBookInfoBySecondary();
        log.info("secondary数据源结果:{}",secondaryBooks);
    }
}
