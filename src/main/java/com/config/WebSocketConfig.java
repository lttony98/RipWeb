package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
		config.enableSimpleBroker("/topic");
//		config.enableSimpleBroker("/user");
		config.setApplicationDestinationPrefixes("/app");
		System.out.println("[WEBSOCKET] MessageBrokerRegistry: " + config);
	}

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/gs-guide-websocket").withSockJS().setInterceptors(new HttpHandshakeInterceptor());
		registry.addEndpoint("/gs-guide-websocket").addInterceptors(new HttpHandshakeInterceptor());
		System.out.println("[WEBSOCKET] StompEndpointRegistry: " + registry);
	}

}
