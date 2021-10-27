// There is an offer going on "The BookStore". Offer says - If you buy three books, you get the least expensive of the three for free.
// Now, the new guy at the desk, Aahad, is well intended. He wants that customers to pay minimum amount. So, Aahad decides to arrange books in such a way 
// that customer is billed the minimum price.
// Now, Harshit buys N books. Aahad wants to calculate the minimum amount that he has to pay.
// You have to help Aahad in his endeavour.


import java.util.Arrays;
import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int price[] = new int[n];
        for (int i = 0; i < price.length; i++) {
            price[i] = s.nextInt();
        }
        Arrays.sort(price);

        int j = 0;
        int ans = 0;
        int loop = price.length / 3;
        while (loop-- != 0 && j < price.length) {
            int min = price[j];
            for (int i = 0; i < 3; i++) {
                ans += price[j];
                j++;
            }
            ans = ans - min; 
        }

        int l = 0;
        for (int k = price.length % 3; k > 0; k--) {
            ans += price[price.length - 1 - l];
            l++;
        }
        System.out.println(ans);
        s.close();
    }
}
