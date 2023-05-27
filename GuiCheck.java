import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiCheck extends Frame {
    static Label l;
    GuiCheck(ActionListener a){
        l = new Label();
        add(l);
        l.setText("Unchecked");
        l.setBounds(40,100,70,60);
        Button b = new Button();
        b.setLabel("Click");
        add(b);
        b.setBounds(60,60,50,30);
        b.addActionListener(a);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        ActionListener a = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(l.getText().equals("Unchecked"))
                    l.setText("Checked");
                else {
                    l.setText("Unchecked");
                }
            }
        };
        new GuiCheck(a);
    }
}
