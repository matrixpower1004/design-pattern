package com.matrix.design.factory;

/**
 * author         : Jason Lee
 * date           : 2023-06-28
 * description    :
 */
public class DBFactory {

    // 싱글톤 패턴
    private static DBFactory dbFactory = new DBFactory();

    private DBFactory() {}

    public static DBFactory getInstance() {
        if (dbFactory == null) {
            dbFactory = new DBFactory();
        }
        return dbFactory;
    }

    // 이렇게 if로 추가하는 방법은 OCP를 위배!! - 기존 코드를 수정.
    // OCP를 위배하면 프로그램을 잘못만든 것이다? - 이렇게 생각할 필요는 없다.
    // 패턴은 우리가 코드를 짤 때, 편하게, 협업, 클린한 코드를 짜게 해주는 것이기 때문에, 예외는 있음.
    // DB 회사가 매일 매일 변경된다전지, 새로운 Driver가 금방 금방 나온다던지, 그럴 수 없음. 몇년에 한 번 나오겠죠!!
    public DB createDB(String protocol) {
        if (protocol.equals("maria")) {
            DB mariaDB = new MariaDB();
            mariaDB.setUrl("jdbc:mariadb://");
            return mariaDB;
        } else if (protocol.equals("oracle")) {
            DB oracleDB = new OracleDB();
            oracleDB.setUrl("jdbc:oracle:thin://");
            return oracleDB;
        } else if (protocol.equals("mysql")) {
            DB mysqlDB = new MySqlDB();
            mysqlDB.setUrl("jdbc:mysqldb://");
            return mysqlDB;
        } else {
            throw new NullPointerException("db driver not found exception");
        }
    }
}
