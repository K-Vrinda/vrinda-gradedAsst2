package question1;

import java.util.Stack;

public class SkyScrapperFloors {
	int nFloors;
	Stack<Integer> s = new Stack<>();
	int currentMax = this.nFloors;
	int day = 1;
	boolean isConstructionDone = false;
	
	public SkyScrapperFloors(int nFloors) {
		this.nFloors = nFloors;
	}
	
	void meth(int floor) {

		
		String floors = "";
		this.s.push(floor);
		
		while((!this.s.empty()) && (this.currentMax == this.s.peek().intValue())) {
			floors += this.s.pop();
			floors += " ";
			this.currentMax--;
			this.isConstructionDone = true;
		}
		
		System.out.println("Day "+ this.day);
		if(this.isConstructionDone) {
			System.out.println(floors);
		}else {
			System.out.println();
		}

		this.day++;
		this.isConstructionDone = false;
	}

}
