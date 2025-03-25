import java.applet.*;
import java.awt.*;

/*<applet code="AppletDemo.class" width="300" height="300">
</applet>*/
public class AppletDemo extends Applet
{
public void paint(Graphics g)
{
g.drawString("Hello World!",100,150);
g.drawLine(150,300,200,300);
g.drawLine(300,100,150,350);
g.drawLine(150,100,300,450);
g.drawRect(400,100,280,300);

int x[]={200,300,300,200,100,100};
int y[]={0,100,500,700,500,100};
g.setColor(Color.BLUE);
g.fillPolygon(x,y,6);


g.setColor(Color.BLACK);
g.fillOval(500,200,200,200);
g.setColor(Color.WHITE);
g.fillOval(400,100,150,150);
g.setColor(Color.GREEN);
g.drawRoundRect(1000,300,250,300,25,25);

}
}
