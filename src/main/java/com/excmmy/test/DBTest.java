package com.excmmy.test;

import com.excmmy.RunBoot;
import com.excmmy.bean.CustomerInfo;
import com.excmmy.bean.UserInfo;
import com.excmmy.entity.CustomerInfoParameter;
import com.excmmy.mapper.CustomerInfoMapper;
import com.excmmy.service.CustomerInfoService;
import com.excmmy.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) // 加载配置文件，创建Spring容器，进行对象注入
@SpringBootTest(classes= {RunBoot.class}) // 指定RunUserBoot.class启动类
public class DBTest {
    @Autowired
    private CustomerInfoService customerInfoService;

    @Test
    public void test1() {
        CustomerInfo customerInfo = new CustomerInfo();
        customerInfo.setId((long) 24);
        System.out.println(customerInfoService.getCustomerById(customerInfo));
    }
}
