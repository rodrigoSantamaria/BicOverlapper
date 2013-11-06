package es.usal.bicoverlapper.controller.data.filter;

import java.io.File;

import javax.swing.filechooser.FileFilter;

/**
 * Bicluster Results file format filter for JFileChooser
 * @author Rodrigo	Santamaria
 */
public class BiclusterResultsFilter extends FileFilter{
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
     * Decides if a file is acceptable as Bicluster Results file
     * @param	f	File to check
     * @return	true if the file extension is bic, false otherwise
     */
    public boolean accept(File f) 
    	{
        if (f.isDirectory()) 							       return true;

        String extension = getExtension(f);
        if (extension != null) 
        	{
            if (extension.equals("bic"))                  return true;
            else								              return false;
            }

        return false;
    	}

    //The description of this filter
    /**
     * Returns the description of Bicluster Result files
     * @return	A brief String description of expected files for Bicluster Result.
     */
    public String getDescription() {
        return "Space delimited text document (.bic)";
    }
    
    public String getExtension()
    	{
    	return ".bic";
    	}
    
}