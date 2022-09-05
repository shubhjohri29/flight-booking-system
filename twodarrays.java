import java.util.Scanner;

/**
 * twodarrays
 */
public class twodarrays {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();
        int columns= sc.nextInt();
       int[][] numbers= new int [rows][columns];
        //input
        //rows
        for(int i=0; i<rows; i++){
            //columns
            for(int j=0; j<columns; j++){
                numbers[i][j]= sc.nextInt();
            }
        }
        int x= sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                // compare with x
                if(numbers[i][j]==x){
                System.out.print("x is found at location("+i+","+j+") ");
            }else{
            System.out.println("element is not found");
            }
        }
        }

    }

    
}