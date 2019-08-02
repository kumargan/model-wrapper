package org.modelwrapper.util;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import org.modelwrapper.beans.Greetings;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.simp.stomp.StompFrameHandler;
import org.springframework.messaging.simp.stomp.StompHeaders;
import org.springframework.messaging.simp.stomp.StompSession;
import org.springframework.messaging.simp.stomp.StompSessionHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.messaging.WebSocketStompClient;
import org.springframework.web.socket.sockjs.client.RestTemplateXhrTransport;
import org.springframework.web.socket.sockjs.client.SockJsClient;
import org.springframework.web.socket.sockjs.client.Transport;
import org.springframework.web.socket.sockjs.client.WebSocketTransport;

//@Component
public class WEbSocketStompClientDAO {
  private final String uri="ws://localhost:8080/greeting/";
  WebSocketClient client;
  BlockingQueue<String> blockingQueue =new LinkedBlockingQueue<>();
  StompSession session = null;
  List<Transport> transports = new ArrayList<Transport>(2);
  SockJsClient sockJsClient;
  WebSocketStompClient stompClient;
  DefaultStompFrameHandler stompHandler = new DefaultStompFrameHandler();

  public  WEbSocketStompClientDAO(){
    transports.add(new WebSocketTransport(new StandardWebSocketClient()));
    transports.add(new RestTemplateXhrTransport());
    sockJsClient = new SockJsClient(transports);
    stompClient = new WebSocketStompClient(sockJsClient);
    stompClient.setMessageConverter(new MappingJackson2MessageConverter());
  }
  
  @PostConstruct
  public void run() {
    try {
      session = stompClient.connect(uri, new WebsocketSessionHandler()).get(1, TimeUnit.SECONDS);
      session.subscribe("/topic/greetings", stompHandler);
      session.send("/app/hello", " this is first message ");

    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  
  public void disconnect() {
    if (session != null) {
      session.disconnect();
    }
  }

  class DefaultStompFrameHandler implements StompFrameHandler {
    @Override
    public Type getPayloadType(StompHeaders stompHeaders) {
      System.out.println(" DefaultStompFrameHandler getPayloadType called "+CommonUtils.getString(stompHeaders));
      return Greetings.class;
    }

    @Override
    public void handleFrame(StompHeaders stompHeaders, Object o) {
      System.out.println(" DefaultStompFrameHandler handleFrame called "+CommonUtils.getString(o));
      //blockingQueue.offer(new String((byte[]) o));
    }
  }

}
