package com.maple.common.config;

import com.maple.common.model.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName: UUIDConfiguration
 * @Description: TODO
 * @author: lixuesong
 * @date: 2019/1/26 12:45
 */
@SpringBootConfiguration
public class UUIDConfiguration {
    @Value("${uuid.workerId}")
    private String workId;
    @Value("${uuid.datacenterId}")
    private String datacenterId;
    @Bean
    public UUID uuid(){
        return UUID.options()
                .setWorkId(workId)
                .setDatacenterId(datacenterId)
                .build();
    }
}
