package com.springcloud.eureka.client.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("product-service") // Eureka Server에서 찾을 서비스명
public interface ProductClient {

    // Eureka Server에 등록된 product-service의 /product/{id} API를 호출
    @GetMapping("/product/{id}")
    String getProduct(@PathVariable("id") String id);
}
