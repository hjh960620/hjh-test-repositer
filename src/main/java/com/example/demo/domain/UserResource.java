/**
 * 
 */
package com.example.demo.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Administrator
 *
 */
//声明该类会引用资源文件
//@Configuration
//为字段加上前缀，对应资源文件
//@ConfigurationProperties(prefix = "com.hjh")
//声明配置文件的位置
//@PropertySource(value = "classpath:resource.properties")
public class UserResource {
	
	private String name;
	private Integer age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserResource [name=" + name + ", age=" + age + "]";
	}
	
	
}
