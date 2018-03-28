package org.modelwrapper;

import java.util.Arrays;

import org.modelwrapper.dao.ModelDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
    	ModelDao.init();
    	ModelHelper.getModelHelper().init();
        SpringApplication.run(Application.class, args);
    }

}
