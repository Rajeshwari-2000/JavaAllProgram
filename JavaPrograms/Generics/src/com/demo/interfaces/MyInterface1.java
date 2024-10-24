package com.demo.interfaces;

import com.demo.beans.A;

public interface MyInterface1<T extends A> {
	 void display(T ob);
}
