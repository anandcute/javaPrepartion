package javaPrepartion.Pattern_Problems;
public class Pattern_5_kPrint {
    public static void main(String[] args) {
        int n = 5;
        //k print 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0 || (j == n/2   && i == 0) || (j == 1  && (i == n/2-1 || i==n-2 )) || (j==n/2 && i==n-1) )
                    System.out.print("  *");
                else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
         System.out.println( );
    //U PRINT
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if((j == 0 && i == 0 ) || j == 0 && i == 1||j == 0 && i == n - 3||j == 0 && i == n-2 ||
                j == n-1 && i == 0 || j == n - 1 && i == 1|| j == n - 1 && i == n-3 || j == n - 1 && i == n - 2||
                j == 1 && i == n-1 || j == 2 && i == n-1 )
                    System.out.print("  *");   
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    
        System.out.print("");
    //M PRINT
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(j == 0 || j == n-1 || (i == n-3 && j == n-3) || (i == 1 && j == 1) || (i == 1 && j == n-2))
                    System.out.print(" *");   
                else{
                    System.out.print("  ");
                }    
            }
            System.out.println( );
        }
        System.out.print(" ");
        System.out.println( );
        //A PRINT
       for(int i = n - 1 ; i >= 0 ; i--){
            for(int j = n - 1 ; j >= 0 ; j--){
                if((j == 0 && i == 0 ) || j == 0 && i == 1||j == 0 && i == n - 3||j == 0 && i == n-2 ||
                j == n-1 && i == 0 || j == n - 1 && i == 1|| j == n - 1 && i == n-3 || j == n - 1 && i == n - 2||
                j == 1 && i == n-1 || j == 2 && i == n-1|| j == n -2 && i == n-1 || i == n-3  )
                    System.out.print(" *");   
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println(" ");

        //R PRINT
        for(int i = 0 ; i < n - 2 ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i == 0 && j==0 ||i==0 && j ==1 || i == 0 && j == n -3 || i == 0 && j == n -2|| j == 0 ||
                 i == n -3 && j == 0 || i == n -3 && j == 1 || i == n -3 && j == 2 || 
                 i == n -3 && j == n -2  || i == 1 && j == n-1 )
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println( );
        }
        for(int i = 0 ; i < n -2 ; i++){
            for(int j = 0 ; j < n ; j++){
                if(j == 0 || i ==  0 && j == 1 || i == 1 && j == 2 || i == 2 && j == 3){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println( );
        }
    }
}
