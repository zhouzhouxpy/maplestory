package com.maple.service;

import com.maple.fallback.ApiServiceError;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName: ApiService
 * @Description: TODO
 * @author: lixuesong
 * @date: 2019/1/30 17:07
 */
@FeignClient(value = "eurekaclient",fallback = ApiServiceError.class)
public interface ApiService {
    @RequestMapping(value = "/getApiInfo",method = RequestMethod.GET)
    String index();
}
