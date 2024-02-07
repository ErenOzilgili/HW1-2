public class arrayOperations {
    public static int[] getSumOfIndexes(int[] arr) {
        int[] result = {0, 0};
        for(int i = 0; i < arr.length; i++) {
            result[i%2] += arr[i];
        }
        return result;
    }

    public static int minOfArray(int[] arr){

        int min = 0;        

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

    public static int maxOfArray(int[] arr){
        int max = 0;        

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

}