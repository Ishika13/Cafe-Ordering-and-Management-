
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;


public class TakeOrder extends javax.swing.JFrame {

   
    public TakeOrder() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    double bill=0;
    String itemz="";
   
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        menu = new javax.swing.JTable();
        ITEM = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderz = new javax.swing.JTable();
        QTY = new javax.swing.JTextField();
        AddItemButton = new javax.swing.JButton();
        PlaceOrderButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MenuButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        FinalBill = new javax.swing.JLabel();
        NewOrderButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM", "PRICE", "CATEGORY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(menu);

        ITEM.setEditable(false);

        orderz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM", "QTY", "PRICE", "AMOUNT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderz);

        AddItemButton.setText("Add");
        AddItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemButtonActionPerformed(evt);
            }
        });

        PlaceOrderButton.setText("Place Order");
        PlaceOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Item:");

        jLabel2.setText("Qty:");

        MenuButton.setText("Menu");
        MenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Total Bill:");

        NewOrderButton.setText("New Order");
        NewOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewOrderButtonActionPerformed(evt);
            }
        });

        HomeButton.setText("Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(QTY, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(ITEM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AddItemButton)
                        .addGap(75, 75, 75)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(MenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PlaceOrderButton)
                .addGap(201, 201, 201))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NewOrderButton)
                .addGap(107, 107, 107)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(FinalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
            .addGroup(layout.createSequentialGroup()
                .addComponent(HomeButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(HomeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ITEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(88, 88, 88)
                        .addComponent(AddItemButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(PlaceOrderButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MenuButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(NewOrderButton))
                    .addComponent(FinalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        try{
            int row = menu.getSelectedRow();
            String clk = (menu.getModel().getValueAt(row,0).toString());
            Class.forName("java.sql.Driver");    
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","circinus");
       Statement stmt = con.createStatement();
       String query="SELECT * FROM MENU WHERE ITEM='"+clk+"';";
       PreparedStatement pst = con.prepareStatement(query);
       ResultSet rs=pst.executeQuery();
        while(rs.next())
        {
            String items = rs.getString("ITEM");
            ITEM.setText(items);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Failed!");
        }
    }

    private void AddItemButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try{
            String item = ITEM.getText();
       Class.forName("java.sql.Driver");    
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","circinus");
       Statement stmt = con.createStatement();
       String query="SELECT * FROM MENU WHERE ITEM='"+item+"';";
       PreparedStatement pst = con.prepareStatement(query);
       ResultSet rs=pst.executeQuery();
        if(rs.next())
        {
         String price = String.valueOf(rs.getDouble("PRICE"));
         int q = Integer.parseInt(QTY.getText());
         String qt = QTY.getText();
         double amount=q*rs.getDouble("PRICE");
         String am = String.valueOf(amount);
         bill = bill + amount;
         itemz = itemz + item + "("+qt+"), "; 
          String data[] = {item,qt,price,am};
          DefaultTableModel tbmdl = (DefaultTableModel)orderz.getModel();
          tbmdl.addRow(data);
        }
        FinalBill.setText(""+bill);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Failed!");
        }
        
    }


    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
         try{
            DefaultTableModel tbmdl1 = (DefaultTableModel)menu.getModel();
            tbmdl1.setRowCount(0);
       Class.forName("java.sql.Driver");    
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","circinus");
       Statement stmt = con.createStatement();
       String query="SELECT * FROM MENU;";
       PreparedStatement pst = con.prepareStatement(query);
       ResultSet rs=pst.executeQuery();
        while(rs.next())
        {
         String item = rs.getString("ITEM");
         String price = String.valueOf(rs.getDouble("PRICE"));
         String category = rs.getString("CATEGORY");
          String data[] = {item,price,category};
          DefaultTableModel tbmdl = (DefaultTableModel)menu.getModel();
          tbmdl.addRow(data);
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Failed!");
        }
    }

    private void PlaceOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try{
       Class.forName("java.sql.Driver");    
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","circinus");
       Statement stmt = con.createStatement();
        String strSQL= "INSERT INTO ORDERS (ITEMS,AMOUNT) VALUES ('"+itemz+"','"+bill+"')";
        int rowsEffected = stmt.executeUpdate(strSQL);
        JOptionPane.showMessageDialog(this,"Order Placed!\n\n Total Amount: Rs:"+bill+"/-");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Order Failed!");
        }
    }

    private void NewOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        bill = 0;
        itemz = "";
        DefaultTableModel tbmdl1 = (DefaultTableModel)menu.getModel();
            tbmdl1.setRowCount(0);
        DefaultTableModel tbmdl2 = (DefaultTableModel)orderz.getModel();
            tbmdl2.setRowCount(0);
        ITEM.setText("");
        QTY.setText("");
        FinalBill.setText("");
    }

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Console a = new Console();
        a.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TakeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeOrder().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton AddItemButton;
    private javax.swing.JLabel FinalBill;
    private javax.swing.JButton HomeButton;
    private javax.swing.JTextField ITEM;
    private javax.swing.JButton MenuButton;
    private javax.swing.JButton NewOrderButton;
    private javax.swing.JButton PlaceOrderButton;
    private javax.swing.JTextField QTY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable menu;
    private javax.swing.JTable orderz;
    
}
