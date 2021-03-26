package com.vy.yzc.es.api;

import com.vy.yzc.es.dto.EsOffersSaveReq;
import com.vy.yzc.es.dto.EsSearchVO;
import com.vy.yzc.es.dto.OffersFilterReq;
import com.vy.yzc.es.dto.OffersKeywordRecommendReq;
import com.vy.yzc.es.dto.OffersNearReq;
import com.vy.yzc.es.dto.OffersSearchReq;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Edward
 * @Date: 2021/3/26 01:48
 * @Description:
 */
@FeignClient(value = "yzc-es-core", path = "/provider/es/offers")
public interface EsFeign {

	/**
	 * 关键词联想
	 * @param req
	 * @return
	 */
	@PostMapping("/keyword/recommend")
	EsSearchVO<String> keywordRecommend(@RequestBody OffersKeywordRecommendReq req);

	/**
	 * 根据关键词分页搜索
	 */
	@PostMapping("/search/keyword")
	EsSearchVO<Long> searchKeyword(@RequestBody OffersSearchReq req);

	/**
	 * 根据条件过滤筛选
	 */
	@PostMapping("/search/filter")
	EsSearchVO<Long> searchFilter(@RequestBody OffersFilterReq req);
	

	/**
	 * 批量删除
	 */
	@PostMapping("/batch/delete")
	Boolean batchDelete(@RequestBody List<Long> offersIds);


	/**
	 * 附近的爆料
	 */
	@PostMapping("/near")
	EsSearchVO<Long> near(@RequestBody OffersNearReq req);

	/**
	 * 更新deleted状态
	 */
/*	@PostMapping("/update/deleted/state")
	Boolean updateDeletedState(@RequestBody List<Long> offersIds, @PathVariable(required = false) Integer deleted);*/

	/**
	 * 批量新增req
	 */
	@PostMapping("/save/reqs")
	Boolean saveReqs(@RequestBody List<EsOffersSaveReq> reqs);

}
