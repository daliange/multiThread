package com.lijie.java.multithread.chat.client;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class SimpleChatClient {
	
	JTextArea incoming;
	JTextField outgoing;
	BufferedReader reader;
	PrintWriter writer;
	Socket socket;
	
	public static void main(String[] args) {
		SimpleChatClient client = new SimpleChatClient();
		client.go();
	}
	
	public void go() {
		
		JFrame frame = new JFrame("Simple Chat Client");
		JPanel mainPanel = new JPanel();
		incoming = new JTextArea(15,50);
		incoming.setLineWrap(true);
		incoming.setWrapStyleWord(true);
		incoming.setEditable(false);
		JScrollPane qScroller = new JScrollPane(incoming);
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		outgoing = new JTextField(20);
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendButtonListener());
		mainPanel.add(qScroller);
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		/**与serverSocket建立连接**/
		setUpNetworking();
		
		/**从服务器读取信息**/
		Thread readThread = new Thread(new IncomingReader());
		readThread.start();
		
		frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
		frame.setSize(400, 500);
		frame.setVisible(true);
	}
	
	private void setUpNetworking(){
		try {
			socket = new Socket("127.0.0.1",5000);
			InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
			reader = new BufferedReader(streamReader);
			writer = new PrintWriter(socket.getOutputStream());
			System.out.println("networking established !");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**向服务器发送信息**/
	public class SendButtonListener implements ActionListener{
		

		public void actionPerformed(ActionEvent e) {
			
			try {
				writer.println(outgoing.getText());
				writer.flush();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			outgoing.setText("");
			outgoing.requestFocus();
			
		}
		
	}
	
	
	public class IncomingReader implements Runnable{
		
		public void run() {
			
			String message;
			try {
				while ((message = reader.readLine())!=null){
					System.out.println("read "+message);
					incoming.append(message +"\n");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
