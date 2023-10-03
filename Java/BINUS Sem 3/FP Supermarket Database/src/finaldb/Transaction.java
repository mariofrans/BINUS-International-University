
package finaldb;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.*;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import net.proteanit.sql.DbUtils;



public class Transaction extends javax.swing.JFrame {

    MySQLConnect myt;
    public Transaction() {
        initComponents();
        
        myt = new MySQLConnect();
        update_table(); // to show the record from the db table to the jTable netbeans 
        // when the form gets loaded
        
        
        set_transactionid();
        jTextFieldTransactionID.setEditable(false);
        jTextFieldGrandTotal.setEditable(false);
        jTextFieldProductName.setEditable(false);
        jTextFieldStaffName.setEditable(false);
        jTextFieldStoreName.setEditable(false);
        jTextFieldCustomerName.setEditable(false);
        // user is not allowed to choose customer id, it will be automatically generated
        // hence while creating cust table we have appllied auto_increment on id column 
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JPanelHeader = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JPanelMenu = new javax.swing.JPanel();
        jLabelCustomer = new javax.swing.JLabel();
        jLabelHome = new javax.swing.JLabel();
        jLabelTransaction = new javax.swing.JLabel();
        jLabelVendor = new javax.swing.JLabel();
        jLabelStaff = new javax.swing.JLabel();
        jLabelRestock = new javax.swing.JLabel();
        jLabelLogOut = new javax.swing.JLabel();
        jLabelStore = new javax.swing.JLabel();
        JPanelBodySearch = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTransaction = new javax.swing.JTable();
        jComboBoxtable = new javax.swing.JComboBox<>();
        jLabelSortAsc = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        JPanelBodyInformation = new javax.swing.JPanel();
        JlabelTransactionID = new javax.swing.JLabel();
        JlabelProductName = new javax.swing.JLabel();
        JlabelStaffName = new javax.swing.JLabel();
        jTextFieldTransactionID = new javax.swing.JTextField();
        JLabeldate = new javax.swing.JLabel();
        JlabelStoreGrandTotal = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jTextFieldQty = new javax.swing.JTextField();
        JlabelQty = new javax.swing.JLabel();
        jTextFieldGrandTotal = new javax.swing.JTextField();
        JlabelStoreName2 = new javax.swing.JLabel();
        jTextFieldProductID = new javax.swing.JTextField();
        jTextFieldStaffName = new javax.swing.JTextField();
        jTextFieldStoreID = new javax.swing.JTextField();
        jTextFieldStoreName = new javax.swing.JTextField();
        JlabelStoreName3 = new javax.swing.JLabel();
        jTextFieldCustomerID = new javax.swing.JTextField();
        jTextFieldCustomerName = new javax.swing.JTextField();
        JlabelStoreName4 = new javax.swing.JLabel();
        JlabelProductName1 = new javax.swing.JLabel();
        JlabelProductName2 = new javax.swing.JLabel();
        jTextFieldProductName = new javax.swing.JTextField();
        jTextFieldStaffID = new javax.swing.JTextField();
        JlabelStoreName5 = new javax.swing.JLabel();
        JPanelBodyTable = new javax.swing.JPanel();
        jButtonSave = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonPrint = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        JlabelTransactionID1 = new javax.swing.JLabel();
        jTextFieldSearchTransaction = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 531));

        JPanelHeader.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Consolate Elf", 1, 24)); // NOI18N
        jLabel1.setText("INVENTORY MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(98, 98, 98))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout JPanelHeaderLayout = new javax.swing.GroupLayout(JPanelHeader);
        JPanelHeader.setLayout(JPanelHeaderLayout);
        JPanelHeaderLayout.setHorizontalGroup(
            JPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
        JPanelHeaderLayout.setVerticalGroup(
            JPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabelTransaction.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelTransaction.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        jLabelRestock.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelRestock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRestock.setText("Restock");
        jLabelRestock.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelRestock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRestockMouseClicked(evt);
            }
        });

        jLabelLogOut.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogOut.setText("Log Out");
        jLabelLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogOutMouseClicked(evt);
            }
        });

        jLabelStore.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelStore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStore.setText("Store");
        jLabelStore.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelStore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelStoreMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPanelMenuLayout = new javax.swing.GroupLayout(JPanelMenu);
        JPanelMenu.setLayout(JPanelMenuLayout);
        JPanelMenuLayout.setHorizontalGroup(
            JPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelMenuLayout.createSequentialGroup()
                        .addGroup(JPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(JPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelStore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
                .addComponent(jLabelRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStore, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabelLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanelBodySearch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "All Transaction Detailed Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jTableTransaction.setAutoCreateRowSorter(false);
        jTableTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTableTransaction.getTableHeader().setReorderingAllowed(false);
        jTableTransaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTransactionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableTransaction);

        jComboBoxtable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBoxtable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Product Name", "Staff Name", "Date", "Qty", "Price", "Store Name", "Customer Name" }));
        jComboBoxtable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxtableActionPerformed(evt);
            }
        });

        jLabelSortAsc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSortAsc.setText("Order By");

        jComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelBodySearchLayout = new javax.swing.GroupLayout(JPanelBodySearch);
        JPanelBodySearch.setLayout(JPanelBodySearchLayout);
        JPanelBodySearchLayout.setHorizontalGroup(
            JPanelBodySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodySearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelBodySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelBodySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelSortAsc, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxtable, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelBodySearchLayout.setVerticalGroup(
            JPanelBodySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodySearchLayout.createSequentialGroup()
                .addGroup(JPanelBodySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelBodySearchLayout.createSequentialGroup()
                        .addComponent(jLabelSortAsc, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxtable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addGroup(JPanelBodySearchLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        JPanelBodyInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transaction Information :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        JPanelBodyInformation.setPreferredSize(new java.awt.Dimension(1100, 531));

        JlabelTransactionID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelTransactionID.setText("Transaction ID");

        JlabelProductName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelProductName.setText("Product ID");

        JlabelStaffName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelStaffName.setText("Staff Name");

        jTextFieldTransactionID.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        JLabeldate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLabeldate.setText("Date");

        JlabelStoreGrandTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelStoreGrandTotal.setText("Grand Total");

        jDateChooser.setDateFormatString("yyyy-MM-dd");
        jDateChooser.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N

        jTextFieldQty.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldQtyKeyReleased(evt);
            }
        });

        JlabelQty.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelQty.setText("Qty");

        jTextFieldGrandTotal.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        JlabelStoreName2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelStoreName2.setText("Store Name");

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

        jTextFieldStaffName.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jTextFieldStoreID.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldStoreID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldStoreIDKeyReleased(evt);
            }
        });

        jTextFieldStoreName.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        JlabelStoreName3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelStoreName3.setText("Customer ID");

        jTextFieldCustomerID.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldCustomerID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCustomerIDKeyReleased(evt);
            }
        });

        jTextFieldCustomerName.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        JlabelStoreName4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelStoreName4.setText("Store ID");

        JlabelProductName1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelProductName1.setText("Product Name");

        JlabelProductName2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelProductName2.setText("Staff ID");

        jTextFieldProductName.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jTextFieldStaffID.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldStaffID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldStaffIDKeyReleased(evt);
            }
        });

        JlabelStoreName5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelStoreName5.setText("Customer Name");

        javax.swing.GroupLayout JPanelBodyInformationLayout = new javax.swing.GroupLayout(JPanelBodyInformation);
        JPanelBodyInformation.setLayout(JPanelBodyInformationLayout);
        JPanelBodyInformationLayout.setHorizontalGroup(
            JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                        .addComponent(JLabeldate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelBodyInformationLayout.createSequentialGroup()
                        .addComponent(JlabelStaffName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                        .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(JlabelTransactionID, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JlabelProductName, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(JlabelProductName1))
                                .addGap(20, 20, 20)
                                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldProductName, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(jTextFieldTransactionID)
                                    .addComponent(jTextFieldProductID)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelBodyInformationLayout.createSequentialGroup()
                                .addComponent(JlabelProductName2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addComponent(jTextFieldStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)))
                .addGap(47, 47, 47)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                        .addComponent(JlabelStoreName5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jTextFieldCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelBodyInformationLayout.createSequentialGroup()
                        .addComponent(JlabelQty, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldQty, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelBodyInformationLayout.createSequentialGroup()
                        .addComponent(JlabelStoreName3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelBodyInformationLayout.createSequentialGroup()
                        .addComponent(JlabelStoreName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldStoreName, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelBodyInformationLayout.createSequentialGroup()
                        .addComponent(JlabelStoreName4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldStoreID, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                        .addComponent(JlabelStoreGrandTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JPanelBodyInformationLayout.setVerticalGroup(
            JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JlabelTransactionID)
                            .addComponent(jTextFieldTransactionID))
                        .addGap(10, 10, 10))
                    .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JlabelQty, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelProductName)
                    .addComponent(JlabelStoreGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelProductName1)
                    .addComponent(JlabelStoreName4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldStoreID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldStoreName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelStoreName2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelProductName2))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelStoreName3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JLabeldate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JlabelStoreName5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout JPanelBodyTableLayout = new javax.swing.GroupLayout(JPanelBodyTable);
        JPanelBodyTable.setLayout(JPanelBodyTableLayout);
        JPanelBodyTableLayout.setHorizontalGroup(
            JPanelBodyTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelBodyTableLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(JPanelBodyTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        JPanelBodyTableLayout.setVerticalGroup(
            JPanelBodyTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelBodyTableLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Transaction by ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        JlabelTransactionID1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        JlabelTransactionID1.setText("Search Transaction ");

        jTextFieldSearchTransaction.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldSearchTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchTransactionActionPerformed(evt);
            }
        });
        jTextFieldSearchTransaction.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchTransactionKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(JlabelTransactionID1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldSearchTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlabelTransactionID1)
                    .addComponent(jTextFieldSearchTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JPanelBodyInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JPanelBodyTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(JPanelBodySearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(JPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(JPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JPanelBodySearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JPanelBodyInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                            .addComponent(JPanelBodyTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(JPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1109, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // add the transaction id to jTextFieldTransactionID automatically
    public void set_transactionid(){
        PreparedStatement pst;
        MySQLConnect obj = new MySQLConnect();
        Connection con = obj.getConn();
        ResultSet rs;
        try{
            String sql = "select max_id from variable_t";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);          
            
            if(rs.next()){
                int num = rs.getInt(1);
                jTextFieldTransactionID.setText(""+num);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }
    
    // to update in the jTable
    public void update_table(){
        PreparedStatement pst;
        ResultSet rs;
        Connection con = myt.getConn();
        try{
            String inside = jComboBoxtable.getSelectedItem().toString();
            if(inside.equals("ID")){
                inside = "OrderID";
                
            }else if(inside.equals("Product Name")){
                inside = "ProductName";
            }else if(inside.equals("Staff Name")){
                inside = "StaffName";
            }else if(inside.equals("Date")){
                inside = "Date";
            }else if(inside.equals("Qty")){
                inside = "Qty";
            }else if(inside.equals("Price")){
                inside = "GrandTotal";
            }else if(inside.equals("Store Name")){
                inside = "StoreName";
            }
            else{
                inside = "CustomerName";
            }
            String insideOrder = jComboBox.getSelectedItem().toString();
            if(insideOrder.equals("Ascending")){
                insideOrder = "ASC";
            }else{
                insideOrder = "DESC";
            }
            
            String sql = (" select transaction_header.OrderID, transaction_header.Date, staff.FirstName as StaffName, store.StoreName, customer.CustomerName, product.ProductName, transaction_details.Qty, transaction_details.GrandTotal "
                    + "from transaction_header join staff on transaction_header.StaffID = staff.StaffID "
                    + "join store on transaction_header.StoreID = store.StoreID "
                    + "left join customer on transaction_header.CustomerID = customer.CustomerID "
                    + "join transaction_details on transaction_header.OrderID = transaction_details.OrderID "
                    + "join product on transaction_details.ProductID = product.productID order by " + inside + " " + insideOrder);
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTableTransaction.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_jLabelHomeMouseClicked

    private void jLabelVendorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVendorMouseClicked
        this.dispose();
        Vendor v = new Vendor();
        v.setVisible(true);
    }//GEN-LAST:event_jLabelVendorMouseClicked

    private void jLabelStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStaffMouseClicked

        this.dispose();
        Staff s = new Staff();
        s.setVisible(true);
    }//GEN-LAST:event_jLabelStaffMouseClicked

    private void jLabelRestockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRestockMouseClicked
        this.dispose();
        Restock r = new Restock();
        r.setVisible(true);
    }//GEN-LAST:event_jLabelRestockMouseClicked

    private void jLabelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseClicked
        this.dispose();
        Main m = new Main();
        m.setVisible(true);
    }//GEN-LAST:event_jLabelLogOutMouseClicked

    private void jLabelStoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStoreMouseClicked
        this.dispose();
        Store s = new Store();
        s.setVisible(true);

    }//GEN-LAST:event_jLabelStoreMouseClicked

    private void jTextFieldSearchTransactionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchTransactionKeyReleased
        int flag = 0;
        PreparedStatement pst;
        ResultSet rs;
        MySQLConnect myt = new MySQLConnect();
        Connection con = myt.getConn();    

        try{
            // search by using transaction id
            String sql = " select transaction_header.OrderID, transaction_header.Date, staff.StaffID, staff.FirstName as StaffName, store.StoreID, store.StoreName, customer.CustomerID, customer.CustomerName, product.ProductID, product.ProductName, transaction_details.Qty, transaction_details.GrandTotal "
                    + "from transaction_header join staff on transaction_header.StaffID = staff.StaffID "
                    + "join store on transaction_header.StoreID = store.StoreID "
                    + "left join customer on transaction_header.CustomerID = customer.CustomerID "
                    + "join transaction_details on transaction_header.OrderID = transaction_details.OrderID "
                    + "join product on transaction_details.ProductID = product.productID where transaction_header.OrderID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, jTextFieldSearchTransaction.getText());
            rs = pst.executeQuery();

            if(rs.next() && flag == 0){

                jTextFieldTransactionID.setText(rs.getString("OrderID"));
                jTextFieldProductID.setText(rs.getString("ProductID"));
                jTextFieldProductName.setText(rs.getString("ProductName"));
                jTextFieldStaffID.setText(rs.getString("StaffID"));
                jTextFieldStaffName.setText(rs.getString("StaffName"));
                jTextFieldQty.setText(rs.getString("Qty"));
                String dateValue = rs.getString("Date");
                java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue);
                
                jDateChooser.setDate(date);
                jTextFieldGrandTotal.setText(rs.getString("GrandTotal"));
                jTextFieldStoreID.setText(rs.getString("StoreID"));
                jTextFieldStoreName.setText(rs.getString("StoreName"));
                jTextFieldCustomerID.setText(rs.getString("CustomerID"));
                jTextFieldCustomerName.setText(rs.getString("CustomerName"));


            }else if (flag == 0){
                flag = 1;

                jTextFieldTransactionID.setText("");
                jTextFieldProductID.setText("");
                jTextFieldProductName.setText("");
                jTextFieldStaffID.setText("");
                jTextFieldStaffName.setText("");
                jTextFieldQty.setText("");
                jDateChooser.setDate(null);
                jTextFieldGrandTotal.setText("");
                jTextFieldStoreID.setText("");
                jTextFieldStoreName.setText("");
                jTextFieldCustomerID.setText("");
                jTextFieldCustomerName.setText("");
                set_transactionid();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Transaction Information search transaction id", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jTextFieldSearchTransactionKeyReleased

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed

        String OrderID = jTextFieldTransactionID.getText().toString();
        String ProductID = jTextFieldProductID.getText().toString();
        String StaffID = jTextFieldStaffID.getText().toString();
        String Qty = jTextFieldQty.getText().toString();
        java.util.Date date = jDateChooser.getDate();
        String GrandTotal = jTextFieldGrandTotal.getText().toString();
        String StoreID = jTextFieldStoreID.getText().toString();
        String CustomerID = jTextFieldCustomerID.getText().toString();
        
        if(ProductID.trim().equals("") || StaffID.trim().equals("") || Qty.trim().equals("") || date == null || GrandTotal.trim().equals("") || StoreID.trim().equals("")){
               JOptionPane.showMessageDialog(null, "You have to fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            
            // if all data are entered
            Connection con = myt.getConn();
            PreparedStatement pst;
            ResultSet rs;
            if(CustomerID.equals("")){
            try{
                con.setAutoCommit(false);
                String sql = "select max_id from variable_t";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery(sql);
                int id =0 ;
                if(rs.next()){
                    id = rs.getInt(1)+1;
                    sql = "update variable_t set max_id =' "+id+"'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                }
                sql = "call insert_into_transaction_wo_cust (?,?,?,?,?,?,?)";
                pst = con.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(OrderID));
                java.sql.Date Date = new java.sql.Date(jDateChooser.getDate().getTime());
                pst.setDate(2, Date);
                pst.setInt(3, Integer.parseInt(StaffID));
                pst.setInt(4, Integer.parseInt(StoreID));
                pst.setInt(5, Integer.parseInt(ProductID));
                pst.setInt(6, Integer.parseInt(Qty));
                pst.setInt(7, Integer.parseInt(GrandTotal));

                int i= pst.executeUpdate();
                if(i >= 1){
                    JOptionPane.showMessageDialog(null, "Transaction information saved successfully to Database Table");
                    con.commit();
                    System.out.println("successfully commited changes to the database");
                    
                    // call reset action to clear / vanish the content from the form fields
                    jButtonResetActionPerformed(evt);

                    // call the update table after save it
                    // to show record from the db table to jtable netbeans
                    update_table();
                    set_transactionid();                    
                }else{
                    JOptionPane.showMessageDialog(null, " Transaction information is not saved to Database Table", "Error", JOptionPane.ERROR_MESSAGE);
                }
  
            }catch(Exception e){
                try{
                    con.rollback();
                    System.out.println("Successfully rolled back changes from the database");
                    JOptionPane.showMessageDialog(null, "Transaction Information is not saved to database", "Error", JOptionPane.ERROR_MESSAGE);
                }
                catch(Exception e1){
                    JOptionPane.showMessageDialog(null,e1);
                }
            }
            }
            else{
                try{
                con.setAutoCommit(false);
                String sql = "select max_id from variable_t";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery(sql);
                int id =0 ;
                if(rs.next()){
                    id = rs.getInt(1)+1;
                    sql = "update variable_t set max_id =' "+id+"'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                }
                sql = "call insert_into_transaction (?,?,?,?,?,?,?,?)";
                pst = con.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(OrderID));
                java.sql.Date Date = new java.sql.Date(jDateChooser.getDate().getTime());
                pst.setDate(2, Date);
                pst.setInt(3, Integer.parseInt(StaffID));
                pst.setInt(4, Integer.parseInt(StoreID));
                pst.setInt(5, Integer.parseInt(CustomerID));
                pst.setInt(6, Integer.parseInt(ProductID));
                pst.setInt(7, Integer.parseInt(Qty));
                pst.setInt(8, Integer.parseInt(GrandTotal));

                int i= pst.executeUpdate();
                if(i >= 1){
                    JOptionPane.showMessageDialog(null, "Transaction information saved successfully to Database Table");
                    con.commit();
                    System.out.println("successfully commited changes to the database");
                    
                    // call reset action to clear / vanish the content from the form fields
                    jButtonResetActionPerformed(evt);

                    // call the update table after save it
                    // to show record from the db table to jtable netbeans
                    update_table();
                    set_transactionid();                    
                }else{
                    JOptionPane.showMessageDialog(null, " Transaction information is not saved to Database Table", "Error", JOptionPane.ERROR_MESSAGE);
                }
  
            }catch(Exception e){
                try{
                    con.rollback();
                    System.out.println("Successfully rolled back changes from the database");
                    JOptionPane.showMessageDialog(null, "Transaction Information is not saved to database", "Error", JOptionPane.ERROR_MESSAGE);
                }
                catch(Exception e1){
                    JOptionPane.showMessageDialog(null,e1);
                }
            }
            }
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete "+jTextFieldTransactionID.getText()+" Transaction Information ?","delete", JOptionPane.YES_NO_OPTION);

        if(choice == 0){
            PreparedStatement pst;
            MySQLConnect myt = new MySQLConnect();
            Connection con = myt.getConn();
            String sql = "delete h.*, d.* from transaction_header h inner join transaction_details d on h.OrderID = d.OrderID where h.OrderID = ?";
            try{
                con.setAutoCommit(false);
                pst = con.prepareStatement(sql);
                pst.setString(1, jTextFieldTransactionID.getText());
//                pst.setString(2, jTextFieldProductID.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, jTextFieldTransactionID.getText()+ " Deleted Successfully" );
                con.commit();
                System.out.println("successfully commited changes to the database");
                
                // to update the table after delete from the database
                update_table();

                // clear from the interface
                jButtonResetActionPerformed(evt);

                // display the next id
                set_transactionid();

            }catch(Exception e){
                try{
                    con.rollback();
                    System.out.println("Successfully rolled back changes from the database");
                    JOptionPane.showMessageDialog(null, "Transaction Information delete error", "Error", JOptionPane.ERROR_MESSAGE);
                }
                catch(Exception e1){
                    JOptionPane.showMessageDialog(null,e1);
                }
            }
        }

    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        PreparedStatement pst;
        MySQLConnect myt = new MySQLConnect();
        Connection con = myt.getConn();
        if(jTextFieldCustomerID.getText().equals("")){
        try{
            con.setAutoCommit(false);
            String OrderID = jTextFieldTransactionID.getText().toString().trim();
            String ProductID = jTextFieldProductID.getText().toString().trim();
            String StaffID = jTextFieldStaffID.getText().toString().trim();
            String Qty = jTextFieldQty.getText().toString().trim();
            String GrandTotal = jTextFieldGrandTotal.getText().toString().trim();
            String StoreID = jTextFieldStoreID.getText().toString().trim();
            String CustomerID = jTextFieldCustomerID.getText().toString().trim();
            
            // update the query
            // in here, we dont update the primary key
            // alter table .... delete primary key;
            // alter table .... add primary key();
            String sql = "update transaction_header inner join transaction_details on transaction_header.OrderID = transaction_details.OrderID "
                    + "set transaction_details.ProductID = ?, transaction_details.Qty = ?, transaction_details.GrandTotal = ?, transaction_header.Date = ?, transaction_header.StaffID = ?, transaction_header.StoreID = ? where transaction_details.OrderID = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(ProductID));
            pst.setInt(5, Integer.parseInt(StaffID));
            java.sql.Date Date = new java.sql.Date(jDateChooser.getDate().getTime());
            pst.setDate(4, Date);
            pst.setInt(2, Integer.parseInt(Qty));
            pst.setInt(3, Integer.parseInt(GrandTotal));
            pst.setInt(6, Integer.parseInt(StoreID));

            pst.setInt(7, Integer.parseInt(OrderID));
//            pst.setInt(8, Integer.parseInt(ProductID));

            int i = pst.executeUpdate();
            if(i >= 1){
                JOptionPane.showMessageDialog(null, jTextFieldTransactionID.getText()+" Information Updated Successfully");
                con.commit();
                System.out.println("successfully commited changes to the database");
                update_table();
                jButtonResetActionPerformed(evt);
                set_transactionid();
            }else{
                JOptionPane.showMessageDialog(null, jTextFieldTransactionID.getText()+" Information Updated Failed", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }catch(Exception e){
           try{
                con.rollback();
                System.out.println("Successfully rolled back changes from the database");
                JOptionPane.showMessageDialog(null, jTextFieldTransactionID.getText()+" Transaction information Update Error " +e);
            }
            catch(Exception e1){
                JOptionPane.showMessageDialog(null, e);
            }

        }
        }
        else{
            try{
            con.setAutoCommit(false);
            String OrderID = jTextFieldTransactionID.getText().toString().trim();
            String ProductID = jTextFieldProductID.getText().toString().trim();
            String StaffID = jTextFieldStaffID.getText().toString().trim();
            String Qty = jTextFieldQty.getText().toString().trim();
            String GrandTotal = jTextFieldGrandTotal.getText().toString().trim();
            String StoreID = jTextFieldStoreID.getText().toString().trim();
            String CustomerID = jTextFieldCustomerID.getText().toString().trim();
            
            // update the query
            // in here, we dont update the primary key
            // alter table .... delete primary key;
            // alter table .... add primary key();
            String sql = "update transaction_header inner join transaction_details on transaction_header.OrderID = transaction_details.OrderID "
                    + "set transaction_details.ProductID = ?, transaction_details.Qty = ?, transaction_details.GrandTotal = ?, transaction_header.Date = ?, transaction_header.StaffID = ?, transaction_header.StoreID = ?, transaction_header.CustomerID = ? where transaction_details.OrderID = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(ProductID));
            pst.setInt(5, Integer.parseInt(StaffID));
            java.sql.Date Date = new java.sql.Date(jDateChooser.getDate().getTime());
            pst.setDate(4, Date);
            pst.setInt(2, Integer.parseInt(Qty));
            pst.setInt(3, Integer.parseInt(GrandTotal));
            pst.setInt(6, Integer.parseInt(StoreID));
            pst.setInt(7, Integer.parseInt(CustomerID));

            pst.setInt(8, Integer.parseInt(OrderID));
//            pst.setInt(9, Integer.parseInt(ProductID));

            int i = pst.executeUpdate();
            if(i >= 1){
                JOptionPane.showMessageDialog(null, jTextFieldTransactionID.getText()+" Information Updated Successfully");
                con.commit();
                System.out.println("successfully commited changes to the database");
                update_table();
                jButtonResetActionPerformed(evt);
                set_transactionid();
            }else{
                JOptionPane.showMessageDialog(null, jTextFieldTransactionID.getText()+" Information Updated Failed", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }catch(Exception e){
           try{
                con.rollback();
                System.out.println("Successfully rolled back changes from the database");
                JOptionPane.showMessageDialog(null, jTextFieldTransactionID.getText()+" Transaction information Update Error " +e);
            }
            catch(Exception e1){
                JOptionPane.showMessageDialog(null, e);
            }

        }
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed

        if(jTextFieldProductID.getText().equals("") && jTextFieldStaffID.getText().equals("") && jDateChooser.getDate() == null && jTextFieldStoreID.getText().equals("") && jTextFieldCustomerID.getText().equals("") && jTextFieldQty.getText().equals("") && jTextFieldGrandTotal.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "You haven't input anything", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            jTextFieldTransactionID.setText("");
            jTextFieldProductID.setText("");
            jTextFieldProductName.setText("");
            jTextFieldStaffID.setText("");
            jTextFieldStaffName.setText("");
            jDateChooser.setDate(null);
            jTextFieldStoreID.setText("");
            jTextFieldStoreName.setText("");
            jTextFieldCustomerID.setText("");
            jTextFieldCustomerName.setText("");
            jTextFieldQty.setText("");
            jTextFieldGrandTotal.setText("");

        }
        set_transactionid();
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        MessageFormat header = new MessageFormat("Transaction Report");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        try{
            jTableTransaction.print(JTable.PrintMode.NORMAL, header, footer);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButtonPrintActionPerformed

    private void jTableTransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTransactionMouseClicked
        PreparedStatement pst;
        MySQLConnect myt = new MySQLConnect();
        ResultSet rs;
        Connection con = myt.getConn();
        String ProductID = jTextFieldProductID.getText().toString().trim();
        try{
            int row = jTableTransaction.getSelectedRow();
            String table_click = jTableTransaction.getModel().getValueAt(row, 0).toString();
            String sql = " select transaction_header.OrderID, transaction_header.Date, staff.StaffID, staff.FirstName as StaffName, store.StoreID, store.StoreName, customer.CustomerID, customer.CustomerName, product.ProductID, product.ProductName, transaction_details.Qty, transaction_details.GrandTotal "
                    + "from transaction_header join staff on transaction_header.StaffID = staff.StaffID "
                    + "join store on transaction_header.StoreID = store.StoreID "
                    + "left join customer on transaction_header.CustomerID = customer.CustomerID "
                    + "join transaction_details on transaction_header.OrderID = transaction_details.OrderID "
                    + "join product on transaction_details.ProductID = product.productID where transaction_header.OrderID = '"+table_click+"'";
            
            pst = con.prepareStatement(sql);
//            pst.setInt(1, Integer.parseInt(ProductID));
            rs = pst.executeQuery();
            if(rs.next()){
                jTextFieldTransactionID.setText(rs.getString("OrderID"));
                jTextFieldProductID.setText(rs.getString("ProductID"));
                jTextFieldProductName.setText(rs.getString("ProductName"));
                jTextFieldStaffID.setText(rs.getString("StaffID"));
                jTextFieldStaffName.setText(rs.getString("StaffName"));
                
                String dateValue = rs.getString("Date");
                java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateValue);
                
                jDateChooser.setDate(date);
                jTextFieldQty.setText(rs.getString("Qty"));
                jTextFieldGrandTotal.setText(rs.getString("GrandTotal"));
                jTextFieldStoreID.setText(rs.getString("StoreID"));
                jTextFieldStoreName.setText(rs.getString("StoreName"));
                jTextFieldCustomerID.setText(rs.getString("CustomerID"));
                jTextFieldCustomerName.setText(rs.getString("CustomerName"));

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error at Transaction Information jTable key pressed"+e);
        }
        
        
    }//GEN-LAST:event_jTableTransactionMouseClicked

    private void jComboBoxtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxtableActionPerformed
        update_table();
    }//GEN-LAST:event_jComboBoxtableActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        update_table();
    }//GEN-LAST:event_jComboBoxActionPerformed

 
    private void jLabelCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCustomerMouseClicked
        this.dispose();
        Customer c = new Customer();
        c.setVisible(true);
    }//GEN-LAST:event_jLabelCustomerMouseClicked

    
    private void jTextFieldQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQtyKeyReleased
       try{            
            int flag = 0;
            PreparedStatement pst;
            ResultSet rs;
            MySQLConnect myt = new MySQLConnect();
            Connection con = myt.getConn();
            // make it like a search so the total price can be displayed
            String sql = "select Price from product where ProductID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, jTextFieldProductID.getText());
            rs = pst.executeQuery();         

            if(rs.next() && flag == 0 ){
                int GrandTotal = rs.getInt("Price");
                int Qty = Integer.parseInt(jTextFieldQty.getText());
                int sum = GrandTotal*Qty;
                jTextFieldGrandTotal.setText(String.valueOf(sum));
            }            

        }
       catch(Exception e){

            jTextFieldGrandTotal.setText("");
        }
    }//GEN-LAST:event_jTextFieldQtyKeyReleased

    private void jTextFieldSearchTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchTransactionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchTransactionActionPerformed

    private void jTextFieldProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProductIDActionPerformed

    private void jTextFieldProductIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProductIDKeyReleased
        try{            
            int flag = 0;
            PreparedStatement pst;
            ResultSet rs;
            MySQLConnect myt = new MySQLConnect();
            Connection con = myt.getConn();
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

    private void jTextFieldStaffIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldStaffIDKeyReleased
        try{            
            int flag = 0;
            PreparedStatement pst;
            ResultSet rs;
            MySQLConnect myt = new MySQLConnect();
            Connection con = myt.getConn();
  
            String sql = "select FirstName from staff where StaffID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, jTextFieldStaffID.getText());
            rs = pst.executeQuery();
            
            if(rs.next() && flag == 0){
                jTextFieldStaffName.setText(rs.getString("FirstName"));
            }else if(flag == 0){
                flag = 1;
                jTextFieldStaffName.setText("");
            }
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);            
        }
    }//GEN-LAST:event_jTextFieldStaffIDKeyReleased

    private void jTextFieldStoreIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldStoreIDKeyReleased
        try{            
            int flag = 0;
            PreparedStatement pst;
            ResultSet rs;
            MySQLConnect myt = new MySQLConnect();
            Connection con = myt.getConn();
            
            String sql = "select StoreName from store where StoreID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, jTextFieldStoreID.getText());
            rs = pst.executeQuery();
            
            if(rs.next() && flag == 0){
                jTextFieldStoreName.setText(rs.getString("StoreName"));
            }else if(flag == 0){
                flag = 1;
                jTextFieldStoreName.setText("");
            }
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);            
        }
    }//GEN-LAST:event_jTextFieldStoreIDKeyReleased

    private void jTextFieldCustomerIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCustomerIDKeyReleased
        try{            
            int flag = 0;
            PreparedStatement pst;
            ResultSet rs;
            MySQLConnect myt = new MySQLConnect();
            Connection con = myt.getConn();
         
            String sql = "select CustomerName from customer where CustomerID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, jTextFieldCustomerID.getText());
            rs = pst.executeQuery();
            
            if(rs.next() && flag == 0){
                jTextFieldCustomerName.setText(rs.getString("CustomerName"));
            }else if(flag == 0){
                flag = 1;
                jTextFieldCustomerName.setText("");
            }
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);            
        }
    }//GEN-LAST:event_jTextFieldCustomerIDKeyReleased

    
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
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabeldate;
    private javax.swing.JPanel JPanelBodyInformation;
    private javax.swing.JPanel JPanelBodySearch;
    private javax.swing.JPanel JPanelBodyTable;
    private javax.swing.JPanel JPanelHeader;
    private javax.swing.JPanel JPanelMenu;
    private javax.swing.JLabel JlabelProductName;
    private javax.swing.JLabel JlabelProductName1;
    private javax.swing.JLabel JlabelProductName2;
    private javax.swing.JLabel JlabelQty;
    private javax.swing.JLabel JlabelStaffName;
    private javax.swing.JLabel JlabelStoreGrandTotal;
    private javax.swing.JLabel JlabelStoreName2;
    private javax.swing.JLabel JlabelStoreName3;
    private javax.swing.JLabel JlabelStoreName4;
    private javax.swing.JLabel JlabelStoreName5;
    private javax.swing.JLabel JlabelTransactionID;
    private javax.swing.JLabel JlabelTransactionID1;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JComboBox<String> jComboBoxtable;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCustomer;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelLogOut;
    private javax.swing.JLabel jLabelRestock;
    private javax.swing.JLabel jLabelSortAsc;
    private javax.swing.JLabel jLabelStaff;
    private javax.swing.JLabel jLabelStore;
    private javax.swing.JLabel jLabelTransaction;
    private javax.swing.JLabel jLabelVendor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableTransaction;
    private javax.swing.JTextField jTextFieldCustomerID;
    private javax.swing.JTextField jTextFieldCustomerName;
    private javax.swing.JTextField jTextFieldGrandTotal;
    private javax.swing.JTextField jTextFieldProductID;
    private javax.swing.JTextField jTextFieldProductName;
    private javax.swing.JTextField jTextFieldQty;
    private javax.swing.JTextField jTextFieldSearchTransaction;
    private javax.swing.JTextField jTextFieldStaffID;
    private javax.swing.JTextField jTextFieldStaffName;
    private javax.swing.JTextField jTextFieldStoreID;
    private javax.swing.JTextField jTextFieldStoreName;
    private javax.swing.JTextField jTextFieldTransactionID;
    // End of variables declaration//GEN-END:variables
}
