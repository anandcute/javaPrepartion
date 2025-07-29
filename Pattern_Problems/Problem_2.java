package javaPrepartion.Pattern_Problems;

public class Problem_2 {
   public static void main(String[] args) {
        int n = 5;
        for(int i = 1 ; i <= n ; i++){
            for(int j = i ; j <= n ; j++){
                System.out.print(j + " ") ;
            }
            for(int j = 1 ; j < i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
   } 
}


/* Output

1 2 3 4 5 
2 3 4 5 1
3 4 5 1 2
4 5 1 2 3
5 1 2 3 4   */