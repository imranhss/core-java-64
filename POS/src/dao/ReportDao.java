/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import entity.Purchase;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.DatabaseUtil;

/**
 *
 * @author Admin
 */
public class ReportDao {

    DatabaseUtil util = new DatabaseUtil();
    PreparedStatement ps;
    String sql;
    ResultSet rs;

    CategoryDao categoryDao = new CategoryDao();
    StockDao stockDao = new StockDao();

    public List<Purchase> purchaseReportByDate(Date from, Date to, JTable jt) {

        List<Purchase> purchaseList = new ArrayList<>();

        String[] columnsName = {"Product Name", "Unit Price", "Quantity", "Total Price", "Category", "Supplier", "Date"};
        DefaultTableModel tableModel = new DefaultTableModel(columnsName, 0);
        jt.setModel(tableModel);

        sql = "select * from purchase where date between ? and ?";

        try {
            ps = util.getCon().prepareStatement(sql);

            ps.setDate(1, from);
            ps.setDate(2, to);

            rs = ps.executeQuery();

            while (rs.next()) {

                Purchase p = new Purchase(
                        rs.getString("name"),
                        rs.getFloat("unitPrice"),
                        rs.getFloat("quantity"),
                        rs.getFloat("totalPrice"),
                        rs.getDate("date"),
                        rs.getString("category"),
                        rs.getString("supplier")
                );

                purchaseList.add(p);
                Object[] rowData = {p.getName(), p.getUnitPrice(), p.getQuantity(), p.getTotalPrice(), p.getCategory(), p.getSupplier(), p.getDate()};
                tableModel.addRow(rowData);

            }

        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return purchaseList;
    }

    public void generatePDFReportForPurchase(Date from, Date to, JTable jt) {
        List<Purchase> purchases = purchaseReportByDate(from, to, jt);
       
        long mil=System.currentTimeMillis();
        LocalDate currentDate = LocalDate.now(); 
        
        
        try {
            // Create a PDF document
            Document document = new Document(PageSize.A4);
            String filePath = "Purchase_Report"+mil+".pdf"; // Save to root directory
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            
            // Add title to the document
            Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16);
            Paragraph title = new Paragraph("Purchase Report: ", titleFont);
            title.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(title);
            
            
            
            // Add Sub-title to the document
            Font subTitleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14);
            Paragraph subtitle = new Paragraph("Report Generated: "+currentDate, subTitleFont);
            subtitle.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(subtitle);
            
            // Add a line break
            document.add(new Paragraph("\n"));
            
            // Add table headers
            PdfPTable table = new PdfPTable(7); // 7 columns for the data
            table.setWidthPercentage(100); // Use full page width
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);
            
            // Set table column widths
            float[] columnWidths = {2.5f, 2.5f, 2.0f, 1.5f, 1.5f, 2f, 2f};
            table.setWidths(columnWidths);
            
            String[] headers = {"Product Name", "Unit Price", "Quantity", "Total Price", "Category", "Supplier", "Date"};
            Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12);
            
            for (String header : headers) {
                PdfPCell headerCell = new PdfPCell(new Phrase(header, headerFont));
                headerCell.setHorizontalAlignment(Element.ALIGN_CENTER);
                headerCell.setBackgroundColor(BaseColor.BLACK.LIGHT_GRAY);
                table.addCell(headerCell);
            }
            
            
            Font dataFont = FontFactory.getFont(FontFactory.HELVETICA, 10);
            for (Purchase p : purchases) {
                table.addCell(new PdfPCell(new Phrase(p.getName(), dataFont)));
                table.addCell(new PdfPCell(new Phrase(String.valueOf(p.getUnitPrice()), dataFont)));
                table.addCell(new PdfPCell(new Phrase(String.valueOf(p.getQuantity()), dataFont)));
                table.addCell(new PdfPCell(new Phrase(String.valueOf(p.getTotalPrice()), dataFont)));
                table.addCell(new PdfPCell(new Phrase(p.getCategory(), dataFont)));
                table.addCell(new PdfPCell(new Phrase(p.getSupplier(), dataFont)));
                table.addCell(new PdfPCell(new Phrase(p.getDate().toString(), dataFont)));
            }

            
            // Add table to the document
            document.add(table);

            // Close the document
            document.close();
            
          JOptionPane.showMessageDialog(null, "Purchase Report Generated");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReportDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(ReportDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       

    }

    

}
