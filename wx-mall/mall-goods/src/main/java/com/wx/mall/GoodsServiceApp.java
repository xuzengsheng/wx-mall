package com.wx.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: wx-mall
 * @author: xuzengsheng
 * @create: 2020-11-19 11:03
 * @description:
 **/
@SpringBootApplication
@MapperScan("com.wx.mall.mapper")
@ComponentScan(value = "com.wx.mall.*")
public class GoodsServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(GoodsServiceApp.class, args);
    }
}
