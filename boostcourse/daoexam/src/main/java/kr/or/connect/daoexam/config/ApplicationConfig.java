package kr.or.connect.daoexam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@ComponentScan(basePackages = { "kr.or.connect.daoexam.dao" })
@Configuration
@Import({DBConfig.class})
public class ApplicationConfig {

}
