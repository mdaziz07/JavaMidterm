package databases;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class UnitTestConnectDB {

    public static void main(String[] args) throws Exception {

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        List <String> list =connectToSqlDB.readDataBase("dataReader","col1");
        System.out.println(list.get(0));



    }
}
