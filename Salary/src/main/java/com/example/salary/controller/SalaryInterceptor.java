package com.example.salary.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Component
public class SalaryInterceptor implements HandlerInterceptor {
  @Value("${active.profile}")
  private String activeProfile;

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
          throws Exception {
    var ipAddr = "";
    ipAddr = request.getHeader("X-FORWARDED-FOR");
    if (ipAddr == null || "".equals(ipAddr)) {
      ipAddr = request.getRemoteAddr();
      log.info("{} hit for environment {}", ipAddr, activeProfile);
    }
    return true;
  }
}
