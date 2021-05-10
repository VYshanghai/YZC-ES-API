package com.vy.yzc.es.api;

import com.vy.yzc.es.dto.EsOffersSaveReq;
import com.vy.yzc.es.dto.EsSearchVO;
import com.vy.yzc.es.dto.OffersFilterReq;
import com.vy.yzc.es.dto.OffersKeywordRecommendReq;
import com.vy.yzc.es.dto.OffersNearReq;
import com.vy.yzc.es.dto.OffersOfflineSearchReq;
import com.vy.yzc.es.dto.OffersOnlineSearchReq;
import com.vy.yzc.es.dto.OffersSearchReq;
import java.util.List;
import javax.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
	 * 根据关键词分页搜索——后台
	 */
	@PostMapping("/search/keyword/background")
	EsSearchVO<Long> searchKeywordForBackground(@RequestBody OffersSearchReq req);

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
	@PostMapping("/update/deleted/state/{deleted}")
	Boolean updateDeletedState(@RequestBody List<Long> offersIds, @PathVariable("deleted") Integer deleted);

	/**
	 * 批量新增req
	 */
	@PostMapping("/save/reqs")
	Boolean saveReqs(@RequestBody List<EsOffersSaveReq> reqs);

	/**
	 * since version 1.1
	 * search offline offers (xkc, mt)
	 * @param req
	 * @return
	 */
	@PostMapping("/search/offline")
	EsSearchVO<Long> searchOffline(@Valid @RequestBody OffersOfflineSearchReq req);

	/**
	 * since version 1.1
	 * search online offers(pdd, jd, wph)
	 * @param req
	 * @return
	 */
	@PostMapping("/search/online")
	EsSearchVO<Long> searchOnline(@Valid @RequestBody OffersOnlineSearchReq req);

}
