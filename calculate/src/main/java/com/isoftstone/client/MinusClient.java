package com.isoftstone.client;

import com.isoftstone.api.MinusApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RestController;

@FeignClient("minus-web")
public interface MinusClient extends MinusApi {
}
