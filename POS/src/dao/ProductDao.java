/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.DatabaseUtil;

/**
 *
 * @author Admin
 */
public class ProductDao {

    DatabaseUtil util = new DatabaseUtil();
    PreparedStatement ps;
    String sql;
    ResultSet rs;

    CategoryDao categoryDao = new CategoryDao();

    public void loadCategoryToProductCombo(JComboBox<String> catList) {

        catList.removeAllItems();

        List<Category> categories = new ArrayList<>();

        categories = categoryDao.getAllCategory();

        for (Category c : categories) {
            catList.addItem(c.getName());
        }

    }

    public void saveProduct(String productName, String category) {
        sql = "insert into product(category, productName) values(?,?)";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setString(1, category);
            ps.setString(2, productName);

            ps.executeUpdate();

            ps.close();
            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Product Added Successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Product not Added");

            Logger.getLogger(ProductDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    public void showAllProduct(JTable jt) {

        String[] columnsName = {"ID", "Product Name", "Category"};
        DefaultTableModel tableModel = new DefaultTableModel(columnsName, 0);
        jt.setModel(tableModel);

        String sql = "select * from product";

        try {
            PreparedStatement ps = util.getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String productName = rs.getString("productName");
                String category = rs.getString("category");
               

                // Add row to table model
                Object[] rowData = {id, productName, category};
                tableModel.addRow(rowData);
            }

            rs.close();
            ps.close();
            util.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(SupplierDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    

}



