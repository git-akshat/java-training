package com.cruds.eventHandling;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class AdapterDemo extends Applet{
	
	@Override
	public void init() {
		addMouseListener(new MyMouseListener(this));
	}
}

class MyMouseListener extends MouseAdapter{
	
	Applet enclosingApplet;
	
	public MyMouseListener(Applet appletHandle) {
		enclosingApplet = appletHandle;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		enclosingApplet.showStatus("Mouse Clicked");
	}
}
