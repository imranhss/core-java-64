/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.CategoryDao;
import dao.CustomerDao;
import dao.ProductDao;
import dao.PurchaseDao;
import dao.ReportDao;
import dao.SalesDao;
import dao.StockDao;
import dao.SupplierDao;
import entity.Sales;
import entity.Stock;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import util.DatabaseUtil;
import util.DateConvert;

/**
 *
 * @author Admin
 */
public class PosView extends javax.swing.JFrame {

    DatabaseUtil util = new DatabaseUtil();
    CustomerDao customerDao = new CustomerDao();
    SupplierDao supplierDao = new SupplierDao();
    CategoryDao categoryDao = new CategoryDao();
    PurchaseDao purchaseDao = new PurchaseDao();
    StockDao stockDao = new StockDao();
    ProductDao productDao = new ProductDao();
    DateConvert convert = new DateConvert();
    ReportDao reportDao = new ReportDao();
    SalesDao salesDao = new SalesDao();

    /**
     * Creates new form PosView
     */
    public PosView() {
        initComponents();
        productDao.showAllProduct(tblProduct);
        customerDao.showAllCustomer(tblCustomer);
        supplierDao.showAllSupplier(tblSupplier);
        categoryDao.showAllCategory(tblCategory);
        purchaseDao.loadCategory(comboPurchaseCategory);
        supplierDao.showAllSupplierToPurchaseComboBox(comboPurchaseSupplierName);
        productDao.loadCategoryToProductCombo(comboProductCategory);

        salesDao.loadCategory(comboSalesCategory);
        customerDao.showAllCustomer(comboSalesCustomer);

        stockDao.getAllStock(tblStock);

        comboPurchaseCategory.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String categoryName = comboPurchaseCategory.getSelectedItem().toString();

                purchaseDao.loadProduct(comboPurchaseProductName, categoryName);

            }
        }
        );

//        comboSalesCategory.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                String categoryName = comboSalesCategory.getSelectedItem().toString();
//
//                salesDao.loadProduct(comboSalesProductName, categoryName);
//
//            }
//        }
//        );

        comboSalesCategory.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED && comboSalesCategory.getSelectedItem() != null) {
                String categoryName = comboSalesCategory.getSelectedItem().toString();
                salesDao.loadProduct(comboSalesProductName, categoryName);
            }
        });

        comboSalesProductName.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED && comboSalesProductName.getSelectedItem() != null) {
                String productName = comboSalesProductName.getSelectedItem().toString();
                float quantity = stockDao.getStockQuantityByProductName(productName);
                lblSalesStock.setText(String.valueOf(quantity));
            }
        });

