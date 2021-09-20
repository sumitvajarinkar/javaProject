package myjavaproject;

import java.sql.*;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.PreparedStatement;
//import java.sql.ResultSetMetaData;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Group1
 **/

// To enter Book book_entry extends from JFrame
public class book_entry extends javax.swing.JFrame {

    //Book entry calls book_shelf to add book in Table 
    public book_entry() {
        //User choice to create, update, delete data
        initComponents();
        //Call to insert data in book shelf
        book_shelf();
    }

    //Code for JFrame by IDE
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bname = new javax.swing.JTextField();
        bauthor = new javax.swing.JTextField();
        bprice = new javax.swing.JTextField();
        bsave = new javax.swing.JButton();
        bclear = new javax.swing.JButton();
        bexit = new javax.swing.JButton();
        bdelete = new javax.swing.JButton();
        bupdate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookshelf = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        bprice1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bprice2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        bid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Book Shop");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(608, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(539, 539, 539))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 70));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Entry", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Book name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Author name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Price");

        bauthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bauthorActionPerformed(evt);
            }
        });

        bprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpriceActionPerformed(evt);
            }
        });

        bsave.setBackground(new java.awt.Color(51, 255, 0));
        bsave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bsave.setForeground(new java.awt.Color(0, 0, 0));
        bsave.setText("Save");
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });

        bclear.setBackground(new java.awt.Color(51, 204, 255));
        bclear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bclear.setForeground(new java.awt.Color(0, 0, 0));
        bclear.setText("Clear");
        bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bclearActionPerformed(evt);
            }
        });

        bexit.setBackground(new java.awt.Color(255, 255, 102));
        bexit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bexit.setForeground(new java.awt.Color(0, 0, 0));
        bexit.setText("Exit");
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(bsave)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bname, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bauthor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(bprice, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(bexit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(bclear)))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bprice, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bexit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bclear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 400, 400));

        bdelete.setBackground(new java.awt.Color(255, 51, 102));
        bdelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bdelete.setForeground(new java.awt.Color(0, 0, 0));
        bdelete.setText("Delete");
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(bdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 500, 100, 60));

        bupdate.setBackground(new java.awt.Color(51, 102, 255));
        bupdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bupdate.setForeground(new java.awt.Color(0, 0, 0));
        bupdate.setText("Update");
        bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupdateActionPerformed(evt);
            }
        });
        getContentPane().add(bupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 110, 60));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Shelf", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 0, 255))); // NOI18N

        bookshelf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookshelf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Author", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        bookshelf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookshelfMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookshelf);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 910, 400));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Price");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bprice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprice1ActionPerformed(evt);
            }
        });
        getContentPane().add(bprice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bprice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprice2ActionPerformed(evt);
            }
        });
        getContentPane().add(bprice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 153, 51))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Book ID");

        bid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bidActionPerformed(evt);
            }
        });
        bid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bidKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(bid, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bid)
                        .addGap(4, 4, 4))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 420, 120));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
            
//Variable declared
            Connection con;
            PreparedStatement insert;

//To fetch data from database to JTable - book_shelf           
      private void book_shelf(){
          //Variable declared
          int c;
            try {
            
            //Database connection
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/myshop","root","");
            
            //Query to select data on server
            insert=con.prepareStatement("select * from mybook");
            
            //Add data in Book shelf 
            ResultSet rs=insert.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
            
            //column count assign to c
            c=rsmd.getColumnCount();
            
            //Fetch data from server to book shelf
            DefaultTableModel df=(DefaultTableModel)bookshelf.getModel();
            df.setRowCount(0);
           
                while(rs.next()){
                
                    Vector v=new Vector();
                    for(int i=1;i<=c;i++){
                        v.add(rs.getString("id"));
                        v.add(rs.getString("name"));
                        v.add(rs.getString("author"));
                        v.add(rs.getString("price"));
                    }
                    df.addRow(v);
                }
            
            //To clear the text field after adding book
            bname.setText("");
            bauthor.setText("");
            bprice.setText("");
            
            //Cursor on name 
            bname.requestFocus();
            
        } 
            catch (ClassNotFoundException ex) {
            Logger.getLogger(book_entry.class.getName()).log(Level.SEVERE, null, ex);
        } 
            catch (SQLException ex) {
            Logger.getLogger(book_entry.class.getName()).log(Level.SEVERE, null, ex);
        }
                
       }
            
            
 //Additional actions - not used    
    private void bauthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bauthorActionPerformed

    }//GEN-LAST:event_bauthorActionPerformed

