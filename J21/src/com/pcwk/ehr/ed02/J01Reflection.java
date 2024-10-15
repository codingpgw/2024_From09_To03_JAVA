package com.pcwk.ehr.ed02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.pcwk.ehr.cmn.PLog;

public class J01Reflection implements PLog {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
		String name = "Java";
		log.debug("{} 문자열의 길이 {}",name, name.length());
		log.debug("{} 문자열의 문자[0] {}",name, name.charAt(0));
		
		Method lm = String.class.getMethod("length");
		
		int nameLeghth = (int)lm.invoke(name);
		log.debug("리플렉션 {} 문자열의 길이 {}",name, nameLeghth);
		
		//메서드에 파라메터 전달
		Class rClazz = String.class;
		Method cm = rClazz.getMethod("charAt",int.class);
		log.debug("{} 문자열의 문자[0] {}",name, cm.invoke(name, 0));
		
		Class<?> dbClazz = Class.forName("java.lang.String");
		
		Method cd = dbClazz.getMethod("charAt", int.class);
		log.debug("{} 문자열의 문자[0] {}",name, cd.invoke(name, 0));
		
		
	}

}
