package com.springaction.springidol;

import com.springaction.springidol.springexceptions.PerformanceException;

public class PoeticJuggler extends Juggler {
  private Poem poem;
	
	 
	
	public PoeticJuggler(Poem poem){
		super();
		this.poem = poem;
	}
	
	public PoeticJuggler (int beanBags,Poem poem){
		
		super(beanBags);
		this.poem = poem;
	}
	
	
   public void perform() throws PerformanceException{
	   super.perform();
	   poem.recite();
	   System.out.println("howdy");
   }
}
