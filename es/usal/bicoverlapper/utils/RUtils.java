package es.usal.bicoverlapper.utils;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.rosuda.JRI.REXP;
import org.rosuda.JRI.Rengine;

/** Utility class with methods that would be very slow to run on R
 * 
 * @author rodri
 *
 */
public final class RUtils {
	
	/**
	 * Wraps cad into a tryCatch method, and runs it with re
	 * If an error occurs, it shows an error message and returns null, otherwise it returns the expression
	 * NOTE: if exp use an assignment, use '<-', not '='
	 * 
	 * @param exp
	 * @param re
	 * @return
	 */
	public static REXP tryCatch(String cad, Rengine re)
		{
		REXP exp=re.eval("res<-tryCatch("+cad+", error=function(e){e})");
		if(re.eval("length(res$message)").asInt()>0)
			{//print message and return null
			JOptionPane.showMessageDialog(null, re.eval("res$message").asString(), "R/Bioconductor error", JOptionPane.ERROR_MESSAGE);
			return null;
			}
		else
			return exp;
		}
	/**
	 * Converts a list of list L (where Ln contains the elements related to the object n)
	 *   to a matrix A, elements are in columns, and objects in rows, where Aij is 1 if the element j is in the list Li corresponding to the object i 
	 * @return
	 */
	public final int[][] listToMatrix(ArrayList<ArrayList<String>> list, int nrows, int ncols)
		{
		int[][] mat=new int[nrows][ncols];
		for(int i=0;i<nrows;i++)	for(int j=0;j<ncols;j++)	mat[i][j]=0;
		
		/*for(ArrayList<String> l : list)
			{
			for(String s : l)
				{
				System.out.println(s);
				}
			}*/
		return mat;
		}
	/**
	 * Builds up an R structure c("id1", "id2", ...) for the elements in the list
	 * NOTE: Can take a lot if a huge list (~1min for 50000 elements)
	 * @param list
	 * @return
	 */
	public static String getRList(String[] list)
		{
		String ret="c(";
		for(String i:list)
			{
			ret+="\""+i+"\",";
			}
		return ret.substring(0, ret.length()-1)+")";
		}
	
	/**
	 * Builds up an R structure c("id1", "id2", ...) for the elements in the list
	 * @param list
	 * @return
	 */
	public static String getRList(Integer[] list)
		{
		String ret="c(";
		for(Integer i:list)
			{
			ret+=i+",";
			}
		return ret.substring(0, ret.length()-1)+")";
		}
	public String sayHello(String cad)
		{
		return "Hello"+cad;
		}
}
