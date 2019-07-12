package com.cruds.io;

import java.io.File;

public class DirectoryDemo {
	
	public static void main(String[] args) {
		
		String dirname = "TestDirectory";
		File f1 = new File(dirname);

		if(f1.isDirectory()) {
			System.out.println("Directory : " + dirname);

			String[] s1 = f1.list();

			for(String x : s1)
			{
				File f = new File(dirname + "/" + x);
				if(f.isDirectory()) {
					System.out.println(x + " is a directory");
				}
				else {
					System.out.println(x + " is a file");
				}
			}

		}
		else
		{
			System.out.println(dirname + " is not a directory");
		}

	}

}
