import java.util.Scanner;

public class ArrayCreation {
    
    public static void main(String[] args) {
        
        // initilizing a new array 
        Scanner a = new Scanner(System.in);

        System.out.print("Enter Number of Elements in the array:");
        int arrSize = a.nextInt();
        int[] arr = new int[arrSize];

        // Taking the array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = a.nextInt();
        }

        // printing the array
        /*System.out.println("The Elements:");
        for (int i = 0; i < arrSize; i++) {
            System.out.println(arr[i]);
        }*/


        // insering a new elements to our previous array
        int newArrSize = arrSize+1;
        int[] newArr = new int[newArrSize];


        System.out.print("Enter the Index in you want to add a new element:");
        int toIndex = a.nextInt();

        System.out.print("Enter the new element:");
        int newElement = a.nextInt();

        for(int i = 0; i < newArrSize; i++ ){

            if (i<toIndex) {
                newArr[i] = arr[i];
            }else if(i == toIndex){
                newArr[i] = newElement;
            }else{
                newArr[i] = arr[i-1];
            }
        }

        System.out.println("The Elements:");
        for (int i = 0; i < newArrSize; i++) {
            System.out.println(newArr[i]);
        }
    }
}
