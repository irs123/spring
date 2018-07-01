package com.irs;

import org.springframework.stereotype.Component;

@Component
public class Car implements vehicle{

	public void derive()
	{
		System.out.println("The  main Car ");
	}
}