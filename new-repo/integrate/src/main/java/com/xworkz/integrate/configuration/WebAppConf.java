package com.xworkz.integrate.configuration;


import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.integrate.constant.Constant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WebAppConf extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("running getrootconfigclasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("running getServletConfigClasses");
		return new Class[] { Springconfi.class };
	}

	@Override
	protected String[] getServletMappings() {
		log.info("running getServletMappings");
		return new String[] { "/" };
	}

@Override
	protected void customizeRegistration(Dynamic registration) {
		int maxSize = Constant.MAX_SIZE;
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(Constant.TEMP_FILE_LOCATION,
				maxSize, maxSize * 2, maxSize / 2);
		registration.setMultipartConfig(multipartConfigElement);
	}


}
