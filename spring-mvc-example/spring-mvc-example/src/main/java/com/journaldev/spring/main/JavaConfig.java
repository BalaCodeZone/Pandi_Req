package com.journaldev.spring.main;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	/*@Bean
	public void transportClient() throws UnknownHostException  {

		Settings settings = Settings.builder()
		        .put("cluster.name", "elasticsearch").build();
		TransportClient client = new PreBuiltTransportClient(settings);

	
	 client = new PreBuiltTransportClient(Settings.EMPTY)
	        .addTransportAddress(new TransportAddress(InetAddress.getByName("http://localhost"), 9300))
	        .addTransportAddress(new TransportAddress(InetAddress.getByName("http://localhost"), 9300));
	 
	 System.out.println(client.connectedNodes().get(0).getName().toString());
	

	}*/

}
