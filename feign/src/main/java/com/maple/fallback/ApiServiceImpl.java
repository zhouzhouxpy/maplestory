package com.maple.fallback;

import com.maple.service.ApiService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName: ApiServiceError
 * @Description: TODO
 * @author: lixuesong
 * @date: 2019/1/30 17:33
 */
@Component
public class ApiServiceImpl implements ApiService {
    @Override
    public String index() {
        return "服务发生故障！";
    }
}
