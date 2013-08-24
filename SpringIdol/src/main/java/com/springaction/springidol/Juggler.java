package com.springaction.springidol;

import com.springaction.springidol.springexceptions.PerformanceException;

public class Juggler implements Performer {

	
	 private int beanBags = 3;
	 
	 public Juggler(){}
	public Juggler(int beanBags) {
          this.beanBags = beanBags;		
	}

	public void perform() throws PerformanceException {
	   System.out.println("Juggling "+beanBags + "  Bean Bags");

	}

}
