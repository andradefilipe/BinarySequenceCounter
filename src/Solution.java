import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       
        String binary = Integer.toBinaryString(num);
        int count = 0;
        int max = 0;
        for(char c : binary.toCharArray()) {
            if(c == 48){
                count = 0;
            }
            else{
                count ++;
                if(max < count){
                    max = count;    
                }
                
            }
         }
        System.out.println(max);
        sc.close();
    }
}