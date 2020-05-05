import java.util.Arrays;
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the required size of the array(>=3) :: ");
            int size = sc.nextInt();
            int[] myArray= new int[size];
           
            System.out.println("Enter the elements of the array one by one ");
            System.out.println("================================");
            for(int i=0;i<size;i++) {
            	myArray[i] = sc.nextInt();
            }
            sc.close();
            System.out.println("Contents of the array are: "+Arrays.toString(myArray));
            for(int i = size-1 ; i>size-1-3;i--) {//k;size-1-k;k=3
            	for(int j = 0; j<i;j++ ) {
            	if(myArray[j]> myArray[i]) {	
            		int a = myArray[i];
            		myArray[i] = myArray[j];
            		myArray[j] = a;
            	}
            	}
            //	System.out.println("Third largest number in the array:"+myArray[i]);
            }
           // System.out.println("Sorted array: "+Arrays.toString(myArray));
            System.out.println("Third largest number in the array: "+myArray[size-3]);
           // System.out.println("Max and Min values in the array: "+myArray[size-1]+" and"+myArray[0]);

    }

}