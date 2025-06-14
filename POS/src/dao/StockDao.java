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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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

    public void saveStock(String productName, float quantity, String category) {

        sql = "insert into stock(productName, quantity, category) values(?,?,?)";
        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, productName);
            ps.setFloat(2, quantity);
            ps.setString(3, category);

            ps.executeUpdate();

            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(StockDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateStockQuantityByProductName(String productName, float quantity) {

        sql = "update stock set quantity = quantity + ? where productName = ?";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setFloat(1, quantity);
            ps.setString(2, productName);

            ps.executeUpdate();

            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(StockDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void getAllStock(JTable jt) {

        // List<Stock> stockList = new ArrayList<>();
        String[] columnsName = {"ID", "Product Name", "Quantity","Category"};
        DefaultTableModel tableModel = new DefaultTableModel(columnsName, 0);
        jt.setModel(tableModel);

        sql = "select * from stock order by productName";

        try {
            ps = util.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String productName = rs.getString("productName");
                float quantity = rs.getFloat("quantity");
                String category = rs.getString("category");

                Object[] rowData = {id, productName,quantity, category};
                tableModel.addRow(rowData);
            }

        } catch (SQLException ex) {
            Logger.getLogger(StockDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    
    public float getStockQuantityByProductName(String productName){
    
        sql= "select quantity from stock where productName = ?";
    
        float quantity=0;
        
        try {
            ps=util.getCon().prepareStatement(sql);
            ps.setString(1, productName);
            
            rs=ps.executeQuery();
            
            while(rs.next()){
            
                quantity = rs.getFloat("quantity");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StockDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return quantity;
    }
    
    
    
    public void updateStockQuantityByProductNameSales(String productName, float quantity) {

        sql = "update stock set quantity = quantity - ? where productName = ?";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setFloat(1, quantity);
            ps.setString(2, productName);

            ps.executeUpdate();

            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(StockDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
