package com.impl.bean;

import com.impl.Paper;

public class PaperImplB implements Paper {

	@Override
	public String paperSize(String str) {
		System.out.println("B5纸");
		return null;
	}

}
