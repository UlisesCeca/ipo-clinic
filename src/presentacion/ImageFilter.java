package presentacion;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class ImageFilter extends FileFilter {

	@Override
	public boolean accept(File arg0) {

		boolean aceptar = arg0.isDirectory();
		if (!aceptar) {
			String extension = getExtension(arg0);
			if (extension != null)
				aceptar = extension.equals("png") || extension.equals("gif") || extension.equals("jpg");
		}
		return aceptar;
	}

	@Override
	public String getDescription() {
		return "Fichero de imagen (*.jpg | *.gif | *.png)";
	}
	
	public String getExtension(File f){
		String s=f.getPath();
		String extension=null;
		int i=s.lastIndexOf('.');
		if(i>0 && i<s.length()-1){
			extension=s.substring(i+1).toLowerCase();
		}
		return extension;
	}

}
