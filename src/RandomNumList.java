import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Arrays;


public class RandomNumList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int temp = 0;
        System.out.print("Enter a n value: ");
        int n = s.nextInt();
        s.close();
        
        int randomList[] = new int[n];
        boolean unique = true;
        for(int i = 0; i < n; i++){
            temp = rand.nextInt(100);
            for(int j = 0; j < n; j++){
                if(randomList[j] == temp){
                    unique = false;
                    i--;
                }
            }
            if(unique == true){
                randomList[i] = temp;
            }
            unique = true;
        }
        
        System.out.println(Arrays.toString(randomList));
    }
}
//Asymptotic Complexity
// i for loop = O(n)
// j for loop = O(n)
//rand.nextInt = O(logn)
//total complexity = O(n) * O(n) + O(logn) = O(n^2)