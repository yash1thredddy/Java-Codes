import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Pizza extends JFrame implements ItemListener{
private final int small=100;
private final int medium = 130;
private final int large =160;
private final int plain=0;
private final int sausage=20;
private final int mushroom=20;
private final int pepperoni=20;
JCheckBox small1=new JCheckBox("small");
JCheckBox medium1=new JCheckBox("medium");
JCheckBox large1=new JCheckBox("large");
JCheckBox plain1=new JCheckBox("plain");
JCheckBox sausage1=new JCheckBox("sausage");
JCheckBox pepperoni1=new JCheckBox("pepperoni");
JCheckBox mushroom1=new JCheckBox("mushroom");
JTextField cost=new JTextField(10) ;
int totalcost=0;
public Pizza(){
setTitle("pizza");
setLayout(new FlowLayout());
ButtonGroup location=new ButtonGroup();
location.add(small1);
location.add(medium1);
location.add(large1);
add(new JLabel("                                                 "));
add(new JLabel("PizzaHut Pizza Corner"));
add(new JLabel("                                                                                        "));
add(small1);
add(medium1);
add(large1);
ButtonGroup toppings=new ButtonGroup();
toppings.add(plain1);
toppings.add(sausage1);
toppings.add(mushroom1);
toppings.add(pepperoni1);
add(new JLabel("                                                                                                   "));
add(new JLabel("       Toppings - "));
add(plain1);
add(sausage1);
add(mushroom1);
add(pepperoni1);
small1.addItemListener(this);
medium1.addItemListener(this);
large1.addItemListener(this);
plain1.addItemListener(this);
sausage1.addItemListener(this);
mushroom1.addItemListener(this);
pepperoni1.addItemListener(this);
add(new JLabel("                                                 "));
add(new JLabel("Total cost is"));
add(cost);
}
public void itemStateChanged(ItemEvent e){
Object a=e.getSource();
int selected=e.getStateChange();
if(a==small1){
if(selected==ItemEvent.SELECTED){
totalcost=totalcost+small;
}
else{
totalcost=totalcost-small;
}
}
else if(a==medium1){
if(selected==ItemEvent.SELECTED){
totalcost=totalcost+medium;
}
else{
totalcost=totalcost-medium;
}
}
else if(a==large1){
if(selected==ItemEvent.SELECTED){
totalcost=totalcost+large;
}
else{
totalcost=totalcost-large;
}
}
else if(a==plain1){
if(selected==ItemEvent.SELECTED){
totalcost=totalcost+plain;
}
else{
totalcost=totalcost-plain;
}
}
else if(a==sausage1){
if(selected==ItemEvent.SELECTED){
totalcost=totalcost+sausage;
}
else{
totalcost=totalcost-sausage;
}
}
else if(a==mushroom1){
if(selected==ItemEvent.SELECTED){
totalcost=totalcost+mushroom;
}
else{
totalcost=totalcost-mushroom;
}
}
else if(a==pepperoni1){
if(selected==ItemEvent.SELECTED){
totalcost=totalcost+pepperoni;
}
else{
totalcost=totalcost+pepperoni;
}
}
cost.setText(totalcost+"$");
}
public static void main(String[] args){
Pizza vr= new Pizza();
vr.setSize(600,180);
vr.setVisible(true);
}
}
