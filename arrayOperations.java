public class arrayOperations {

    //returns the sum of the elements in the array at even and odd indexes
    public static int[] getSumOfIndexes(int[] arr) {
        int[] result = {0, 0};
        //iterate through the array and add the elements to the result array at the even and odd indexes
        for(int i = 0; i < arr.length; i++) {
            result[i%2] += arr[i];
        }
        return result;
    }

    
    /*
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

    /*
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
    public static int averageofArrau(int [] arr)
    {
        int sum = 0;
        int average = 0;
        int [] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        average = sum / arr.length;
        for(int i = 0; i < arr.length; i++)
        {
            result[i] = arr[i] - average;
        }
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(result[i] + ",");
        }
        return average;
        
    }
    //
}