import java.util.*;

class DA {
    private int arr[];
    private int nextelementindex;

    // constructor
    public DA() {
        arr = new int[5];
        nextelementindex = 0;
    }

    // addition
    public void add(int element) {
        if (nextelementindex < arr.length) {
            arr[nextelementindex] = element;
            nextelementindex++;
        } else {
            int newarr[] = new int[2 * arr.length];
            for (int k = 0; k < arr.length; k++) {
                newarr[k] = arr[k];
            }
            newarr[nextelementindex] = element;
            nextelementindex++;
            this.arr = newarr;
        }
    }

    // set
    public void set(int index, int element) {
        if (index < nextelementindex) {
            arr[index] = element;
        } else {
            int newarr[] = new int[2 * index];
            for (int k = 0; k < arr.length; k++) {
                newarr[k] = arr[k];
            }
            newarr[index] = element;
            nextelementindex = index + 1;
            this.arr = newarr;
        }
    }

    // delete
    public void delete(int index) {
        int newarr[] = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (index == i) {
                i++;
            }
            newarr[j] = arr[i];
        }
        nextelementindex--;
        this.arr = newarr;

    }

    // remove last
    public void removeLast() {
        int newarr[] = new int[arr.length - 1];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = arr[i];
        }
        nextelementindex--;
        this.arr = newarr;
    }

    // size
    public int size() {
        return nextelementindex;
    }

    // to getting element of ith index
    public int get(int i) {
        if (i < nextelementindex)
            return arr[i];
        return Integer.MIN_VALUE;
    }

    // array empty?
    public boolean isempty() {
        return nextelementindex == 0;
    }

    // print
    public void print() {
        for (int l = 0; l < nextelementindex; l++) {
            System.out.print(arr[l] + " ");
        }
        System.out.println();
    }

}

class DynamicArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		DA a1=new DA();
        while(true){
            System.out.println("SELECT:\n1.Add    2.Set    3.Delete   4.Remove Last\n5.Size    6.Get    7.Print    8.Exit");
            int ans=s.nextInt();
            if(ans==1){
                System.out.println("Enter element: ");
                a1.add(s.nextInt());
            }
            else if(ans==2){
                System.out.println("Enter index ans value: ");
                a1.set(s.nextInt(),s.nextInt());
            }
            else if(ans==3){
                System.out.println("Enter index: ");
                a1.delete(s.nextInt());
            }
            else if(ans==4){
                a1.removeLast();
            }
            else if(ans==5){
                System.out.println(a1.size());
            }
            else if(ans==6){
                System.out.println("Enter index:");
                System.out.println(a1.get(s.nextInt()));
            }
            else if(ans==7){
                a1.print();
            }
            else{
                break;
            }

        }  
	}
}
