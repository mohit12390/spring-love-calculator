package com.javatpoint.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCAppIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[] = {LoveCalculatorAppConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("servlet mapping");
		String arr[] = {"/"};
		return arr;
	}

}
