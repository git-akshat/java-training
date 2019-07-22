package com.cruds.eventHandling;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventDemo extends Applet implements KeyListener{
	
	String msg = "";
	
	@Override
	public void init() {
		addKeyListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawString(msg, 10, 10);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		msg = msg + e.getKeyChar();
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_F1)
		{
			msg = msg + "<F1>";
			repaint();
		}
		showStatus("Key pressed......");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		showStatus("Key Released...");
	}

}
