import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Guest{
String name,add;
int no;
String tor;

/*Guest(String name, String add, int no, String tor){
this.name=name;
this.add=add;
this.tor=tor;
this.no=no;
}*/
}

class GUI{
JFrame jf;
JTextField t1,t2;
JTextArea ta1;
JComboBox<String> jb1;
JButton b1;
ArrayList<Guest> al;

GUI(){
jf=new JFrame("ROOM BOOKING");
t1=new JTextField("Enter name",20);
t2=new JTextField("Enter no. of occupants",5);
ta1=new JTextArea("Enter address",20,5);
String s[]={"Single","Double","Suite"};
jb1=new JComboBox<String>(s);
b1=new JButton("Submit");
al=new ArrayList<Guest>();
JLabel l1= new JLabel("Welcome to Hotel Room Management");
jf.setLayout(new FlowLayout());
jf.setSize(350,600);
jf.add(l1);
jf.add(t1);
jf.add(t2);
jf.add(ta1);
jf.add(jb1);
jf.add(b1);
t1.addFocusListener(new FocusAdapter(){
public void focusGained(FocusEvent fe){
t1.setText("");
}});
t2.addFocusListener(new FocusAdapter(){
public void focusGained(FocusEvent fe){
t2.setText("");
}});
ta1.addFocusListener(new FocusAdapter(){
public void focusGained(FocusEvent fe){
ta1.setText("");
}});
jf.setVisible(true);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
Guest g=new Guest();
g.name=t1.getText();
g.no=Integer.parseInt(t2.getText());
g.add=ta1.getText();
g.tor=(String)jb1.getSelectedItem();
try{
if(g.name.isEmpty()||g.add.isEmpty()||g.tor.isEmpty()|| t2.getText().isEmpty()){
throw new EmptyException("Enter all the Details");
}

else if(g.tor.equals("Single") && g.no>1){
throw new OccupancyException("Single room cannot accommodate more than 1 occupant");
}

else{
al.add(g);
JOptionPane.showMessageDialog(jf, "Guest details saved successfully");
}
}
catch (NumberFormatException ex) {
JOptionPane.showMessageDialog(jf, "Please enter a valid number for occupants");
}
catch(OccupancyException ex){
JOptionPane.showMessageDialog(jf, ex.getMessage());
}
catch(EmptyException ex){
JOptionPane.showMessageDialog(jf, ex.getMessage());
}
}});
}

}

class OccupancyException extends Exception {
    public OccupancyException(String message) {
        super(message);
    }
}

class EmptyException extends Exception {
    public EmptyException(String message) {
        super(message);
    }
}

class Hotel{
public static void main(String[] args) {
        new GUI();
    }
}