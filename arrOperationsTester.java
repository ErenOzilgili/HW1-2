/**
 * @author Mehmet Efe Mutlu
 */
import java.util.Scanner;

public class arrOperationsTester{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Welcoming user to the program
        System.out.println("Welcome to array operations program!");
        System.out.print("Type the array size: ");
        int size = in.nextInt();
       
        //Creating array with create array method
        int [] arr = arrayOperations.createArray(size);
        
        System.out.println();

        while(true)
        {
            System.out.println("Operations: ");

            //Displaying choices
            System.out.println("1) Maximum of array " + "\n" + "2) Minimum of array" + "\n" + "3) Average of array" + "\n" + "4) Sum of indexes" + "\n" + "5) Exit" );
            System.out.print("Please choose an operation: ");

            //If the choice is not valid type it asks the user again
            while(!in.hasNextInt()){
                System.out.print("You have supposed to enter an integer! Try again: ");
                in.next();
            }

            int choice = in.nextInt();

            if(choice == 1){
                //Summons the maxOfArray method
                System.out.print("The maximum number of array is: ");
                System.out.println(arrayOperations.maxOfArray(arr));
                System.out.println();
            }
            else if(choice == 2){
                //Summons the minOfArray method
                System.out.print("The minimum number of array is: ");
                System.out.println(arrayOperations.minOfArray(arr));
                System.out.println();
            }
            else if(choice ==3){
                //Summons the averageOfArray method
                System.out.print("The average of array is: ");
                System.out.println(arrayOperations.averageOfArray(arr));
                System.out.println();
            }
            else if(choice == 4){
                //Summons the sumOfIndexes method
                System.out.print("Sum of indexes are: ");
                System.out.println(arrayOperations.getSumOfIndexes(arr)[0]);
                System.out.println();
            }
            else if(choice == 5){
                //Exits
                System.out.println("Exiting");
                break;
            }
            else{
                //Pushes user to type valid choice
                System.out.println("Invalid choice");
                System.out.println();
            }
        }

        in.close();
            
    }
}

