package maple.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lixuesong
 * @Description //TODO
 * @Date 10:11 2019/2/12
 **/
@RestController
public class ApiController {
    @Value("${server.port}")
    private int port;

    /**
     * @Author lixuesong
     * @Description //TODO
     * @Date 10:11 2019/2/12
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("getApiInfo")
    public String index(){
        return "中文 api data"+port;
    }
}
