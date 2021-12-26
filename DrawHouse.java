import java.awt.*;
import java.awt.event.*;
public class DrawHouse extends Frame{
    DrawHouse(){
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
            System.exit(0);
            }
        });
    }
    public void init(){
        setBackground(Color.blue);
        setForeground(Color.WHITE);
    }
    public void paint(Graphics g){
        this.setBackground(Color.pink);
        int x[]={190,100,300};
        int y[]={130,200,200};
        g.setColor(Color.BLACK);
        g.fillPolygon(x,y,3);
       g.setColor(Color.gray);
        g.fillRect(100,200,200,250);
        g.setColor(Color.black);
        g.fillRect(145,300,40,150);
        g.setColor(Color.black);
        g.fillRect(220,320,50,50);
        g.setColor(Color.green);
        g.fillRect(0,427,600,25);
        
    }
    public static void main(String args[]){
        DrawHouse d=new DrawHouse();
        d.setTitle("HOUSE");
        d.setSize(550,550);
        d.setVisible(true);
    }
}
