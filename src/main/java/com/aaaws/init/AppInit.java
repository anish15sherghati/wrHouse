package com.aaaws.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.aaaws.config.AppConfig;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	//Provide spring config file as input to web.xml(FC)
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {AppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	//URL-Pattern Mapping
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
