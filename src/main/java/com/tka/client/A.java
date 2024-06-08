package com.tka.client;

import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

public class A {
	public A() {
		System.err.println("A const");
	}

	public void m1() {
		System.err.println("A m1");
	}
	@Async
	public void hello()  {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hello");
		}
	}
}
