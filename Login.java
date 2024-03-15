package project_Hotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JTextField  textField1;

    JPasswordField passwordField1;

    JButton b1,b2;
    public Login(){
        //text visible
        JLabel label1 = new JLabel("Username");
        label1.setBounds(40,20,100,30);
        label1.setFont(new Font("Tahoma", Font.BOLD,16));
        //text color set
        label1.setForeground(Color.WHITE);
        add(label1);



        JLabel label2 = new JLabel("Password");
        label2.setBounds(40,70,100,30);
        label2.setFont(new Font("Tahoma", Font.BOLD,16));
        label2.setForeground(Color.WHITE);
        add(label2);

        textField1 = new JTextField();
        textField1.setBounds(150,20,150,30);
        textField1.setForeground(Color.BLACK);
        textField1.setFont(new Font("Tahoma",Font.PLAIN,15));
        add(textField1);


        passwordField1 = new JPasswordField();
        passwordField1.setBounds(150,70,150,30);
        passwordField1.setForeground(Color.BLACK);
        passwordField1.setFont(new Font("Tahoma",Font.PLAIN,15));
        add( passwordField1);


        //image fetch
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/log.jpg"));
        Image i1 = imageIcon.getImage().getScaledInstance(255,280,Image.SCALE_DEFAULT);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(318,-9,255,280);
        add(label);

        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);


        b2 = new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);






         //color set
        getContentPane().setBackground(new Color(100, 220, 229));
        setLayout(null);
        setLocation(400,270);
        setSize(600,300);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            try{
                Conn c = new Conn();
                // accec login user password;
                String user = textField1.getText();
                String pass = passwordField1.getText();


                String q = "Select * from login where username='"+user+"' and password = '" + pass+"'";
                ResultSet  resultSet = c.stm.executeQuery(q);
                if(resultSet.next()){
                   new DashBoard();
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null , "Invalid user password ");
                }


            }catch(Exception a){
                a.printStackTrace();
            }

        }else{
            System.exit(0);
        }

    }
    public static void main(String[] args){
    new Login();

    }
}
