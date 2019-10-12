package com.zime.serviceB;

import com.zime.api.ServiceAInterface;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient( value = "ServiceA")
public interface ServiceAClient extends ServiceAInterface {

}
