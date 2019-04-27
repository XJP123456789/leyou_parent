package com.leyou.user.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private IErrorCode iErrorCode;

    private String errorCode;
    private String errorMessage;
    private Map<String, Object> errorData;

    public BusinessException(SysErrorEnums errorParame) {
    }

}