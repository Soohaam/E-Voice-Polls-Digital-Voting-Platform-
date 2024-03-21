

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
class Awt extends JFrame 
{
int Student1=0;
int Student2=0;                     
int Student3=0;
int Student4=0;
int Student5=0;  
int Student6=0;
JTextField t ; 
JLabel l2;  
JButton b;
JButton b3;
int ti;
String correctPassword="Student";
String correctPassword2="Admin";
 
Awt()
{
JFrame f0=new JFrame("HOME", getGraphicsConfiguration());
        f0.setSize(1382,740);
        
        ImageIcon icon = new ImageIcon("c:/Users/aaa/Downloads/WhatsApp Image 2023-11-01 at 5.37.49 PM.jpeg");
        JLabel label = new JLabel(icon);

        // Set the size of the label (adjust as needed)
        label.setSize(1110, 600);

        // Set the location of the label within the frame (adjust as needed)
        label.setLocation(250, 100);

        // Make sure the layout is set to null for absolute positioning
        f0.setLayout(null);

        // Add the label to the existing frame
        f0.add(label);

        // Make the frame visible
        f0.setVisible(true);

        f0.setLayout(null);
        f0.setVisible(true);

        JLabel l00=new JLabel("Saraswati Collage Of Engineering");
        l00.setHorizontalAlignment(SwingConstants.LEFT);
        l00.setVerticalAlignment(SwingConstants.CENTER); 
        l00.setOpaque(true);
        l00.setBackground(Color.BLUE);
        l00.setForeground(Color.PINK);
        l00.setFont(new Font("", Font.ITALIC, 38));
        l00.setBounds(0,0,700,70);
        f0.getContentPane().setBackground(Color.WHITE);
        f0.add(l00);

        JLabel l01=new JLabel("NAAC A+ Accredited");
        l01.setHorizontalAlignment(SwingConstants.LEFT);
        l01.setVerticalAlignment(SwingConstants.CENTER); 
        l01.setOpaque(true);
        l01.setBackground(Color.BLUE);
        l01.setForeground(Color.RED);
        l01.setFont(new Font("", Font.ITALIC, 29));
        l01.setBounds(0,70,700,30);
        f0.getContentPane().setBackground(Color.WHITE);
        f0.add(l01);


        JLabel l0=new JLabel("                                                       INFO     ABOUT");
        l0.setVerticalAlignment(SwingConstants.CENTER); 
        l0.setOpaque(true);
        l0.setBackground(Color.BLUE);
        l0.setForeground(Color.BLACK);
        l0.setFont(new Font("", Font.PLAIN, 28));
        l0.setBounds(700,0,700,100);
        f0.getContentPane().setBackground(Color.WHITE);
        f0.add(l0);


        JButton b0=new JButton("E-VOICE POLLS");
        b0.setFont(new Font("", Font.BOLD, 20));
        b0.setBounds(0,100,250,100);
        b0.setBorderPainted(false);
        b0.setFocusPainted(false);
        b0.setBackground(Color.GRAY);
        b0.setForeground(Color.BLACK);
        b0.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        f0.add(b0);

        JButton b02=new JButton("ANNOUNCEMENTS");
        b02.setFont(new Font("", Font.BOLD, 20));
        b02.setBounds(0,200,250,100);
        b02.setBorderPainted(false);
        b02.setFocusPainted(false);
        b02.setBackground(Color.GRAY);
        b02.setForeground(Color.BLACK);
        b02.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        f0.add(b02);

        JButton b03=new JButton("SCHOLARSHIP");
        b03.setFont(new Font("", Font.BOLD, 20));
        b03.setBounds(0,300,250,100);
        b03.setBorderPainted(false);
        b03.setFocusPainted(false);
        b03.setBackground(Color.GRAY);
        b03.setForeground(Color.BLACK);
        b03.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        f0.add(b03);

        JButton b04=new JButton("ACHIEVEMENTS");
        b04.setFont(new Font("", Font.BOLD, 20));
        b04.setBounds(0,400,250,100);
        b04.setBorderPainted(false);
        b04.setFocusPainted(false);
        b04.setBackground(Color.GRAY);
        b04.setForeground(Color.BLACK);
        b04.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        f0.add(b04);   
        
        JButton b5=new JButton("EVENTS");
        b5.setFont(new Font("", Font.BOLD, 20));
        b5.setBounds(0,500,250,100);
        b5.setBorderPainted(false);
        b5.setFocusPainted(false);
        b5.setBackground(Color.GRAY);
        b5.setForeground(Color.BLACK);
        b5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        f0.add(b5);     
        
        JButton b6=new JButton("INTERNSHIPS");
        b6.setFont(new Font("", Font.BOLD, 20));
        b6.setBounds(0,600,250,100);
        b6.setBorderPainted(false);
        b6.setFocusPainted(false);
        b6.setBackground(Color.GRAY);
        b6.setForeground(Color.BLACK);
        b6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        f0.add(b6);
 
        
  

        b0.addActionListener(new ActionListener() {
             @Override
    public void actionPerformed(ActionEvent e) {
            

       

JLabel l=new JLabel("ENTER GR. NO. :")  ;   
l.setFont(new Font("", Font.BOLD, 28));
l.setForeground(Color.BLACK);
JTextField t = new JTextField();
JFrame f=new JFrame("VERIFICATION");


JButton b=new JButton("LOGIN");

JLabel e1=new JLabel("E-VOICE POLLS");

e1.setFont(new Font("", Font.BOLD, 54));
e1.setHorizontalAlignment(SwingConstants.CENTER);
e1.setVerticalAlignment(SwingConstants.CENTER); 
e1.setOpaque(true);
e1.setBackground(Color.BLACK);
e1.setForeground(Color.WHITE);
e1.setBounds(0,55,1382,100);
f.add(e1);
JLabel le=new JLabel("ENTER PASSWORD :");
le.setFont(new Font("", Font.BOLD, 28));
le.setForeground(Color.BLACK);
le.setBounds(326,330,290,150);
f.add(le);



JPasswordField te=new JPasswordField();
te.setBounds(620,395,230,25);
te.setBorder(BorderFactory.createLineBorder(Color.BLACK));
f.add(te);

t.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
       
      String ti=t.getText();
      System.out.println(ti);
    }
    
});

te.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
       char[] tei=te.getPassword();
        System.out.println(tei);
    }                                                               
});

