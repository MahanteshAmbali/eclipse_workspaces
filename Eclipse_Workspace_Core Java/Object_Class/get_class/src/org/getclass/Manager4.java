package org.getclass;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface E{
	
}

@Deprecated
@E
class F{
	
}

public class Manager4 {

	public static void main(String[] args){
		
		F f1 = new F();
		Class c1 = f1.getClass();
		
		Annotation[] ann = c1.getDeclaredAnnotations();
		for (Annotation annotation : ann) {
			System.out.println(annotation);
		}

	}

}
