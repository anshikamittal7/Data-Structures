import java.util.*;

class GFG {
    static String chkl1(String wrd) {
        for (int i = 0; i < wrd.length(); i++) {
            if (wrd.charAt(i) >= 'a' && wrd.charAt(i) <= 'm') {
                continue;
            } else {
                return "NO";
            }
        }
        return "YES";
    }

    static String chkl2(String wrd) {
        for (int j = 0; j < wrd.length(); j++) {
            if (wrd.charAt(j) >= 'N' && wrd.charAt(j) <= 'Z')
                continue;
            else {
                return "NO";
            }
        }
        return "YES";
    }

    static String chk(String ans1) {
        if (chkl1(ans1) == "YES" || chkl2(ans1) == "YES")
            return "YES";
        else
            return "NO";

    }

    static String chkarr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "NO") {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int k = s.nextInt();
            String wrd[] = new String[k];
            while (k > 0) {
                wrd[k - 1] = chk(s.next());
                k--;
            }
            t--;
        }

    }
}