b.setForeground(Color.BLACK);
b.setBounds(591,570,200,50);
b.setBorderPainted(true);
b.setFocusPainted(false);
b.setBackground(Color.GRAY);
b.setFont(new Font("", Font.BOLD, 28));
b.setBorder(BorderFactory.createLineBorder(Color.BLACK));

b.addActionListener(new ActionListener(){

    @Override
    public void actionPerformed(ActionEvent e) {

        char[] enteredPassword = te.getPassword();
        String enteredPasswordString = new String(enteredPassword);
        String ti=t.getText();
        int intValue = Integer.parseInt(ti);

        if ((enteredPasswordString.equals(correctPassword))&&(intValue==10009||intValue==10025||intValue==10052||intValue==10068||intValue==10000)) {

               try {
        TimeUnit.SECONDS.sleep(2);
    } catch (InterruptedException e1) {
       
        e1.printStackTrace();
    }

        System.out.println("Action Receved");
        JFrame f2=new JFrame("VOTING PROCESS", getGraphicsConfiguration());

        f2.setSize(1382,740);
        f2.setLayout(null);
        f2.setVisible(true);
        l2=new JLabel("VOTE FOR THE BEST PERFORMANCE");
        l2.setFont(new Font("", Font.BOLD, 40));
        l2.setHorizontalAlignment(SwingConstants.CENTER);
        l2.setVerticalAlignment(SwingConstants.CENTER); 
        l2.setOpaque(true);
        l2.setBackground(Color.BLACK);
        l2.setForeground(Color.WHITE);
       
        l2.setFont(l2.getFont().deriveFont(Font.BOLD));
        l2.setBounds(281,50,820,100);
        f2.getContentPane().setBackground(Color.DARK_GRAY);
        f2.add(l2);
        JButton b2=new JButton("Student1");
        b2.setFont(new Font("", Font.BOLD, 40));
        f2.add(b2);
        b2.setBounds(241,270,200,50);
        b2.setBorderPainted(true);
        b2.setFocusPainted(false);
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.BLACK);
        b2.setBorder(BorderFactory.createLineBorder(Color.BLACK));;
        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              
               System.out.println("Student1++");
               Student1++;
        JFrame f5=new JFrame("THANKS FOR VOTING", getGraphicsConfiguration());
        JLabel lf=new JLabel("THANK  YOU  FOR  VOTING");
        f5.setSize(1382,740);
        f5.getContentPane().setBackground(Color.DARK_GRAY);
        lf.setFont(new Font("", Font.BOLD, 64));
        lf.setHorizontalAlignment(SwingConstants.CENTER); 
        lf.setVerticalAlignment(SwingConstants.CENTER); 
        lf.setOpaque(true);
        lf.setBackground(Color.BLACK);
        lf.setForeground(Color.WHITE);
        lf.setBounds(0,200,1382,100);
        f5.setLayout(null);
        f5.setVisible(true);
        f5.add(lf);


        f2.setVisible(false);
        f.setVisible(false);
            }
                        
        });
        JButton b3=new JButton("Student2");
        b3.setFont(new Font("", Font.BOLD, 40));
        f2.add(b3);
        b3.setBounds(241,520,200,50);
        b3.setBorderPainted(true);
        b3.setFocusPainted(false);
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.BLACK);
        b3.setBorder(BorderFactory.createLineBorder(Color.BLACK));;
        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
        JFrame f5=new JFrame("THANKS FOR VOTING", getGraphicsConfiguration());
        JLabel lf=new JLabel("THANK  YOU  FOR  VOTING");
        f5.setSize(1382,740);
        f5.getContentPane().setBackground(Color.DARK_GRAY);
        lf.setFont(new Font("", Font.BOLD, 64));
        lf.setHorizontalAlignment(SwingConstants.CENTER); 
        lf.setVerticalAlignment(SwingConstants.CENTER); 
        lf.setOpaque(true);
        lf.setBackground(Color.BLACK);
        lf.setForeground(Color.WHITE);
        lf.setBounds(0,200,1382,100);
        f5.setLayout(null);
        f5.setVisible(true);
        f5.add(lf);

        f2.setVisible(false);
        f.setVisible(false);

               System.out.println("Student2++");
               Student2++;
            }
            
        });
        JButton b4=new JButton("Student4");
        b4.setFont(new Font("", Font.BOLD, 40));
        f2.add(b4);
        b4.setBounds(591,520,200,50);
        b4.setBorderPainted(true);
        b4.setFocusPainted(false);
        b4.setBackground(Color.GRAY);
        b4.setForeground(Color.BLACK);
        b4.setBorder(BorderFactory.createLineBorder(Color.BLACK));;
        b4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
        JFrame f5=new JFrame("THANKS FOR VOTING", getGraphicsConfiguration());
        JLabel lf=new JLabel("THANK  YOU  FOR  VOTING");
        f5.setSize(1382,740);
        f5.getContentPane().setBackground(Color.DARK_GRAY);
        lf.setFont(new Font("", Font.BOLD, 64));
        lf.setHorizontalAlignment(SwingConstants.CENTER); 
        lf.setVerticalAlignment(SwingConstants.CENTER); 
        lf.setOpaque(true);
        lf.setBackground(Color.BLACK);
        lf.setForeground(Color.WHITE);
        lf.setBounds(0,200,1382,100);
        f5.setLayout(null);
        f5.setVisible(true);
        f5.add(lf);

        f2.setVisible(false);

               System.out.println("Student4++");
               Student4++;
            }
            
        });
        JButton b5=new JButton("Student3");
        b5.setFont(new Font("", Font.BOLD, 40));
        f2.add(b5);
        b5.setBounds(591,270,200,50);
        b5.setBorderPainted(true);
        b5.setFocusPainted(false);
        b5.setBackground(Color.GRAY);
        b5.setForeground(Color.BLACK);
        b5.setBorder(BorderFactory.createLineBorder(Color.BLACK));;
        b5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
        JFrame f5=new JFrame("THANKS FOR VOTING", getGraphicsConfiguration());
        JLabel lf=new JLabel("THANK  YOU  FOR  VOTING");
        f5.setSize(1382,740);
        f5.getContentPane().setBackground(Color.DARK_GRAY);
        lf.setFont(new Font("", Font.BOLD, 64));
        lf.setHorizontalAlignment(SwingConstants.CENTER); 
        lf.setVerticalAlignment(SwingConstants.CENTER); 
        lf.setOpaque(true);
        lf.setBackground(Color.BLACK);
        lf.setForeground(Color.WHITE);
        lf.setBounds(0,200,1382,100);
        f5.setLayout(null);
        f5.setVisible(true);
        f5.add(lf);

        f2.setVisible(false);
        f.setVisible(false);

                System.out.println("Student3++");
                Student3++;
            }
            
        });
        JButton b6=new JButton("Student5", null);
        b6.setFont(new Font("", Font.BOLD, 40));
        f2.add(b6);
        b6.setBounds(941,270,200,50);
        b6.setBorderPainted(true);
        b6.setFocusPainted(false);
        b6.setBackground(Color.GRAY);
        b6.setForeground(Color.BLACK);
        b6.setBorder(BorderFactory.createLineBorder(Color.BLACK));;
        b6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             
        JFrame f5=new JFrame("THANKS FOR VOTING", getGraphicsConfiguration());
        JLabel lf=new JLabel("THANK  YOU  FOR  VOTING");
        f5.setSize(1382,740);
        f5.getContentPane().setBackground(Color.DARK_GRAY);
        lf.setFont(new Font("", Font.BOLD, 64));
        lf.setHorizontalAlignment(SwingConstants.CENTER); 
        lf.setVerticalAlignment(SwingConstants.CENTER); 
        lf.setOpaque(true);
        lf.setBackground(Color.BLACK);
        lf.setForeground(Color.WHITE);
        lf.setBounds(0,200,1382,100);
        f5.setLayout(null);
        f5.setVisible(true);
        f5.add(lf);

        f2.setVisible(false);
        f.setVisible(false);
              System.out.println("Student5++");
              Student5++;
            }
            
        });
        JButton b7=new JButton("Student6", null);
        b7.setFont(new Font("", Font.BOLD, 40));
        f2.add(b7);
        b7.setBounds(941,520,200,50);
        b7.setBorderPainted(true);
        b7.setFocusPainted(false);
        b7.setBackground(Color.GRAY); 
        b7.setForeground(Color.BLACK);
        b7.setBorder(BorderFactory.createLineBorder(Color.BLACK));;
        b7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
        JFrame f5=new JFrame("THANKS FOR VOTING", getGraphicsConfiguration());
        JLabel lf=new JLabel("THANK  YOU  FOR  VOTING");
        f5.setSize(1382,740);
        f5.getContentPane().setBackground(Color.DARK_GRAY);
        lf.setFont(new Font("", Font.BOLD, 64));
        lf.setHorizontalAlignment(SwingConstants.CENTER); 
        lf.setVerticalAlignment(SwingConstants.CENTER); 
        lf.setOpaque(true);
        lf.setBackground(Color.BLACK);
        lf.setForeground(Color.WHITE);
        lf.setBounds(0,200,1382,100);
        f5.setLayout(null);
        f5.setVisible(true);
        f5.add(lf);

        f2.setVisible(false);
        f.setVisible(false);
                System.out.println("Student6++");
                Student6++;
            }
            
        });
    }else
        JOptionPane.showMessageDialog(null, "Data is incorrect!");
    
}
      });
    


