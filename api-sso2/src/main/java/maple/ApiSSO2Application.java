package maple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/***
 * @Author lixuesong
 * @Description //TODO
 * @Date 10:11 2019/2/12
 **/
@SpringBootApplication
@EnableEurekaClient
public class ApiSSO2Application {
    public static void main(String[] args) {
        SpringApplication.run(ApiSSO2Application.class, args);
    }
}
