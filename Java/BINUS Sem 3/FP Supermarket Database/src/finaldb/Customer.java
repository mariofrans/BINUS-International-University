
package finaldb;

import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.sql.Connection;
import java.sql.*;
import java.text.MessageFormat;
import net.proteanit.sql.DbUtils;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Customer extends javax.swing.JFrame {


    MySQLConnect mycust;
    public Customer() {
        initComponents();
        mycust = new MySQLConnect();
        update_table(); // to show the record from the db table to the jTable netbeans 
        // when the form gets loaded
        
        Fillcombo();
        
        set_custID();
        jTextFieldCustomerID.setEditable(false);
        // user is not allowed to choose customer id, it will be automatically generated
        // hence while creating cust table we have appllied auto_increment on id column 
    }
    
    // add the customer id to jTextFieldcustomerID automatically
    public void set_custID(){
        PreparedStatement pst;
        MySQLConnect obj = new MySQLConnect();
        Connection con = obj.getConn();
        ResultSet rs;
        try{
            String sql = "select max_id from variable_name";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);          
            
            if(rs.next()){
                int num = rs.getInt(1);
                jTextFieldCustomerID.setText(""+num);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    // to update in the jTable
    public void update_table(){
        PreparedStatement pst;
        ResultSet rs;
        Connection con = mycust.getConn();
        try{
            String inside = jComboBoxtable.getSelectedItem().toString();
            if(inside.equals("ID")){
                inside = "CustomerID";
                
            }else if(inside.equals("Name")){
                inside = "CustomerName";
            }else if(inside.equals("Phone No")){
                inside = "PhoneNo";
            }else if(inside.equals("Address")){
                inside = "Address";
            }else{
                inside = "PaymentMethod";
            }
            String insideOrder = jComboBox.getSelectedItem().toString();
            if(insideOrder.equals("Ascending")){
                insideOrder = "ASC";
            }else{
                insideOrder = "DESC";
            }
            
            String sql = ("select customer.CustomerID, customer.CustomerName, customer.PhoneNo, customer.Address, paymentmethod.PaymentMethod from customer inner join paymentmethod on customer.PaymentMethodID =  paymentmethod.PaymentMethodID order by " + inside + " " + insideOrder);
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTableCustomer.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
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
        jTextFieldSearchCustomerID = new javax.swing.JTextField();
        JlabelTransactionID1 = new javax.swing.JLabel();
        JPanelBodyInformation = new javax.swing.JPanel();
        JlabelCustomerID = new javax.swing.JLabel();
        JlabelName = new javax.swing.JLabel();
        JlabelTelNo = new javax.swing.JLabel();
        jTextFieldCustomerID = new javax.swing.JTextField();
        jTextFieldPhoneNo = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        JLabelAddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        JlabelPaymentMethod = new javax.swing.JLabel();
        jComboBoxPaymentMethod = new javax.swing.JComboBox<>();
        JPanelBodyButtons = new javax.swing.JPanel();
        jButtonSave = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonPrint = new javax.swing.JButton();
        JPanelBodyTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCustomer = new javax.swing.JTable();
        jLabelSortAsc = new javax.swing.JLabel();
        jComboBoxtable = new javax.swing.JComboBox<>();
        jLabelSortAsc1 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("jFrame customer"); // NOI18N

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
                .addContainerGap(266, Short.MAX_VALUE)
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
        jLabelCustomer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                .addContainerGap())
        );

        JPanelBodySearch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Customer by Name or ID :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jTextFieldSearchCustomerID.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldSearchCustomerID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchCustomerIDKeyReleased(evt);
            }
        });

        JlabelTransactionID1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        JlabelTransactionID1.setText("Search Customer");

        javax.swing.GroupLayout JPanelBodySearchLayout = new javax.swing.GroupLayout(JPanelBodySearch);
        JPanelBodySearch.setLayout(JPanelBodySearchLayout);
        JPanelBodySearchLayout.setHorizontalGroup(
            JPanelBodySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelBodySearchLayout.createSequentialGroup()
                .addComponent(JlabelTransactionID1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldSearchCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        JPanelBodySearchLayout.setVerticalGroup(
            JPanelBodySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodySearchLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(JPanelBodySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSearchCustomerID)
                    .addComponent(JlabelTransactionID1))
                .addContainerGap())
        );

        JPanelBodyInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Information :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        JPanelBodyInformation.setPreferredSize(new java.awt.Dimension(1100, 531));

        JlabelCustomerID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JlabelCustomerID.setText("Customer ID");

        JlabelName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JlabelName.setText("Name");

        JlabelTelNo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JlabelTelNo.setText("Phone No");

        jTextFieldCustomerID.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jTextFieldPhoneNo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jTextFieldName.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        JLabelAddress.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JLabelAddress.setText("Address");

        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextAreaAddress.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAddress);

        JlabelPaymentMethod.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JlabelPaymentMethod.setText("Payment Method");

        jComboBoxPaymentMethod.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        javax.swing.GroupLayout JPanelBodyInformationLayout = new javax.swing.GroupLayout(JPanelBodyInformation);
        JPanelBodyInformation.setLayout(JPanelBodyInformationLayout);
        JPanelBodyInformationLayout.setHorizontalGroup(
            JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JlabelCustomerID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JlabelName)
                    .addComponent(JLabelAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JlabelPaymentMethod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JlabelTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                        .addComponent(jTextFieldPhoneNo, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldCustomerID, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jComboBoxPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );
        JPanelBodyInformationLayout.setVerticalGroup(
            JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlabelCustomerID)
                    .addComponent(jTextFieldCustomerID))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlabelName)
                    .addComponent(jTextFieldName))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlabelTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPhoneNo))
                .addGap(21, 21, 21)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlabelPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        JPanelBodyTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "All Customer Detailed Information :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jTableCustomer.setAutoCreateRowSorter(false);
        jTableCustomer.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableCustomer.getTableHeader().setReorderingAllowed(false);
        jTableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCustomerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCustomer);

        jLabelSortAsc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSortAsc.setText("Order By");

        jComboBoxtable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBoxtable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Phone No", "Address", "Payment Method" }));
        jComboBoxtable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxtableActionPerformed(evt);
            }
        });

        jLabelSortAsc1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSortAsc1.setText("Order By");

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
                        .addComponent(jComboBoxtable, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelBodyTableLayout.createSequentialGroup()
                        .addComponent(jLabelSortAsc1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSortAsc, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JPanelBodyTableLayout.setVerticalGroup(
            JPanelBodyTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelBodyTableLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(JPanelBodyTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelBodyTableLayout.createSequentialGroup()
                        .addComponent(jLabelSortAsc, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelBodyTableLayout.createSequentialGroup()
                        .addComponent(jLabelSortAsc1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(JPanelBodyTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxtable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JPanelBodyInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JPanelBodyButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JPanelBodySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPanelBodyTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(JPanelBodyButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JPanelBodyInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)))
                    .addComponent(JPanelBodyTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // reset button 
    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed

        if(jTextFieldCustomerID.getText().equals("") && jTextFieldName.getText().equals("") && jTextFieldPhoneNo.getText().equals("") && jTextAreaAddress.getText().equals("") && jComboBoxPaymentMethod.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(null, "You haven't input anything", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            jTextFieldCustomerID.setText("");
            jTextFieldName.setText("");
            jTextFieldPhoneNo.setText("");
            jTextAreaAddress.setText("");
            jComboBoxPaymentMethod.setSelectedIndex(-1);
        }
        set_custID();

    }//GEN-LAST:event_jButtonResetActionPerformed

    // save button
    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        String custID = jTextFieldCustomerID.getText().toString();
        String custName = jTextFieldName.getText().toString();
        String custPhoneNo = jTextFieldPhoneNo.getText().toString();
        String custAddress = jTextAreaAddress.getText().toString();

        // checking if the text field is empty or not

        if(custName.trim().equals("") || custPhoneNo.trim().equals("") || custAddress.trim().equals("") || jComboBoxPaymentMethod.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(null, "You have to fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else  // if all data are entered
        {
            // JOptionPane.showMessageDialog(null, "All fields are filled");
            Connection con = mycust.getConn();

            // prepared statement is an interface is used to execute parameterized query
            // more convenient to sending sql statements to database
            PreparedStatement pst;
            // is a table of data representing a database result set
            // the sql statements taht read data from a database quesry, and return the data in a result set
            ResultSet rs;
            try{
                // find the customer max_id for customer to update
                // creating the query
                String sql = "select max_id from variable_name";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery(sql);
                int num = 0;
                if(rs.next()){
                    
                    num = rs.getInt(1)+1;
                    sql = "update variable_name set max_id =' "+num+"'";
                    pst = con.prepareStatement(sql);
                    pst.execute();

                }

                sql = "insert into customer(CustomerID, CustomerName, PhoneNo, Address, PaymentMethodID) values(?, ?, ?, ?, (select PaymentMethodID from paymentmethod where PaymentMethod = ?))";
                pst = con.prepareStatement(sql);

                pst.setInt(1, Integer.parseInt(custID));
                pst.setString(2, custName);
                pst.setString(3, custPhoneNo);
                pst.setString(4, custAddress);
                String paymentmethod = jComboBoxPaymentMethod.getSelectedItem().toString();
                pst.setString(5, paymentmethod);

                int i= pst.executeUpdate();
                if(i >= 1){
                    JOptionPane.showMessageDialog(null, custName +" Customer information saved successfully to Database Table");

                    // call reset action to clear / vanish the content from the form fields
                    jButtonResetActionPerformed(evt);

                    // call the update table after save it
                    // to show record from the db table to jtable netbeans
                    update_table();
                    set_custID();

                }else{
                    JOptionPane.showMessageDialog(null, custName +" Customer information is not saved to Database Table", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,custName+" Customer Information Error"+e);
            }
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    
    
    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_jLabelHomeMouseClicked

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        PreparedStatement pst;
        MySQLConnect mycust = new MySQLConnect();
        Connection con = mycust.getConn();
        try{
            String custID = jTextFieldCustomerID.getText().toString().trim();
            String custName = jTextFieldName.getText().toString().trim();
            String custPhoneNo = jTextFieldPhoneNo.getText().toString().trim();
            String custAddress = jTextAreaAddress.getText().toString().trim();
            
            // update the query
            // in here, we dont update the primary key 
            // alter table .... delete primary key;
            // alter table .... add primary key();
            String sql = "update customer set CustomerName = ?, PhoneNo = ?, Address = ?, PaymentMethodID = (select PaymentMethodID from paymentmethod where PaymentMethod = ?) where CustomerID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, custName);
            pst.setString(2, custPhoneNo);
            pst.setString(3, custAddress);
            
            String paymentmethod = jComboBoxPaymentMethod.getSelectedItem().toString();
            pst.setString(4, paymentmethod); 
            
            pst.setInt(5, Integer.parseInt(custID));
            
            int i = pst.executeUpdate();
            if(i >= 1){
                JOptionPane.showMessageDialog(null, jTextFieldName.getText()+" Information Updated Successfully");
                update_table();
                jButtonResetActionPerformed(evt);
                set_custID();
            }else{
                JOptionPane.showMessageDialog(null, jTextFieldName.getText()+" Information Updated Failed", "Error", JOptionPane.ERROR_MESSAGE);

            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, jTextFieldName.getText()+" Customer information" + " Update Error"+e);
            
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed
    
    // delete customer information
    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete "+jTextFieldName.getText()+" Customer Information ?","delete", JOptionPane.YES_NO_OPTION);
        
        if(choice == 0){
            PreparedStatement pst;
            MySQLConnect mycust = new MySQLConnect();
            Connection con = mycust.getConn();
            String sql = "delete from customer where CustomerID = ?";
            try{
                pst = con.prepareStatement(sql);
                pst.setString(1, jTextFieldCustomerID.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, jTextFieldName.getText()+ " Deleted Successfully" );
                
                // to update the table after delete from the database
                update_table();
                
                // clear from the interface
                jButtonResetActionPerformed(evt);
                
                // display the next id
                set_custID();
                
            }catch(Exception e){
               JOptionPane.showMessageDialog(null, "Customer Information delete Error"+e);
               
            }            
        }
      
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        MessageFormat header = new MessageFormat("Customer Report");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        try{
            jTableCustomer.print(JTable.PrintMode.NORMAL, header, footer);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
//            System.out.println("Error while printing Customer Information" +e);
        }
    }//GEN-LAST:event_jButtonPrintActionPerformed

    
    // search customer id and name by adding key released on jTextField
    private void jTextFieldSearchCustomerIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchCustomerIDKeyReleased
        int flag = 0;
        PreparedStatement pst;
        ResultSet rs;
        MySQLConnect mycust = new MySQLConnect();
        Connection con = mycust.getConn();
        
        try{
            // search by using customer name
            String sql = "select customer.CustomerID, customer.CustomerName, customer.PhoneNo, customer.Address, paymentmethod.PaymentMethod from customer inner join paymentmethod on customer.PaymentMethodID = paymentmethod.PaymentMethodID where CustomerName like '%"+jTextFieldSearchCustomerID.getText()+"%'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                flag = 1;
                
                jTextFieldCustomerID.setText(rs.getString("CustomerID"));
                jTextFieldName.setText(rs.getString("CustomerName"));
                jTextFieldPhoneNo.setText(rs.getString("PhoneNo"));
                jTextAreaAddress.setText(rs.getString("Address"));   
                jComboBoxPaymentMethod.setSelectedItem(rs.getString("PaymentMethod"));
                
            }else{
                set_custID();
                jTextFieldCustomerID.setText("");
                jTextFieldName.setText("");
                jTextFieldPhoneNo.setText("");
                jTextAreaAddress.setText("");
                jComboBoxPaymentMethod.setSelectedIndex(-1);
            }
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, "Error Customer Information search customer id", "Error", JOptionPane.ERROR_MESSAGE);            
        }
        
        
        try{
            // search by using customer id
            String sql = "select customer.CustomerID, customer.CustomerName, customer.PhoneNo, customer.Address, paymentmethod.PaymentMethod from customer inner join paymentmethod on customer.PaymentMethodID = paymentmethod.PaymentMethodID where CustomerID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, jTextFieldSearchCustomerID.getText());
            rs = pst.executeQuery();
            
            if(rs.next() && flag == 0){

                jTextFieldCustomerID.setText(rs.getString("CustomerID"));
                jTextFieldName.setText(rs.getString("CustomerName"));
                jTextFieldPhoneNo.setText(rs.getString("PhoneNo"));
                jTextAreaAddress.setText(rs.getString("Address"));
                jComboBoxPaymentMethod.setSelectedItem(rs.getString("PaymentMethod"));

            }else if (flag == 0){
                flag = 1;
                set_custID();
                jTextFieldCustomerID.setText("");
                jTextFieldName.setText("");
                jTextFieldPhoneNo.setText("");
                jTextAreaAddress.setText("");
                jComboBoxPaymentMethod.setSelectedIndex(-1);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Customer Information search customer id", "Error", JOptionPane.ERROR_MESSAGE);
            
        }         
    }//GEN-LAST:event_jTextFieldSearchCustomerIDKeyReleased

    private void Fillcombo(){
      
        try{
            Connection con = mycust.getConn();
            String sql = "select * from paymentmethod";
            PreparedStatement pst;
            ResultSet rs;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            
            while(rs.next()){
                jComboBoxPaymentMethod.setSelectedIndex(-1);
                String vendorname = rs.getString("PaymentMethod");
                jComboBoxPaymentMethod.addItem(vendorname);  
            }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    private void jTableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCustomerMouseClicked
        PreparedStatement pst;
        MySQLConnect mycust = new MySQLConnect();
        ResultSet rs;
        Connection con = mycust.getConn();
        
        try{
            int row = jTableCustomer.getSelectedRow();
            String table_click = jTableCustomer.getModel().getValueAt(row, 0).toString();
            String sql = "select customer.CustomerID, customer.CustomerName, customer.PhoneNo, customer.Address, paymentmethod.PaymentMethod from customer inner join paymentmethod on customer.PaymentMethodID = paymentmethod.PaymentMethodID where CustomerID = '"+table_click+"'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                jTextFieldCustomerID.setText(rs.getString("CustomerID"));
                jTextFieldName.setText(rs.getString("CustomerName"));
                jTextFieldPhoneNo.setText(rs.getString("PhoneNo"));
                jTextAreaAddress.setText(rs.getString("Address"));
                jComboBoxPaymentMethod.setSelectedItem(rs.getString("PaymentMethod"));
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error at Customer Information jTable key pressed"+e);
        }     
    }//GEN-LAST:event_jTableCustomerMouseClicked

    private void jLabelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseClicked
       this.dispose();
       Main m = new Main();
       m.setVisible(true);
    }//GEN-LAST:event_jLabelLogOutMouseClicked

    private void jLabelStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStaffMouseClicked

        this.dispose();
        Staff s = new Staff();
        s.setVisible(true);
    }//GEN-LAST:event_jLabelStaffMouseClicked

    private void jLabelVendorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVendorMouseClicked
        this.dispose();
        Vendor v = new Vendor();
        v.setVisible(true);
    }//GEN-LAST:event_jLabelVendorMouseClicked

    private void jLabelRestockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRestockMouseClicked
        this.dispose();
        Restock r = new Restock();
        r.setVisible(true);
    }//GEN-LAST:event_jLabelRestockMouseClicked

    private void jLabelStoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStoreMouseClicked
        this.dispose();
        Store s = new Store();
        s.setVisible(true);


    }//GEN-LAST:event_jLabelStoreMouseClicked

    private void jLabelTransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTransactionMouseClicked
        this.dispose();
        Transaction t = new Transaction();
        t.setVisible(true);
    }//GEN-LAST:event_jLabelTransactionMouseClicked

    private void jComboBoxtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxtableActionPerformed
        update_table();
    }//GEN-LAST:event_jComboBoxtableActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
       update_table();
    }//GEN-LAST:event_jComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelAddress;
    private javax.swing.JPanel JPanelBodyButtons;
    private javax.swing.JPanel JPanelBodyInformation;
    private javax.swing.JPanel JPanelBodySearch;
    private javax.swing.JPanel JPanelBodyTable;
    private javax.swing.JPanel JPanelHeader;
    private javax.swing.JPanel JPanelMenu;
    private javax.swing.JLabel JlabelCustomerID;
    private javax.swing.JLabel JlabelName;
    private javax.swing.JLabel JlabelPaymentMethod;
    private javax.swing.JLabel JlabelTelNo;
    private javax.swing.JLabel JlabelTransactionID1;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JComboBox<String> jComboBoxPaymentMethod;
    private javax.swing.JComboBox<String> jComboBoxtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCustomer;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelLogOut;
    private javax.swing.JLabel jLabelRestock;
    private javax.swing.JLabel jLabelSortAsc;
    private javax.swing.JLabel jLabelSortAsc1;
    private javax.swing.JLabel jLabelStaff;
    private javax.swing.JLabel jLabelStore;
    private javax.swing.JLabel jLabelTransaction;
    private javax.swing.JLabel jLabelVendor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCustomer;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextField jTextFieldCustomerID;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhoneNo;
    private javax.swing.JTextField jTextFieldSearchCustomerID;
    // End of variables declaration//GEN-END:variables
}
