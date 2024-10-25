package com.pcwk.ehr.ed02;


//함수형 인터페이스 문법 체크 : 함수가 한개만 있어야 한다.
@FunctionalInterface
public interface MathOperation {
	int operation(int x, int y);

}
