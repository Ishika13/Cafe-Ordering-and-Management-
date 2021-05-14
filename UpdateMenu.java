
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class UpdateMenu extends javax.swing.JFrame {

    
    public UpdateMenu() {
        initComponents();
        add.setVisible(false);
        upd.setVisible(false);
        del.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        b1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        menu = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        MenuFetch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        item = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        cat = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        upd = new javax.swing.JButton();
        del = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        HomeButton = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(menu);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Menu");

        MenuFetch.setText("Get Menu");
        MenuFetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFetchActionPerformed(evt);
            }
        });

        jLabel1.setText("Item:");

        jLabel2.setText("Price:");

        jLabel4.setText("Category:");

        add.setText("Add Item");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        upd.setText("Update Item");
        upd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updActionPerformed(evt);
            }
        });

        del.setText("Delete Item");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        b1.add(jRadioButton1);
        jRadioButton1.setText("Add");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        b1.add(jRadioButton2);
        jRadioButton2.setText("Update");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        b1.add(jRadioButton3);
        jRadioButton3.setText("Delete");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HomeButton))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(price))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addComponent(jRadioButton1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton2))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(add)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(del)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton3)
                                        .addComponent(upd))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(60, 60, 60))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(MenuFetch)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(del)
                            .addComponent(add)
                            .addComponent(upd))
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(HomeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MenuFetch)))
                .addContainerGap())
        );

        pack();
    }

    private void MenuFetchActionPerformed(java.awt.event.ActionEvent evt) {
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
            item.setText(items);
         String pri = String.valueOf(rs.getDouble("PRICE"));
         price.setText(pri);
         String category = rs.getString("CATEGORY");
         cat.setText(category);
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Failed!");
        }
    }

    private void updActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try
        {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","circinus");
            Statement stmt = con.createStatement();
                String i=item.getText();
                String p= price.getText();
                String c=cat.getText();
                String strSQL = "UPDATE MENU SET PRICE='"+p+"', CATEGORY='"+c+"' WHERE ITEM='"+i+"';";
                int rowsEffected = stmt.executeUpdate(strSQL);
                JOptionPane.showMessageDialog(this, "Menu Updated!");
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this,"Error!");
        }
    }

    private void addActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try
        {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","circinus");
            Statement stmt = con.createStatement();
                String i=item.getText();
                double p=Double.parseDouble(price.getText());
                String c=cat.getText();
                String strSQL = "INSERT INTO MENU VALUES ('"+i+"','"+p+"','"+c+"');";
                int rowsEffected = stmt.executeUpdate(strSQL);
                JOptionPane.showMessageDialog(this, "Menu Updated!");
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this,"Error!");
        }
    }

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        add.setVisible(true);
        upd.setVisible(false);
        del.setVisible(false);
        item.setEditable(true);
        price.setEditable(true);
        cat.setEditable(true);
        item.setText("");
        price.setText("");
        cat.setText("");
    }

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        add.setVisible(false);
        upd.setVisible(true);
        del.setVisible(false);
        item.setEditable(false);
        price.setEditable(true);
        cat.setEditable(true);
    }

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        add.setVisible(false);
        upd.setVisible(false);
        del.setVisible(true);
        item.setEditable(false);
        price.setEditable(false);
        cat.setEditable(false);
    }

    private void delActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try
        {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","circinus");
            Statement stmt = con.createStatement();
                String i=item.getText();
                String strSQL = "DELETE FROM MENU WHERE ITEM='"+i+"';";
                int rowsEffected = stmt.executeUpdate(strSQL);
                JOptionPane.showMessageDialog(this, "Menu Updated!");
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this,"Error!");
        }
    }
    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Console a = new Console();
        a.setVisible(true);
        this.setVisible(false);
    }

    private void menuMouseEntered(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(UpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMenu().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton MenuFetch;
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup b1;
    private javax.swing.JTextField cat;
    private javax.swing.JButton del;
    private javax.swing.JTextField item;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable menu;
    private javax.swing.JTextField price;
    private javax.swing.JButton upd;
    
}
