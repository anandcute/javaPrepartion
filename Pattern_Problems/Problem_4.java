package javaPrepartion.Pattern_Problems;
public class Problem_4 {
    public static void main(String[] args) {
        int n = 5;
        // 1
        // 212
        // 32123
        // 4321234
        // 543212345
        for (int i = 1 ; i <= n ; i++){
            // Print decreasing part
            for(int j = i ; j > 0 ; j--){
                System.out.print(" " + j);
            }
            // Print increasing part
            for(int j = 1 ; j <= i ; j++){
                if(j == 1){
                    continue;
                }
                System.out.print(" " + j);
            }
            System.out.println(" ");
        }
       
    }
}
