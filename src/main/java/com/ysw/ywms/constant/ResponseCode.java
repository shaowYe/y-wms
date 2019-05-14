package com.ysw.ywms.constant;

public enum ResponseCode {

    SUCCESS("0000", "请求成功"),
    MISS_PARAMETER("0001", "缺少参数"),
    FAKE_SESSION("0009", "Session无效"),
    SERVICE_ERROR("0500", "服务不可用"),
    ERROR("2000", "失败"),
    NULL_PARAMETER("2001", "缺少参数"),
    FORMAT_PARAMETER_ERROR("2002", "参数格式错误"),
    INVALID_VERIFCODE("2003", "无效的验证码"),
    DEL_SUBACCOUNT_FAILURE("2004", "子账号删除失败"),
    REP_SUBACCOUNT_ADD("2005", "该账号已存在"),
    INVALID_ACCOUNT("2006", "该账号已停用"),
    VERIF_CUST_FAILURE("2007","验证失败"),
    CARDIFNO_ERROR("2008","客户信息校验失败"),
    NULL_ESIGN("2009", "无订单信息或无授权返回结果"),
    NULL_PARAMETER_VAL("2010", "参数值不能为空"),
    INVALID_JSON("2011", "无效的JSON"),
    DISABLE_ACCOUNT("2012", "该账号已停用"),
    INVALID_SESSION("2222", "身份验证已过时"),
    SERVER_ERROR("3000", "系统异常"),
    UNKNOW_ERROR("4000", "未知错误");
	//该账号不存在

    private String code;
    private String message;

    ResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
