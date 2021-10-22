package com.scg.employee.feign.config;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import feign.codec.Encoder;

public class CustomFeinConfiguration {

	public Encoder feignEncoder() {

		final HttpMessageConverter jacksonConverter = new MappingJackson2HttpMessageConverter();

		final ObjectFactory<HttpMessageConverters> objectFactory = () -> new HttpMessageConverters(jacksonConverter);

		return new SpringEncoder(objectFactory);

	}

}
