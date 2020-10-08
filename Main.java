import java.util.Scanner; 

/**
 * The program that will populate a 10 element array (put values into an array) with integers. Once the array is full, the user enter a number to search for. Your program will then search through the array and state any index that the number is located at.
 * @author Neil Fischer
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create scanner for user input 
    Scanner input = new Scanner(System.in); 

    //ask the user to enter 10 integers 
    System.out.println("Please enter in 10 integers to put into the array"); 

    //create array for integers 
    int[] numB = new int[10]; 

    //use for loop to get all the values for arrays 
    for(int i = 0; i < numB.length; i++){
      numB[i] = input.nextInt(); 
    }  

    //prompt the user to enter a number to find 
    System.out.println("Please enter a number to find"); 

    //create variable for number the user wants to find 
    int searchNum = input.nextInt();

    //create for statement to find and print the number the user is looking for 
    for(int i = 0; i < numB.length; i++){
      if(numB[i] == searchNum){
        System.out.println(searchNum + " is located at index " + i);
      }
    }
    
  }
}
