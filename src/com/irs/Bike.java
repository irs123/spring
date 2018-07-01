package com.irs;

import org.springframework.stereotype.Component;

@Component
public class Bike implements vehicle {
	public void derive()
	{System.out.println("Bike vala");}
}
