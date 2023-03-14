package com.demo.k.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Consumer
{
	@KafkaListener(topics ="DemoKafka_code",groupId = "codedecode_group")
	public void listenToTopic(String recievedMessage)
	{
		System.out.println("The message has been recieved , "+ recievedMessage );
	}
}

