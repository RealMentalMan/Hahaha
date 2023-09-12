import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
public class Practice4 extends JFrame{
    public JPanel panel1 = new JPanel();
    public JButton ACMilanButton = new JButton();
    public JButton realMadridButton = new JButton();
    public JLabel lastScoredLabel = new JLabel();
    public JLabel resultLabel = new JLabel();
    public JLabel winnerLabel = new JLabel();

    private int mil = 0, rea = 0;

    private  Practice4(){
        setContentPane(panel1);
        setSize(430, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        ACMilanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mil++;
                upd("AC Milan");
            }
        });
        realMadridButton.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                rea++;
                upd("Real Madrid");
            }
        });
    }

    private void upd(String last){
        lastScoredLabel.setText("Последний забитый " + last);
        resultLabel.setText("Счёт " + mil + " X " + rea);
        String w = "Ничья";
        if(mil > rea)
            w = "AC Milan";
        else if (rea > mil)
            w = "Real Madrid";
        winnerLabel.setText("И победитель!:  " + w);
    }

    public static void main(String[] args) {
        new Practice4();
    }
}