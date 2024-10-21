import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

interface Bank{
void deposit(double amo);
    void withdrawl(double amo) throws InsufficientFundException;
    double checkBal();
}

class Customer implements Bank{
String name;
int acno;
double bal;

Customer(String name,int acno,double bal){
this.name=name;
this.acno=acno;
this.bal=bal;
}
public void deposit(double amo){
bal+=amo;
}

public void withdrawl(double amo) throws InsufficientFundException{
if(amo>bal){
throw new InsufficientFundException("Insufficient funds");
}
else
bal-=amo;
}

public double checkBal(){
return bal;
}

public String toString(){
return "Customer{Name: "+name+" |Ac No.: "+acno+" |Balance: "+bal+"}"; 
}
}

class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class BankDemo{
ArrayList<Customer> cl=new ArrayList<Customer>();

public void addCustomer(Customer c){
cl.add(c);
}

public void deposit(int ac,double am){
for(Customer c:cl){
if(c.acno==ac)
c.deposit(am);
}
}

public void withdrawl(int ac,double am) throws InsufficientFundException {
for(Customer c:cl){
if(c.acno==ac)
c.withdrawl(am);
}
}

public double checkBal(int ac){
for(Customer c:cl){
if(c.acno==ac)
return c.checkBal();
}
return -1;
}

}

class GUI{
JFrame jf;
JTextField t1,t2,t3;
JTextArea ta1;
JButton b1,b2,b3,b4,b5;
BankDemo bd;

GUI(){
jf=new JFrame("BANK");
t1=new JTextField("Enter name",20);
t2=new JTextField("Enter Account no.",20);
t3=new JTextField("Enter amount",20);
b1=new JButton("ADD CUSTOMER");
b2=new JButton("DEPOSIT");
b3=new JButton("WITHDRAWL");
b4=new JButton("CHECK BALANCE");
b5=new JButton("DISPLAY");
ta1=new JTextArea(20,30);
jf.setLayout(new FlowLayout());
jf.setSize(350,600);
jf.add(t1);
jf.add(t2);
jf.add(t3);
jf.add(ta1);
jf.add(b1);
jf.add(b2);
jf.add(b3);
jf.add(b4);
jf.add(b5);
t1.addFocusListener(new FocusAdapter(){
public void focusGained(FocusEvent fe){
t1.setText("");
}});
t2.addFocusListener(new FocusAdapter(){
public void focusGained(FocusEvent fe){
t2.setText("");
}});
t3.addFocusListener(new FocusAdapter(){
public void focusGained(FocusEvent fe){
t3.setText("");
}});
jf.setVisible(true);
bd=new BankDemo();

b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String s1=t1.getText();
int ac=Integer.parseInt(t2.getText());
double b=0;
Customer c=new Customer(s1,ac,b);
bd.addCustomer(c);
ta1.append("Customer Added\n");
}});

b2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
int ac=Integer.parseInt(t2.getText());
double am=Double.parseDouble(t3.getText());
try {
if (am <= 0) {
throw new InvalidAmountException("Invalid amount");
}
bd.deposit(ac,am);
ta1.setText(am+" deposited.\n");
}
catch(InvalidAmountException ex){
ta1.setText(ex.getMessage());
}
}});

b3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
int ac=Integer.parseInt(t2.getText());
double am=Double.parseDouble(t3.getText());
try {
if (am <= 0) {
throw new InsufficientFundException("Insufficient Funds");
}
bd.withdrawl(ac,am);
ta1.setText(am+" withdrawed.\n");
}
catch(InsufficientFundException ex){
ta1.setText(ex.getMessage());
}
}});

b4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
int ac=Integer.parseInt(t2.getText());
double ba=bd.checkBal(ac);
if(ba!=-1){
ta1.setText("Available Balance: "+Double.toString(ba)+"\n");
}
else
ta1.setText("Account not found\n");
}});

b5.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
ta1.setText("");
ArrayList<Customer> c1=bd.cl;
for(Customer c:c1){
ta1.append(c.toString()+"\n");
}
}});

}
}

class Bank_Application{
public static void main(String args[]){
GUI bank=new GUI();
}
}