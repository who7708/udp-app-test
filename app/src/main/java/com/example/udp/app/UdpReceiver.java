package com.example.udp.app;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2024/5/27
 */
public class UdpReceiver {

    public static void main(String[] args) {
        startUdpReceiver();
    }

    public static void startUdpReceiver() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    udpReceiver();
                }
            }
        }).start();

    }

    public static void udpReceiver() {
        try {
            DatagramSocket datagramSocket = new DatagramSocket(1234);
            byte[] buff = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buff, buff.length);
            datagramSocket.receive(packet);
            InetAddress ip = packet.getAddress();
            String ipStr = ip + "";

            String ip_new = ipStr.substring(1, ipStr.length());
            System.out.printf("ip_new: %s \n", ip_new);
            System.out.printf("udpReceiver: %s \n", ip_new);

            // 获取内容: 约定好的词。 收到约定好的词之后，不再进行 while（true）
            String text = new String(packet.getData(), 0, packet.getLength());
            System.out.printf("text: %s \n", text);
            System.out.println();
            datagramSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
