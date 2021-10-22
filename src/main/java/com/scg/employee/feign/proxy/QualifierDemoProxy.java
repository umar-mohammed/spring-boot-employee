package com.scg.employee.feign.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.scg.employee.feign.config.CustomFeinConfiguration;

@FeignClient(name = "qualifier-service", url = "http://localhost:8080", configuration = CustomFeinConfiguration.class)
public interface QualifierDemoProxy {

	@PostMapping("/testdemo")
	String inputName1();
}
