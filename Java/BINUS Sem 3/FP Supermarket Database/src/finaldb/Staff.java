
package finaldb;

import javax.swing.*;
import java.sql.Connection;
import java.sql.*;
import java.text.MessageFormat;
import net.proteanit.sql.DbUtils;



public class Staff extends javax.swing.JFrame {
    MySQLConnect mystaff;
    ButtonGroup bg;
    
    public Staff() {
        initComponents();
        mystaff = new MySQLConnect();
        update_table();
        
        
        bg = new ButtonGroup();
        bg.add(jRadioButtonFemale);
        bg.add(jRadioButtonMale);

        jTextFieldStaffID.setEditable(false);
        
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
        jTextFieldSearchStaff = new javax.swing.JTextField();
        JlabelTransactionID1 = new javax.swing.JLabel();
        JPanelBodyInformation = new javax.swing.JPanel();
        JlabelCustomerID = new javax.swing.JLabel();
        JlabelName = new javax.swing.JLabel();
        JlabelFieldlName = new javax.swing.JLabel();
        jTextFieldStaffID = new javax.swing.JTextField();
        jTextFieldfName = new javax.swing.JTextField();
        JLabelPosition = new javax.swing.JLabel();
        JlabelGender = new javax.swing.JLabel();
        jTextFieldlName = new javax.swing.JTextField();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jTextFieldEmail = new javax.swing.JTextField();
        JLabelEmail = new javax.swing.JLabel();
        jComboBoxPosition = new javax.swing.JComboBox<>();
        JPanelBodyButtons = new javax.swing.JPanel();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonPrint = new javax.swing.JButton();
        JPanelBodyTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableStaff = new javax.swing.JTable();
        jLabelSortAsc = new javax.swing.JLabel();
        jComboBoxtable = new javax.swing.JComboBox<>();
        jLabelSortDesc = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Staff");

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
                .addContainerGap(276, Short.MAX_VALUE)
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
        jLabelStaff.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelMenuLayout.createSequentialGroup()
                        .addGroup(JPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelVendor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRestock, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelStore, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGap(68, 68, 68)
                .addComponent(jLabelLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JPanelBodySearch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Staff by Name or ID :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jTextFieldSearchStaff.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldSearchStaff.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchStaffKeyReleased(evt);
            }
        });

        JlabelTransactionID1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        JlabelTransactionID1.setText("Search Staff");

