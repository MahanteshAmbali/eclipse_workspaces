package com.lara;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class HelloTag implements Tag{

	private PageContext pc = null;
	
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("doEndTag");
		return EVAL_PAGE;
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		System.out.println("Do start tag");
		JspWriter out = pc.getOut();
		try {
			out.println("Hello to all");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
	}

	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		System.out.println("getParent");
		return null;
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub
		System.out.println("release");
	}

	@Override
	public void setPageContext(PageContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("setPageContext()");
		pc = arg0;
		
	}

	@Override
	public void setParent(Tag arg0) {
		// TODO Auto-generated method stub
		System.out.println("setParent");
	}

}
