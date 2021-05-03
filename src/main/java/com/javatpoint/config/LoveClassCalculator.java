package com.javatpoint.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveClassCalculator // implements WebApplicationInitializer
{

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub

		// treat as web.xml
		
	/*	XmlWebApplicationContext context = new XmlWebApplicationContext();
		context.setConfigLocation("classpath:spring-servlet.xml");
		*/
		AnnotationConfigWebApplicationContext webAppcontext = new AnnotationConfigWebApplicationContext();
		webAppcontext.register(LoveCalculatorAppConfig.class);

		DispatcherServlet dispatcherservlet = new DispatcherServlet(webAppcontext);

		// register dispacther servlet with servlet context
		ServletRegistration.Dynamic myCustomDispatcher = servletContext.addServlet("myDispatcherServlet",
			dispatcherservlet);
		
		myCustomDispatcher.setLoadOnStartup(1);
		myCustomDispatcher.addMapping("/mywebsite.com/*"); 
	}

}
