package com.example;

import com.example.dao.FxLogsDao;
import com.example.domian.FxLogs;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
class SpringbootDemoDaoApplicationTests {

    @Resource
    private FxLogsDao fxLogsDao;

    @Test
    void contextLoads() {
    }

    @Test
    void selectData() {
        FxLogs fxLogs = fxLogsDao.selectOne();
        System.out.println(fxLogs.toString());
    }

}
