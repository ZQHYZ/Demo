package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 启动项目自动打开浏览器
 */
@Component
public class MyCommandRunner implements CommandLineRunner {
    @Value("${start.auto}")
    private boolean autoOpen;
    @Value("${start.chromeAddr}")
    private String chromeAddr;
    @Value("${start.url}")
    private String url;
    @Override
    public void run(String... args) throws Exception {
        if(autoOpen){
            String cmd = chromeAddr +" "+ url;
            Runtime run = Runtime.getRuntime();
            try{
                run.exec(cmd);
//                run.exec("notepad.exe");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
