package com.source.it.lecture6.examples.binaryTree;

public class BinaryTreeHomeWork {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(8);
        BinaryTree left = new BinaryTree(3);
        BinaryTree right = new BinaryTree(10);
        tree.setLeft(left);
        tree.setRight(right);
        left.setLeft(new BinaryTree(1));
        left.setRight(new BinaryTree(6));
        right.setLeft(new BinaryTree(9));
        right.setRight(new BinaryTree(14));

        System.out.println("Sum is " + TreeUtils.getSum(tree, 0));
        System.out.println("Min value is " + TreeUtils.getMin(tree));
        System.out.println("Max value is " + TreeUtils.getMax(tree));
        TreeUtils.PrintTree(tree);
    }
}
