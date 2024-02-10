import java.util.Random;

public class arrayOperations {

    /**
     * @author Ahmet Eren Gözübenli
     * @param arraySize
     * @return randomly filled array
     */
    //create the array with random numbers in range 0-100
    public static int[] createArray(int arraySize)
    {
        Random rand = new Random();

        int[] newArray = new int[arraySize];

        for(int i = 0 ; i < arraySize ; i++)
        {
            newArray[i] = rand.nextInt(100);
        }
        return newArray;
    }

    /**
     * @author Eren Özilgili
     * @param arr
     * 
     * -Displays the array
     */
    public static void displayArray(int[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + ", ");
            
        }

        System.out.print(arr[arr.length - 1] + "]\n");//This is for formatting concerns

    }

    /**
     * @author Hikmet Şamil Karaş
     * @param arr
     * @return the sum of the elements in the array at even and odd indexes
     *
     */
    //returns the sum of the elements in the array at even and odd indexes
    public static int [] getSumOfIndexes(int[] arr) {
        int[] result = {0, 0};
        //iterate through the array and add the elements to the result array at the even and odd indexes
        for(int i = 0; i < arr.length; i++) {
            result[i%2] += arr[i];
        }
        return result;
    }
 
    /**
     * @author Eren Özilgili
     * @param arr
     * @return the minimum of the given array
     * 
     * -Returns the minimum of the given array by 
     * iterating through succesive indexes
     */
    public static int minOfArray(int[] arr){

        int min = 0;        

        //By default, if array is not properly filled, 0 will be returned
        if(arr.length > 0){
            min = arr[0];
            for(int i = 0; i < arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            
        }

        return min;
    }

    /**
     * @author Eren Öziligli
     * @param arr
     * @return the maximum of the given array
     * 
     * -Returns the maximum of the given array by 
     * iterating through succesive indexes
     */
    public static int maxOfArray(int[] arr){
        int max = 0;     

        //By default, if array is not properly filled, 0 will be returned
        if(arr.length > 0){
            max = arr[0];
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            
        }
        
        return max;
    }

    /**
     * @author Burak Tutuş
     * @param arr
     * @return the average of the given array
     * 
     * -Returns the average of the given array 
     */
    public static int averageOfArray(int [] arr)
    {
        int sum = 0;
        int average = 0;        
        //  we get the sum of elements in array
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        // by dividing the sum to the number of elements we get total
        average = sum / arr.length;        
        return average;
        
    }
    /**
     * @author Burak Tutuş
     * @param arr     
     * 
     * -Displays the difference of each element compared to average
     */
    public static void differencesOfAverage(int [] arr)
    {
        int [] result = new int[arr.length];
        //creating an array that stores the differences between elements and average
        for(int i = 0; i < arr.length; i++)
        {
            result[i] = arr[i] - averageOfArray(arr);
        }
        // displaying the array
        System.out.print(result[0]);
        for(int i = 1; i < arr.length; i++)
        {
            System.out.print("," + result[i]);
        }
        System.out.println();

    }
   
    
}