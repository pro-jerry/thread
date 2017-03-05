
package com.annotation;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

@MyAnnotation
public class MyTest {

	@MyAnnotation
	private String name;
	
	@MyAnnotation
	public MyTest() {
	}

	@MyAnnotation
	public void setName(@MyAnnotation String name){
		
		
	}
	
	@Test
	public void test1(){
		
		@MyAnnotation
		String value;
		
		Orange orange = new Orange();
		orange.displayName();
		orange.showPaste();
	}
	
	/**
	 * @SuppressWarnings
	 * 常见的参数:
	 * 1.deprecation 使用了不赞成使用的类或方法时的警告
	 * 2.unchecked 执行了未检查的转换时的警告
	 * 3.fallthrough 当 Switch 程序块直接通往下一种情况而没有 Break 时的警告
	 * 4.path 在类路径、源文件路径等中有不存在的路径时的警告
	 * 5.serial 当在可序列化的类上缺少 serialVersionUID 定义时的警告
	 * 6.finally 任何 finally 子句不能正常完成时的警告
	 * 7.all 关于以上所有情况的警告
	 * @return
	 */
	@SuppressWarnings({"rawtypes","unchecked"})
	public static List<Fruit> getFruitList(){
		
		List<Fruit> list = new ArrayList<>();
		
		return list;
	}
	
	
	public static void main(String[] args) {
		
		getFruitList();
	}
}
