/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

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
public class CustomerDao {
    
    DatabaseUtil util = new DatabaseUtil();
    PreparedStatement ps;
    
    public void saveCustomer(String name, String email, String cell, String address, JTable jt) {
        
        String sql = "insert into customer(name, cell, email, address) values(?,?,?,?)";
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);
            
            ps.executeUpdate();
            
            ps.close();
            util.getCon().close();
            
            JOptionPane.showMessageDialog(null, "Customer Saved Successfully");
            showAllCustomer(jt);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Customer Saved not Successfull");
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void showAllCustomer(JTable jt) {
        
        String[] columnsName = {"ID", "Name", "Email", "Cell", "Address"};
        DefaultTableModel tableModel = new DefaultTableModel(columnsName, 0);
        jt.setModel(tableModel);
        
        String sql = "select * from customer";
        
        try {
            PreparedStatement ps = util.getCon().prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String cell = rs.getString("cell");
                String address = rs.getString("address");

                // Add row to table model
                Object[] rowData = {id, name, email, cell, address};
                tableModel.addRow(rowData);
            }
            
            rs.close();
            ps.close();
            util.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void deleteCustomer(int id, JTable jt) {
        
        String sql = "delete from customer where id=?";
        
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            
            ps.close();
            util.getCon().close();
            
            JOptionPane.showMessageDialog(null, "Customer Delete Successfully");
            showAllCustomer(jt);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Customer Saved not Successfull");
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void editCustomer(int id, String name, String email, String cell, String address, JTable jt) {
        
        String sql = "update customer set name=?, cell=?, email=?, address=? where id=? ";
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);
            ps.setInt(5, id);
            
            ps.executeUpdate();
            
            ps.close();
            util.getCon().close();
            
            JOptionPane.showMessageDialog(null, "Customer Updated Successfully");
            showAllCustomer(jt);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Customer Saved not Successfull");
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Object[] findCustomerById(int id) {
        
        String sql = "select * from customer where id=?";
        
        try {
            ps = util.getCon().prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                return new Object[]{
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("cell"),
                    rs.getString("address"),};
            }
            
            rs.close();
            ps.close();
            util.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public void findCustomerByAddressToTable(String address, JTable jt) {
        
        String[] columnsName = {"ID", "Name", "Email", "Cell", "Address"};
        DefaultTableModel tableModel = new DefaultTableModel(columnsName, 0);
        jt.setModel(tableModel);
        
        String sql = "select * from customer where address=?";
        
        try {
            ps = util.getCon().prepareStatement(sql);
            
            ps.setString(1, address);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                tableModel.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getString("cell"),
                    rs.getString("address")}
                );
            }
            
            rs.close();
            ps.close();
            util.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void showAllCustomer(JComboBox<String> jcb) {
        
        jcb.removeAllItems();
        List<String> customersName = new ArrayList<>();
        String sql = "select name from customer";
        try {
            ps = util.getCon().prepareStatement(sql);            
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                String customerName = rs.getString("name");
                customersName.add(customerName);
                
            }
            
            rs.close();
            ps.close();
            util.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (String c : customersName) {
            
            jcb.addItem(c);
        }
        
    }
    
}
