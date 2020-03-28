import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPasswordField;

public class Calculator {





        private JFrame frame;
        private JTextField textField;

        /**
         * Launch the application.
         * @throws UnsupportedLookAndFeelException
         */
        public static void main(String[] args) throws UnsupportedLookAndFeelException {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        Calculator window = new Calculator();
                        window.frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        /**
         * Create the application.
         */
        public Calculator() {
            initialize();
        }

        /**
         * Initialize the contents of the frame.
         */
        private void initialize() {
            frame = new JFrame();
            frame.setBounds(100, 100, 296, 451);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().setLayout(null);

            textField = new JTextField();
            textField.setBounds(10, 11, 252, 52);
            frame.getContentPane().add(textField);
            textField.setColumns(10);


            //-----------------------------ROW 1-----------------------------

            JButton btnFlech = new JButton("<-");
            btnFlech.setFont(new Font("Tahoma", Font.BOLD, 14));
            btnFlech.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                }
            });
            btnFlech.setBounds(10, 85, 50, 50);
            frame.getContentPane().add(btnFlech);

            JButton btnC = new JButton("C");
            btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnC.setBounds(78, 85, 50, 50);
            frame.getContentPane().add(btnC );




            JButton btnPrc = new JButton("%");
            btnPrc.setFont(new Font("Tahoma", Font.BOLD, 14));
            btnPrc.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                }
            });
            btnPrc.setBounds(145, 85, 50, 50);
            frame.getContentPane().add(btnPrc);

            JButton btnPlus = new JButton("+");
            btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnPlus.setBounds(212, 85, 50, 50);
            frame.getContentPane().add(btnPlus );

            //-----------------------------ROW 2-----------------------------

            JButton btn7 = new JButton("7");
            btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {

                    String EnterNumber = textField.getText() + btn7.getText();
                    textField.setText(EnterNumber);

                }
            });
            btn7.setBounds(10, 150, 50, 50);
            frame.getContentPane().add(btn7);

            JButton btn8 = new JButton("8");
            btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn8.setBounds(78, 150, 50, 50);
            frame.getContentPane().add(btn8 );




            JButton btn9 = new JButton("9");
            btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                }
            });
            btn9.setBounds(145,150, 50, 50);
            frame.getContentPane().add(btn9);

            JButton btnSub = new JButton("-");
            btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnSub.setBounds(212,150, 50, 50);
            frame.getContentPane().add(btnSub );
            //-----------------------------ROW 3-----------------------------

            JButton btn4 = new JButton("4");
            btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                }
            });
            btn4.setBounds(10, 215, 50, 50);
            frame.getContentPane().add(btn4);

            JButton btn5 = new JButton("5");
            btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn5.setBounds(78, 215, 50, 50);
            frame.getContentPane().add(btn5 );




            JButton btn6 = new JButton("6");
            btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                }
            });
            btn6.setBounds(145,215, 50, 50);
            frame.getContentPane().add(btn6);

            JButton btnMult = new JButton("*");
            btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnMult.setBounds(212,215, 50, 50);
            frame.getContentPane().add(btnMult );



            //-----------------------------ROW 4-----------------------------

            JButton btn1 = new JButton("1");
            btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                }
            });
            btn1.setBounds(10, 280, 50, 50);
            frame.getContentPane().add(btn1);

            JButton btn2 = new JButton("2");
            btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn2.setBounds(78, 280, 50, 50);
            frame.getContentPane().add(btn2 );




            JButton btn3 = new JButton("3");
            btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                }
            });
            btn3.setBounds(145,280, 50, 50);
            frame.getContentPane().add(btn3);

            JButton btnDiv = new JButton("/");
            btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnDiv.setBounds(212,280, 50, 50);
            frame.getContentPane().add(btnDiv );


            //-----------------------------ROW 5-----------------------------

            JButton btn0 = new JButton("0");
            btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
            btn0.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                }
            });
            btn0.setBounds(10, 341, 50, 50);
            frame.getContentPane().add(btn0);

            JButton btnDot = new JButton(".");
            btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnDot.setBounds(78, 341, 50, 50);
            frame.getContentPane().add(btnDot );




            JButton btnPM = new JButton("+/-");
            btnPM.setFont(new Font("Tahoma", Font.BOLD, 10));
            btnPM.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                }
            });
            btnPM.setBounds(145,343, 50, 50);
            frame.getContentPane().add(btnPM);

            JButton btnEqual = new JButton("=");
            btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
            btnEqual.setBounds(212,341, 50, 50);
            frame.getContentPane().add(btnEqual );

        }
    }


