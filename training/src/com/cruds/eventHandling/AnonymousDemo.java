package com.cruds.eventHandling;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AnonymousDemo extends Applet{
	
	@Override
	public void init() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				showStatus("Mouse Clicked");
			}
		});
	}
}