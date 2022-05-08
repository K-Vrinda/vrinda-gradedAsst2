package question1;

import java.util.Scanner;
import java.util.Stack;

public class SkyScrapperFloorsMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the total no of floors in the building: ");
		
		int nFloors = scanner.nextInt();
		int currentMax = nFloors;
		int day = 1;
		Stack<Integer> s = new Stack<>();
		boolean isConstructionDone = false;
		
		int floorsArray[] = new int[nFloors];
//		SkyScrapperFloors obj = new SkyScrapperFloors(nFloors);
		
		for(int i = 0; i < nFloors; i++) {
			System.out.println("Enter the floor size given on day : ");
			floorsArray[i] = scanner.nextInt();
		}
		
		System.out.println("The order of construction is as follows");
		
		while(currentMax >= 1) {
			
			int floor = floorsArray[day-1];
			String floors = "";
			s.push(floor);
			
			while((!s.empty()) && (currentMax == s.peek().intValue())) {
				floors += s.pop();
				floors += " ";
				currentMax--;
				isConstructionDone = true;
			}
			System.out.println("Day "+ day);
			if(isConstructionDone) {
				System.out.println(floors);
			}else {
				System.out.println();
			}
	
			day++;
			isConstructionDone = false;
		}
		
		scanner.close();

	}

}
