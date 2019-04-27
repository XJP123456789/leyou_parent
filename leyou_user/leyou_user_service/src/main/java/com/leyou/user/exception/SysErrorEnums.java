package com.leyou.user.exception;




public enum SysErrorEnums implements IErrorCode {

    /**
     * 参数为空
     */
    EMPTY_PARAME(110, "参数为空"),
    /**
     * 参数错误
     */
    ERROR_PARAME(111, "参数错误"),

    ;
    private String errorCode;
    private String errorMessage;

    SysErrorEnums(Integer errorCode, String errorMessage) {
    }

    @Override
    public Integer getErrorCode() {
        return null;
    }

    @Override
    public String getErrorMessage() {
        return null;
    }
}