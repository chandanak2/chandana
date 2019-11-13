package ajproj;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class welcome extends JFrame implements ActionListener
{
/**
*
*/
private static final long serialVersionUID = 1L;
JFrame frame2;
JButton btn1 = new JButton("Login");




JTextArea txt = new JTextArea(5,5);

public welcome()
{
createWindow();
setLocationAndSize();
addComponentsToFrame();
actionEvent();
}
public void createWindow()

{
frame2 = new JFrame("Welcome to Dayananda Sagar");
frame2.setSize(500,500);


txt.setVisible(true);
txt.setForeground(Color.blue);
txt.setFont(new Font("Arial", Font.BOLD, 20));
txt.setText("The Dayananda Sagar College of Engineering was established in 1979,"
+ " was founded by Late Sri R Dayananda Sagar and "
+ "is run by the Mahatma Gandhi Vidya Peetha Trust (MGVP). It started with the basic courses"
+ " of Civil, Mechanical, Electrical and Electronics Engineering. The college offeres undergraduate"
+ ", Post-graduates and doctoral programmes under Visvesvaraya Technological University"
);
txt.setLineWrap(true);
txt.setWrapStyleWord(true);
frame2.getContentPane().setBackground(Color.white);
frame2.getContentPane().setLayout(null);
frame2.setVisible(true);
frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame2.setResizable(true);

}
public void setLocationAndSize()
{


btn1.setBounds(10, 400, 100, 30);


txt.setBounds(10, 50, 300, 500);
}
public void addComponentsToFrame()
{
frame2.add(btn1);



frame2.add(txt);

}
public void actionEvent()
{
btn1.addActionListener(this);

}
public void actionPerformed(ActionEvent e)
{
frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

frame2.getContentPane().add(btn1);
btn1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
frame2.dispose();
new Login();
}
});
{
public void actionPerformed(ActionEvent ae) {
frame2.dispose();
new registration();
}
};
// frame2.setSize(400,400);
// frame2.setVisible(true);
}
public static void main(String args[])
{
new welcome();
}
}