package com.rabbitmq.eai.samples;

public class RequestReceiverDemo {
	
	public static void main(String[] args) throws InterruptedException {
		final RequestReceiver receiver = new RequestReceiver();
		receiver.initialize();
		receiver.receive();
		receiver.destroy();
	}
}

