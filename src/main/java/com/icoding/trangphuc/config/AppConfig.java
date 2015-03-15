package com.icoding.trangphuc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan({ "com.icoding.trangphuc" })
@EnableTransactionManagement
@Import({ HibernateConfig.class, TilesConfig.class })
public class AppConfig {

}
