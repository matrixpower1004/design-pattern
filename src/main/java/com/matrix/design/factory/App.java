package com.matrix.design.factory;

/**
 * author         : Jason Lee
 * date           : 2023-06-28
 * description    :
 */
// 팩토리 패턴!! - 도입하기
// DIP를 지킨 기본적인 형태는 지킨 상태에서 어떤 패턴을 적용할 수 있다.
public class App {
    public static void main(String[] args) {

        // 이런 방법이 잘못된것은 아니지만 DIP 원칙을 위배하고 있다.
//        MariaDB mariaDB = new MariaDB();
//        mariaDB.setUrl("jdbc:mariadb://");
//        mariaDB.execute("select");
//
//        OracleDB oracleDB = new OracleDB();
//        oracleDB.setUrl("jdbc:oracle:thin://");
//        oracleDB.execute("select");

        // 이 방법도 잘못된것은 아니지만 사용자가 실수할 여지가 많다.
//        DB mariaDB = new MariaDB();
//        mariaDB.setUrl("jdbc:mariadb://");
//        mariaDB.execute("select");
//
//        DB oracleDB = new OracleDB();
//        oracleDB.setUrl("jdbc:oracle:thin://");
//        oracleDB.execute("select");

        // 여기까지 하면 끝나긴 했지만 DBFactory는 여러번 만들어질 필요가 없다. 싱글톤 적용
//        DBFactory dbFactory = new DBFactory();
//        DB db = dbFactory.createDB("mariadb");
//        db.execute("select");

        // 싱글톤 제작
        DBFactory dbFactory = DBFactory.getInstance();

        // 내가 MariaDB 객체를 알 필요가 없고
        // setUrl 부터 해야 할지, execute 부터 해야 할지 생각할 필요가 없다.
        // 문자열만 추가해서 DB를 생성하면 된다. (내가 의존해야할 것은 DBFactory)
        DB maria = dbFactory.createDB("maria");
        maria.execute("select");

        DB mysql = dbFactory.createDB("mysql");
        mysql.execute("select");


    } // end of main
} // end of class
