/**
 * 
 */
package com.example.demo.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.domain.Result;

/**
 * @author Administrator
 *自定义全局异常捕获
 */
//声明该类是一个控制器加强类
@RestControllerAdvice
public class ExceptionHandler {
	
	@org.springframework.web.bind.annotation.ExceptionHandler(value = RuntimeException.class)
	public Object errorExceptionHandler(Exception e,HttpServletRequest request)throws RuntimeException {
		
		e.printStackTrace();
		if(isAjaxRequest(request)) {
			return Result.errorException(e.getMessage());
		}
		return "";
	}
	
	
	/**
	 * 判断请求是否是Ajax请求
	 * @param request
	 * @return
	 */
	public static boolean isAjaxRequest(HttpServletRequest request) {
		return (request.getHeader("X-Requested-With")!=null &&
				"XMLHttpRequest".equals(request.getHeader("X-Requested-With").toString()));
	}

}
