package com.vy.yzc.es.dto;

import com.vy.yzc.es.eo.BaseEsPageReq;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.NotNull;
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
@EqualsAndHashCode(callSuper = true)
public class OffersOfflineSearchReq extends BaseEsPageReq {

	@ApiModelProperty(value = "关键词")
	private String keyword;

	@ApiModelProperty(value = "距离")
	private Integer distance;

	@ApiModelProperty(value = "分类id")
	private Long categoryType;

	@ApiModelProperty(value = "纬度")
	private BigDecimal lat;

	@ApiModelProperty(value = "经度")
	private BigDecimal lng;

	@ApiModelProperty(value = "商圈id")
	private Long regionId;

	@ApiModelProperty(value = "最低价，单位分")
	private Integer lowPrice;

	@ApiModelProperty(value = "最高价，单位分")
	private Integer highPrice;

	@ApiModelProperty(value = "排序类型，1按照距离 2优惠最大")
	private Integer sortType = 1;

	@ApiModelProperty(value = "前端不传，不需要处理")
	private Integer platform;

}
