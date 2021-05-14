
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
public class OrderCheck extends javax.swing.JFrame {

    public OrderCheck() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Ordered = new javax.swing.JTable();
        MenuButton = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Ordered.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER_NO", "ITEMS", "AMOUNT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Ordered);

        MenuButton.setText("Refresh");
        MenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(MenuButton)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(MenuButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HomeButton)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Console a = new Console();
        a.setVisible(true);
        this.setVisible(false);
    }

    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        try{
            DefaultTableModel tbmdl1 = (DefaultTableModel)Ordered.getModel();
            tbmdl1.setRowCount(0);
       Class.forName("java.sql.Driver");    
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","circinus");
       Statement stmt = con.createStatement();
       String query="SELECT * FROM ORDERS;";
       PreparedStatement pst = con.prepareStatement(query);
       ResultSet rs=pst.executeQuery();
        while(rs.next())
        {
         String id = String.valueOf(rs.getInt("ORDER_NO"));
         String item = rs.getString("ITEMS");
         String amt = String.valueOf(rs.getDouble("AMOUNT"));
          String data[] = {id,item,amt};
          DefaultTableModel tbmdl = (DefaultTableModel)Ordered.getModel();
          tbmdl.addRow(data);
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Failed!");
        }
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
            java.util.logging.Logger.getLogger(OrderCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderCheck().setVisible(true);
            }
        });
    }

   
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton MenuButton;
    private javax.swing.JTable Ordered;
    private javax.swing.JScrollPane jScrollPane2;
    
}
