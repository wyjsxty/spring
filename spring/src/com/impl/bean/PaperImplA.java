package com.impl.bean;

import com.impl.Paper;

public class PaperImplA implements Paper {

	@Override
	public String paperSize(String str) {
		System.out.println("A4纸");
		return null;
	}

}
