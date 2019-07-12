package com.cruds.io;

import java.io.File;
import java.io.FilenameFilter;

public class HtmlFileFilter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(".html");
	}
	
	

}