f.add(b);
f.setSize(1382,740);
f.setLayout(null);
f.setVisible(true);

l.setSize(30,30);
l.setLocation(40,40);
l.setBounds(382,230,390,150);
f.add(l);
f.getContentPane().setBackground(Color.DARK_GRAY);
t.setBounds(620,296,230,25);
t.setBorder(BorderFactory.createLineBorder(Color.BLACK));
f.add(t);


   JButton ba=new JButton("Admin");
    f.add(ba);
    ba.setForeground(Color.BLACK);
    ba.setBounds(1300,10,50,25);
    ba.setBorderPainted(true);
    ba.setFocusPainted(false);
    ba.setBackground(Color.GRAY);
    ba.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    ba.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            
           JFrame f3=new JFrame("ADMIN ACCESS", getGraphicsConfiguration());
           f3.setSize(1382,740);
           f3.setLayout(null);
           f3.setVisible(true);
           f3.getContentPane().setBackground(Color.DARK_GRAY);

JLabel l2=new JLabel("ENTER ADMIN CODE :")  ;   
l2.setFont(new Font("", Font.BOLD, 28));
l2.setForeground(Color.BLACK);
l2.setBounds(310,230,390,150);
f3.add(l2);



JLabel ee1=new JLabel("ADMIN ACCESS");

