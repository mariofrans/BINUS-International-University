
package finaldb;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.sql.Connection;
import java.sql.*;
import java.text.MessageFormat;
import net.proteanit.sql.DbUtils;

public class StoreStaff extends javax.swing.JFrame {

   MySQLConnect mystore;
    public StoreStaff() {
        initComponents();
        mystore = new MySQLConnect();
        set_storeid();
        update_table();
        
        
        
        jTextFieldStoreID.setEditable(false);
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
        jLabelStore = new javax.swing.JLabel();
        JPanelBodySearch = new javax.swing.JPanel();
        jTextFieldSearchStore = new javax.swing.JTextField();
        JlabelTransactionID1 = new javax.swing.JLabel();
        JPanelBodyInformation = new javax.swing.JPanel();
        JlabelStoreID = new javax.swing.JLabel();
        JlabelName = new javax.swing.JLabel();
        JlabelAddress = new javax.swing.JLabel();
        jTextFieldStoreID = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        JPanelBodyButtons = new javax.swing.JPanel();
        jButtonSave = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonPrint = new javax.swing.JButton();
        JPanelBodyTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableStore = new javax.swing.JTable();
        jComboBoxtable = new javax.swing.JComboBox<>();
        jLabelSortAsc = new javax.swing.JLabel();
        jLabelSortDesc = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        jLabelStatistics.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelStatistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelStatisticsMouseClicked(evt);
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
        jLabelStore.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelStore.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                    .addComponent(jLabelStore, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jLabelStore, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JPanelBodySearch.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Store by Name or ID :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jTextFieldSearchStore.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldSearchStore.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchStoreKeyReleased(evt);
            }
        });

        JlabelTransactionID1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        JlabelTransactionID1.setText("Search Store");

        javax.swing.GroupLayout JPanelBodySearchLayout = new javax.swing.GroupLayout(JPanelBodySearch);
        JPanelBodySearch.setLayout(JPanelBodySearchLayout);
        JPanelBodySearchLayout.setHorizontalGroup(
            JPanelBodySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelBodySearchLayout.createSequentialGroup()
                .addComponent(JlabelTransactionID1)
                .addGap(10, 10, 10)
                .addComponent(jTextFieldSearchStore)
                .addContainerGap())
        );
        JPanelBodySearchLayout.setVerticalGroup(
            JPanelBodySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodySearchLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(JPanelBodySearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSearchStore)
                    .addComponent(JlabelTransactionID1))
                .addContainerGap())
        );

        JPanelBodyInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Store Information :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N
        JPanelBodyInformation.setPreferredSize(new java.awt.Dimension(1100, 531));

        JlabelStoreID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelStoreID.setText("Store ID");

        JlabelName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelName.setText("Name");

        JlabelAddress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JlabelAddress.setText("Address");

        jTextFieldStoreID.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jTextFieldName.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextAreaAddress.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAddress);

        javax.swing.GroupLayout JPanelBodyInformationLayout = new javax.swing.GroupLayout(JPanelBodyInformation);
        JPanelBodyInformation.setLayout(JPanelBodyInformationLayout);
        JPanelBodyInformationLayout.setHorizontalGroup(
            JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JlabelStoreID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelName)
                    .addComponent(JlabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                        .addComponent(jTextFieldStoreID, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        JPanelBodyInformationLayout.setVerticalGroup(
            JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyInformationLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStoreID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelStoreID))
                .addGap(21, 21, 21)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPanelBodyInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JlabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
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
                    .addComponent(jButtonReset, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jButtonPrint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JPanelBodyButtonsLayout.setVerticalGroup(
            JPanelBodyButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyButtonsLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        JPanelBodyTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "All Store Detailed Information :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jTableStore.setAutoCreateRowSorter(false

        );
        jTableStore.setModel(new javax.swing.table.DefaultTableModel(
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
    jTableStore.getTableHeader().setReorderingAllowed(false);
    jTableStore.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTableStoreMouseClicked(evt);
        }
    });
    jScrollPane2.setViewportView(jTableStore);

    jComboBoxtable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
    jComboBoxtable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "StoreID", "StoreName", "Address" }));
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
        .addGroup(JPanelBodyTableLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(JPanelBodyTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPanelBodyTableLayout.createSequentialGroup()
                    .addComponent(jLabelSortAsc, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                    .addComponent(jLabelSortDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(JPanelBodyTableLayout.createSequentialGroup()
                    .addComponent(jComboBoxtable, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
            .addGap(18, 18, 18)
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
                        .addComponent(JPanelBodySearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(JPanelBodyTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(JPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );
    jPanelWholeLayout.setVerticalGroup(
        jPanelWholeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelWholeLayout.createSequentialGroup()
            .addGap(9, 9, 9)
            .addComponent(JPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanelWholeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelWholeLayout.createSequentialGroup()
                    .addComponent(JPanelBodySearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanelWholeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JPanelBodyButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPanelBodyInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)))
                .addComponent(JPanelBodyTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanelWhole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanelWhole, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // to update in the jTable
    public void update_table(){
        PreparedStatement pst;
        ResultSet rs;
        Connection con = mystore.getConn();
        try{
            String inside = jComboBoxtable.getSelectedItem().toString();
            if(inside.equals("StoreID")){
                inside = "StoreID";
            }else if(inside.equals("StoreName")){
                inside = "StoreName";
            }else{
                inside = "Address";
            }
            String insideOrder = jComboBox.getSelectedItem().toString();
            if(insideOrder.equals("Ascending")){
                insideOrder = "ASC";
            }else{
                insideOrder = "DESC";
            }
            String sql =  ("select * from store order by " + inside + " " + insideOrder);
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTableStore.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void set_storeid(){
        MySQLConnect mystore = new MySQLConnect();
        PreparedStatement pst;
        ResultSet rs;
        Connection con = mystore.getConn();
        
        try{
            String sql = "select max_id from variable_store";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                int num = rs.getInt(1);
                jTextFieldStoreID.setText(""+num);
            }  
        }catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }  
    }
    
    private void jLabelCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCustomerMouseClicked
        this.dispose();

        CustomerStaff customer = new CustomerStaff();
        customer.setVisible(true);
    }//GEN-LAST:event_jLabelCustomerMouseClicked

    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked
        this.dispose();
        HomeStaff h = new HomeStaff();
        h.setVisible(true);
    }//GEN-LAST:event_jLabelHomeMouseClicked

    private void jLabelTransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTransactionMouseClicked
        this.dispose();
        TransactionStaff t = new TransactionStaff();
        t.setVisible(true);
    }//GEN-LAST:event_jLabelTransactionMouseClicked

    private void jLabelVendorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVendorMouseClicked
        this.dispose();
        VendorStaff vendor = new VendorStaff();
        vendor.setVisible(true);
    }//GEN-LAST:event_jLabelVendorMouseClicked

    private void jLabelStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStaffMouseClicked
        this.dispose();
        StaffStaff s = new StaffStaff();
        s.setVisible(true);
    }//GEN-LAST:event_jLabelStaffMouseClicked

    private void jLabelStatisticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStatisticsMouseClicked
        this.dispose();
        RestockStaff r = new RestockStaff();
        r.setVisible(true);
    }//GEN-LAST:event_jLabelStatisticsMouseClicked

    private void jLabelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogOutMouseClicked
        this.dispose();
        Main m = new Main();
        m.setVisible(true);
    }//GEN-LAST:event_jLabelLogOutMouseClicked

    private void jTextFieldSearchStoreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchStoreKeyReleased
        int flag = 0;
        PreparedStatement pst;
        ResultSet rs;
        MySQLConnect mystore = new MySQLConnect();
        Connection con = mystore.getConn();

        try{
            // search by using store name
            String sql = "select * from store where StoreName like '%"+jTextFieldSearchStore.getText()+"%'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            if(rs.next()){
                flag = 1;

                jTextFieldStoreID.setText(rs.getString("StoreID"));
                jTextFieldName.setText(rs.getString("StoreName"));
                jTextAreaAddress.setText(rs.getString("Address"));

            }else{
                jTextFieldStoreID.setText("");
                jTextFieldName.setText("");
                jTextAreaAddress.setText("");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error store Information search store name", "Error", JOptionPane.ERROR_MESSAGE);

        }

        try{
            // search by using store id
            String sql = "select * from store where StoreID = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, jTextFieldSearchStore.getText());
            rs = pst.executeQuery();

            if(rs.next() && flag == 0){

                jTextFieldStoreID.setText(rs.getString("StoreID"));
                jTextFieldName.setText(rs.getString("StoreName"));
                jTextAreaAddress.setText(rs.getString("Address"));

            }else if (flag == 0){
                flag = 1;
                // set_storeid();
                jTextFieldStoreID.setText("");
                jTextFieldName.setText("");
                jTextAreaAddress.setText("");
            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error store Information search store id", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jTextFieldSearchStoreKeyReleased

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        String storeid = jTextFieldStoreID.getText().toString();
        String name = jTextFieldName.getText().toString();
        String address = jTextAreaAddress.getText().toString();

        // check if the field are empty or not
        if(name.trim().equals("") || address.trim().equals("")){
            JOptionPane.showMessageDialog(null, "You have to fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
        }else{

            // check if all data are entered.
            try{
                PreparedStatement pst;
                ResultSet rs;
                Connection con = mystore.getConn();

                String sql = "select max_id from variable_store";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery(sql);
                int num = 0;
                if(rs.next()){

                    num = rs.getInt(1)+1;
                    sql = "update variable_store set max_id =' "+num+"'";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                }

                sql = "insert into store (StoreID, StoreName, Address) values(?,?,?)";
                pst = con.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(storeid));
                pst.setString(2, name);
                pst.setString(3, address);

                int i= pst.executeUpdate();
                if(i >= 1){
                    JOptionPane.showMessageDialog(null, name +" Store information saved successfully to Database Table");

                    // call reset action to clear / vanish the content from the form fields
                    jButtonResetActionPerformed(evt);

                    // call the update table after save it
                    // to show record from the db table to jtable netbeans
                    update_table();
                    set_storeid();

                }else{
                    JOptionPane.showMessageDialog(null, name +" Store information is not saved to Database Table", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed

        if(jTextFieldStoreID.getText().equals("") && jTextFieldName.getText().equals("") && jTextAreaAddress.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null, "You haven't input anything", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            jTextFieldStoreID.setText("");
            jTextFieldName.setText("");
            jTextAreaAddress.setText("");
            set_storeid();
        }
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        MessageFormat header = new MessageFormat("Store Report");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        try{
            jTableStore.print(JTable.PrintMode.NORMAL, header, footer);
        }catch(Exception e){
            System.out.println("Error while printing Store"
                + " Information" +e);
        }
    }//GEN-LAST:event_jButtonPrintActionPerformed

    private void jTableStoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStoreMouseClicked
        PreparedStatement pst;
        MySQLConnect mystore = new MySQLConnect();
        ResultSet rs;
        Connection con = mystore.getConn();

        try{

            int row = jTableStore.getSelectedRow();
            String table_click = jTableStore.getModel().getValueAt(row, 0).toString();

            String sql = "select * from store where StoreID = '"+table_click+"'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                jTextFieldStoreID.setText(rs.getString("StoreID"));
                jTextFieldName.setText(rs.getString("StoreName"));
                jTextAreaAddress.setText(rs.getString("Address"));

            }

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error at Store Information jTable key pressed"+e);
        }
    }//GEN-LAST:event_jTableStoreMouseClicked

    private void jComboBoxtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxtableActionPerformed
        update_table();
    }//GEN-LAST:event_jComboBoxtableActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        update_table();
    }//GEN-LAST:event_jComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(StoreStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoreStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoreStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoreStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoreStaff().setVisible(true);
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
    private javax.swing.JLabel JlabelAddress;
    private javax.swing.JLabel JlabelName;
    private javax.swing.JLabel JlabelStoreID;
    private javax.swing.JLabel JlabelTransactionID1;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JComboBox<String> jComboBoxtable;
    private javax.swing.JLabel jLabelCustomer;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelLogOut;
    private javax.swing.JLabel jLabelSortAsc;
    private javax.swing.JLabel jLabelSortDesc;
    private javax.swing.JLabel jLabelStaff;
    private javax.swing.JLabel jLabelStatistics;
    private javax.swing.JLabel jLabelStore;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTransaction;
    private javax.swing.JLabel jLabelVendor;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelWhole;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableStore;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldSearchStore;
    private javax.swing.JTextField jTextFieldStoreID;
    // End of variables declaration//GEN-END:variables

}
