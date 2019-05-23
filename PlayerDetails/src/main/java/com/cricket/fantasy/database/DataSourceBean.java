/*package com.cricket.fantasy.database;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceBean {
    
    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("spring.data.mongodb.host");
        //dataSourceBuilder.username("SA");
       // dataSourceBuilder.password("");
        return dataSourceBuilder.build();
    }
}
*/