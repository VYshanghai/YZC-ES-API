package com.vy.yzc.es.api;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Edward
 * @Date: 2021/3/26 01:48
 * @Description:
 */
@FeignClient(value = "yzc-es", path = "/provider/es/offers")
public interface EsFeign {


	@GetMapping("/update/deleted")
	Boolean updateOffersEsDeletedStateAsync(@RequestParam("offersIds") List<Long> offersIds,
			@RequestParam("deleted") Integer deleted);


}
