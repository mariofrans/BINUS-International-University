
package finaldb;

import java.util.Date;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.*;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import net.proteanit.sql.DbUtils;



public class Restock extends javax.swing.JFrame {

    MySQLConnect myrestock;
    public Restock() {
        initComponents();
        myrestock = new MySQLConnect();
        
        update_table();
        
        set_restockid();
        jTextFieldRestockID.setEditable(false);
        jTextFieldProductName.setEditable(false);
        jTextFieldVendorName.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelWhole = new javax.swing.JPanel();
        JPanelHeader = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        JPanelMenu = new javax.swing.JPanel();
        jLabelCustomer = new javax.swing.JLabel();
        jLabelHome = new javax.swing.JLabel();
        jLabelTransaction = new javax.swing.JLabel();
        jLabelVendor = new javax.swing.JLabel();
        jLabelStaff = new javax.swing.JLabel();
        jLabelStatistics = new javax.swing.JLabel();
        jLabelLogOut = new javax.swing.JLabel();
        jLabelStatistics1 = new javax.swing.JLabel();
        JPanelBodySearch = new javax.swing.JPanel();
        jTextFieldSearchRestock = new javax.swing.JTextField();
        JlabelTransactionID1 = new javax.swing.JLabel();
        JPanelBodyInformation = new javax.swing.JPanel();
        JlabelRestockID = new javax.swing.JLabel();
        JlabelProductID = new javax.swing.JLabel();
        JlabelQty = new javax.swing.JLabel();
        jTextFieldRestockID = new javax.swing.JTextField();
        JlabelArrivalDate = new javax.swing.JLabel();
        jTextFieldQty = new javax.swing.JTextField();
        JlabelTotal = new javax.swing.JLabel();
        JlabelVendorID = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jTextFieldProductID = new javax.swing.JTextField();
        jTextFieldVendorID = new javax.swing.JTextField();
        jTextFieldProductName = new javax.swing.JTextField();
        JlabelProductName = new javax.swing.JLabel();
        JlabelVendorName = new javax.swing.JLabel();
        jTextFieldVendorName = new javax.swing.JTextField();
        JPanelBodyButtons = new javax.swing.JPanel();
        jButtonSave = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonPrint = new javax.swing.JButton();
        JPanelBodyTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRestock = new javax.swing.JTable();
        jComboBoxtable = new javax.swing.JComboBox<>();
        jLabelSortAsc = new javax.swing.JLabel();
        jLabelSortDesc = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restock");

        jPanelWhole.setBackground(new java.awt.Color(255, 255, 255));
        jPanelWhole.setPreferredSize(new java.awt.Dimension(1100, 531));

        JPanelHeader.setBackground(new java.awt.Color(204, 255, 255));

        jPanelHeader.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTitle.setFont(new java.awt.Font("Consolate Elf", 1, 24)); // NOI18N
        jLabelTitle.setText("INVENTORY MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jLabelTitle)
                .addGap(98, 98, 98))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabelTitle)
                .addContainerGap())
        );

        javax.swing.GroupLayout JPanelHeaderLayout = new javax.swing.GroupLayout(JPanelHeader);
        JPanelHeader.setLayout(JPanelHeaderLayout);
        JPanelHeaderLayout.setHorizontalGroup(
            JPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
        JPanelHeaderLayout.setVerticalGroup(
            JPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelCustomer.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCustomer.setText("Customer");
        jLabelCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCustomerMouseClicked(evt);
            }
        });

        jLabelHome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHome.setText("Product");
        jLabelHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseClicked(evt);
            }
        });

        jLabelTransaction.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTransaction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTransaction.setText("Transaction");
        jLabelTransaction.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelTransaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTransactionMouseClicked(evt);
            }
        });

        jLabelVendor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelVendor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVendor.setText("Vendor");
        jLabelVendor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelVendor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVendorMouseClicked(evt);
            }
        });

        jLabelStaff.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelStaff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStaff.setText("Staff");
        jLabelStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelStaffMouseClicked(evt);
            }
        });

        jLabelStatistics.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelStatistics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStatistics.setText("Restock");
        jLabelStatistics.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelStatistics.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelLogOut.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogOut.setText("Log Out");
        jLabelLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogOutMouseClicked(evt);
            }
        });

        jLabelStatistics1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelStatistics1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStatistics1.setText("Store");
        jLabelStatistics1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelStatistics1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelStatistics1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPanelMenuLayout = new javax.swing.GroupLayout(JPanelMenu);
        JPanelMenu.setLayout(JPanelMenuLayout);
        JPanelMenuLayout.setHorizontalGroup(
            JPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStatistics1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelMenuLayout.setVerticalGroup(
            JPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelMenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStatistics1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jLabelLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JPanelBodySearch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Restock by Restock ID  :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jTextFieldSearchRestock.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldSearchRestock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchRestockKeyReleased(evt);
            }
        });

        JlabelTransactionID1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        JlabelTransactionID1.setText("Search Restock");

        javax.swing.GroupLayout JPanelBodySearchLayout = new javax.swing.GroupLayout(JPanelBodySearch);
        JPanelBodySearch.setLayout(JPanelBodySearchLayout);
        JPanelBodySearchLayout.setHorizontalGroup(
            JPanelBodySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelBodySearchLayout.createSequentialGroup()
                .addComponent(JlabelTransactionID1)
                .addGap(10, 10, 10)
                .addComponent(jTextFieldSearchRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        JPanelBodySearchLayout.setVerticalGroup(
            JPanelBodySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodySearchLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(JPanelBodySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSearchRestock)
                    .addComponent(JlabelTransactionID1))
                .addContainerGap())
        );

        JPanelBodyInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Restock Information :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        JPanelBodyInformation.setPreferredSize(new java.awt.Dimension(1100, 531));

        JlabelRestockID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelRestockID.setText("Restock ID");

        JlabelProductID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelProductID.setText("Product ID");

        JlabelQty.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelQty.setText("Qty");

        jTextFieldRestockID.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldRestockID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRestockIDActionPerformed(evt);
            }
        });

        JlabelArrivalDate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelArrivalDate.setText("Arrival Date");

        jTextFieldQty.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQtyActionPerformed(evt);
            }
        });

        JlabelTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        JlabelVendorID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelVendorID.setText("Vendor ID");

        jDateChooser.setDateFormatString("yyyy-MM-dd");
        jDateChooser.setFocusable(false);
        jDateChooser.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jTextFieldProductID.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductIDActionPerformed(evt);
            }
        });
        jTextFieldProductID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldProductIDKeyReleased(evt);
            }
        });

        jTextFieldVendorID.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldVendorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVendorIDActionPerformed(evt);
            }
        });
        jTextFieldVendorID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldVendorIDKeyReleased(evt);
            }
        });

        jTextFieldProductName.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProductNameActionPerformed(evt);
            }
        });

        JlabelProductName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelProductName.setText("Product Name");

        JlabelVendorName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelVendorName.setText("Vendor Name");

        jTextFieldVendorName.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldVendorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVendorNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelBodyInformationLayout = new javax.swing.GroupLayout(JPanelBodyInformation);
        JPanelBodyInformation.setLayout(JPanelBodyInformationLayout);
        JPanelBodyInformationLayout.setHorizontalGroup(
            JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                        .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                                .addComponent(JlabelVendorID)
                                .addGap(28, 28, 28)
                                .addComponent(JlabelTotal))
                            .addComponent(JlabelQty, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JlabelProductID)
                            .addComponent(JlabelRestockID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JlabelArrivalDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jTextFieldQty, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldRestockID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldProductID)
                            .addComponent(jTextFieldVendorID)))
                    .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                        .addComponent(JlabelProductName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                        .addComponent(JlabelVendorName)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldVendorName)))
                .addContainerGap())
        );
        JPanelBodyInformationLayout.setVerticalGroup(
            JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlabelRestockID)
                    .addComponent(jTextFieldRestockID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelProductID))
                .addGap(8, 8, 8)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(JlabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                        .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JlabelProductName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JlabelQty, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JlabelArrivalDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JlabelVendorID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldVendorID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JlabelVendorName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldVendorName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanelBodyButtons.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButtonSave.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButtonSave.setText("Save");
        jButtonSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonUpdate.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonReset.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonPrint.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButtonPrint.setText("Print");
        jButtonPrint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelBodyButtonsLayout = new javax.swing.GroupLayout(JPanelBodyButtons);
        JPanelBodyButtons.setLayout(JPanelBodyButtonsLayout);
        JPanelBodyButtonsLayout.setHorizontalGroup(
            JPanelBodyButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelBodyButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jButtonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPrint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JPanelBodyButtonsLayout.setVerticalGroup(
            JPanelBodyButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyButtonsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanelBodyTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "All Restock Detailed Information :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jTableRestock.setAutoCreateRowSorter(false

        );
        jTableRestock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            @Override
            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
                //        if(columnIndex == 3){
                    //            return Integer.class;}
                //        }else if (columnIndex == 1){
                //            return String.class;
                //        }else if(columnIndex == 2){
                //            return Integer.class;
                //        }else if(columnIndex == 3){
                //            return Integer.class;
                //        }else{
                //            return String.class;
                //        }
            //    return super.getColumnClass(columnIndex);
        }

    });
    jTableRestock.getTableHeader().setReorderingAllowed(false);
    jTableRestock.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTableRestockMouseClicked(evt);
        }
    });
    jScrollPane2.setViewportView(jTableRestock);

    jComboBoxtable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jComboBoxtable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Product Name", "Arrival Date", "Qty", "Vendor Name" }));
    jComboBoxtable.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBoxtableActionPerformed(evt);
        }
    });

    jLabelSortAsc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabelSortAsc.setText("Order By");

    jLabelSortDesc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jLabelSortDesc.setText("Order By");

    jComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));
    jComboBox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jComboBoxActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout JPanelBodyTableLayout = new javax.swing.GroupLayout(JPanelBodyTable);
    JPanelBodyTable.setLayout(JPanelBodyTableLayout);
    JPanelBodyTableLayout.setHorizontalGroup(
        JPanelBodyTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        .addGroup(JPanelBodyTableLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(JPanelBodyTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPanelBodyTableLayout.createSequentialGroup()
                    .addComponent(jLabelSortAsc, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSortDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JPanelBodyTableLayout.createSequentialGroup()
                    .addComponent(jComboBoxtable, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    JPanelBodyTableLayout.setVerticalGroup(
        JPanelBodyTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelBodyTableLayout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addGroup(JPanelBodyTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelSortAsc, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelSortDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(JPanelBodyTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jComboBoxtable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(26, 26, 26)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanelWholeLayout = new javax.swing.GroupLayout(jPanelWhole);
    jPanelWhole.setLayout(jPanelWholeLayout);
    jPanelWholeLayout.setHorizontalGroup(
        jPanelWholeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelWholeLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelWholeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanelWholeLayout.createSequentialGroup()
                    .addComponent(JPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanelWholeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelWholeLayout.createSequentialGroup()
                            .addComponent(JPanelBodyInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JPanelBodyButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(JPanelBodySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(JPanelBodyTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(JPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );
    jPanelWholeLayout.setVerticalGroup(
        jPanelWholeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelWholeLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(JPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanelWholeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelWholeLayout.createSequentialGroup()
                    .addComponent(JPanelBodySearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanelWholeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JPanelBodyInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                        .addComponent(JPanelBodyButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(JPanelBodyTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JPanelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanelWhole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanelWhole, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//  add the restock id automatically
    public void set_restockid(){
        MySQLConnect mystore = new MySQLConnect();
        PreparedStatement pst;
        ResultSet rs;
        Connection con = mystore.getConn();
        
        try{
            String sql = "select RestockID from variable_restock";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                int num = rs.getInt(1);
                jTextFieldRestockID.setText(""+num);
            }  
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }  

    }
    
    // to update in the jTable
    public void update_table(){
        PreparedStatement pst;
        ResultSet rs;
        Connection con = myrestock.getConn();
        try{
            String inside = jComboBoxtable.getSelectedItem().toString();
            if(inside.equals("ID")){
                inside = "RestockID";  
            }else if(inside.equals("Product Name")){
                inside = "ProductName";
            }else if(inside.equals("Arrival Date")){
                inside = "ArrivalDate";
            }else if(inside.equals("Qty")){
                inside = "Qty";
            }
            else{
                inside = "VendorName";
            }
            String insideOrder = jComboBox.getSelectedItem().toString();
            if(insideOrder.equals("Ascending")){
                insideOrder = "ASC";
            }else{
                insideOrder = "DESC";
            }
            String sql = ("select restock_header.RestockID, restock_header.ArrivalDate, vendor.VendorName, product.ProductName, restock_details.Qty "
                    + "from restock_header join vendor on restock_header.VendorID = vendor.VendorID "
                    + "inner join restock_details on restock_header.RestockID = restock_details.RestockID "
                    + "join product on restock_details.ProductID = product.ProductID order by " + inside + " " + insideOrder);
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTableRestock.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    private void jLabelCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCustomerMouseClicked
        this.dispose();

        Customer customer = new Customer();
        customer.setVisible(true);
    }//GEN-LAST:event_jLabelCustomerMouseClicked

    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked
        this.dispose();
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_jLabelHomeMouseClicked

    private void jLabelStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStaffMouseClicked
        this.dispose();
        Staff s = new Staff();
        s.setVisible(true);
    }//GEN-LAST:event_jLabelStaffMouseClicked

    private void jLabelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseClicked
        this.dispose();
        Main m = new Main();
        m.setVisible(true);
    }//GEN-LAST:event_jLabelLogOutMouseClicked

    private void jTextFieldSearchRestockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchRestockKeyReleased
        int flag = 0;
        PreparedStatement pst;
        ResultSet rs;
        MySQLConnect myrestock = new MySQLConnect();
        Connection con = myrestock.getConn();


        try{
            // search by using restock id
            String sql = "select restock_header.RestockID, restock_header.ArrivalDate, vendor.VendorID, vendor.VendorName, product.ProductID, product.ProductName, restock_details.Qty "
                    + "from restock_header join vendor on restock_header.VendorID = vendor.VendorID "
                    + "inner join restock_details on restock_header.RestockID = restock_details.RestockID "
                    + "join product on restock_details.ProductID = product.ProductID where restock_header.RestockID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, jTextFieldSearchRestock.getText());
            rs = pst.executeQuery();

            if(rs.next() && flag == 0){

                jTextFieldRestockID.setText(rs.getString("RestockID"));
                jTextFieldProductID.setText(rs.getString("ProductID"));
                jTextFieldProductName.setText(rs.getString("ProductName"));
                jTextFieldQty.setText(rs.getString("Qty"));
                String dateValue = rs.getString("ArrivalDate");
                java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue);
                
                jDateChooser.setDate(date);
                jTextFieldVendorID.setText(rs.getString("VendorID"));
                jTextFieldVendorName.setText(rs.getString("VendorName"));
                

            }else if (flag == 0){
                flag = 1;
                set_restockid();
                jTextFieldRestockID.setText("");
                jTextFieldQty.setText("");
                jTextFieldProductID.setText("");
                jTextFieldProductName.setText("");
                jTextFieldVendorID.setText("");
                jTextFieldVendorName.setText("");

                jDateChooser.setDate(null);
                
                // display the new id again
                set_restockid();
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Restock Information search restock id", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jTextFieldSearchRestockKeyReleased

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        String RestockID = jTextFieldRestockID.getText().toString();
        String Qty = jTextFieldQty.getText().toString();
        Date ArrivalDate = jDateChooser.getDate();
        
        String ProductID = jTextFieldProductID.getText().toString();
        String VendorID = jTextFieldVendorID.getText().toString();
        
//         checking if the text field is empty or not
          if(Qty.trim().equals("") || ProductID.trim().equals("") || VendorID.trim().equals("") || ArrivalDate == null)
        {
            JOptionPane.showMessageDialog(null, "You have to fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            // if all data are entered
//            JOptionPane.showMessageDialog(null, "all fields are filled");
            
             Connection con = myrestock.getConn();
             PreparedStatement pst;
             ResultSet rs;
             
             try{
                con.setAutoCommit(false);
                String sql = "select RestockID from variable_restock";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery(sql);
                int id =0 ;
                if(rs.next()){

                    id = rs.getInt(1)+1;
                    sql = "update variable_restock set RestockID =' "+id+"'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                }

                sql = "call insert_into_restock(?,?,?,?,?)";
                pst = con.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(RestockID));
                pst.setInt(4, Integer.parseInt(ProductID));
                pst.setInt(5, Integer.parseInt(Qty));
                java.sql.Date sqlDate = new java.sql.Date(jDateChooser.getDate().getTime());
                pst.setDate(2, sqlDate);
                pst.setInt(3, Integer.parseInt(VendorID));

                int i= pst.executeUpdate();
                if(i >= 1){
                    JOptionPane.showMessageDialog(null, "Restock information saved successfully to Database Table");
                    con.commit();
                    System.out.println("successfully commited changes to the database");
                    
                    // call reset action to clear / vanish the content from the form fields
                    jButtonResetActionPerformed(evt);

                    // call the update table after save it
                    // to show record from the db table to jtable netbeans
                    update_table();
                    set_restockid();
                    

                }else{
                    JOptionPane.showMessageDialog(null, " Restock information is not saved to Database Table", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
             }catch(Exception e){
                 try{
                    con.rollback();
                    System.out.println("Successfully rolled back changes from the database");
                    JOptionPane.showMessageDialog(null, "Restock Information is not saved to database","Error", JOptionPane.ERROR_MESSAGE);
                }
                catch(Exception e1){
                    JOptionPane.showMessageDialog(null,e1);
                }
             }
                        
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    
    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete "+jTextFieldProductName.getText()+" Restock information ?","delete", JOptionPane.YES_NO_OPTION);

        if(choice == 0){
            PreparedStatement pst;
            
            MySQLConnect myvendor = new MySQLConnect();
            Connection con = myvendor.getConn();
            String sql = "delete h.*, d.* from restock_header h inner join restock_details d on h.RestockID = d.RestockID where h.RestockID = ?";
            try{
                // disable auto commit 
                con.setAutoCommit(false);
                
                pst = con.prepareStatement(sql); 
                
                pst.setString(1, jTextFieldRestockID.getText());
                pst.execute();
                
                JOptionPane.showMessageDialog(null, jTextFieldProductName.getText()+ " Deleted Successfully" );
                con.commit();
                System.out.println("successfully commited changes to the database");
                // to update the table after delete from the database
                update_table();

                // clear from the interface
                jButtonResetActionPerformed(evt);
                set_restockid();
                
                
                                
            }catch(Exception e){
                try{
                    con.rollback();
                    System.out.println("Successfully rolled back changes from the database");
                    JOptionPane.showMessageDialog(null, "Restock Information delete Error");
                }
                catch(Exception e1){
                    JOptionPane.showMessageDialog(null,e1);
                }                
            } 
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        PreparedStatement pst;
        MySQLConnect myrestock = new MySQLConnect();
        Connection con = myrestock.getConn();
        try{
            con.setAutoCommit(false);
            String restockid = jTextFieldRestockID.getText().toString().trim();
            String qty = jTextFieldQty.getText().toString().trim();
//            Date arrivaldate = jDateChooser.getDate();
            
            String ProductID = jTextFieldProductID.getText().toString().trim();
            String VendorID = jTextFieldVendorID.getText().toString().trim();
            
            // update the query
            // in here, we dont update the primary key
            // alter table .... delete primary key;
            // alter table .... add primary key();
//            String sql = "update restock set ProductID = ?, Qty =?, ArrivalDate = ?, VendorID = ? where RestockID = ?";
            String sql = "update restock_header inner join restock_details on restock_header.RestockID = restock_details.RestockID "
                    + "set restock_details.ProductID = ?, restock_details.Qty = ?, restock_header.ArrivalDate = ?, restock_header.VendorID = ? where restock_details.RestockID = ?";
            pst = con.prepareStatement(sql);

            pst.setInt(1, Integer.parseInt(ProductID));
            pst.setInt(2, Integer.parseInt(qty));
            pst.setInt(4, Integer.parseInt(VendorID));

 
            java.sql.Date sqlDate = new java.sql.Date(jDateChooser.getDate().getTime());
            pst.setDate(3, sqlDate);  
            pst.setInt(5, Integer.parseInt(restockid));


            int i = pst.executeUpdate();
            if(i >= 1){
                JOptionPane.showMessageDialog(null, jTextFieldProductName.getText()+" Restock Updated Successfully");
                con.commit();
                System.out.println("successfully commited changes to the database");
                update_table();
                jButtonResetActionPerformed(evt);
                set_restockid();
                
            }else{
                JOptionPane.showMessageDialog(null, jTextFieldProductName.getText()+" Information Updated Failed", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }catch(Exception e){
            try{
                con.rollback();
                System.out.println("Successfully rolled back changes from the database");
            JOptionPane.showMessageDialog(null, jTextFieldProductName.getText()+" Restock information Update Error " +e);
        }
        catch(Exception e1){
            JOptionPane.showMessageDialog(null, e);
        }
        }
        
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed

        if(jTextFieldQty.getText().equals("") && jTextFieldProductID.getText().equals("") && jTextFieldVendorID.getText().equals("") && jDateChooser.getDate() == null)
        {
            JOptionPane.showMessageDialog(null, "You haven't input anything", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            jTextFieldRestockID.setText("");
            jTextFieldQty.setText("");
            jDateChooser.setDate(null);
            jTextFieldProductName.setText("");
            jTextFieldProductID.setText("");
            jTextFieldVendorID.setText("");
            jTextFieldVendorName.setText("");

            
        }
        set_restockid();
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        MessageFormat header = new MessageFormat("Restock Report");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        try{
            jTableRestock.print(JTable.PrintMode.NORMAL, header, footer);
        }catch(Exception e){
            System.out.println("Error while printing Restock Information" +e);
        }
    }//GEN-LAST:event_jButtonPrintActionPerformed

    private void jTableRestockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRestockMouseClicked
        PreparedStatement pst;
        MySQLConnect myrestock = new MySQLConnect();
        ResultSet rs;
        Connection con = myrestock.getConn();

        try{

            int row = jTableRestock.getSelectedRow();
            String table_click = jTableRestock.getModel().getValueAt(row, 0).toString();
            String sql = "select restock_header.RestockID, restock_header.ArrivalDate, vendor.VendorID, vendor.VendorName, product.ProductID, product.ProductName, restock_details.Qty "
                    + "from restock_header join vendor on restock_header.VendorID = vendor.VendorID "
                    + "inner join restock_details on restock_header.RestockID = restock_details.RestockID "
                    + "join product on restock_details.ProductID = product.ProductID where restock_header.RestockID = '"+table_click+"'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                jTextFieldRestockID.setText(rs.getString("RestockID"));
                jTextFieldProductID.setText(rs.getString("ProductID"));
                jTextFieldProductName.setText(rs.getString("ProductName"));
                jTextFieldVendorID.setText(rs.getString("VendorID"));
                jTextFieldVendorName.setText(rs.getString("VendorName"));
                jTextFieldQty.setText(rs.getString("Qty"));

                String dateValue = rs.getString("ArrivalDate");
                java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue);
                
                jDateChooser.setDate(date);

            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTableRestockMouseClicked

    private void jTextFieldRestockIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRestockIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRestockIDActionPerformed

    private void jTextFieldQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQtyActionPerformed

    private void jLabelVendorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVendorMouseClicked
        this.dispose();
        Vendor v = new Vendor();
        v.setVisible(true);
    }//GEN-LAST:event_jLabelVendorMouseClicked

    private void jLabelStatistics1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStatistics1MouseClicked
        this.dispose();
        Store s = new Store();
        s.setVisible(true);
    }//GEN-LAST:event_jLabelStatistics1MouseClicked

    private void jComboBoxtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxtableActionPerformed
        update_table();
    }//GEN-LAST:event_jComboBoxtableActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        update_table();
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void jLabelTransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTransactionMouseClicked
        this.dispose();
        Transaction t = new Transaction();
        t.setVisible(true);
    }//GEN-LAST:event_jLabelTransactionMouseClicked

    private void jTextFieldProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductIDActionPerformed

    private void jTextFieldVendorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVendorIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVendorIDActionPerformed

    private void jTextFieldProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductNameActionPerformed

    private void jTextFieldVendorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVendorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVendorNameActionPerformed

    private void jTextFieldProductIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProductIDKeyReleased
        
        try{            
            int flag = 0;
            PreparedStatement pst;
            ResultSet rs;
            MySQLConnect myrestock = new MySQLConnect();
            Connection con = myrestock.getConn();
            // make it like a search so the product name can be displayed
            String sql = "select ProductName from product where ProductID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, jTextFieldProductID.getText());
            rs = pst.executeQuery();
            
            if(rs.next() && flag == 0){
                jTextFieldProductName.setText(rs.getString("ProductName"));
            }else if(flag == 0){
                flag = 1;
                jTextFieldProductName.setText("");
            }
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);            
        }
        
    }//GEN-LAST:event_jTextFieldProductIDKeyReleased

    private void jTextFieldVendorIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldVendorIDKeyReleased
        try{            
            int flag = 0;
            PreparedStatement pst;
            ResultSet rs;
            MySQLConnect myrestock = new MySQLConnect();
            Connection con = myrestock.getConn();
            // make it like a search so the product name can be displayed
            String sql = "select VendorName from vendor where VendorID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, jTextFieldVendorID.getText());
            rs = pst.executeQuery();
            
            if(rs.next() && flag == 0){
                jTextFieldVendorName.setText(rs.getString("VendorName"));
            }else if(flag == 0){
                flag = 1;
                jTextFieldVendorName.setText("");
            }
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);            
        }
    }//GEN-LAST:event_jTextFieldVendorIDKeyReleased

 
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
            java.util.logging.Logger.getLogger(Restock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelBodyButtons;
    private javax.swing.JPanel JPanelBodyInformation;
    private javax.swing.JPanel JPanelBodySearch;
    private javax.swing.JPanel JPanelBodyTable;
    private javax.swing.JPanel JPanelHeader;
    private javax.swing.JPanel JPanelMenu;
    private javax.swing.JLabel JlabelArrivalDate;
    private javax.swing.JLabel JlabelProductID;
    private javax.swing.JLabel JlabelProductName;
    private javax.swing.JLabel JlabelQty;
    private javax.swing.JLabel JlabelRestockID;
    private javax.swing.JLabel JlabelTotal;
    private javax.swing.JLabel JlabelTransactionID1;
    private javax.swing.JLabel JlabelVendorID;
    private javax.swing.JLabel JlabelVendorName;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JComboBox<String> jComboBoxtable;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabelCustomer;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelLogOut;
    private javax.swing.JLabel jLabelSortAsc;
    private javax.swing.JLabel jLabelSortDesc;
    private javax.swing.JLabel jLabelStaff;
    private javax.swing.JLabel jLabelStatistics;
    private javax.swing.JLabel jLabelStatistics1;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTransaction;
    private javax.swing.JLabel jLabelVendor;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelWhole;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableRestock;
    private javax.swing.JTextField jTextFieldProductID;
    private javax.swing.JTextField jTextFieldProductName;
    private javax.swing.JTextField jTextFieldQty;
    private javax.swing.JTextField jTextFieldRestockID;
    private javax.swing.JTextField jTextFieldSearchRestock;
    private javax.swing.JTextField jTextFieldVendorID;
    private javax.swing.JTextField jTextFieldVendorName;
    // End of variables declaration//GEN-END:variables
}
