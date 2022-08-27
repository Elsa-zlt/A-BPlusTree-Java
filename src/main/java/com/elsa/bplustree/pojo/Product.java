package com.elsa.bplustree.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName : Product  //类名
 * @Author : elsa //作者
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Integer id;

    private String name;

    private Double price;

}
