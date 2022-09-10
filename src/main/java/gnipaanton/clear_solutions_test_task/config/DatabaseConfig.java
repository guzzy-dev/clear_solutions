package gnipaanton.clear_solutions_test_task.config;

import lombok.extern.slf4j.Slf4j;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@Slf4j
public class DatabaseConfig {

    @Bean
    public DataSource dataSource(@Value("${datasource.driver-class-name}") String driver,
                                 @Value("${datasource.url}") String url,
                                 @Value("${datasource.username}") String username,
                                 @Value("${datasource.password}") String password) {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create()
                .driverClassName(driver)
                .url(url)
                .username(username)
                .password(password);
        return dataSourceBuilder.build();
    }

    @Bean
    @Autowired
    public Flyway flyway(DataSource dataSource){
        Flyway flyway =  Flyway.configure()
                .dataSource(dataSource)
                .load();
        flyway.migrate();
        return flyway;
    }
}
