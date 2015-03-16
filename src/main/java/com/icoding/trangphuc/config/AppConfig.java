package com.icoding.trangphuc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesView;

@EnableWebMvc
@Configuration
@ComponentScan({ "com.icoding.trangphuc" })
@Import({ HibernateConfig.class, TilesConfig.class, DispatcherConfig.class })
public class AppConfig extends WebMvcConfigurerAdapter {
	@Bean(name = "viewResolver")
	public UrlBasedViewResolver urlBasedViewResolver() {
		UrlBasedViewResolver res = new UrlBasedViewResolver();
		res.setViewClass(TilesView.class);
		return res;
	}

	/**
	 * Actually commonmultipart resolver is supported for upload file
	 * 
	 * @return
	 */
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver commonsMultipartResolver() {
		CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
		return commonsMultipartResolver;
	}

	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/Views/**")
				.addResourceLocations("/Views/");
	}

}
