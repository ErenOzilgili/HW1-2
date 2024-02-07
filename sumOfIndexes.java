public class sumOfIndexes {
    public static int[] getSumOfIndexes(int[] arr) {
        int[] result = {0, 0};
        for(int i = 0; i < arr.length; i++) {
            result[i%2] += arr[i];
        }
        return result;
    }
}