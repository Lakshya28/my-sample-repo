package Assignment1;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number - ");  
        int n = sc.nextInt();
        if(n<0)
        {
            System.out.println("Wrong Input");
        }
        else
        {
            int a=2,x=4;
            while(n>0)
            {
                System.out.println(a);
                a+=x;
                x+=2;
                n--;
            }
        }
        sc.close();
    }
}