//To delete data in JTable after searching
    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        
        //Variable declared
        String id=bid.getText();
        
            try {
                
            //Database connection
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/myshop","root","");
            
            //Query to delete data on server
            insert=con.prepareStatement("delete from mybook where id=?");
            insert.setString(1,id);
            insert.executeUpdate();
            
            //if book add in database
            JOptionPane.showMessageDialog(this,"Book deleted !");
            
            //if book added successfully in database then it will display in Book Shelf
            //call for book shelf
            book_shelf();
            
            //To clear the text field after adding book
            bname.setText("");
            bauthor.setText("");
            bprice.setText("");
            
            //Cursor on name 
            bname.requestFocus();
            
        } 
            
        //Exception handling
            catch (ClassNotFoundException ex) {
            Logger.getLogger(book_entry.class.getName()).log(Level.SEVERE, null, ex);
        } 
            catch (SQLException ex) {
            Logger.getLogger(book_entry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bdeleteActionPerformed

//To save the data in database
    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        
            //Variables declared
            String name,author,price;
            name=bname.getText();
            author=bauthor.getText();
            price=bprice.getText();
           
            
            try {
            
            //Database connection
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/myshop","root","");
            
            //Query to insert data on server
            insert=con.prepareStatement("insert into mybook(name,author,price) values(?,?,?)");
            insert.setString(1,name);
            insert.setString(2,author);
            insert.setString(3,price);
            insert.executeUpdate();
            
            //if book add in database
            JOptionPane.showMessageDialog(this,"Book added !");
            
            //if book added successfully in database then it will display in Book Shelf
            //call for book shelf
            book_shelf();
            
            //To clear the text field after adding book
            bname.setText("");
            bauthor.setText("");
            bprice.setText("");
            
            //Cursor on name 
            bname.requestFocus();
            
        } 
        
         //Exception handling
            catch (ClassNotFoundException ex) {
            Logger.getLogger(book_entry.class.getName()).log(Level.SEVERE, null, ex);
        } 
            catch (SQLException ex) {
            Logger.getLogger(book_entry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bsaveActionPerformed

//To update data in textfield after selecting from table
    private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
        
        //Variables declared
        String name,author,price,id;
            name=bname.getText();
            author=bauthor.getText();
            price=bprice.getText();
            id=bid.getText();
           
            
            try {
                
             //Database connection
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/myshop","root","");
            
            //Query to update data on server
            insert=con.prepareStatement("update mybook set name=?,author=?,price=? where id=?");
            insert.setString(1,name);
            insert.setString(2,author);
            insert.setString(3,price);
            insert.setString(4,id);
            insert.executeUpdate();
            
            //if book update in database
            JOptionPane.showMessageDialog(this,"Book updated !");
            
            //if book updated successfully in database then it will display in Book Shelf
            //call for book shelf
            book_shelf();
            
            //To clear the text field after updating book
            bname.setText("");
            bauthor.setText("");
            bprice.setText("");
            
            //Cursor on name 
            bname.requestFocus();
            
        }
         //Exception handling
            catch (ClassNotFoundException ex) {
            Logger.getLogger(book_entry.class.getName()).log(Level.SEVERE, null, ex);
        } 
            catch (SQLException ex) {
            Logger.getLogger(book_entry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bupdateActionPerformed

 //Additional actions - not used    
    private void bookshelfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookshelfMouseClicked

    }//GEN-LAST:event_bookshelfMouseClicked

    private void bpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpriceActionPerformed

    }//GEN-LAST:event_bpriceActionPerformed

    private void bprice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprice1ActionPerformed
   
    }//GEN-LAST:event_bprice1ActionPerformed

    private void bprice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprice2ActionPerformed
 
    }//GEN-LAST:event_bprice2ActionPerformed

    
// To clear the book entry 
    private void bclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bclearActionPerformed
       //To clear the text field after adding book
            bname.setText("");
            bauthor.setText("");
            bprice.setText("");
            
            //Cursor on name 
            bname.requestFocus();
    }//GEN-LAST:event_bclearActionPerformed

// To exit the window
    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed
        System.exit(0);    
    }//GEN-LAST:event_bexitActionPerformed
 
//Additional actions - not used    
    private void bidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bidActionPerformed

    }//GEN-LAST:event_bidActionPerformed

// To search book ID from JTable and display it in Text fields
    private void bidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bidKeyReleased
        
        try{
            //Variables declared
            String id=bid.getText();
            
            //Query to select data on server
            insert=con.prepareStatement("select name,author,price from mybook where id=?");
            insert.setString(1,id);
            ResultSet rs=insert.executeQuery();
            
            //if book add in database
            JOptionPane.showMessageDialog(this,"Fetching book in entry !");
            
            //if data found
            if(rs.next()==true)
            {
            String name=rs.getString(1);
            String author=rs.getString(2);
            String price=rs.getString(3);
            
             bname.setText(name);
             bauthor.setText(author);
             bprice.setText(price);

            }
            
            //if data not found clear the text field
            else{
             bname.setText("");
             bauthor.setText("");
             bprice.setText("");
             bid.setText("");
            }
        } 
        
        //Exception handling
            catch (SQLException ex) {
            Logger.getLogger(book_entry.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_bidKeyReleased

// Main function
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(book_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(book_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(book_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(book_entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                //User enter new book call the function book_entry
                new book_entry().setVisible(true);
            }
        });
    }

// Variables declared by IDE JForm
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bauthor;
    private javax.swing.JButton bclear;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bexit;
    private javax.swing.JTextField bid;
    private javax.swing.JTextField bname;
    private javax.swing.JTable bookshelf;
    private javax.swing.JTextField bprice;
    private javax.swing.JTextField bprice1;
    private javax.swing.JTextField bprice2;
    private javax.swing.JButton bsave;
    private javax.swing.JButton bupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
