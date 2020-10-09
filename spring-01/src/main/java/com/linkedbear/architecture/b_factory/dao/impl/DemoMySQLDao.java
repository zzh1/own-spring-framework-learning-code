package com.linkedbear.architecture.b_factory.dao.impl;

import com.linkedbear.architecture.b_factory.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoMySQLDao implements DemoDao {
    @Override
    public List<String> findAll() {
        System.out.println("DemoMySQLDao findAll run ......");
        //此处应该是访问数据库的操作，用临时数据代替
        return Arrays.asList("aaa","bbb","ccc");
    }
}
