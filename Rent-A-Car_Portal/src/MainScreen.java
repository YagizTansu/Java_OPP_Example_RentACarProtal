import java.util.ArrayList;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ctans
 */
class Car{
    private String car_ıd ;
    private String brand ;
    private String model ;
    private String color ;
    private String motor_power ;
    private int daily_rent_price ;
    private boolean available ;

    public Car(String car_ıd, String brand, String model, String color, String motor_power, int daily_rent_price, boolean available) {
        this.car_ıd = car_ıd;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.motor_power = motor_power;
        this.daily_rent_price = daily_rent_price;
        this.available = available;
    }

    
    
    public String getCar_ıd() {
        return car_ıd;
    }

    public void setCar_ıd(String car_ıd) {
        this.car_ıd = car_ıd;
    }

    
    
    public Car(String brand, String model, String color, String motor_power, int daily_rent_price, boolean available) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.motor_power = motor_power;
        this.daily_rent_price = daily_rent_price;
        this.available = available;
    }
    
    

    public Car(String brand, String model, String color, String motor_power, int daily_rent_price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.motor_power = motor_power;
        this.daily_rent_price = daily_rent_price;
       
    }

    public Car() {
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

   

    
    
    public String getMotor_power() {
        return motor_power;
    }

    public void setMotor_power(String motor_power) {
        this.motor_power = motor_power;
    }

    public int getDaily_rent_price() {
        return daily_rent_price;
    }

    public void setDaily_rent_price(int daily_rent_price) {
        this.daily_rent_price = daily_rent_price;
    }

    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
}

class User {
    private String user_Id ;
    private String user_name ;
    private String password ;
    private String user_mobil_no ;
    private String home_adress ;
    private int _user_credit ;

    public User(String user_Id, String user_name, String password, String user_mobil_no, String home_adress, int _user_credit) {
        this.user_Id = user_Id;
        this.user_name = user_name;
        this.password = password;
        this.user_mobil_no = user_mobil_no;
        this.home_adress = home_adress;
        this._user_credit = _user_credit;
    }

    
    public User(String user_Id, String user_name, String password, String user_mobil_no, String home_adress) {
        this.user_Id = user_Id;
        this.user_name = user_name;
        this.password = password;
        this.user_mobil_no = user_mobil_no;
        this.home_adress = home_adress;
    }

    public User(String user_name, String password, String user_mobil_no, String home_adress) {
        this.user_name = user_name;
        this.password = password;
        this.user_mobil_no = user_mobil_no;
        this.home_adress = home_adress;
    }

    public int getUser_credit() {
        return _user_credit;
    }

    public void setUser_credit(int _user_credit) {
        this._user_credit = _user_credit;
    }
    
    
    
    public User(String user_name, String password) {
        this.user_name = user_name;
        this.password = password;
    }

    
   
    public String getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(String user_Id) {
        this.user_Id = user_Id;
    }

    

    public String getUser_mobil_no() {
        return user_mobil_no;
    }

    public void setUser_mobil_no(String user_mobil_no) {
        this.user_mobil_no = user_mobil_no;
    }

    public String getHome_adress() {
        return home_adress;
    }

    public void setHome_adress(String home_adress) {
        this.home_adress = home_adress;
    }
    
    
    

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    Object getUser_name(JTextField user_name_text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}

public class MainScreen extends javax.swing.JFrame {
     
    private static ArrayList<Car> cars = new ArrayList<Car>();
    
    
    public static ArrayList<Car> getCars() {
        return cars;
    }

    public static void setCars(ArrayList<Car> cars) {
        MainScreen.cars = cars;
    }

    
    
       
    private static ArrayList<User> user_list = new ArrayList<User>();
    public static ArrayList<User> getUser_list() {
        return user_list;
    }

    public static void setUser_list(ArrayList<User> user_list) {
        MainScreen.user_list = user_list;
    }
    

    
    
    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rentacarphotopanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        useroradmınpanel = new javax.swing.JPanel();
        adminbutton = new javax.swing.JButton();
        userbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rentacarphotopanel.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 54)); // NOI18N
        jLabel1.setText("CAR RENTAL PORTAL");

        javax.swing.GroupLayout rentacarphotopanelLayout = new javax.swing.GroupLayout(rentacarphotopanel);
        rentacarphotopanel.setLayout(rentacarphotopanelLayout);
        rentacarphotopanelLayout.setHorizontalGroup(
            rentacarphotopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentacarphotopanelLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rentacarphotopanelLayout.setVerticalGroup(
            rentacarphotopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentacarphotopanelLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        useroradmınpanel.setBackground(new java.awt.Color(102, 0, 0));

        adminbutton.setText("ADMIN");
        adminbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbuttonActionPerformed(evt);
            }
        });

        userbutton.setText("USER");
        userbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout useroradmınpanelLayout = new javax.swing.GroupLayout(useroradmınpanel);
        useroradmınpanel.setLayout(useroradmınpanelLayout);
        useroradmınpanelLayout.setHorizontalGroup(
            useroradmınpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(useroradmınpanelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(adminbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(userbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        useroradmınpanelLayout.setVerticalGroup(
            useroradmınpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(useroradmınpanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(useroradmınpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rentacarphotopanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(useroradmınpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rentacarphotopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(useroradmınpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbuttonActionPerformed
       
        AdminScreen adminscreen = new AdminScreen(); 
        adminscreen.setVisible(true);
        
    }//GEN-LAST:event_adminbuttonActionPerformed

    private void userbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userbuttonActionPerformed
        UserScreen usersucreen = new UserScreen(); 
        usersucreen.setVisible(true);
    }//GEN-LAST:event_userbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        ArrayList<Car> car_list = MainScreen.getCars() ;
        car_list.add(new Car("1","OPEL","CORSA","GRAY","1.3",100,true));
        car_list.add(new Car("2","OPEL","Astra","Black","1.6",150,true));
        car_list.add(new Car("3","BMW","320d","WHITE","2.0",100,true));
        car_list.add(new Car("4","MERCEDES","A180","Black","1.6",300,true));
        car_list.add(new Car("5","MERCEDES","C200","RED","1.3",250,true));
        car_list.add(new Car("6","HONDA","CIVIC","Black","1.6",200,true));
        car_list.add(new Car("7","HYUNDAI","İ20","WHITE","1.4",110,true));
        car_list.add(new Car("8","OPEL","Astra","Black","1.6",140,true));
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel rentacarphotopanel;
    private javax.swing.JButton userbutton;
    private javax.swing.JPanel useroradmınpanel;
    // End of variables declaration//GEN-END:variables
}
