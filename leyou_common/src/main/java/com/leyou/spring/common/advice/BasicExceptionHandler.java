package com.leyou.spring.common.advice;


import com.leyou.spring.common.exception.LyException;
import com.leyou.spring.common.vo.ExceptionResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author bystander
 * @date 2018/9/15
 *
 * 自定义异常处理
 */
@Slf4j
@ControllerAdvice
public class BasicExceptionHandler {

    @ExceptionHandler(LyException.class)
    public ResponseEntity<ExceptionResult> handleException(LyException e) {
        return ResponseEntity.status(e.getExceptionEnum().value())
                .body(new ExceptionResult(e.getExceptionEnum()));
    }
}
