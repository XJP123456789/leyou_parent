package com.leyou.common.exception;

import com.leyou.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * @author bystander
 * @date 2018/9/15
 *
 * 自定义异常类
 */
@Getter
@NoArgsConstructor
public class LyException extends RuntimeException {

    private ExceptionEnum exceptionEnum;

    public LyException(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }


}
