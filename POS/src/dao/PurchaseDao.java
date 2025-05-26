/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Category;
import entity.Stock;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import util.DatabaseUtil;

/**
 *
 * @author Admin
 */
public class PurchaseDao {

    DatabaseUtil util = new DatabaseUtil();
    PreparedStatement ps;
    String sql;

    CategoryDao categoryDao = new CategoryDao();
    StockDao stockDao = new StockDao();

    public void loadProduct(JComboBox<String> comboProductList, String category) {
        comboProductList.removeAllItems();

        List<Stock> stockList = stockDao.getProductByCategory(category);

        if (stockList.isEmpty()) {
            System.out.println("No Product found!");
            return; // Optionally disable the combo box or notify the user
        }

        for (Stock s : stockList) {

            comboProductList.addItem(s.getProductName());
        }

    }

    public void loadCategory(JComboBox<String> comboCategoryList) {

        comboCategoryList.removeAllItems();

        List<Category> catList = categoryDao.getAllCategory();

        // Check if the suppliers list is empty
        if (catList.isEmpty()) {
            System.out.println("No Category found!");
            return; // Optionally disable the combo box or notify the user
        }

        for (Category cat : catList) {

            comboCategoryList.addItem(cat.getName());
        }

    }

    public void savePurchase(String name, float unitPrice, float quantity, float totalPrice, String category, String supplier) {

        sql = "insert into purchase(name, unitPrice, quantity, totalPrice, category, supplier, date) "
                + "values(?,?,?,?,?,?,now())";
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setFloat(2, unitPrice);
            ps.setFloat(3, quantity);
            ps.setFloat(4, totalPrice);
            ps.setString(5, category);
            ps.setString(6, supplier);

            ps.executeUpdate();

            ps.close();
            util.getCon().close();

            JOptionPane.showMessageDialog(null, "Purchase Saved Successfully");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Purchase Not Saved ");

            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
