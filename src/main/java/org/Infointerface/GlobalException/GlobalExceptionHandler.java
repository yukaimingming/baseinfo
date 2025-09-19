package org.Infointerface.GlobalException;

import org.Infointerface.entity.Result;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private Log log = LogFactory.getLog(getClass());
    @Autowired
    private ObjectMapper objectMapper;

    // public ResponseEntity<String> handleException(Exception ex) {
    // ex.printStackTrace(); // 打印日志
    // return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
    // .body("系统错误: " + ex.getMessage());
    // }
    // @ExceptionHandler(MethodArgumentNotValidException.class)
    // public Result<Void> handleException(MethodArgumentNotValidException ex)
    // throws JsonProcessingException {
    // ex.printStackTrace(); // 打印日志
    // // 把所有字段错误拼接成一个字符串
    // String errorMsg = ex.getBindingResult()
    // .getFieldErrors()
    // .stream()
    // .map(error -> error.getField() + ":" + error.getDefaultMessage())
    // .reduce((m1, m2) -> m1 + "; " + m2)
    // .orElse("参数校验失败");

    // // Result retmsg = new Result();
    // // retmsg.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
    // // retmsg.setMessage("参数校验失败: " + errorMsg);
    // Result<Void> retmsg = Result.failure("参数校验失败: " + errorMsg);
    // log.info("❌ 返回响应参数: " +
    // objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(retmsg));
    // return retmsg;
    // }

    @ExceptionHandler({ DataIntegrityViolationException.class, ConstraintViolationException.class
    })
    public Result<Void> handleDataIntegrityViolationException(Exception ex) throws JsonProcessingException {
        ex.printStackTrace(); // 打印日志
        // Result retmsg = new Result();
        // retmsg.setCode(HttpStatus.CONFLICT.value()); // 409 冲突
        // retmsg.setMessage("数据库唯一约束冲突: " + ex.getMessage());
        Result<Void> retmsg = Result.failure("数据库唯一约束冲突: " + ex.getMessage());
        log.info(" 返回响应参数: " + objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(retmsg));
        return retmsg;
    }

    /**
     * 处理业务异常（自定义异常类，比如 BusinessException）
     */
    // @ExceptionHandler(BusinessException.class)
    // public Retmsg handleBusinessException(BusinessException ex) {
    // ex.printStackTrace();
    // return new Retmsg(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
    // }

    /**
     * 处理 Spring 的 BindException（主要是 GET 请求的参数绑定异常）
     */
    // @ExceptionHandler(org.springframework.validation.BindException.class)
    // public Result
    // handleBindException(org.springframework.validation.BindException ex) {
    // ex.printStackTrace();
    // String errorMsg = ex.getBindingResult()
    // .getFieldErrors()
    // .stream()
    // .map(error -> error.getField() + ":" + error.getDefaultMessage())
    // .reduce((m1, m2) -> m1 + "; " + m2)
    // .orElse("参数绑定失败");
    // Result retmsg = new Result();
    // retmsg.setCode(HttpStatus.BAD_REQUEST.value());
    // retmsg.setMessage("参数校验失败: " + errorMsg);
    // return retmsg;
    // }

    /**
     * 捕获空指针异常（常见错误）
     */
    // @ExceptionHandler(NullPointerException.class)
    // public Retmsg handleNullPointerException(NullPointerException ex) {
    // ex.printStackTrace();
    // Retmsg retmsg = new Retmsg();
    // retmsg.setCode(HttpStatus.BAD_REQUEST.value());
    // retmsg.setMessage("参数校验失败: " + errorMsg);
    // return retmsg;
    // }

    /**
     * 全局兜底异常处理（最后一道防线）
     */
    @ExceptionHandler({ Exception.class })
    public Result<Void> handleException(Exception ex) throws JsonProcessingException {
        ex.printStackTrace();
        Result<Void> retmsg = Result.failure("系统异常: " + ex.getMessage());
        log.info("返回响应参数: " + objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(retmsg));
        return retmsg;
    }

}
