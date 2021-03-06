package student_0.pkg1;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 *   @author Xhelion Brakaj
 */
public class StudentLogin extends javax.swing.JFrame {


    public StudentLogin() {
        initComponents();
        table_update();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    Connection con1;
    PreparedStatement insert;
    
    //function that updates the table
    private void table_update(){
        
        int call;
        
        try {
            
           Class.forName("com.mysql.cj.jdbc.Driver");
            
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/student0.1","root","");
         insert = con1.prepareStatement("select * from record");
            ResultSet rs = insert.executeQuery();
            
            java.sql.ResultSetMetaData Rss = rs.getMetaData();
           call = Rss.getColumnCount();
           
           DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
            Df.setRowCount(0);
            
            while(rs.next()){
                
                Vector vex = new Vector();
                
                for(int i = 1;i<=call;i++){
                    
                    vex.add(rs.getString("id"));
                    vex.add(rs.getString("name"));
                    vex.add(rs.getString("program"));
                    vex.add(rs.getString("gpa"));
                 
                }
                
                Df.addRow(vex); 
            }
            

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        editUser = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        addUser = new javax.swing.JButton();
        programUser = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        gpaUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(227, 223, 223));

        jPanel2.setBackground(new java.awt.Color(149, 169, 249));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(104, 224, 224));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 35)); // NOI18N
        jLabel1.setText("Student Registration System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Program");

        txtUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(149, 169, 249), 3, true));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        editUser.setBackground(new java.awt.Color(132, 132, 239));
        editUser.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        editUser.setText("Edit User");
        editUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserActionPerformed(evt);
            }
        });

        deleteUser.setBackground(new java.awt.Color(255, 51, 51));
        deleteUser.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        deleteUser.setText("Delete");
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });

        addUser.setBackground(new java.awt.Color(0, 153, 0));
        addUser.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        addUser.setText("Add User");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        programUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(149, 169, 249), 3, true));
        programUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programUserActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(149, 169, 249));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Username", "Program", "GPA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("GPA");

        gpaUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(149, 169, 249), 3, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUser)
                                    .addComponent(programUser)
                                    .addComponent(gpaUser, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(deleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(editUser, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(129, 129, 129)
                                        .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editUser)
                    .addComponent(deleteUser))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(programUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(gpaUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(775, 685));
        setLocationRelativeTo(null);
    }// </editor-fold>                        
    //adding the new user function
    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
        String name = txtUser.getText();
        String program = programUser.getText();
        String gpa = gpaUser.getText();
  
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/student0.1","root","");
         
            insert = con1.prepareStatement("insert into record(name,program,gpa)values(?,?,?)");
            insert.setString(1, name);
            insert.setString(2, program);
            insert.setString(3, gpa);
            
            insert.executeUpdate();
            
            table_update();
            JOptionPane.showMessageDialog(this,"Record Addedd succesfully!");
            
            
            txtUser.setText("");
            programUser.setText("");
            gpaUser.setText("");
            
            txtUser.requestFocus();
                 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }                                       

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // nothing...
    }                                       

    private void programUserActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // nothing...
    }                                           

    
    //editing the existing user data
    private void editUserActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
       DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
      int selectedIndex = jTable1.getSelectedRow();
      
              try {
                  
                  int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
                String name = txtUser.getText();
                String program = programUser.getText();
                String gpa = gpaUser.getText();

            
            Class.forName("com.mysql.jdbc.Driver");
            
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/student0.1","root","");
         
            insert = con1.prepareStatement("update record set name= ?,program= ?,gpa= ? where id=? ");
            insert.setString(1, name);
            insert.setString(2, program);
            insert.setString(3, gpa);
            insert.setInt(4, id);
            
            insert.executeUpdate();
            
            table_update();
            JOptionPane.showMessageDialog(this,"Updated!");
            
            
            txtUser.setText("");
            programUser.setText("");
            gpaUser.setText("");
            
            txtUser.requestFocus();
                
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }                                        

    //selecting the user function
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     


      DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
      int selectedIndex = jTable1.getSelectedRow();
      txtUser.setText(Df.getValueAt(selectedIndex, 1).toString());
      programUser.setText(Df.getValueAt(selectedIndex, 2).toString());
      gpaUser.setText(Df.getValueAt(selectedIndex, 3).toString());
          
    }                                    

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
      int selectedIndex = jTable1.getSelectedRow();
      try {
 
                  int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
                  
                  int dialogResult = JOptionPane.showConfirmDialog(null, "You are going to delete the record","Warning",JOptionPane.YES_NO_CANCEL_OPTION);
                  
                 if(dialogResult == JOptionPane.YES_OPTION){
                          Class.forName("com.mysql.jdbc.Driver");
                          con1 = DriverManager.getConnection("jdbc:mysql://localhost/student0.1","root","");
                          insert = con1.prepareStatement("delete from record where id=?");
                          insert.setInt(1, id);
                          insert.executeUpdate();
            
                          table_update();
                          JOptionPane.showMessageDialog(this,"Deleted!");
            
            
            
            txtUser.setText("");
            programUser.setText("");
            gpaUser.setText("");
            
            txtUser.requestFocus();
            
                 }
   
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }                                          

    
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
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        // displaying the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton addUser;
    private javax.swing.JButton deleteUser;
    private javax.swing.JButton editUser;
    private javax.swing.JTextField gpaUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField programUser;
    private javax.swing.JTextField txtUser;
    // End of variables declaration                   
}
