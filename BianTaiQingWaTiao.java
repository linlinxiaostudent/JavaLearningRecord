package niuke;

import java.util.Scanner;

public class BianTaiQingWaTiao {
	public int jumpFloor(int target){
    	int count =0;
        if(target <=0)
            return count;
        else if(target==1)
            return 1;
        else if(target==2)
            return 2;
        else{
        	for(int j=0;j<target;j++)
        		count = count+jumpFloor(j);  
        	count =count+1;
            return count;
            }
	}
	public static void main(String[] args) {
		BianTaiQingWaTiao q= new BianTaiQingWaTiao();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int num;
		num = q.jumpFloor(n);
		System.out.println(num);
	}
}

