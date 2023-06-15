package com.xworkz.worst.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.worst.constant.ApplicationCons;

public class Webapp extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getrootconfigclasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses");
		return new Class[] { Springconfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings");
		return new String[] { "/" };
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		int maxSize = ApplicationCons.MAX_SIZE;
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(ApplicationCons.TEMP_FILE_LOCATION,
				maxSize, maxSize * 2, maxSize / 2);
		registration.setMultipartConfig(multipartConfigElement);
	}

}