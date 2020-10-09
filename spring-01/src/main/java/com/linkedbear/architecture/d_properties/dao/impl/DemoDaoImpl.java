package com.linkedbear.architecture.d_properties.dao.impl;

import com.linkedbear.architecture.d_properties.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoDaoImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        //此处应该是访问数据库的操作，用临时数据代替
        return Arrays.asList("aaa","bbb","ccc");
    }
}
