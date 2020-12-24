
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.Color;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class ChatBot extends JFrame implements KeyListener {

    JPanel p = new JPanel();
    JTextArea dialog = new JTextArea(20, 50);
    JTextArea input = new JTextArea(1, 50);
    JScrollPane Scroll = new JScrollPane(
            dialog,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
    );
    String[][] chatBot = {
        //standred greeting 
        {"hi","hello","hola","howdy"},
        {"hi","hello","hey"},
        //question greetings
        {"how are you","how r u","how are u"},
        {"good","doing well"},
        //default
        {"shut up","Sam is not available right now","don't have time to talk"},
    };
    public static void main(String[] args) {
        new ChatBot();
    }

    public ChatBot() {
        super("chat Bot");
        setSize(600, 400);
       // setResizeable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        dialog.setEditable(false);

      //  p.add(scroll);
        p.add(input);
        p.setBackground(new Color(255, 200, 0));
        add(p);

        setVisible(true);
    }
    public void KeyPressed(KeyEvent e){}
    
    public void KeyReleased(KeyEvent e){}
    
    public void KeyTyped(KeyEvent e){}
}