ee1.setFont(new Font("", Font.BOLD, 54));
ee1.setHorizontalAlignment(SwingConstants.CENTER);
ee1.setVerticalAlignment(SwingConstants.CENTER); 
ee1.setOpaque(true);
ee1.setBackground(Color.LIGHT_GRAY);
ee1.setForeground(Color.BLACK);
ee1.setBounds(0,55,1382,100);
f3.add(ee1);
JLabel lee=new JLabel("ENTER PASSWORD :");
lee.setFont(new Font("", Font.BOLD, 28));
lee.setForeground(Color.BLACK);
lee.setBounds(326,330,290,150);
f3.add(lee);

JPasswordField tee=new JPasswordField();
tee.setBounds(620,395,230,25);
tee.setBorder(BorderFactory.createLineBorder(Color.BLACK));
f3.add(tee);

JTextField te3 = new JTextField();
te3.setBounds(620,296,230,25);
te3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
f3.add(te3);


           JButton ba2=new JButton("LOGIN");
           f3.add(ba2);
           ba2.setForeground(Color.BLACK);
           ba2.setBounds(591,550,200,50);
           ba2.setBorderPainted(true);
           ba2.setFocusPainted(false);
           ba2.setBackground(Color.GRAY);
           ba2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
           ba2.setFont(new Font("", Font.BOLD, 28));
           ba2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
        char[] enteredPassword2 = tee.getPassword();
        String enteredPasswordString2 = new String(enteredPassword2);
        String te3i=te3.getText();
        int intValue2 = Integer.parseInt(te3i);

        if ((enteredPasswordString2.equals(correctPassword2))&&(intValue2==12345)) {




                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                f3.setVisible(false);
           JFrame f4=new JFrame("RESULTS", getGraphicsConfiguration());
           JLabel l3=new JLabel("Student1 :- "+Student1);
           l3.setFont(new Font("", Font.BOLD, 50));
           l3.setForeground(Color.BLACK);
           l3.setBounds(126,170,350,50);
           f4.add(l3);
           f4.setSize(1382,740);
           f4.setLayout(null);
           f4.setVisible(true);
           f4.getContentPane().setBackground(Color.DARK_GRAY);

           JLabel l4=new JLabel("Student2 :- "+Student2);
           l4.setFont(new Font("", Font.BOLD, 50));
           l4.setForeground(Color.BLACK);
           l4.setBounds(126,420,350,50);
           f4.add(l4);

           JLabel l5=new JLabel("Student3 :- "+Student3);
           l5.setFont(new Font("", Font.BOLD, 50));
           l5.setForeground(Color.BLACK);
           l5.setBounds(538,170,350,50);
           f4.add(l5);

           JLabel l6=new JLabel("Student4 :- "+Student4);
           l6.setFont(new Font("", Font.BOLD, 50));
           l6.setForeground(Color.BLACK);
           l6.setBounds(538,420,350,50);
           f4.add(l6);

           JLabel l7=new JLabel("Student5 :- "+Student5);
           l7.setFont(new Font("", Font.BOLD, 50));
           l7.setForeground(Color.BLACK);
           l7.setBounds(940,170,350,50);
           f4.add(l7);

           JLabel l8=new JLabel("Student6 :- "+Student6);
           l8.setFont(new Font("", Font.BOLD, 50));
           l8.setForeground(Color.BLACK);
           l8.setBounds(940,420,350,50);
           f4.add(l8);
          
            }else
            JOptionPane.showMessageDialog(null, "Data is incorrect!");
          }
    
        
           });
        
        }
    
    });
    

        }
});
}         
 



   
     



public static void main(String args[])
{
Awt f=new Awt();
}
}
