package com.example.springboothelloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test {

    @Autowired
    Dao dao;

    public Dao getDao() {
        return dao;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }

/*Test(Dao dao) {
        this.dao = dao;
    }*/

    public void displayPrintTestData() {
        dao.printData();
    }
}
