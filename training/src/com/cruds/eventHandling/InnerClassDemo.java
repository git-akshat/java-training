package com.cruds.eventHandling;

import java.applet.Applet;
import java.awt.event.MouseAdapter;

public class InnerClassDemo extends Applet {
	
	@Override
	public void init() {
		addMouseListener(new MyMouseListener2());
	}
	
	class MyMouseListener2 extends MouseAdapter{
		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {
			showStatus("Mouse Clicked");
		}
	}

}
