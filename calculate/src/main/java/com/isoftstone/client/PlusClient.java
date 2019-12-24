package com.isoftstone.client;

import com.isoftstone.api.PlusApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "plus")
public interface PlusClient extends PlusApi {
}
