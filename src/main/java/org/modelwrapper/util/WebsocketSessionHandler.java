package org.modelwrapper.util;

import org.modelwrapper.beans.Message;
import org.omg.CORBA.OMGVMCID;
import org.springframework.messaging.simp.stomp.StompCommand;
import org.springframework.messaging.simp.stomp.StompHeaders;
import org.springframework.messaging.simp.stomp.StompSession;
import org.springframework.messaging.simp.stomp.StompSessionHandlerAdapter;

import java.lang.reflect.Type;

public class WebsocketSessionHandler extends StompSessionHandlerAdapter {
  @Override
  public void afterConnected(StompSession session, StompHeaders connectedHeaders) {
//    System.out.println("New session established : " + session.getSessionId());
//    session.subscribe("/topic/greetings", this);
//    System.out.println("Subscribed to /topic/messages");
//    session.send("/app/hello", " this is connection setup");
//    System.out.println("Message sent to websocket server");      
  }
  @Override
  public void handleFrame(StompHeaders headers, Object payload) {
   // Message msg = (Message) payload;
    //System.out.println("Received : " + msg.getText()+ " from : " + msg.getFrom());
    System.out.println(" message "+CommonUtils.getString(payload));
  }
  
  @Override
  public void handleException(StompSession session, StompCommand command, StompHeaders headers, byte[] payload, Throwable exception) {
    System.out.println("Got an exception "+exception.getMessage()+" :::::::::: "+ CommonUtils.getString(exception.getStackTrace()));
  }

  @Override
  public Type getPayloadType(StompHeaders headers) {
    System.out.println(" WebsocketSessionHandler getPayloadType called ");
      return String.class;
  }

}
