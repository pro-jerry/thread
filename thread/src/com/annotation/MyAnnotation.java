package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Retention(RetentionPolicy.RUNTIME)
//@Retention(RetentionPolicy.SOURCE)
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE,//用于描述类，接口（包括注解类型）或enum声明
		ElementType.CONSTRUCTOR,//用于描述构造器
		ElementType.FIELD,//用于描述域
		ElementType.LOCAL_VARIABLE,//用于描述局部变量
		ElementType.METHOD,//用于描述方法
		ElementType.PACKAGE,//用于描述包
		ElementType.PARAMETER//用于描述参数
		})
public @interface MyAnnotation {

}
