package com.elsa.bplustree.test;

import com.elsa.bplustree.BPlusTree.BPlusTree;
import com.elsa.bplustree.pojo.Product;

/**
 * @ClassName : test  //类名
 * @Author : elsa //作者
 */
public class test {
    public static void main(String[] args){

        BPlusTree<Product, Integer> b = new BPlusTree<Product, Integer>(4);

        long time1 = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            Product p = new Product(i, "test", 1.0 * i);
            b.insert(p, p.getId());
        }

        long time2 = System.nanoTime();

        Product p1 = b.find(345);

        long time3 = System.nanoTime();

        System.out.println("插入耗时: " + (time2 - time1));
        System.out.println("查询耗时: " + (time3 - time2));
    }

}
