package com.happylife.demo;

public class Main {
	public static int port = 9000;
	public static void main(String[] args) {
		SimpleHttpsServer httpsServer = new SimpleHttpsServer();
		httpsServer.Start(port);
		
	}
}
