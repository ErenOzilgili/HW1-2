
<<<<<<< Updated upstream
=======
public class arrOperationsTester{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to array operations program!");
        System.out.println("Type the array size: ");
        int size = in.nextInt();
        
        int [] arr = arrayOperations.createArray(size);

        System.out.println("Creating an array: ");
        for(int i=0; i<arr.length; i++){

        }


        

        //Assuming user enters number inputs
        System.out.println("Please choose an operation: ");
        System.out.println("1) Maximum of array " + "\n" + "2) Minimum of array" + "\n" + "3)Sum of indexes" );

        while(in.hasNextInt())
        {

            int choice = in.nextInt();

            if(choice == 1)
            {

            }

        }



        in.close();

        
    }
}
>>>>>>> Stashed changes
