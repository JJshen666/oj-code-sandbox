package com.shen.ojcodesandbox.security;

import cn.hutool.core.io.FileUtil;

import java.nio.charset.StandardCharsets;

public class TestSecurityManager {

    public static void main(String[] args) {
        System.setSecurityManager(new MySecurityManager());
        FileUtil.readLines("D:\\Project\\JavaProject\\oj-code-sandbox\\src\\main\\resources\\application.yml", StandardCharsets.UTF_8);
    }
}
