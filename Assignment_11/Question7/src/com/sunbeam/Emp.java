package com.sunbeam;

public interface Emp {
	/*public abstract*/double getSal();

	/*public*/default double calcIncentives() {
		return 0.0;
	}

	/*public*/static double calcTotalIncom(Emp arr[]) {
		double totalIncome = 0.0;
		for (Emp e : arr) {
			totalIncome = e.getSal() + e.calcIncentives();
		}
		return totalIncome;
	}
}
