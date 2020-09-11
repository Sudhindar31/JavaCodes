package com.xworkz.java.hashmap;

import java.util.HashMap;

public class TraineeClass {

	String trainee;
	int noofclassesreg;

	public TraineeClass(String trainee, int noofclassesreg) {
		super();
		this.trainee = trainee;
		this.noofclassesreg = noofclassesreg;
	}

	public String getTrainee() {
		return trainee;
	}

	public int getNoofclassesreg() {
		return noofclassesreg;
	}

	public void setTrainee(String trainee) {
		this.trainee = trainee;
	}

	public void setNoofclassesreg(int noofclassesreg) {
		this.noofclassesreg = noofclassesreg;
	}

	@Override
	public String toString() {
		return "TraineeClass [trainee=" + trainee + ", noofclassesreg=" + noofclassesreg + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		/*TraineeClass other = (TraineeClass) obj;
		if (noofclassesreg != other.noofclassesreg)
			return false;
		if (trainee == null) {
			if (other.trainee != null)
				return false;
		} else if (!trainee.equals(other.trainee))
			return false;*/
		return (this.getNoofclassesreg()==((TraineeClass)obj).getNoofclassesreg() && this.getTrainee().equals(((TraineeClass)obj).getNoofclassesreg()));
	}
	
	@Override
	public int hashCode() {
		return noofclassesreg;
	}

	public static void main(String[] args) {
		HashMap<String, Integer> tc = new HashMap<>();
		
		tc.put("Mike", 2 );
		tc.put("Mike", 2 );
		tc.put("Drake", 3);
		tc.put("Olivia", 2);
		tc.put("Brian", 3);
		
	}

}
