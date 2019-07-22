package com.cruds.eventHandling;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@SuppressWarnings("serial")
public class MouseEventDemo extends Applet implements MouseListener, MouseMotionListener{
	
	String msg = "";
	
	@Override
	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString(msg, 50, 50);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		msg = "Mouse Clicked " + e.getX() + "," + e.getY();	
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		msg = "Mouse Pressed";	
		repaint();		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		msg = "Mouse Released";	
		repaint();		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		msg = "Mouse Entered";	
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		msg = "Mouse Exited";	
		repaint();		
	}

	//MouseMotionListener contains mouseDragged and mouseMoved method
	@Override
	public void mouseDragged(MouseEvent e) {
		msg = "Mouse Dragged";
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		msg = "Mouse Moved";
		repaint();
	}
	
	

}
