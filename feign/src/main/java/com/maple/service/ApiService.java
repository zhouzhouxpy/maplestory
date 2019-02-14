package com.maple.service;

import com.maple.fallback.ApiServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName: ApiService
 * @Description: TODO
 * @author: lixuesong
 * @date: 2019/1/30 17:07
 */
@FeignClient(value = "eurekaclient",fallback = ApiServiceImpl.class)
public interface ApiService {
    /**
     * @Author lixuesong
     * @Description //TODO
     * @Date 15:30 2019/2/12
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping(value = "/getApiInfo",method = RequestMethod.GET)
    String index();
}
