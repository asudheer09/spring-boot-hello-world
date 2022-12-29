package com.example.springboothelloworld;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class OracleDaoImpl implements Dao{
    @Override
    public void printData() {
        System.out.println("oracle");
    }
}
