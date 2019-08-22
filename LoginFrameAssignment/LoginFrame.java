import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
 class LoginFrame extends JFrame implements ActionListener {
 
    Container container=getContentPane();
    JLabel userLabel=new JLabel("NAME");
    JLabel rollnoLabel=new JLabel("ROLL NO:");
    JLabel emailLabel=new JLabel("EMAIL");
    JLabel passwordLabel=new JLabel("PASSWORD");
    JLabel cityLabel=new JLabel("CITY");
    JTextField userTextField=new JTextField();
    JTextField rollnoTextField=new JTextField();
    JTextField emailTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JTextField cityTextField=new JTextField();
    JButton saveButton=new JButton("SAVE");
    JButton clearButton=new JButton("CLEAR");
    JCheckBox showPassword=new JCheckBox("Show");
 
 
    LoginFrame()
    {
       //Calling methods inside constructor.
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        
 
    }
   public void setLayoutManager()
   {
       container.setLayout(null);
   }
   public void setLocationAndSize()
   {
       //Setting location and Size of each components using setBounds() method.
       userLabel.setBounds(50,150,100,40);
       rollnoLabel.setBounds(50,190,120,40);
       emailLabel.setBounds(50,220,140,40);
       passwordLabel.setBounds(50,250,160,40);
       cityLabel.setBounds(50,320,180,40);
       userTextField.setBounds(150,150,100,30);
       rollnoTextField.setBounds(150,190,100,30);
       emailTextField.setBounds(150,230,100,30);
       passwordField.setBounds(150,270,100,30);
       showPassword.setBounds(150,298,100,30);
       cityTextField.setBounds(150,330,100,30);
       saveButton.setBounds(50,390,100,30);
       clearButton.setBounds(230,390,100,30);
 

   }
   public void addComponentsToContainer()
   {
      //Adding each components to the Container
       container.add(userLabel);
       container.add(rollnoLabel);
       container.add(emailLabel);
       container.add(passwordLabel);
       container.add(cityLabel);
       container.add(userTextField);
       container.add(rollnoTextField);
       container.add(emailTextField);
       container.add(passwordField);
       container.add(showPassword);
       container.add(cityTextField);
       container.add(saveButton);
       container.add(clearButton);
   }
 
 
    @Override
    public void actionPerformed(ActionEvent e) {
 
    }

    public static void main(String[] args){
        LoginFrame frame=new LoginFrame();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(30,30,570,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true );
 
    }
 
}