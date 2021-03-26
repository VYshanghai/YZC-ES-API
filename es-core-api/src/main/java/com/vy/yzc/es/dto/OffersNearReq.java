package com.vy.yzc.es.dto;

import com.vy.yzc.es.eo.BaseEsPageReq;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author: vikko
 * @Date: 2021/3/24 19:47
 * @Description:
 */
@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OffersNearReq extends BaseEsPageReq {

	private BigDecimal lat;

	private BigDecimal lng;
}
