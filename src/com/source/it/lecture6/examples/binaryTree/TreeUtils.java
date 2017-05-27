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
}
