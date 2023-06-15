package com.xworkz.dog.config;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.dog.constant.ApplicationCons;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Webapp extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("running getrootconfigclasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("running getServletConfigClasses");
		return new Class[] { Springconf.class };
	}

	@Override
	protected String[] getServletMappings() {
		log.info("running getServletMappings");
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
