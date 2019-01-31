package com;

import com.maple.FeignApplication;
import com.maple.service.ApiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: mapleTest
 * @Description: TODO
 * @author: lixuesong
 * @date: 2019/1/30 17:10
 */
@SpringBootTest(classes = FeignApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class mapleTest {
    @Autowired
    private ApiService apiService;
    @Test
    public void testFeign(){
        try {
            System.out.println(apiService.index());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
