// ## write a program to find the distance between x and y from an array 

public class minDistInArray {

    int getMinDist(int arr[], int x, int y){

        int minDist     = Integer.MAX_VALUE;
        int arrLength   = arr.length;

        for (int i = 0; i < arrLength; i++) {
            for(int j = i; j < arrLength; j++){

                if (((arr[i] == x && arr[j] == y || arr[i] == y && arr[j] == x) && minDist > Math.abs(i - j))){
                    minDist = Math.abs(i-j);
                }
            }
        }
        if (minDist > arrLength) {
            return -1;
        }
        return minDist;
    }
    public static void main(String[] args) {

        int arr[] = { 3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3 };
        int x     = 3;
        int y     = 6;

        minDistInArray minDist = new minDistInArray();
        int result = minDist.getMinDist(arr, x, y);

        System.out.println("Minimum distance between " + x + " and " + y + " is " + result);
    }
    
}

