package com.lijie.java.multithread.chat.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class VerySimpleChatServer {
	
	ArrayList clientOutputStreams;
	
	public class ClientHandler implements Runnable{
		BufferedReader reader;
		Socket socket;
		
		public ClientHandler(Socket clientsocket,ArrayList arrayList){
			try {
				socket = clientsocket;
				InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
				reader = new BufferedReader(inputStreamReader);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void run (){
			String message ;
			try {
				while ((message=reader.readLine())!=null){
					System.out.println("read "+message);
					/**向其他客户端发送信息**/
					tellEveryone(message);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		VerySimpleChatServer verySimpleChatServer= new VerySimpleChatServer();
		verySimpleChatServer.go();
	}
	
	public void go(){
		
		clientOutputStreams = new ArrayList();
		try {
			/**创建ServerSocket**/
			ServerSocket serverSocket = new ServerSocket(5000);
			System.out.println("server启动成功，监听中。。。");
			while(true){
				/**获取socket连接**/
				Socket clientSocket = serverSocket.accept();
				/**根据socket获取writer**/
				PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream());
				/**将writer放入集合中**/
				clientOutputStreams.add(printWriter);
				/**创建ClientHandler**/
				Thread t = new Thread(new ClientHandler(clientSocket,clientOutputStreams));
				t.start();
				System.out.println("got a connection !");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void tellEveryone(String message) {
		Iterator it = clientOutputStreams.iterator();
		while(it.hasNext()){
			try {
				PrintWriter printWriter = (PrintWriter)it.next();
				printWriter.println(message);
				printWriter.flush();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
