package org.modelwrapper;

import org.modelwrapper.util.WebSocketClientWithAuth;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Application {
//comment if using model dao
  WebSocketClientWithAuth client;

  public static void main(String[] args) {
    //ModelDao.init();
    //ModelHelper.getModelHelper().init();
    SpringApplication.run(Application.class, args);
  }

  @EventListener(ApplicationReadyEvent.class)
  public void afterStartup() {
    //comment if using model dao
    client = new WebSocketClientWithAuth();
  }

}
