package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.plugin.net.cookie.Netscape4CookieHandler;

@SpringBootApplication
public class NettyApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(NettyApplication.class, args);

        //启动 netty Server
        new NettyServer(12345).start();
    }

}
