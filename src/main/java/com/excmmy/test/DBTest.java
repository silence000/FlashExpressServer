package com.excmmy.test;

import com.excmmy.RunBoot;
import com.excmmy.bean.ProductInfo;
import com.excmmy.service.DictionaryService;
import com.excmmy.service.ProductInfoService;
import com.excmmy.service.impl.ProductInfoServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) // 加载配置文件，创建Spring容器，进行对象注入
@SpringBootTest(classes= {RunBoot.class}) // 指定RunUserBoot.class启动类
public class DBTest {
    @Autowired
    private DictionaryService dictionaryService;

    @Test
    public void test1() {
        System.out.println(dictionaryService.getOrderType());
    }
}
