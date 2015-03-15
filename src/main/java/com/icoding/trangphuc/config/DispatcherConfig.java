package com.icoding.trangphuc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
@EnableWebMvc
public class DispatcherConfig {

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
}
