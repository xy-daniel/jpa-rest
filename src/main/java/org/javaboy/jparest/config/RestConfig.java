package org.javaboy.jparest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

/**
 * REST配置---->优先级比配置文件的优先级更高
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/14 16:11
 */
@Configuration
public class RestConfig implements RepositoryRestConfigurer {


    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        //http://localhost:8080/api/bs/2
        config
                .setBasePath("/api")
                .setDefaultPageSize(2);
    }
}
