/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Stock;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DatabaseUtil;

/**
 *
 * @author Admin
 */
public class StockDao {

    DatabaseUtil util = new DatabaseUtil();
    PreparedStatement ps;
    String sql;
    ResultSet rs;

    public List<Stock> getProductByCategory(String category) {
        List<Stock> stockList = new ArrayList<>();
        sql = "select * from stock where category=?";

        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, category);
            rs = ps.executeQuery();

            while (rs.next()) {
                Stock s = new Stock(
                        rs.getInt("id"),
                        rs.getString("productName"),
                        rs.getFloat("quantity"),
                        rs.getString("category")
                );

                stockList.add(s);
            }

        } catch (SQLException ex) {
            Logger.getLogger(StockDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stockList;
    }

}
