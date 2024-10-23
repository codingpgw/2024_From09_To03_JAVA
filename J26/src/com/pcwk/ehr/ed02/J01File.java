package com.pcwk.ehr.ed02;

import java.io.File;

public class J01File {

	public static void main(String[] args) {	
		
		System.out.printf("File.pathSeparaotr : %s%n",File.pathSeparator);
		System.out.printf("File.pathSeparaotr : %s%n",File.pathSeparatorChar);
		//Windows path구분자
		//C:\app\acorn\product\18.0.0\dbhomeXE\bin;C:\Program Files\Common Files\Oracle\Java\javapath
		
		
		//Unix path구분자
		//pcwk@user:~$ echo $PATH$
		///usr/lib/jvm/java-8-openjdk-amd64/bin:/usr/local/sbin:/usr/local/bin:
		
		System.out.println("================================================");
		
		System.out.printf("File.Separaotr : %s%n",File.separator);
		System.out.printf("File.Separaotr : %s%n",File.separatorChar);
	}

}
//File.pathSeparaotr : ;
//File.pathSeparaotr : ;
//================================================
//File.Separaotr : \
//File.Separaotr : \

