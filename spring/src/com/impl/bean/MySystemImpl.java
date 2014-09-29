package com.impl.bean;

import javax.annotation.Resource;

import com.impl.MoHe;
import com.impl.MySystem;
import com.impl.Paper;

public class MySystemImpl implements MySystem {
	
	@Resource MoHe moHe;
	@Resource Paper paper;

	public void setMoHe(MoHe moHe) {
		this.moHe = moHe;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	@Override
	public String systemText() {
		moHe.mymh("");
		paper.paperSize("");
		System.out.println("开始打印");
		return null;
	}

}
