package com.matrix.design.stragegy.ex02;

import java.util.Base64;

/**
 * author         : Jason Lee
 * date           : 2023-06-06
 * description    :
 */
public class Base64Strategy implements EncodingStrategy {
    @Override
    public String encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }
}
