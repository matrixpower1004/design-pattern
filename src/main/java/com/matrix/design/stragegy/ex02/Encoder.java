package com.matrix.design.stragegy.ex02;

/**
 * author         : Jason Lee
 * date           : 2023-06-06
 * description    :
 */

// Encoder는 그때그때마다 전략을 주입받을 것이므로 전략을 알고 있어야 한다.
public class Encoder {

    private EncodingStrategy encodingStrategy;

    // 각각의 전략에 따라서 결과가 달라질 수 있다.
    public String getMessage(String message) {
        return this.encodingStrategy.encode(message);
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }
}