//        comboSalesProductName.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                String productName = comboSalesProductName.getSelectedItem().toString();
//
//                float quantity = stockDao.getStockQuantityByProductName(productName);
//                lblSalesStock.setText(String.valueOf(quantity));
//
//            }
//        }
//        );
//        comboPurchaseProductName.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            }
//        });
    }

    //Cutomer form Reset
    public void resetCustomer() {
        txtCustomerId.setText("");
        txtCustomerName.setText("");
        txtCustomerEmail.setText("");
        txtCustomerCell.setText("");
        txtCustomerAddress.setText("");
        btnCustomerSave.setVisible(true);

    }

    //Product form Reset
    public void resetProduct() {
        txtProductProductName.setText("");
        txtProductID.setText("");
        btnProductSave.setVisible(true);

    }

    //Supplier form Reset
    public void resetSupplier() {
        txtSupplierId.setText("");
        txtSupplierName.setText("");
        txtSupplierEmail.setText("");
        txtSupplierCell.setText("");
        txtSupplierAddress.setText("");
        txtSupplierContactPerson.setText("");

        btnSupplierSave.setVisible(true);

    }

    //resat
    public void resetCategory() {
        txtCategoryId.setText("");
        txtCategoryName.setText("");
        btnCategorySave.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        btnSupplier = new javax.swing.JButton();
        btnCategory = new javax.swing.JButton();
        btnPurchase = new javax.swing.JButton();
        btnSales = new javax.swing.JButton();
        btnStock = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        tabMain = new javax.swing.JTabbedPane();
        tabHome = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tabCustomer = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCustomerCell = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCustomerEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCustomerAddress = new javax.swing.JTextField();
        btnCustomerSave = new javax.swing.JButton();
        btnCustomerEdit = new javax.swing.JButton();
        btnCustomerDelete = new javax.swing.JButton();
        btnCustomerReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        btnCustomerSearch = new javax.swing.JButton();
        btnCustomerSearchByAddress = new javax.swing.JButton();
        tabSupplier = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnSupplierDelete = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtSupplierId = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtSupplierName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtSupplierAddress = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtSupplierCell = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtSupplierEmail = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtSupplierContactPerson = new javax.swing.JTextField();
        btnSupplierSave = new javax.swing.JButton();
        btnSupplierEdit = new javax.swing.JButton();
        btnSupplierReset = new javax.swing.JButton();
        btnSupplierDelete1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSupplier = new javax.swing.JTable();
        tabCategory = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCategoryId = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCategoryName = new javax.swing.JTextField();
        btnCategoryEdit = new javax.swing.JButton();
        btnCategorySave = new javax.swing.JButton();
        btnCategoryDelete = new javax.swing.JButton();
        btnCategoryReset = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCategory = new javax.swing.JTable();
        tabPurchase = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        comboPurchaseCategory = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        comboPurchaseProductName = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        comboPurchaseSupplierName = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        txtPurcahseUnitPrice = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtPurcahseQuantity = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtPurcahseTotalPrice = new javax.swing.JTextField();
        btnPurchaseConfirm = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tabSales = new javax.swing.JTabbedPane();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        comboSalesCategory = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        comboSalesProductName = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        lblSalesStock = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        comboSalesCustomer = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        txtSalesUnitPrice = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtSalesQuantity = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtSalesTotalPrice = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtSalesDiscount = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtSalesActualAmount = new javax.swing.JTextField();
        btnSalesSave = new javax.swing.JButton();
        btnSalesReset = new javax.swing.JButton();
        tabStock = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblStock = new javax.swing.JTable();
        tabReport = new javax.swing.JTabbedPane();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        JdateReportFrom = new com.toedter.calendar.JDateChooser();
        jLabel33 = new javax.swing.JLabel();
        JdateReportTo = new com.toedter.calendar.JDateChooser();
        btnReportPurchase = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblReport = new javax.swing.JTable();
        tabProduct = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        comboProductCategory = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        txtProductProductName = new javax.swing.JTextField();
        btnProductSave = new javax.swing.JButton();
        btnProductReset = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1333, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1324, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 90));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        btnHome.setText("Home");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        btnCustomer.setText("Customer");
        btnCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerMouseClicked(evt);
            }
        });

        btnSupplier.setText("Supplier");
        btnSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierMouseClicked(evt);
            }
        });

        btnCategory.setText("Category");
        btnCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoryMouseClicked(evt);
            }
        });

        btnPurchase.setText("Purchase");
        btnPurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPurchaseMouseClicked(evt);
            }
        });

        btnSales.setText("Sales");
        btnSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalesMouseClicked(evt);
            }
        });

        btnStock.setText("Stock");
        btnStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStockMouseClicked(evt);
            }
        });

        btnReport.setText("Report");
        btnReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportMouseClicked(evt);
            }
        });

        btnProduct.setText("Product");
        btnProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 210, 610));

        tabMain.setEnabled(false);

        jLabel2.setText("1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(580, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(522, Short.MAX_VALUE))
        );

        tabHome.addTab("tab1", jPanel3);

        tabMain.addTab("tab1", tabHome);

        jPanel8.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Customers");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 204, 204));

        jLabel7.setText("ID");

        jLabel8.setText("Name");

        jLabel9.setText("Cell");

        jLabel10.setText("Email");

        jLabel11.setText("Address");

        btnCustomerSave.setText("Save");
        btnCustomerSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerSaveMouseClicked(evt);
            }
        });

        btnCustomerEdit.setText("Edit");
        btnCustomerEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerEditMouseClicked(evt);
            }
        });

        btnCustomerDelete.setText("Delete");
        btnCustomerDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerDeleteMouseClicked(evt);
            }
        });

        btnCustomerReset.setText("Reset");
        btnCustomerReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerResetMouseClicked(evt);
            }
        });

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        btnCustomerSearch.setText("Search");
        btnCustomerSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerSearchMouseClicked(evt);
            }
        });

        btnCustomerSearchByAddress.setText("Search By Address");
        btnCustomerSearchByAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerSearchByAddressMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCustomerSearch)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(txtCustomerCell, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(btnCustomerSave)
                                        .addGap(97, 97, 97)
                                        .addComponent(btnCustomerEdit)))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCustomerAddress))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(btnCustomerDelete)
                                        .addGap(97, 97, 97)
                                        .addComponent(btnCustomerReset)
                                        .addGap(98, 98, 98)
                                        .addComponent(btnCustomerSearchByAddress)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1089, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtCustomerCell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomerSearch))
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCustomerSave)
                    .addComponent(btnCustomerEdit)
                    .addComponent(btnCustomerDelete)
                    .addComponent(btnCustomerReset)
                    .addComponent(btnCustomerSearchByAddress))
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabCustomer.addTab("tab1", jPanel4);

        tabMain.addTab("tab2", tabCustomer);

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(51, 51, 0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Supplier");
        jPanel11.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 76));

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("ID");

        jLabel16.setText("Name");

        jLabel17.setText("Address");

        jLabel18.setText("Cell");

        jLabel19.setText("Email");

        jLabel20.setText("Contact Person");

        btnSupplierSave.setText("Save");
        btnSupplierSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierSaveMouseClicked(evt);
            }
        });

        btnSupplierEdit.setText("Edit");
        btnSupplierEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierEditMouseClicked(evt);
            }
        });

        btnSupplierReset.setText("Reset");
        btnSupplierReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierResetMouseClicked(evt);
            }
        });

        btnSupplierDelete1.setText("Delete");
        btnSupplierDelete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSupplierDelete1MouseClicked(evt);
            }
        });

        tblSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSupplierMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSupplier);

        javax.swing.GroupLayout btnSupplierDeleteLayout = new javax.swing.GroupLayout(btnSupplierDelete);
        btnSupplierDelete.setLayout(btnSupplierDeleteLayout);
        btnSupplierDeleteLayout.setHorizontalGroup(
            btnSupplierDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSupplierDeleteLayout.createSequentialGroup()
                .addGap(1109, 1109, 1109)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btnSupplierDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnSupplierDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnSupplierDeleteLayout.createSequentialGroup()
                        .addGroup(btnSupplierDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(btnSupplierDeleteLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(29, 29, 29)
                                .addComponent(txtSupplierId, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel16)
                                .addGap(29, 29, 29)
                                .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(btnSupplierDeleteLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(29, 29, 29)
                                .addComponent(txtSupplierEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(btnSupplierDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20))
                        .addGap(29, 29, 29)
                        .addGroup(btnSupplierDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSupplierAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                            .addComponent(txtSupplierContactPerson))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(btnSupplierDeleteLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addGroup(btnSupplierDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSupplierCell, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(btnSupplierDeleteLayout.createSequentialGroup()
                                .addComponent(btnSupplierSave)
                                .addGap(61, 61, 61)
                                .addComponent(btnSupplierEdit)))
                        .addGap(77, 77, 77)
                        .addComponent(btnSupplierDelete1)
                        .addGap(65, 65, 65)
                        .addComponent(btnSupplierReset)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(btnSupplierDeleteLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        btnSupplierDeleteLayout.setVerticalGroup(
            btnSupplierDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSupplierDeleteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(btnSupplierDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtSupplierId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtSupplierAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(btnSupplierDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtSupplierCell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtSupplierEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtSupplierContactPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(btnSupplierDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSupplierSave)
                    .addComponent(btnSupplierEdit)
                    .addComponent(btnSupplierReset)
                    .addComponent(btnSupplierDelete1))
                .addGap(70, 70, 70)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(1109, 1109, 1109)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSupplierDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSupplierDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabSupplier.addTab("tab1", jPanel5);

        tabMain.addTab("tab3", tabSupplier);

        jPanel6.setBackground(new java.awt.Color(0, 153, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(0, 102, 153));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Category");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, 20));
        jPanel6.add(txtCategoryId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 140, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Name");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 70, 30));
        jPanel6.add(txtCategoryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 160, 30));

        btnCategoryEdit.setText("Edit");
        btnCategoryEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoryEditMouseClicked(evt);
            }
        });
        jPanel6.add(btnCategoryEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        btnCategorySave.setText("Save");
        btnCategorySave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategorySaveMouseClicked(evt);
            }
        });
        jPanel6.add(btnCategorySave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        btnCategoryDelete.setText("Delete");
        jPanel6.add(btnCategoryDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        btnCategoryReset.setText("Reset");
        jPanel6.add(btnCategoryReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));

        tblCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoryMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCategory);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 570, 200));

        tabCategory.addTab("tab1", jPanel6);

        tabMain.addTab("tab4", tabCategory);

        jPanel14.setBackground(new java.awt.Color(0, 51, 51));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Purchase");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        jLabel14.setText("Category");

        comboPurchaseCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel21.setText("Product Name");

        comboPurchaseProductName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel22.setText("Supplier Name");

        comboPurchaseSupplierName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel23.setText("Unit Price");

        jLabel24.setText("Quantity");

        txtPurcahseQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPurcahseQuantityFocusLost(evt);
            }
        });

        jLabel25.setText("Total Price");

        btnPurchaseConfirm.setText("Confirm");
        btnPurchaseConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPurchaseConfirmMouseClicked(evt);
            }
        });

        jButton2.setText("Reset");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboPurchaseCategory, 0, 176, Short.MAX_VALUE)
                            .addComponent(txtPurcahseUnitPrice))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(comboPurchaseProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(txtPurcahseQuantity)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(comboPurchaseSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(18, 18, 18)
                                .addComponent(txtPurcahseTotalPrice))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnPurchaseConfirm)
                        .addGap(78, 78, 78)
                        .addComponent(jButton2)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPurchaseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPurchaseProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboPurchaseSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtPurcahseUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtPurcahseQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(txtPurcahseTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPurchaseConfirm)
                    .addComponent(jButton2))
                .addGap(0, 538, Short.MAX_VALUE))
        );

        tabPurchase.addTab("tab1", jPanel7);

        tabMain.addTab("tab5", tabPurchase);

        jPanel21.setBackground(new java.awt.Color(153, 153, 153));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Sales ");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        jLabel35.setText("Category");

        comboSalesCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel36.setText("Product Name");

        comboSalesProductName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel37.setText("Stock");

        lblSalesStock.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        jLabel39.setText("Customer");

        comboSalesCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel40.setText("Unit Price");

        jLabel41.setText("Quantity");

        txtSalesQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSalesQuantityFocusLost(evt);
            }
        });

        jLabel42.setText("Total Price");

        jLabel43.setText("Discount %");

        txtSalesDiscount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSalesDiscountFocusLost(evt);
            }
        });

        jLabel44.setText("Actual Amount");

        btnSalesSave.setText("Sales");
        btnSalesSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalesSaveMouseClicked(evt);
            }
        });

        btnSalesReset.setText("Reset");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboSalesCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboSalesCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalesSave)
                            .addComponent(txtSalesTotalPrice))))
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel40)
                            .addComponent(jLabel43))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboSalesProductName, 0, 158, Short.MAX_VALUE)
                            .addComponent(txtSalesUnitPrice)
                            .addComponent(txtSalesDiscount))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel44)
                            .addComponent(jLabel41)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSalesActualAmount)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(txtSalesQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblSalesStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(131, 131, 131))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnSalesReset)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSalesStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(comboSalesCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36)
                        .addComponent(comboSalesProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(comboSalesCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(txtSalesUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(txtSalesQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtSalesTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(txtSalesDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(txtSalesActualAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalesSave)
                    .addComponent(btnSalesReset))
                .addGap(0, 385, Short.MAX_VALUE))
        );

        tabSales.addTab("tab1", jPanel20);

        tabMain.addTab("tab6", tabSales);

        jPanel17.setBackground(new java.awt.Color(153, 204, 255));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Stock Details");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        tblStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tblStock);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(125, 125, 125)
                        .addComponent(jButton3)
                        .addGap(141, 141, 141)
                        .addComponent(jButton4)
                        .addGap(194, 194, 194)
                        .addComponent(jButton5)))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 80, Short.MAX_VALUE))
        );

        tabStock.addTab("tab1", jPanel16);

        tabMain.addTab("tab7", tabStock);

        jPanel19.setBackground(new java.awt.Color(51, 102, 0));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Report");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        jLabel32.setText("Fron");

        jLabel33.setText("To");

        btnReportPurchase.setText("Purcahse");
        btnReportPurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportPurchaseMouseClicked(evt);
            }
        });

        tblReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tblReport);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReportPurchase)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(72, 72, 72)
                        .addComponent(JdateReportFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel33)
                        .addGap(46, 46, 46)
                        .addComponent(JdateReportTo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1069, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(JdateReportFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JdateReportTo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(35, 35, 35)
                .addComponent(btnReportPurchase)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 77, Short.MAX_VALUE))
        );

        tabReport.addTab("tab1", jPanel18);

        tabMain.addTab("tab8", tabReport);

        jPanel15.setBackground(new java.awt.Color(0, 204, 153));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Product");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
        );

        jLabel27.setText("ID");

        jLabel28.setText("Category");

        comboProductCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel29.setText("ProductName");

        btnProductSave.setText("Save");
        btnProductSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductSaveMouseClicked(evt);
            }
        });

        btnProductReset.setText("Reset");
        btnProductReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductResetMouseClicked(evt);
            }
        });

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblProduct);

        javax.swing.GroupLayout tabProductLayout = new javax.swing.GroupLayout(tabProduct);
        tabProduct.setLayout(tabProductLayout);
        tabProductLayout.setHorizontalGroup(
            tabProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tabProductLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel27)
                .addGap(26, 26, 26)
                .addGroup(tabProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabProductLayout.createSequentialGroup()
                        .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(comboProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29)
                        .addGap(49, 49, 49)
                        .addComponent(txtProductProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))
                    .addGroup(tabProductLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(btnProductReset)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(tabProductLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(tabProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProductSave)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 952, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tabProductLayout.setVerticalGroup(
            tabProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabProductLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(tabProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(comboProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(txtProductProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(tabProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProductSave)
                    .addComponent(btnProductReset))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        tabMain.addTab("tab9", tabProduct);

        getContentPane().add(tabMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 1120, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        // TODO add your handling code here:
        tabMain.setSelectedIndex(0);

    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMouseClicked
        // TODO add your handling code here:
        tabMain.setSelectedIndex(1);
    }//GEN-LAST:event_btnCustomerMouseClicked

    private void btnSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierMouseClicked
        // TODO add your handling code here:
        tabMain.setSelectedIndex(2);
    }//GEN-LAST:event_btnSupplierMouseClicked

    private void btnCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoryMouseClicked
        // TODO add your handling code here:
        tabMain.setSelectedIndex(3);
    }//GEN-LAST:event_btnCategoryMouseClicked

    private void btnCustomerSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerSaveMouseClicked
        // TODO add your handling code here:

        String name = txtCustomerName.getText().trim();
        String email = txtCustomerEmail.getText().trim();
        String cell = txtCustomerCell.getText().trim();
        String address = txtCustomerAddress.getText().trim();

        customerDao.saveCustomer(name, email, cell, address, tblCustomer);

        resetCustomer();
    }//GEN-LAST:event_btnCustomerSaveMouseClicked

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        // TODO add your handling code here:

        btnCustomerSave.setVisible(false);
        int rowIndex = tblCustomer.getSelectedRow();

        String id = tblCustomer.getModel().getValueAt(rowIndex, 0).toString();
        String name = tblCustomer.getModel().getValueAt(rowIndex, 1).toString();
        String email = tblCustomer.getModel().getValueAt(rowIndex, 2).toString();
        String cell = tblCustomer.getModel().getValueAt(rowIndex, 3).toString();
        String address = tblCustomer.getModel().getValueAt(rowIndex, 4).toString();

        txtCustomerId.setText(id);
        txtCustomerName.setText(name);
        txtCustomerEmail.setText(email);
        txtCustomerCell.setText(cell);
        txtCustomerAddress.setText(address);


    }//GEN-LAST:event_tblCustomerMouseClicked

    private void btnCustomerResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerResetMouseClicked
        // TODO add your handling code here:
        resetCustomer();
    }//GEN-LAST:event_btnCustomerResetMouseClicked

    private void btnCustomerDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerDeleteMouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(txtCustomerId.getText());

        customerDao.deleteCustomer(id, tblCustomer);
        resetCustomer();
        btnCustomerSave.setVisible(true);

    }//GEN-LAST:event_btnCustomerDeleteMouseClicked

    private void btnCustomerEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerEditMouseClicked
        // TODO add your handling code here:

        String name = txtCustomerName.getText().trim();
        String email = txtCustomerEmail.getText().trim();
        String cell = txtCustomerCell.getText().trim();
        String address = txtCustomerAddress.getText().trim();
        int id = Integer.parseInt(txtCustomerId.getText().trim());

        customerDao.editCustomer(id, name, email, cell, address, tblCustomer);

        resetCustomer();
        btnCustomerSave.setVisible(true);

    }//GEN-LAST:event_btnCustomerEditMouseClicked

    private void btnCustomerSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerSearchMouseClicked
        // TODO add your handling code here:

        int id = Integer.parseInt(txtCustomerId.getText());
        Object[] customers = customerDao.findCustomerById(id);

        if (customers == null) {
            JOptionPane.showMessageDialog(null, "Customer Not found with this ID");
            txtCustomerId.setText("");
        } else {
            //txtCustomerId.setText(customers[0].toString());
            txtCustomerName.setText(customers[0].toString());
            txtCustomerEmail.setText(customers[1].toString());
            txtCustomerCell.setText(customers[2].toString());
            txtCustomerAddress.setText(customers[3].toString());

        }


    }//GEN-LAST:event_btnCustomerSearchMouseClicked

    private void btnCustomerSearchByAddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerSearchByAddressMouseClicked
        // TODO add your handling code here:
        String address = txtCustomerAddress.getText().trim();
        customerDao.findCustomerByAddressToTable(address, tblCustomer);
    }//GEN-LAST:event_btnCustomerSearchByAddressMouseClicked

    private void btnSupplierSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierSaveMouseClicked
        // TODO add your handling code here:

        String name = txtSupplierName.getText().trim().toString();
        String email = txtSupplierEmail.getText().trim().toString();
        String cell = txtSupplierCell.getText().trim().toString();
        String address = txtSupplierAddress.getText().trim().toString();
        String contactPerson = txtSupplierContactPerson.getText().trim().toString();

        supplierDao.saveSupplier(name, email, cell, address, contactPerson, tblSupplier);

        resetSupplier();

    }//GEN-LAST:event_btnSupplierSaveMouseClicked

    private void tblSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSupplierMouseClicked
        // TODO add your handling code here:
        btnSupplierSave.setVisible(false);
        int rowIndex = tblSupplier.getSelectedRow();

        String id = tblSupplier.getModel().getValueAt(rowIndex, 0).toString();
        String name = tblSupplier.getModel().getValueAt(rowIndex, 1).toString();
        String email = tblSupplier.getModel().getValueAt(rowIndex, 2).toString();
        String cell = tblSupplier.getModel().getValueAt(rowIndex, 3).toString();
        String address = tblSupplier.getModel().getValueAt(rowIndex, 4).toString();
        String contactPerson = tblSupplier.getModel().getValueAt(rowIndex, 5).toString();

        txtSupplierId.setText(id);
        txtSupplierName.setText(name);
        txtSupplierEmail.setText(email);
        txtSupplierCell.setText(cell);
        txtSupplierAddress.setText(address);
        txtSupplierContactPerson.setText(contactPerson);

    }//GEN-LAST:event_tblSupplierMouseClicked

    private void btnSupplierResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierResetMouseClicked
        // TODO add your handling code here:
        resetSupplier();
    }//GEN-LAST:event_btnSupplierResetMouseClicked

    private void btnSupplierDelete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierDelete1MouseClicked
        // TODO add your handling code here:
        int id = Integer.parseInt(txtSupplierId.getText().trim().toString());
        supplierDao.deleteSupplier(id, tblSupplier);
        resetSupplier();

    }//GEN-LAST:event_btnSupplierDelete1MouseClicked

    private void btnSupplierEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSupplierEditMouseClicked
        // TODO add your handling code here:
        String name = txtSupplierName.getText().trim().toString();
        String email = txtSupplierEmail.getText().trim().toString();
        String cell = txtSupplierCell.getText().trim().toString();
        String address = txtSupplierAddress.getText().trim().toString();
        String contactPerson = txtSupplierContactPerson.getText().trim().toString();
        int id = Integer.parseInt(txtSupplierId.getText());

        supplierDao.editSupplier(id, name, email, cell, address, contactPerson, tblSupplier);

        resetSupplier();


    }//GEN-LAST:event_btnSupplierEditMouseClicked

    private void btnCategorySaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategorySaveMouseClicked
        // TODO add your handling code here:
        String name = txtCategoryName.getText().trim().toString();

        categoryDao.saveCategory(name, tblCategory);


    }//GEN-LAST:event_btnCategorySaveMouseClicked

    private void btnCategoryEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoryEditMouseClicked
        // TODO add your handling code here:
        String name = txtCategoryName.getText().trim();
        int id = Integer.parseInt(txtCategoryId.getText());
        categoryDao.editCategory(id, name, tblCategory);

        resetCategory();
    }//GEN-LAST:event_btnCategoryEditMouseClicked

    private void tblCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoryMouseClicked
        // TODO add your handling code here:
        btnCategorySave.setVisible(false);
        int rowIndex = tblCategory.getSelectedRow();

        String id = tblCategory.getModel().getValueAt(rowIndex, 0).toString();
        String name = tblCategory.getModel().getValueAt(rowIndex, 1).toString();

        txtCategoryId.setText(id);
        txtCategoryName.setText(name);


    }//GEN-LAST:event_tblCategoryMouseClicked

    private void btnPurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPurchaseMouseClicked
        // TODO add your handling code here:
        tabMain.setSelectedIndex(4);
        // purchaseDao.loadCategory(comboPurchaseCategory);
    }//GEN-LAST:event_btnPurchaseMouseClicked

    private void txtPurcahseQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPurcahseQuantityFocusLost
        // TODO add your handling code here:
        float unitPrice = Float.parseFloat(txtPurcahseUnitPrice.getText().trim());
        float quantity = Float.parseFloat(txtPurcahseQuantity.getText().trim());

        float totalPrice = unitPrice * quantity;

        txtPurcahseTotalPrice.setText(String.valueOf(totalPrice));

    }//GEN-LAST:event_txtPurcahseQuantityFocusLost

    private void btnPurchaseConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPurchaseConfirmMouseClicked
        // TODO add your handling code here:
        String category = comboPurchaseCategory.getSelectedItem().toString();
        String productName = comboPurchaseProductName.getSelectedItem().toString();
        String supplierName = comboPurchaseSupplierName.getSelectedItem().toString();
        float unitPrice = Float.parseFloat(txtPurcahseUnitPrice.getText().trim());
        float quantity = Float.parseFloat(txtPurcahseQuantity.getText().trim());
        float totalPrice = Float.parseFloat(txtPurcahseTotalPrice.getText().trim());

        purchaseDao.savePurchase(productName, unitPrice, quantity, totalPrice, category, supplierName);

        // Start stock update 
        List<Stock> sList = stockDao.getProductByCategory(category);
        boolean status = false;

        for (Stock stock : sList) {
            if (productName.equals(stock.getProductName())) {
                // Do something
                status = true;
                break;
            }
        }

        if (status) {
            stockDao.updateStockQuantityByProductName(productName, quantity);

        }

        stockDao.getAllStock(tblStock);

    }//GEN-LAST:event_btnPurchaseConfirmMouseClicked

    private void btnSalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalesMouseClicked
        // TODO add your handling code here:
        tabMain.setSelectedIndex(5);
    }//GEN-LAST:event_btnSalesMouseClicked

    private void btnStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStockMouseClicked
        // TODO add your handling code here:
        tabMain.setSelectedIndex(6);
        stockDao.getAllStock(tblStock);
    }//GEN-LAST:event_btnStockMouseClicked

    private void btnReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseClicked
        // TODO add your handling code here:
        tabMain.setSelectedIndex(7);
    }//GEN-LAST:event_btnReportMouseClicked

    private void btnProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductMouseClicked
        // TODO add your handling code here:
        tabMain.setSelectedIndex(8);
    }//GEN-LAST:event_btnProductMouseClicked

    private void btnProductSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductSaveMouseClicked
        // TODO add your handling code here:
        String productName = txtProductProductName.getText().trim();
        String category = comboProductCategory.getSelectedItem().toString();

        productDao.saveProduct(productName, category);
        resetProduct();
        productDao.showAllProduct(tblProduct);
        stockDao.saveStock(productName, 0, category);

    }//GEN-LAST:event_btnProductSaveMouseClicked

    private void btnProductResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductResetMouseClicked
        // TODO add your handling code here:

        resetProduct();
    }//GEN-LAST:event_btnProductResetMouseClicked

    private void btnReportPurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportPurchaseMouseClicked
        // TODO add your handling code here:
        Date fromDate = JdateReportFrom.getDate();
        Date toDate = JdateReportTo.getDate();

        java.sql.Date from = convert.utilDateToSqlDate(fromDate);
        java.sql.Date to = convert.utilDateToSqlDate(toDate);

        reportDao.generatePDFReportForPurchase(from, to, tblReport);

    }//GEN-LAST:event_btnReportPurchaseMouseClicked

    private void txtSalesQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSalesQuantityFocusLost
        // TODO add your handling code here:
        float unitPrice = Float.parseFloat(txtSalesUnitPrice.getText().trim());
        float quantity = Float.parseFloat(txtSalesQuantity.getText().trim());

        float totalPrice = unitPrice * quantity;

        txtSalesTotalPrice.setText(String.valueOf(totalPrice));
        
        float stock = Float.parseFloat(lblSalesStock.getText());
        
        if(stock < quantity){
            JOptionPane.showMessageDialog(null, "Sales Quantity not more than Stock Quantity");
            txtSalesQuantity.requestFocus();
        }
        


    }//GEN-LAST:event_txtSalesQuantityFocusLost

    private void txtSalesDiscountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSalesDiscountFocusLost
        // TODO add your handling code here:
        float unitPrice = Float.parseFloat(txtSalesUnitPrice.getText().trim());
        float quantity = Float.parseFloat(txtSalesQuantity.getText().trim());

        float totalPrice = unitPrice * quantity;

        float discount = Float.parseFloat(txtSalesDiscount.getText().trim());

        float actualAmount = (float) Math.ceil((totalPrice - (totalPrice * (discount / 100))));

        txtSalesActualAmount.setText(String.valueOf(actualAmount));

    }//GEN-LAST:event_txtSalesDiscountFocusLost

    private void btnSalesSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalesSaveMouseClicked
        // TODO add your handling code here:
        String category = comboSalesCategory.getSelectedItem().toString();
        String productName = comboSalesProductName.getSelectedItem().toString();
        String customerName = comboSalesCustomer.getSelectedItem().toString();
        float quantity = Float.parseFloat(txtSalesQuantity.getText().trim());
        float unitPrice = Float.parseFloat(txtSalesUnitPrice.getText().trim());
        float totalPrice = Float.parseFloat(txtSalesTotalPrice.getText().trim());
        float discount = Float.parseFloat(txtSalesDiscount.getText().trim());
        float actualAmount = Float.parseFloat(txtSalesActualAmount.getText().trim());
        
        Sales s = new Sales(category, productName, customerName, unitPrice, quantity, totalPrice, discount, actualAmount);
        
        salesDao.saveSales(s);
        
        stockDao.updateStockQuantityByProductNameSales(productName, quantity);
            
        

    }//GEN-LAST:event_btnSalesSaveMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JdateReportFrom;
    private com.toedter.calendar.JDateChooser JdateReportTo;
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnCategoryDelete;
    private javax.swing.JButton btnCategoryEdit;
    private javax.swing.JButton btnCategoryReset;
    private javax.swing.JButton btnCategorySave;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnCustomerDelete;
    private javax.swing.JButton btnCustomerEdit;
    private javax.swing.JButton btnCustomerReset;
    private javax.swing.JButton btnCustomerSave;
    private javax.swing.JButton btnCustomerSearch;
    private javax.swing.JButton btnCustomerSearchByAddress;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnProductReset;
    private javax.swing.JButton btnProductSave;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnPurchaseConfirm;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnReportPurchase;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton btnSalesReset;
    private javax.swing.JButton btnSalesSave;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JPanel btnSupplierDelete;
    private javax.swing.JButton btnSupplierDelete1;
    private javax.swing.JButton btnSupplierEdit;
    private javax.swing.JButton btnSupplierReset;
    private javax.swing.JButton btnSupplierSave;
    private javax.swing.JComboBox<String> comboProductCategory;
    private javax.swing.JComboBox<String> comboPurchaseCategory;
    private javax.swing.JComboBox<String> comboPurchaseProductName;
    private javax.swing.JComboBox<String> comboPurchaseSupplierName;
    private javax.swing.JComboBox<String> comboSalesCategory;
    private javax.swing.JComboBox<String> comboSalesCustomer;
    private javax.swing.JComboBox<String> comboSalesProductName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblSalesStock;
    private javax.swing.JTabbedPane tabCategory;
    private javax.swing.JTabbedPane tabCustomer;
    private javax.swing.JTabbedPane tabHome;
    private javax.swing.JTabbedPane tabMain;
    private javax.swing.JPanel tabProduct;
    private javax.swing.JTabbedPane tabPurchase;
    private javax.swing.JTabbedPane tabReport;
    private javax.swing.JTabbedPane tabSales;
    private javax.swing.JTabbedPane tabStock;
    private javax.swing.JTabbedPane tabSupplier;
    private javax.swing.JTable tblCategory;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTable tblReport;
    private javax.swing.JTable tblStock;
    private javax.swing.JTable tblSupplier;
    private javax.swing.JTextField txtCategoryId;
    private javax.swing.JTextField txtCategoryName;
    private javax.swing.JTextField txtCustomerAddress;
    private javax.swing.JTextField txtCustomerCell;
    private javax.swing.JTextField txtCustomerEmail;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductProductName;
    private javax.swing.JTextField txtPurcahseQuantity;
    private javax.swing.JTextField txtPurcahseTotalPrice;
    private javax.swing.JTextField txtPurcahseUnitPrice;
    private javax.swing.JTextField txtSalesActualAmount;
    private javax.swing.JTextField txtSalesDiscount;
    private javax.swing.JTextField txtSalesQuantity;
    private javax.swing.JTextField txtSalesTotalPrice;
    private javax.swing.JTextField txtSalesUnitPrice;
    private javax.swing.JTextField txtSupplierAddress;
    private javax.swing.JTextField txtSupplierCell;
    private javax.swing.JTextField txtSupplierContactPerson;
    private javax.swing.JTextField txtSupplierEmail;
    private javax.swing.JTextField txtSupplierId;
    private javax.swing.JTextField txtSupplierName;
    // End of variables declaration//GEN-END:variables
}
