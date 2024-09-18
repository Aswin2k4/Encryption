import java.awt.*;
import java.awt.event.*;

class txt_enc_dec
{
    TextField plain, cy, T1, T2;
    Button b, B;
    Label x, y, m, n;
    Frame f;

    // Constructor to set up the GUI components
    txt_enc_dec() 
    {
        // Labels for the GUI
        x = new Label("Plain Text: ");
        y = new Label("Encrypted Text: ");
        m = new Label("Encrypted Text: ");
        n = new Label("Decrypted Text: ");
        
        // TextFields for input and output
        plain = new TextField();
        cy = new TextField();
        T1 = new TextField();
        T2 = new TextField();
        
        // Buttons for actions
        b = new Button("Encrypt");
        B = new Button("Decrypt");
        
        // Frame to contain the components
        f = new Frame("ActionListener Example");
        
        // Seting bounds for components
        x.setBounds(10, 100, 100, 30);
        y.setBounds(10, 300, 100, 30);
        plain.setBounds(120, 100, 200, 30);
        cy.setBounds(120, 300, 200, 30);
        b.setBounds(60, 170, 100, 30);
        m.setBounds(400, 100, 100, 30);
        n.setBounds(400, 300, 100, 30);
        T1.setBounds(520, 100, 200, 30);
        T2.setBounds(520, 300, 200, 30);
        B.setBounds(460, 170, 100, 30);
        
        // Adding components to the frame
        f.add(plain);
        f.add(cy);
        f.add(b);
        f.add(x);
        f.add(y);
        f.add(T1);
        f.add(T2);
        f.add(m);
        f.add(n);
        f.add(B);
        
        // Seting frame properties
        f.setSize(800, 500);
        f.setLayout(null);
        f.setVisible(true);
        
        // Adding action listeners for buttons
        b.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String t = plain.getText();
                char a;
                String cypher = "";
                for (int i = 0; i < t.length(); i++) 
                {
                    a = t.charAt(i);
                    int n = (int) a;
                    n = n + 9; // Encryption by shifting characters by 9
                    a = (char) n;
                    cypher = cypher + a;
                }
                cy.setText(cypher);
            }
        });

        B.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                String t = T1.getText();
                char a;
                String cypher = "";
                for (int i = 0; i < t.length(); i++) 
                {
                    a = t.charAt(i);
                    int n = (int) a;
                    n = n - 9; // Decryption by shifting characters back by 9
                    a = (char) n;
                    cypher = cypher + a;
                }
                T2.setText(cypher);
            }
        });

        // Add window listener to close the frame
        f.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent we) 
            {
                f.dispose();
            }
        });
    }

    // Main method of the application
    public static void main(String args[]) 
    {
        Enc awt_obj = new Enc();
    }
}
