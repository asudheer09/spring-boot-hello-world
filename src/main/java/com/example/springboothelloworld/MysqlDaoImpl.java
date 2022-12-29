package com.example.springboothelloworld;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MysqlDaoImpl implements Dao{
    @Override
    public void printData() {
        System.out.println("mysql");
    }
}
