/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ad;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.util.Collections.list;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.*;

public class Connect {
 //static Connection con = null;

    public static Connection coneect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");
            // JOptionPane.showMessageDialog(null, "coneected ");    //to cheak
            return con;

        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "cant connected ");

        }
        return null;

    }

    public static ArrayList<admin> getadmin() {
        ArrayList<admin> lists = new ArrayList<admin>();
        try {
            String sql = "SELECT * FROM `admin` WHERE 1";
            Connection con = Connect.coneect();
            PreparedStatement pd = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rus = pd.executeQuery();
            while (rus.next()) {
                admin ad = new admin();
                ad.setID(rus.getInt(1));
                ad.setUsername(rus.getString(2));
                ad.setPassword(rus.getString(3));

                lists.add(ad);
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lists;
    }

    public static ArrayList<customer> getcustomer() {
        ArrayList<customer> lists = new ArrayList<customer>();
        try {
            String sql = "SELECT * FROM `customer` WHERE 1";
            Connection con = Connect.coneect();
            PreparedStatement pd = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rus = pd.executeQuery();
            while (rus.next()) {
                customer cc = new customer();
                cc.setID(rus.getInt(1));
                cc.setName(rus.getString(2));
                cc.setPhone(rus.getString(3));
                cc.setAddress(rus.getString(4));
                cc.setTotal(Double.parseDouble(rus.getString(5)));
                cc.setPaid(Double.parseDouble(rus.getString(6)));

                lists.add(cc);
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lists;
    }

    public static void main(String[] args) {
        Connect.coneect();
    }
}
