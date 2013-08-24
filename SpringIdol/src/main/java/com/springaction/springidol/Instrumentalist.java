package com.springaction.springidol;

import com.springaction.springidol.springexceptions.PerformanceException;

public class Instrumentalist implements Performer {

	
	 private Instrument instrument;
	public Instrumentalist() {
		// TODO Auto-generated constructor stub
	}
	
	private String song; 

	public void perform() throws PerformanceException {
		System.out.print("Playing"+getSong()+":");
		instrument.play();

	}

	private String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	
	
	
	
}
