package com.annotation;

import com.annotation.FruitColor.Color;

public class Apple {

	@FruitName("apple")
	private String appleName;
	
	@FruitColor(fruitColor=Color.GREEN)
	private String appleColor;

	@FruitProvider(id=1,address="陕西红富士集团",name="陕西省西安市延安路89号红富士大厦")
	private String appleProvider;
	
	
	public String getAppleName() {
		return appleName;
	}

	public void setAppleName(String appleName) {
		this.appleName = appleName;
	}

	public String getAppleColor() {
		return appleColor;
	}

	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}

	public String getAppleProvider() {
		return appleProvider;
	}

	public void setAppleProvider(String appleProvider) {
		this.appleProvider = appleProvider;
	}
	
	
}
