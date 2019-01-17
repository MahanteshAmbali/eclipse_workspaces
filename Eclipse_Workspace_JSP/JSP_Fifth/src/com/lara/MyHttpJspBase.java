package com.lara;

import javax.servlet.jsp.HttpJspPage;
import org.apache.jasper.runtime.HttpJspBase;

public abstract class MyHttpJspBase extends HttpJspBase 
{

	public String sayHello(){
		return "hello to all";
	}
}
