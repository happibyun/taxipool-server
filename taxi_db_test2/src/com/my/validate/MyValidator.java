package com.my.validate;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.my.vo.CustomerInfo;

public class MyValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return CustomerInfo.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		String field = "id";
		String errorCode = "required";
		//target커맨드객체의 id필드가 empty인 경우
		//id필드에 대한 에러를 추가한다
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, field, errorCode);
	}

}
