package com.vy.yzc.es.dto;

import com.vy.yzc.es.eo.BaseEsPageReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.validation.annotation.Validated;

/**
 * @author: vikko
 * @Date: 2021/2/22 16:42
 * @Description:
 */
@Data
@Validated
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "OffersMtSearchReq", description = "搜索筛选请求对象")
public class OffersOnlineSearchReq extends BaseEsPageReq{

	@ApiModelProperty(value = "分类id")
	private Long categoryType;

	@ApiModelProperty(value = "前端不传，不需要处理")
	private Integer platform;

}
