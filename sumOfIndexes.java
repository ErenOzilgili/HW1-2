public class sumOfIndexes {
    public static int[] getSumOfIndexes(int[] arr) {
        int[] result = {0, 0};
        for(int i = 0; i < arr.length; i++) {
            result[i%2] += arr[i];
        }
        return result;
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
}
