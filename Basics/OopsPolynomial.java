
class Polynomial {
    int coefficient[];

    public Polynomial() {
        this.coefficient = new int[1];
    }

    // set value and degree
    public void setcoeff(int index, int c) {
        if (index < coefficient.length) {
            this.coefficient[index] = c;
        } else {
            int newcoeff[] = new int[index + 1];
            for (int i = 0; i < coefficient.length; i++) {
                newcoeff[i] = coefficient[i];
            }
            this.coefficient = newcoeff;
            coefficient[index] = c;
        }
    }

    // add poly
    public void sum(Polynomial p1) {
        Polynomial ans = new Polynomial();
        int len = Math.min(p1.coefficient.length, this.coefficient.length);
        int i;
        for (i = 0; i < len; i++) {
            ans.setcoeff(i, p1.coefficient[i] + this.coefficient[i]);
        }

        while (i < p1.coefficient.length) {
            ans.setcoeff(i, p1.coefficient[i]);
            i++;
        }
        while (i < this.coefficient.length) {
            ans.setcoeff(i, this.coefficient[i]);
            i++;
        }
        this.coefficient = ans.coefficient;
        // return ;
    }

    // subtract poly
    public Polynomial difference(Polynomial p1) {
        Polynomial ans = new Polynomial();
        int len = Math.min(p1.coefficient.length, this.coefficient.length);
        int i;
        for (i = 0; i < len; i++) {
            ans.setcoeff(i, p1.coefficient[i] - this.coefficient[i]);
        }
        while (i < p1.coefficient.length) {
            ans.setcoeff(i, p1.coefficient[i]);
            i++;
        }
        while (i < this.coefficient.length) {
            ans.setcoeff(i, this.coefficient[i]);
            i++;
        }
        return ans;
    }

    public int get(int index) {
        if (index < this.coefficient.length) {
            return this.coefficient[index];
        } else {
            return 0;
        }
    }

    // multiply
    public Polynomial product(Polynomial p1) {
        Polynomial ans = new Polynomial();
        for (int i = 0; i < p1.coefficient.length; i++) {
            for (int j = 0; j < this.coefficient.length; j++) {
                ans.setcoeff(i + j, ans.get(i + j) + p1.coefficient[i] * this.coefficient[j]);
            }
        }
        return ans;
    }

    public void print() {
        // System.out.print(coefficient[0]+" ");
        for (int i = 0; i < coefficient.length; i++) {
            if (coefficient[i] != 0)
                System.out.print(coefficient[i] + "x" + i + " ");

        }
        System.out.println();
    }
}

public class OopsPolynomial {
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial();
        p1.setcoeff(0, 2);
        p1.setcoeff(1, 3);
        p1.print();

        Polynomial p2 = new Polynomial();
        p2.setcoeff(2, 2);
        p2.setcoeff(8, 4);
        p2.setcoeff(6, 5);
        p2.print();

        // p2.sum(p1);
        // p2.print();

        // Polynomial p4 = p1.difference(p3);
        // p4.print();

        Polynomial p5 = p1.product(p2);
        p5.print();

    }
}
