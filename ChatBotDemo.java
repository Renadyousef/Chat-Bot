//author :renad (:
package chatbotdemo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ChatBotDemo {

   
    public static void main(String[] args) {
   new  ChatBot(); 
    }
    
}
class ChatBot extends JFrame {

  private JTextArea ca=new JTextArea();
  private JTextField cf=new JTextField();
  private JButton cb=new JButton();
  private JLabel l =new JLabel();
  //creat consturcter chat bot
  ChatBot(){
  //make chat window using jframe ,basic methods to set up window
  JFrame f=new JFrame();
  f.setDefaultCloseOperation(EXIT_ON_CLOSE);
  f.setVisible(true);
 f.setResizable(false);
  f.setLayout(null);
  f.setSize(400, 400);
  f.getContentPane().setBackground(Color.GREEN);
  f.setTitle("chat Bot ☺️");
  //add components
  f.add(ca);
  f.add(cf);


ca.setSize(300,310);
ca.setLocation(1, 1);
ca.setBackground(Color.white);



//setting the chat field and button
cf.setSize(300, 20);
cf.setLocation(1, 320);
 f.add(cb);
cb.add(l);//
cb.setSize(400,20);
cb.setLocation(300, 320);
l.setText("Enter"); 
//adding action listener to button 
cb.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
     if(e.getSource()==cb) {
    //when the button is clicked we have to get text from user from chat field     
     String txt=cf.getText().toLowerCase();
     ca.append("you --->"+txt+"\n");
    cf.setText("");
    
    
    if(txt.contains("hi")){
   replyMeth("Hi there")  ;   
    }
    else if(txt.contains("how are you")){
        replyMeth("im good ,and now better after seeing u 😉");
    }
    else if(txt.contains("what is your name")){
     replyMeth("im just an AI creation  i dont have a name 👻") ;  
    }
    else if(txt.contains("my name is")){
      replyMeth("nice to meet you dear 🌹")   ;
    }
    else if(txt.contains("where are you from")){
     replyMeth("im from KSA")   ;
    }
    else if(txt.contains("i love you")){
        replyMeth("oh you're sweet but so does everybody else 😃");
    }
    else if(txt.contains("bye")){
      replyMeth("too soon come again love,be safe byee")  ; 
    }
    else{
        replyMeth("i cant understand !");
    }
     }
      }
 });

 


  }
  //reply method
 public void replyMeth(String text){
 ca.append("chatbot--->"+text+"\n");
 }
}

