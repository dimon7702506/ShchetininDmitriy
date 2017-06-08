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
        return 1 + Math.max(leftDepth, rightDepth);
    }

    public static int getMaxWidth(BinaryTree tree) {

        int maxWidth = 0;
        int width = 0;

        for (int i = 1; i <= getDepth(tree); i++){
            width = getWidth(tree, i);
            if (width > maxWidth) {
                maxWidth = width;
            }
        }
        return maxWidth;
    }

    public  static int getWidth(BinaryTree tree, int level) {
        if (tree == null) {
            return 0;
        }
        if (level == 1) {
            return 1;
        } else {
            return  getWidth(tree.getLeft(), level - 1) + getWidth(tree.getRight(),level - 1);
        }
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

        String maxSt = getMax(tree) + " ";
        int step = maxSt.length();
        int startPosition = getMaxWidth(tree) * step / 2 - 1;

        for (int i = 1; i <= getDepth(tree); i++){
            int layer = i;
            PrintTreeLevel(tree, i, layer, startPosition, step);
            System.out.println();
        }
    }

    public  static int PrintTreeLevel(BinaryTree tree, int level, int i, int startPosition, int step) {
        if (tree == null) {
            return 0;
        }
        if (level == 1) {
            String out = "";
            String out1 = "";

            for (int j = 1; j <= (startPosition - (i - 1) * step); j++) {
                out = out + " ";
            }
            for (int j = 1; j <= step; j++) {
                out1 = out1 + " ";
            }
            System.out.print(out + tree.getValue() + out1);
            return 1;
        } else {
            return  PrintTreeLevel(tree.getLeft(), level - 1, i, startPosition, step)
                    + PrintTreeLevel(tree.getRight(),level - 1, i, startPosition, step);
        }
    }
}
