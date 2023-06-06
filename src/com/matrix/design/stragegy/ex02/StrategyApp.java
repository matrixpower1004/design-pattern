package com.matrix.design.stragegy.ex02;

/**
 * author         : Jason Lee
 * date           : 2023-06-06
 * description    :
 */
public class StrategyApp {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();

        // Base64
        EncodingStrategy base64 = new Base64Strategy();

        // Normal
        EncodingStrategy normal = new NormalStrategy();

        String message = "hello java";
        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendresult = encoder.getMessage(message);
        System.out.println(appendresult);
    }
}
