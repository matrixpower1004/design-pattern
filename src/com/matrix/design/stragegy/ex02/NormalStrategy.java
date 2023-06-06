package com.matrix.design.stragegy.ex02;

/**
 * author         : Jason Lee
 * date           : 2023-06-06
 * description    :
 */
public class NormalStrategy implements EncodingStrategy {
    @Override
    public String encode(String text) {
        return text;
    }
}
