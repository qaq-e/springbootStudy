package com.zk.springbootzk.demos.config;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
@Slf4j
public class GlobalExceptionHandler {

//    @ExceptionHandler(MissingServletRequestParameterException.class)
//    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
//    public JsonResult2 handleHttpMessageNotReadableException(
//            MissingServletRequestParameterException ex) {
//        log.error("缺少请求参数，{}", ex.getMessage());
//        return new JsonResult2("400", "缺少必要的请求参数");
//    }

    /**
     * 系统异常 预期以外异常
     * @param ex
     * @return
     */
//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    public JsonResult handleUnexpectedServer(Exception ex) {
//        log.error("系统异常：", ex);
//        return new JsonResult("500", "系统发生异常，请联系管理员");
//    }

    /**
     * 拦截业务异常，返回业务异常信息
     * @param ex
     * @return
     */
//    @ExceptionHandler(BusinessErrorException.class)
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    public JsonResult handleBusinessError(BusinessErrorException ex) {
//        String code = ex.getCode();
//        String message = ex.getMessage();
//        return new JsonResult(code, message);
//    }
}

