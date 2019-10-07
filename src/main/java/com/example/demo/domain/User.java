/**
 * 
 */
package com.example.demo.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Administrator
 *
 */
@Getter
@Setter
@ToString
public class User {
	
	private String name;
	
	@JsonIgnore
	private String password;
	
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss a",locale = "zh",timezone = "GMT+8")
	private Date birthDate;
	
	@JsonInclude(Include.NON_NULL)
	private String desc;
	
	private Integer sex;

}
