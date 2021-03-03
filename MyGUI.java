

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyGUI extends JFrame
{
    //Main Function
    public static void main(String[] args)
	{
      MyGUI f = new MyGUI();
      f.setVisible(true);
    }
//creating buttons for Add,Subtarct,Multiply,Divide and Modulus
  private JButton buttonExit  = new JButton("Exit");
  private JButton buttonAdd = new JButton("Add");
  private JButton buttonSubtract = new JButton("Subtract");
  private JButton buttonMultiply = new JButton("Multiply");
  private JButton buttonDivide = new JButton("Divide");
  private JButton buttonModulus = new JButton("Modulus");

//creating Text Field for input of A and B and rest for displaying the sum, difference, product, quotient and remainder
  private JTextField textA = new JTextField();
  private JTextField textB = new JTextField();
  private JTextField textC = new JTextField();
  private JTextField textD = new JTextField();
  private JTextField textE = new JTextField();
  private JTextField textF = new JTextField();
  private JTextField textG = new JTextField();

//creating labels
  private JLabel labelA = new JLabel("Number A: ");
  private JLabel labelB = new JLabel("Number B: ");
  private JLabel labelC = new JLabel("(A+B): ");
  private JLabel labelD = new JLabel("(A-B): ");
  private JLabel labelE = new JLabel("(A*B): ");
  private JLabel labelF = new JLabel("(A/B): ");
  private JLabel labelG = new JLabel("(A%B): ");

  public MyGUI()
  {
	
    setTitle("Arithmetic Operations on two numbers");//Title of the container
    setSize(600,300);//setting overall size of component
    setLocation(new Point(100,200));
    setLayout(null);
    setResizable(false);

    initComponent();
    initEvent();
  }

  private void initComponent()
  {
	//setting bounds for buttons (x,y,a,b)= x & y are coordinates and a is width, b is height
    buttonExit.setBounds(300,210,100,25);
    buttonAdd.setBounds(300,60,100,25);
	buttonSubtract.setBounds(300,90,100,25);
	buttonMultiply.setBounds(300,120,100,25);
	buttonDivide.setBounds(300,150,100,25);
	buttonModulus.setBounds(300,180,100,25);

    //setting bounds for TextFields (x,y,a,b)= x & y are coordinates and a is width, b is height
    textA.setBounds(100,10,100,20);
    textB.setBounds(100,35,100,20);
    textC.setBounds(100,65,100,20);
	textD.setBounds(100,95,100,20);
	textE.setBounds(100,125,100,20);
	textF.setBounds(100,155,100,20);
	textG.setBounds(100,185,100,20);
	
	//setting bounds for Labels (x,y,a,b)= x & y are coordinates and a is width, b is height
    labelA.setBounds(20,10,300,20);
    labelB.setBounds(20,35,300,20);
    labelC.setBounds(20,65,300,20);
	labelD.setBounds(20,95,300,20);
	labelE.setBounds(20,125,300,20);
	labelF.setBounds(20,155,300,20);
	labelG.setBounds(20,185,300,20);

	//Adding buttons
    add(buttonExit);
    add(buttonAdd);
	add(buttonSubtract);
	add(buttonMultiply);
	add(buttonDivide);
	add(buttonModulus);
	
	//Adding Labels
    add(labelA);
    add(labelB);
    add(labelC);
	add(labelD);
	add(labelE);
	add(labelF);
	add(labelG);

	//Adding TextFields
    add(textA);
    add(textB);
    add(textC);
	add(textD);
	add(textE);
	add(textF);
	add(textG);
  }

  private void initEvent()
  {

    this.addWindowListener(new WindowAdapter() //Window Listener 
	{
      public void windowClosing(WindowEvent e)
	  {
       System.exit(1);
      }
    });

    buttonExit.addActionListener(new ActionListener() //ActionListener for Exit button
	{
      public void actionPerformed(ActionEvent e) 
	  {
        buttonExitClick(e);
      }
    });

    buttonAdd.addActionListener(new ActionListener()//ActionListener for Add button
	{
      public void actionPerformed(ActionEvent e)
	  {
        buttonAddClick(e);
      }
    });
	
	buttonSubtract.addActionListener(new ActionListener()//ActionListener for Subtract button
	{
      public void actionPerformed(ActionEvent e) 
	  {
        buttonSubtractClick(e);
      }
    });
	
	buttonMultiply.addActionListener(new ActionListener()//ActionListener for Multiply button
	{
      public void actionPerformed(ActionEvent e) 
	  {
        buttonMultiplyClick(e);
      }
    });
	
	buttonDivide.addActionListener(new ActionListener() //ActionListener for Diivide button
	{
      public void actionPerformed(ActionEvent e) 
	  {
        buttonDivideClick(e);
      }
    });
	buttonModulus.addActionListener(new ActionListener() //ActionListener for Modulus button
	{
      public void actionPerformed(ActionEvent e) 
	  {
        buttonModulusClick(e);
      }
    });
  }

  private void buttonExitClick(ActionEvent evt)//ActionEvent for Exit button- exits the pragram when button is clicked
  {
    System.exit(0);
  }

  private void buttonAddClick(ActionEvent evt)
  {
	//ActionEvent for Add button- Addition happens when Add button is clicked & the sum gets displayed in TextField C
    Integer x,y,z;
      x = Integer.parseInt(textA.getText());
      y = Integer.parseInt(textB.getText());
      z = x + y;
      textC.setText(z.toString());
	
  }
  
   private void buttonSubtractClick(ActionEvent evt)
   {
	//ActionEvent for Subtract button- Subtraction happens when Subtract button is clicked & the difference gets displayed in TextField D
    Integer m,n,q;
    m = Integer.parseInt(textA.getText());
    n = Integer.parseInt(textB.getText());
    q = m - n;
    textD.setText(q.toString());
  }
  
  private void buttonMultiplyClick(ActionEvent evt)
  {
	  //ActionEvent for Multiply button- Multiplication happens when Multiply button is clicked & the product gets displayed in TextField E
	  Integer f,g,h;
      f = Integer.parseInt(textA.getText());
	  g = Integer.parseInt(textB.getText());
      h=f*g;
      textE.setText(h.toString());
    
  }
  
  private void buttonDivideClick(ActionEvent evt)
  {
	 //ActionEvent for Divide button- Division happens when Divide button is clicked & the quotient gets displayed in TextField F
    Float s,t,u;
      s = Float.parseFloat(textA.getText());
      t = Float.parseFloat(textB.getText());
      u = s / t;
      textF.setText(u.toString());
  }
  
  private void buttonModulusClick(ActionEvent evt)
  {
	 //ActionEvent for Modulus button-  when Modulus button is clicked, the Remainder gets displayed in TextField G
    Float i,j,k;
      i = Float.parseFloat(textA.getText());
      j = Float.parseFloat(textB.getText());
      k = i % j;
      textG.setText(k.toString());
  }
}
