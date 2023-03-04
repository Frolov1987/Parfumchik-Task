package org.example.app.model.servises;

import org.example.app.model.Parfum;
import org.example.app.model.Parfum;
import org.example.app.utils.Constants;
import org.example.app.utils.DBConn;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadAlphabetService {
    List<Parfum> list;

    public String getData() {
        return formDataToString(readData());
    }

    private List<Parfum> readData() {

        String sql = "SELECT name, small \n" +
                "FROM parfums WHERE small = 'Gud' ORDER BY id ASC; " + Constants.TABLE_SMALL +   " ORDER BY name ASC";
        //"SELECT name, small FROM " + Constants.TABLE_SMALL +   " ORDER BY name ASC";


        try (Connection conn = DBConn.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)
        ) {

            list = new ArrayList<>();

            while (rs.next()) {
                list.add(new Parfum(
                        rs.getString("name"),
                        rs.getString("sex"),
                        rs.getString("type"),
                        rs.getString("subtype")

                        )
                );
            }
            return list;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
    }

    private String formDataToString(List<Parfum> parfums) {

        if (parfums != null) {
            if (!parfums.isEmpty()) {
                int count = 0;
                String str;
                StringBuilder stringBuilder = new StringBuilder();
                for (Parfum parfum : parfums) {
                    count++;
                    str = count + ") " + parfum.getName()+
                            " Sex " + parfum.getSex() + "\n"+
                            " Type " + parfum.getType() + "\n"+
                            " Subtype " + parfum.getSubtype() + "\n";
                    stringBuilder.append(str);
                }
                return stringBuilder.toString();
            } else
                return Constants.DATA_ABSENT_MSG;
        } else
            return Constants.DB_ABSENT_MSG;
    }
}
