package com.xworkz.completeapplication.config;

import javax.servlet.FilterRegistration.Dynamic;
import javax.servlet.MultipartConfigElement;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInti extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getrootconfigclasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses");
		return new Class[] { SpringConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings");
		return new String[] { "/" };
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		int maxSize = 800000000;
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement("C:\\Users\\Bhairavi", maxSize,
				maxSize * 2, maxSize / 2);
		registration.setMultipartConfig(multipartConfigElement);
	}

}
