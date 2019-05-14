package com.ysw.ywms.entity;

import com.ysw.ywms.constant.ResponseCode;

import java.util.HashMap;

/**
 * 格式化返回结果
 *
 * @author V_HS26CA
 *
 */
public class ResponseResult {
	private String code;
	private String message;
	private Object data;
	
	public ResponseResult(ResponseCode resCode, Object data) {
        this.code = resCode.getCode();
        this.message = resCode.getMessage();
        this.data = data;
    }

	public ResponseResult(String code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public static ResponseResult success() {
		return new ResponseResult(ResponseCode.SUCCESS, null);
	}

	public static ResponseResult success(String message) {
		return new ResponseResult(ResponseCode.SUCCESS.getCode(), message, null);
	}

	public static ResponseResult success(Object o) {
		return new ResponseResult(ResponseCode.SUCCESS, o);
	}

	public static ResponseResult success(String message, Object o) {

		return new ResponseResult(ResponseCode.SUCCESS.getCode(), message, o);
	}

	public static ResponseResult success(String code, String message, Object o) {

		return new ResponseResult(code, message, o);
	}

	public static ResponseResult error() {

		return new ResponseResult(ResponseCode.ERROR, null);
	}
	
	public static ResponseResult error(ResponseCode resCode) {
        return new ResponseResult(resCode, null);
    }
	
	public static ResponseResult error(String message) {
        return new ResponseResult(ResponseCode.ERROR.getCode(), message, null);
    }

	public static ResponseResult error(String code, String message) {
		return new ResponseResult(code, message, null);
	}
	
	public static ResponseResult error(ResponseCode code,Object data) {
		return new ResponseResult(code, data);
	}
	
	public static ResponseResult error(String code, String message, Object data) {
		return new ResponseResult(code, message, data);
	}



	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data == null ? new HashMap<>():data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