        javax.swing.GroupLayout JPanelBodySearchLayout = new javax.swing.GroupLayout(JPanelBodySearch);
        JPanelBodySearch.setLayout(JPanelBodySearchLayout);
        JPanelBodySearchLayout.setHorizontalGroup(
            JPanelBodySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelBodySearchLayout.createSequentialGroup()
                .addComponent(JlabelTransactionID1)
                .addGap(10, 10, 10)
                .addComponent(jTextFieldSearchStaff)
                .addContainerGap())
        );
        JPanelBodySearchLayout.setVerticalGroup(
            JPanelBodySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodySearchLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(JPanelBodySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSearchStaff)
                    .addComponent(JlabelTransactionID1))
                .addContainerGap())
        );

        JPanelBodyInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Staff Information :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        JPanelBodyInformation.setPreferredSize(new java.awt.Dimension(1100, 531));

        JlabelCustomerID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelCustomerID.setText("Staff ID");

        JlabelName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelName.setText("First Name");

        JlabelFieldlName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelFieldlName.setText("Last Name");

        jTextFieldStaffID.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jTextFieldfName.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        JLabelPosition.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLabelPosition.setText("Position");

        JlabelGender.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelGender.setText("Gender");

        jTextFieldlName.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldlName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldlNameActionPerformed(evt);
            }
        });

        jRadioButtonFemale.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRadioButtonFemale.setText("Female");
        jRadioButtonFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFemaleActionPerformed(evt);
            }
        });

        jRadioButtonMale.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRadioButtonMale.setText("Male");

        jTextFieldEmail.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        JLabelEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JLabelEmail.setText("Email");

        jComboBoxPosition.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jComboBoxPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Staff", "Manager" }));
        jComboBoxPosition.setSelectedIndex(-1);

        javax.swing.GroupLayout JPanelBodyInformationLayout = new javax.swing.GroupLayout(JPanelBodyInformation);
        JPanelBodyInformation.setLayout(JPanelBodyInformationLayout);
        JPanelBodyInformationLayout.setHorizontalGroup(
            JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelBodyInformationLayout.createSequentialGroup()
                        .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelBodyInformationLayout.createSequentialGroup()
                                    .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JlabelName)
                                        .addComponent(JlabelCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                                    .addComponent(JlabelFieldlName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)))
                            .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                                .addComponent(JlabelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelBodyInformationLayout.createSequentialGroup()
                                .addComponent(JLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                                .addComponent(jRadioButtonFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonMale))
                            .addComponent(jTextFieldlName, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldfName, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelBodyInformationLayout.createSequentialGroup()
                        .addComponent(JLabelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxPosition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        JPanelBodyInformationLayout.setVerticalGroup(
            JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlabelCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JlabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JlabelFieldlName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldlName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlabelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonFemale)
                    .addComponent(jRadioButtonMale))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        JPanelBodyButtons.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jButtonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPrint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JPanelBodyButtonsLayout.setVerticalGroup(
            JPanelBodyButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyButtonsLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanelBodyTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "All Customer Detailed Information :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jTableStaff.setAutoCreateRowSorter(false);
        jTableStaff.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableStaff.getTableHeader().setReorderingAllowed(false);
        jTableStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableStaffMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableStaff);

        jLabelSortAsc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSortAsc.setText("Order By");

        jComboBoxtable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBoxtable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "First Name", "Last Name", "Email", "Gender", "Position" }));
        jComboBoxtable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxtableActionPerformed(evt);
            }
        });

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
            .addGroup(JPanelBodyTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelBodyTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(JPanelBodyTableLayout.createSequentialGroup()
                        .addComponent(jComboBoxtable, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelBodyTableLayout.createSequentialGroup()
                        .addComponent(jLabelSortAsc, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSortDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JPanelBodyTableLayout.setVerticalGroup(
            JPanelBodyTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyTableLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(JPanelBodyTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSortAsc, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSortDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelBodyTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxtable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                            .addComponent(JPanelBodySearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPanelBodyTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(JPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_jLabelHomeMouseClicked

    private void jLabelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseClicked
        this.dispose();
        Main m = new Main();
        m.setVisible(true);
    }//GEN-LAST:event_jLabelLogOutMouseClicked

    
    // to update in the jTable
    public void update_table(){
        PreparedStatement pst;
        ResultSet rs;
        Connection con = mystaff.getConn();
        try{
            String inside = jComboBoxtable.getSelectedItem().toString();
            if(inside.equals("ID")){
                inside = "StaffID";
            }else if(inside.equals("Position")){
                inside = "Position";
            }else if(inside.equals("First Name")){
                inside = "FirstName";
            }
            else if(inside.equals("Last Name")){
                inside = "LastName";
            }
            else{
                inside = "email";
            }
            String insideOrder = jComboBox.getSelectedItem().toString();
            if(insideOrder.equals("Ascending")){
                insideOrder = "ASC";
            }else{
                insideOrder = "DESC";
            }
            
            
            
            String sql = ("select StaffID, FirstName, LastName, Email, Position, Gender from staff order by " + inside + " " + insideOrder);
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTableStaff.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void jTextFieldSearchStaffKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchStaffKeyReleased
        int flag = 0;
        PreparedStatement pst;
        ResultSet rs;
        MySQLConnect mystaff = new MySQLConnect();
        Connection con = mystaff.getConn();

        try{
            // search by using staff name
            String sql = "select * from staff where FirstName like '%"+jTextFieldSearchStaff.getText()+"%'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            if(rs.next()){
                flag = 1;

                jTextFieldStaffID.setText(rs.getString("StaffID"));
                jTextFieldfName.setText(rs.getString("FirstName"));
                jTextFieldlName.setText(rs.getString("LastName"));
                jTextFieldEmail.setText(rs.getString("email"));
                jComboBoxPosition.setSelectedItem(rs.getString("Position"));
                String gender = rs.getString("gender");
                if(gender.equals("Female")){
                    jRadioButtonFemale.setSelected(true);
                }else{
                    jRadioButtonMale.setSelected(true);
                }
                

            }else{

                jTextFieldStaffID.setText("");
                jTextFieldfName.setText("");
                jTextFieldlName.setText("");
                jTextFieldEmail.setText("");
                jComboBoxPosition.setSelectedIndex(-1);
                bg.clearSelection();

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Customer Information search staff name", "Error", JOptionPane.ERROR_MESSAGE);
        }

        try{
            // search by using staff id
            String sql = "select * from staff where StaffID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, jTextFieldSearchStaff.getText());
            rs = pst.executeQuery();

            if(rs.next() && flag == 0){

                jTextFieldStaffID.setText(rs.getString("StaffID"));
                jTextFieldfName.setText(rs.getString("FirstName"));
                jTextFieldlName.setText(rs.getString("LastName"));
                jTextFieldEmail.setText(rs.getString("email"));
                jComboBoxPosition.setSelectedItem(rs.getString("Position"));
                String gender = rs.getString("gender");
                if(gender.equals("Female")){
                    jRadioButtonFemale.setSelected(true);
                }else{
                    jRadioButtonMale.setSelected(true);
                }

            }else if (flag == 0){
                flag = 1;

                jTextFieldStaffID.setText("");
                jTextFieldfName.setText("");
                jTextFieldlName.setText("");
                jTextFieldEmail.setText("");
                jComboBoxPosition.setSelectedIndex(-1);
                bg.clearSelection();

            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Staff Information search Staff id", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_jTextFieldSearchStaffKeyReleased

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
 
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete "+jTextFieldfName.getText()+" Staff Information ?","delete", JOptionPane.YES_NO_OPTION);
        
        if(choice == 0){
            PreparedStatement pst;
            MySQLConnect mycust = new MySQLConnect();
            Connection con = mycust.getConn();
            String sql = "delete from staff where StaffID = ?";
            try{
                pst = con.prepareStatement(sql);
                pst.setString(1, jTextFieldStaffID.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, jTextFieldfName.getText()+ " Deleted Successfully" );

                // to update the table after delete from the database
                update_table();

                // clear from the interface
                jButtonResetActionPerformed(evt);

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Staff Information delete Error"+e);

            }

        }

    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        PreparedStatement pst;
        MySQLConnect mystaff = new MySQLConnect();
        Connection con = mystaff.getConn();
        try{
            String staffID = jTextFieldStaffID.getText().toString().trim();
            String FirstName = jTextFieldfName.getText().toString().trim();
            String LastName = jTextFieldlName.getText().toString().trim();
            String Email = jTextFieldEmail.getText().toString().trim();
            String gender = "";
            if(jRadioButtonFemale.isSelected()){
                gender = "Female";
            }
            if (jRadioButtonMale.isSelected()){
                gender = "Male";
            }
            

            // update the query
            // in here, we dont update the primary key
            // alter table .... delete primary key;
            // alter table .... add primary key();
            String sql = "update staff set FirstName = ?, LastName = ?, email = ?, position = ?, gender = ? where StaffID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, FirstName);
            pst.setString(2, LastName);
            pst.setString(3, Email);
            String position = jComboBoxPosition.getSelectedItem().toString();
            pst.setString(4, position); 
            pst.setString(5, gender);

            pst.setInt(6, Integer.parseInt(staffID));


            int i = pst.executeUpdate();
            if(i >= 1){
                JOptionPane.showMessageDialog(null, jTextFieldfName.getText()+" Information Updated Successfully");
                update_table();
                jButtonResetActionPerformed(evt);
            }else{
                JOptionPane.showMessageDialog(null, jTextFieldfName.getText()+" Information Updated Failed", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, jTextFieldfName.getText()+" Staff information" + " Update Error"+e);

        }

    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed

        if(jTextFieldStaffID.getText().equals("") && jTextFieldfName.getText().equals("") && jTextFieldlName.getText().equals("") && jComboBoxPosition.getSelectedIndex() == -1 && jTextFieldEmail.getText().equals("") && !jRadioButtonFemale.isSelected() && !jRadioButtonMale.isSelected())
        {
            JOptionPane.showMessageDialog(null, "You haven't input anything", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            jTextFieldStaffID.setText("");
            jTextFieldfName.setText("");
            jTextFieldlName.setText("");
            bg.clearSelection();
            jComboBoxPosition.setSelectedIndex(-1);
            jTextFieldEmail.setText("");
            
        }
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        MessageFormat header = new MessageFormat("Staff Report");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        try{
            jTableStaff.print(JTable.PrintMode.NORMAL, header, footer);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            System.out.println("Error while printing Staff Information" +e);
        }
    }//GEN-LAST:event_jButtonPrintActionPerformed

    private void jTableStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStaffMouseClicked
        PreparedStatement pst;
        MySQLConnect mystaff = new MySQLConnect();
        ResultSet rs;
        Connection con = mystaff.getConn();

        try{
            int row = jTableStaff.getSelectedRow();
            String table_click = jTableStaff.getModel().getValueAt(row, 0).toString();
            String sql = "select*from staff where StaffID = '"+table_click+"'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                jTextFieldStaffID.setText(rs.getString("StaffID"));
                jTextFieldfName.setText(rs.getString("FirstName"));
                jTextFieldlName.setText(rs.getString("LastName"));
                jTextFieldEmail.setText(rs.getString("email"));
                jComboBoxPosition.setSelectedItem(rs.getString("position"));
                String gender = rs.getString("gender");
                if(gender.equals("Female")){

                    jRadioButtonFemale.setSelected(true);
                }else{
                    jRadioButtonMale.setSelected(true);

                }
                

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error at Staff Information jTable key pressed"+e);
        }

    }//GEN-LAST:event_jTableStaffMouseClicked

    
    private void jLabelCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCustomerMouseClicked
        this.dispose();
        Customer c = new Customer();
        c.setVisible(true);
    }//GEN-LAST:event_jLabelCustomerMouseClicked

    private void jRadioButtonFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFemaleActionPerformed

    private void jTextFieldlNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldlNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldlNameActionPerformed

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
        Store r = new Store();
        r.setVisible(true);
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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelEmail;
    private javax.swing.JLabel JLabelPosition;
    private javax.swing.JPanel JPanelBodyButtons;
    private javax.swing.JPanel JPanelBodyInformation;
    private javax.swing.JPanel JPanelBodySearch;
    private javax.swing.JPanel JPanelBodyTable;
    private javax.swing.JPanel JPanelHeader;
    private javax.swing.JPanel JPanelMenu;
    private javax.swing.JLabel JlabelCustomerID;
    private javax.swing.JLabel JlabelFieldlName;
    private javax.swing.JLabel JlabelGender;
    private javax.swing.JLabel JlabelName;
    private javax.swing.JLabel JlabelTransactionID1;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JComboBox<String> jComboBoxPosition;
    private javax.swing.JComboBox<String> jComboBoxtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCustomer;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelLogOut;
    private javax.swing.JLabel jLabelRestock;
    private javax.swing.JLabel jLabelSortAsc;
    private javax.swing.JLabel jLabelSortDesc;
    private javax.swing.JLabel jLabelStaff;
    private javax.swing.JLabel jLabelStore;
    private javax.swing.JLabel jLabelTransaction;
    private javax.swing.JLabel jLabelVendor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableStaff;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldSearchStaff;
    private javax.swing.JTextField jTextFieldStaffID;
    private javax.swing.JTextField jTextFieldfName;
    private javax.swing.JTextField jTextFieldlName;
    // End of variables declaration//GEN-END:variables
}
