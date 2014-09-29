package com.srpinttext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.impl.bean.MySystemImpl;


public class Text {
	
	public void TextSpring(){
		ApplicationContext act = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		MySystemImpl impl = (MySystemImpl)act.getBean("sys");
		impl.systemText();
	}
	
	

	public static void main(String[] args) {
		new Text().TextSpring();

	}

}
