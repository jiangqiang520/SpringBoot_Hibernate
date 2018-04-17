package com.jqiang.hello.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.ImmutableMap;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseInfo<T> {
	public static final String KEY_CODE = "code";
	public static final String KEY_MESSAGE = "message";
	public static final String KEY_DATA = "data";
	public static final String CODE_SUCCESS = "0000";
	public static final String CODE_ERROR = "9999";

	private static final ImmutableMap<String, String> codeMap = ImmutableMap
			.of(CODE_SUCCESS, "成功", CODE_ERROR, "系统异常，请稍后再试");

	private String code;

	private String message;

	private T data;

	public static <T> ResponseInfo<T> success(T data) {
		return new ResponseInfo<>(CODE_SUCCESS, codeMap.get(CODE_SUCCESS), data);
	}

	public static <T> ResponseInfo<T> error(T data) {
		return new ResponseInfo<>(CODE_ERROR, codeMap.get(CODE_ERROR), data);
	}

	@JsonIgnore
	public boolean isSuccess() {
		return CODE_SUCCESS.equals(code);
	}
}
