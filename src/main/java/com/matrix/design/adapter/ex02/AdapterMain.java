package com.matrix.design.adapter.ex02;

public class AdapterMain {
    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
//        connect(cleaner);

        // 110V에 220V인 cleaner를 넣어서 다시 한번 connect를 시켜본다.
        Electronic110V adapter = new SocketAdapter(cleaner);
        // cleaner를 바로 연결시키는 게 아니라 adapter를 통해서 연결시킨다.
        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);

    }
    // 콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
