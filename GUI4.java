import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GUI4 extends Frame implements ItemListener{
        Button b;
        String ans;
        String res;
        CheckboxGroup cg1;
        Checkbox cb1;
        Checkbox cb2;
        Checkbox cb3;
        Checkbox cb4;
        public GUI4(String s1, String s2, String s3, String s4, String s5, GUI3 g1){
            setTitle("JAVA Quiz");
            Label label = new Label();
            setLocation(500,200);
            label.setText("Q4) " + s1);
            label.setBounds(50,100,300,20);
            setSize(400,400);
            add(label);
            Label l = new Label("Choose the correct option");
            l.setBounds(50,130,200,20);
            l.setFont(new Font("Arial", Font.BOLD, 10));
            add(l);
            cg1 = new CheckboxGroup();
            cb1 = new Checkbox(s2,cg1,false);
            cb1.setBounds(50,150,200,20);
            cb2 = new Checkbox(s3,cg1,false);
            cb2.setBounds(50,170,200,20);
            cb3 = new Checkbox(s4,cg1,false);
            cb3.setBounds(50,190,200,20);
            cb4 = new Checkbox(s5,cg1,false);
            cb4.setBounds(50,210,200,20);
            cb1.addItemListener(this);
            add(cb1);
            add(cb2);
            add(cb3);
            add(cb4);
            cb1.addItemListener(this);
            cb2.addItemListener(this);
            cb3.addItemListener(this);
            cb4.addItemListener(this);
            Button btn = new Button("Next");
            btn.setBounds(300,350,70,20);
            b = btn;
            Button btn1 = new Button("Prev");
            btn1.setBounds(10,350,70,20);
            btn1.addActionListener(new ActionListener(){

                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    g1.setVisible(true);
                }
            });
            addWindowListener(new WindowListener() {

                @Override
                public void windowOpened(WindowEvent e) {
                }

                @Override
                public void windowClosing(WindowEvent e) {
                    dispose();
                }

                @Override
                public void windowClosed(WindowEvent e) {
                }

                @Override
                public void windowIconified(WindowEvent e) {
                }

                @Override
                public void windowDeiconified(WindowEvent e) {
                }

                @Override
                public void windowActivated(WindowEvent e) {
                }

                @Override
                public void windowDeactivated(WindowEvent e) {
                }
            });
            add(btn);
            add(btn1);
            setLayout(null);
        }
        public void fillUpAnswers(String a, ArrayList<String> res){
            ans = a;
            res.add(ans);
        }
        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getSource() == cb1) {
                res = cb1.getLabel();
            }
            if (e.getSource() == cb2) {
                res = cb2.getLabel();
            }
            if (e.getSource() == cb3) {
                res = cb3.getLabel();
            }
            if (e.getSource() == cb4) {
                res = cb4.getLabel();
            }
        }
    public void set(GUI5 g){
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                g.setVisible(true);
            }
        });
    }
}
