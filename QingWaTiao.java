package niuke;

import java.util.Scanner;
public class QingWaTiao {
    public int jumpFloor(int target){
    	int count =0;
        if(target <=0)
            return count;
        else if(target==1)
            return 1;
        else if(target==2)
            return 2;
        else
            {count = jumpFloor(target-1)+jumpFloor(target-2);
            return count;}
	}
	public static void main(String[] args) {
		QingWaTiao q= new QingWaTiao();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int num;
		num = q.jumpFloor(n);
		System.out.println(num);
	}
}

