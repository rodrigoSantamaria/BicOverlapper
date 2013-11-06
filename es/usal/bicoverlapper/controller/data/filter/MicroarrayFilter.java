package es.usal.bicoverlapper.controller.data.filter;

import java.io.File;

import javax.swing.filechooser.FileFilter;

/**
 * Microarray file format filter for JFileChooser
 * @author Rodrigo	Santamaria
 */
public class MicroarrayFilter extends FileFilter{
    static final String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1).toLowerCase();
        }
        return ext;
    }
    
  
    static final String getExtension(String s) 
    	{
        String ext = null;
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1)          ext = s.substring(i+1).toLowerCase();
        return ext;
    	}
    
    /**
     * Decides if a file is acceptable as Microarray file
     * @param	f	File to check
     * @return	true if the file extension is txt, false otherwise
     */
    public boolean accept(File f) 
    	{
        if (f.isDirectory()) 							       return true;

        String extension = getExtension(f);
        if (extension != null) 
        	{
            if (extension.equals("txt"))                  return true;
            else								              return false;
            }

        return false;
    	}

    //The description of this filter
    /**
     * Returns the description of Microarray files
     * @return	A brief String description of expected files for Microarray.
     */
    public String getDescription() {
        return "Tab delimited BicOverlapper expression data (.txt)";
    }
}
