package com.journaldev.spring.main;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Configuration;


public class JavaMain {

	public static void main(String[] args) {
		

		try {
			
			Settings settings = Settings.builder()
			        .put("node-1", "elasticsearch").build();
			TransportClient client = new PreBuiltTransportClient(settings);
			
			client = new PreBuiltTransportClient(Settings.EMPTY)
			        .addTransportAddress(new TransportAddress(InetAddress.getByName("localhost"), 9300));
			
			
			System.out.println(client);
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
