	import javax.swing.JComponent;
	import javax.swing.JFrame;
	import java.awt.Color;
	import java.awt.Graphics2D;
	import java.awt.Dimension;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
	import java.awt.Rectangle;
	import java.awt.Graphics;

	public class Tank extends JComponent
	{
		private Rectangle2D.Double tank = new Rectangle2D.Double(0, 0, 17, 30);
		private Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, 7, 7);
		
		private int dY;
		private int dX;
	
		public Tank(int x, int y)
		{
			this.setFocusable(false);
			this.setLocation(x, y);
			this.setSize(new Dimension(17, 30));
			dY = 0;
			dX = 0;
		}
		
		public void paintComponent(Graphics g)
		{
			Graphics2D g2 = (Graphics2D) g;
			g2.draw(tank);
			g2.fill(tank);
			g2.setColor(Color.BLACK);
		}
		public int getDx()
		{
			return dX;
		}
	
		public int getDy()
		{
			return dY;
		}
		public void setDy(double y)
		{
			this.dY = (int) y;
		}
	
		public void setDx(double x)
		{
			this.dX = (int) x;
		}
		
		public void update()
		{
			this.setLocation(this.getX() + dX, this.getY() + dY);
		}

}


