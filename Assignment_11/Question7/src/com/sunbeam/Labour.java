package com.sunbeam;

public class Labour implements Emp {
	private double hours;
	private double rate;
	
	public Labour(double hours, double rate) {
		this.hours = hours;
		this.rate = rate;
	}
	
	@Override
	public double getSal() {
		return hours*rate;
	}
	
	@Override
	public double calcIncentives() {
		if (hours > 300) 
		{
            return 0.05 * getSal();
        } 
		else 
        {
            return 0.0;
        }
		
	}
	
}
