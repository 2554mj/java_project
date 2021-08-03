package mega;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 2000; i++) {
		//client 객체를 생성하자.
			Socket name = new Socket("localhost", 9100);
			java.net.Socket client = new java.net.Socket();
		//네트워크에서는 소켓이 전화기같은 역할임
		System.out.println("client request----" + i);
		}
	}
}
