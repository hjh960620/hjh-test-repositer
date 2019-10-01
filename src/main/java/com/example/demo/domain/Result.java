/**
 * 
 */
package com.example.demo.domain;

/**
 * @author Administrator
 *自定义的专门用来封装数据的类
 */
public class Result {
	
	/**
	 * status:用来返回的数据的状态，分别有：
	 * 200：成功
	 * 500：失败
	 * 555：出现异常
	 * 	 
	 */
	
	private Integer status;
	private String msg;
	private Object data;
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public Result() {
		
	}
	
	public Result(Integer status,String msg,Object obj) {
		this.status = status;
		this.msg = msg;
		this.data = obj;
	}
	
	public static Result success(Object data) {
		return new Result(200, "成功", data);
	}
	
	public static Result error(String msg) {
		return new Result(500, "失败", "");
	}
	
	public static Result errorException(String msg) {
		return new Result(555, msg, "");
	}
}
