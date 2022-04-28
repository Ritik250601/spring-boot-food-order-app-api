package com.ritik.foodordering.util;

import java.io.FileOutputStream;
import java.io.InputStream;

import org.springframework.stereotype.Service;

@Service
public class FileHandler {
	
	 public boolean saveFile(InputStream is, String path) {
	    	boolean f = false;
	    	
	    	try {
				byte[] b = new byte[is.available()];
				is.read(b);

				FileOutputStream fos = new FileOutputStream(path);
				fos.write(b);
				fos.flush();
				fos.close();
				f = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			return f;
		}

}
