package com.icoding.trangphuc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;

@Configuration
public class TilesConfig {

	@Bean(name = "tilesConfigurer")
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		tilesConfigurer.setDefinitions(new String[] {
				"/WEB-INF/tiles/admin/page.xml", "/WEB-INF/tiles/homePage.xml",
				"/WEB-INF/tiles/adminPage.xml", "/WEB-INF/tiles/loginPage.xml",
				"/WEB-INF/tiles/login/login.xml" });
		tilesConfigurer.setCheckRefresh(true);
		return tilesConfigurer;
	}
}
