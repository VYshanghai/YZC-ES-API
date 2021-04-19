package com.vy.yzc.es.enums;

/**
 * @Description: ES 匹配字段
 * @Date: 2021-04-19 10:13:01
 * @Author: 飞拳
 */
public enum MatchFieldEnum {

	/**
	 * 枚举值
	 */
	UNDEFINED_ENUM(-1, "未定义枚举"),
	OFFERS_TITLE(1, "爆料标题"),
	OFFERS_CONTENT(2, "爆料内容"),
	SHOP_NAME(3, "店铺名"),
	COMMENT_CONTENT(4, "晒单简介");

	MatchFieldEnum(int code, String msg){
		this.code = code;
		this.msg = msg;
	}
	private final Integer code;
	private final String msg;

	public int getCode(){
		return code;
	}

	public String getMsg(){
		return msg;
	}

	public static MatchFieldEnum getEnumByCode(Integer code){
		if (code != null){
			for (MatchFieldEnum typeEnum : MatchFieldEnum.values()){
				if (typeEnum.getCode() == code){
					return typeEnum;
				}
			}
		}
		return MatchFieldEnum.UNDEFINED_ENUM;
	}
}
