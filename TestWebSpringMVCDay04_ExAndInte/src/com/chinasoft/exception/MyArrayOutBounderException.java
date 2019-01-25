package com.chinasoft.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="数组下标越界")
public class MyArrayOutBounderException extends RuntimeException {

	/**
	 * 凡是当前类，或父类或父类的父类实现了序列化（Serializable接口）则建议编写序列ID
	 */
	private static final long serialVersionUID = 1L;

}
