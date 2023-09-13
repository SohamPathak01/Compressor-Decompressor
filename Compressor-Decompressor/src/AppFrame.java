import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AppFrame extends JFrame implements ActionListener{

    JFrame Frame;
    JButton compressButton;
    JButton decompressButton;

    AppFrame(){

        Frame= new JFrame( "File Compressor-DeCompressor");
        Frame.setLayout(null);

        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        compressButton=new JButton("Compressor");
        compressButton.setSize(200,50);
        compressButton.setLocation(100, 100);
        //compressButton.setBounds(150,100,200,50);
        compressButton.addActionListener(this);

        decompressButton=new JButton("Decompressor");
        decompressButton.setSize(200,   50);
        decompressButton.setLocation(400, 100);
        //decompressButton.setBounds(450, 100, 200, 50);
        decompressButton.addActionListener(this);

        Frame.add(compressButton);
        Frame.add(decompressButton);

        Frame.setBounds(400, 150, 700, 500);//(1000, 500);
        Frame.getContentPane().setBackground(Color.DARK_GRAY);
        Frame.setVisible(true);






    }


    //@Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==compressButton){
            JFileChooser fileChooser=new JFileChooser();
            int response=fileChooser.showOpenDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    comp.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
                
            }

        }
        if(e.getSource()==decompressButton){
            JFileChooser fileChooser=new JFileChooser();
            int response=fileChooser.showSaveDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){
                File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    decomp.method(file);
                }
                catch(Exception ee){
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
                
            }

        }
        

    }
    
}
