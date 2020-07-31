package com.aimango.server;

import com.aimango.server.annotation.Component;
import com.aimango.server.reflections.ClassScanner;

import java.io.IOException;
import java.util.Set;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Set<Class> scan = ClassScanner.scan("com.aimango.server");
        for (Class clazz:scan){
            System.out.println(clazz.getName());
            boolean annotationPresent = ClassScanner.isAnnotateWith(clazz,Component.class);
            System.out.println("此类是否存在组件注解："+annotationPresent);
        }

    }
}
