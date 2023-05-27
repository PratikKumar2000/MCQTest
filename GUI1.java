import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GUI1 extends Frame implements ItemListener {
    Button b;
    GUI2 g;
    GUI3 g1;
    GUI4 g2;
    GUI5 g3;
    String ans;
    String res;
    static ArrayList<ArrayList<String>> question = new ArrayList<>();
    ArrayList<String> result = new ArrayList<>();
    CheckboxGroup cg1;
    Checkbox cb1;
    Checkbox cb2;
    Checkbox cb3;
    Checkbox cb4;
    public GUI1(String s1, String s2, String s3, String s4, String s5){
        setTitle("JAVA Quiz");
        setLocation(500,200);
        Label label = new Label();
        label.setText("Q1) " + s1);
        label.setBounds(50,100,200,20);
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
        add(btn);
        b = btn;
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
        setLayout(null);
        setVisible(true);
    }
    public void fillUpAnswers(String a){
        ans = a;
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
    public static void create(){
        for(int i = 0; i < 5; i++){
            question.add(new ArrayList<>());
        }
        question.get(0).add("JAVA was developed by");
        question.get(0).add("Dennis Ritchie");
        question.get(0).add("Bjarne Stroustrup");
        question.get(0).add("Guido van rossum");
        question.get(0).add("James Gosling");

        question.get(1).add("The latest version of JDK is");
        question.get(1).add("11");
        question.get(1).add("12");
        question.get(1).add("15");
        question.get(1).add("17");

        question.get(2).add("Which is a valid keyword in JAVA");
        question.get(2).add("interface");
        question.get(2).add("string");
        question.get(2).add("character");
        question.get(2).add("unsigned");

        question.get(3).add("Which is a reserved keyword in JAVA language");
        question.get(3).add("method");
        question.get(3).add("native");
        question.get(3).add("subclasses");
        question.get(3).add("reference");

        question.get(4).add("Size of an int in JAVA is");
        question.get(4).add("16 bits");
        question.get(4).add("32 bits");
        question.get(4).add("64 bits");
        question.get(4).add("Depends on execution environment");
    }
    public static void main(String[] args) {
        create();
        int i = 0, j = 0;
        GUI1 ob = new GUI1(question.get(i).get(j++),question.get(i).get(j++),question.get(i).get(j++),question.get(i).get(j++),question.get(i).get(j++));
        i++; j = 0;
        ob.fillUpAnswers("James Gosling");
        ob.g = new GUI2(question.get(i).get(j++),question.get(i).get(j++),question.get(i).get(j++),question.get(i).get(j++),question.get(i).get(j++),ob);
        ob.g.fillUpAnswers("17",ob.result);
        ob.set();
        i++; j = 0;
        ob.g1 = new GUI3(question.get(i).get(j++),question.get(i).get(j++),question.get(i).get(j++),question.get(i).get(j++),question.get(i).get(j++),ob.g);
        ob.g1.fillUpAnswers("interface",ob.result);
        ob.g.set(ob.g1);
        i++; j = 0;
        ob.g2 = new GUI4(question.get(i).get(j++),question.get(i).get(j++),question.get(i).get(j++),question.get(i).get(j++),question.get(i).get(j++),ob.g1);
        ob.g2.fillUpAnswers("native",ob.result);
        ob.g1.set(ob.g2);
        i++; j = 0;
        ob.g3 = new GUI5(question.get(i).get(j++),question.get(i).get(j++),question.get(i).get(j++),question.get(i).get(j++),question.get(i).get(j++),ob.g2);
        ob.g3.fillUpAnswers("16 bits",ob.result);
        ob.g2.set(ob.g3);
        ob.g3.set(ob,ob.g,ob.g1,ob.g2,ob.g3);
    }
    public void set(){
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                g.setVisible(true);
            }
        });
    }
}
