package project_Hotel;

import javax.swing.*;

public class MainS extends JFrame {
   public  MainS(){
       //image fetch  and store imageIcon
       ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/ImgHotel.jpeg"));
       JLabel label = new JLabel(imageIcon);
       label.setBounds(0,0,858,680);
       add(label);


       //Frame set
       setSize(858,680);
       setLayout(null);
       setLocation(300,80);
       //Show frame;
       setVisible(true);

       try{
           Thread.sleep(5000);
           new Login();
           setVisible(false);

       }catch (Exception e){
           e.printStackTrace();
       }
   }

    public static void main(String[] args){
       new MainS();



    }
}
