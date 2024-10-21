import.javax.swing.*
import.awt.*
class RadioButton extends JFrame implements ActionListener{
RadioButton(){
JRadioButton rb1,rb2;
setLayout(new FlowLayout());
setsize(200,200);
setvisible(true);
set Defaultcloseoperation(JFrame.EXIT_ON_CLOSE);
rb1=new JRadioButton("Male");
rb1.AddActionListener(this);
add(rb1);
rb2=new JRadioButton("Female");
rb2.AddActionListener(this);
add(rb2);
ButtonGroup bg=new ButtonGroup;
bg.add(rb1);
bg.add(rb2);
Label label=new Label("Text");

}
public void action performed(ActionListener ae)
{
 label setText("you have been selected"+e.get(ActionCommand);
}