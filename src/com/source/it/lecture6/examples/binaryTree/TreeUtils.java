package com.source.it.lecture6.examples.binaryTree;

public class TreeUtils {

    public static int getDepth(BinaryTree tree) {
        int leftDepth = 0;
        int rightDepth = 0;
        if (tree.getLeft() != null) {
            leftDepth = getDepth(tree.getLeft());
        }
        if (tree.getRight() != null) {
            rightDepth = getDepth(tree.getRight());
        }
        System.out.println(leftDepth + rightDepth);
        return 1 + Math.max(leftDepth, rightDepth);
    }

    public  static int getSum(BinaryTree tree, int sum) {

        if(tree != null) {
            sum = tree.getValue() + getSum(tree.getLeft(),0) + getSum(tree.getRight(), 0);
        }
        return sum;
    }

    public static int getMin(BinaryTree tree) {
        if(tree.getLeft() != null) {
            return getMin(tree.getLeft());
        } else {
            return tree.getValue();
        }
    }

    public static int getMax(BinaryTree tree) {
        if(tree.getLeft() != null) {
            return getMax(tree.getRight());
        } else {
            return tree.getValue();
        }
    }

    public static void PrintTree(BinaryTree tree) {
        if(tree == null) {
           return;
       }
       for (int i = 1; i <= getDepth(tree); i++) {
           System.out.println(tree.getValue());
           tree.getLeft();
       }
    }
}
