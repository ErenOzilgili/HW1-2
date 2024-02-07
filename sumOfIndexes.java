public class sumOfIndexes {

    //returns the sum of the elements in the array at even and odd indexes
    public static int[] getSumOfIndexes(int[] arr) {
        int[] result = {0, 0};

        //iterate through the array and add the elements to the result array at the even and odd indexes
        for(int i = 0; i < arr.length; i++) {
            result[i%2] += arr[i];
        }

        return result;
    }
}