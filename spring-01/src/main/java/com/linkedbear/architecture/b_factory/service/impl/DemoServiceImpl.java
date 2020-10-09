package com.linkedbear.architecture.b_factory.service.impl;

import com.linkedbear.architecture.b_factory.dao.DemoDao;
import com.linkedbear.architecture.b_factory.dao.impl.DemoDaoImpl;
import com.linkedbear.architecture.b_factory.factory.BeanFactory;
import com.linkedbear.architecture.b_factory.service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {

    private DemoDao demodao = BeanFactory.getDemoDao();

    @Override
    public List<String> findAll() {
        return demodao.findAll();
    }
}
