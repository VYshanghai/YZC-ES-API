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
@ApiModel(value = "OffersFilterReq", description = "搜索筛选请求对象")
@EqualsAndHashCode(callSuper = true)
public class OffersFilterReq extends BaseEsPageReq {

	@ApiModelProperty(value = "距离")
	private Integer distance;

	@ApiModelProperty(value = "分类名称")
	private Long categoryType;

	@ApiModelProperty(value = "优惠标签: 1 满减 2 折扣 3 满赠 4 低价 5 优惠套餐.")
	private Integer couponType;

	@ApiModelProperty(value = "发布人类型：1用户和商家 2京东和美团系统抓取 3享库存系统抓取")
	private Integer infoSource;

	@NotNull
	@ApiModelProperty(value = "0综合(搜索使用) 1线上 2线下", required = true)
	private Integer postType;

	@ApiModelProperty(value = "纬度")
	private BigDecimal lat;

	@ApiModelProperty(value = "经度")
	private BigDecimal lng;

	@ApiModelProperty("信息来源平台：0 未知 1 羊值厂 2 淘宝 3 京东 4 拼多多 5 唯品会 6 美团 7 其它。默认 0")
	private Integer platform;

}
