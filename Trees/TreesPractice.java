import java.util.Scanner;

public class TreesPractice {
    public static void print(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }

    static Scanner s = new Scanner(System.in);

    public static BinaryTreeNode<Integer> input() {
        int x = s.nextInt();
        if (x == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(x);
        BinaryTreeNode<Integer> rootleft = input();
        BinaryTreeNode<Integer> rootright = input();
        root.left = rootleft;
        root.right = rootright;
        return root;
    }

    public static int numNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        return 1 + numNodes(root.left) + numNodes(root.right);
    }

    public static int sumNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        return sumNodes(root.left) + sumNodes(root.right) + root.data;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = input();
        print(root);
        System.out.println(numNodes(root));
        System.out.println(sumNodes(root));
    }
}
