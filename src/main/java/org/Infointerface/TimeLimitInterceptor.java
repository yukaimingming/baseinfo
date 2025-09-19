package org.Infointerface;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.Infointerface.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class TimeLimitInterceptor implements HandlerInterceptor {

    // 固定允许访问的时间段
    private static final LocalDate START_DATE = LocalDate.of(2025, 8, 30);
    private static final LocalDate END_DATE = LocalDate.of(2025, 9, 15); // 包含最后一天
    // 将对象转换为 JSON 字符串
    @Autowired
    ObjectMapper mapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        LocalDate now = LocalDate.now();

        // if (now.isBefore(START_DATE) || now.isAfter(END_DATE)) {
        //     Result<Void> result = Result.failure("访问失败: " + "接口访问已过期！请联系管理员。");
        //     log.info("❌ 访问失败: " + "接口访问已过期！请联系管理员。");
        //     response.setStatus(HttpStatus.FORBIDDEN.value());
        //     response.setContentType("application/json;charset=UTF-8");
        //     response.getWriter().write(mapper.writeValueAsString(result));
        //     return false;
        // }
        return true;
    }
}
