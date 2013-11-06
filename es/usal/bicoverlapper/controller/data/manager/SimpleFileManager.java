package es.usal.bicoverlapper.controller.data.manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;

/**
 * This Manager just converts a file to a LinkedList with the lines in the file,
 * or a LinkedList of strings to a file 
 * NOTE: This class is to be deprecated
 * @author Rodrigo Santamaria
 *
 */
public class SimpleFileManager {


	/**
	 * Reads a file as a list of strings
	 * @param	fileName	path of the file to read
	 * @return	a LinkedList with strings corresponding to each line of the file read
	 */
	public static LinkedList<String> readFile(String fileName) throws Exception
	{
	String temp;
	LinkedList<String> ficheroLeido=new LinkedList<String>();
	FileReader in=new FileReader(fileName);
	BufferedReader fichero=new BufferedReader(in);

	temp=fichero.readLine();
	while(temp!=null) 
		{
		if(!temp.contains(":") && temp.length()>0)		ficheroLeido.addLast(temp);
		temp=fichero.readLine();
	    }
	return ficheroLeido;
	}



	/**
	 * Writes a file from a list of strings
	 * @param	fileName	path of the file to write
	 * @param lines	LinkedList with strings for each line of the file
	 */
	public static void writeFile(String fileName, LinkedList<String> lines) throws Exception
	{
	FileWriter out=new FileWriter(fileName);
	BufferedWriter fichero=new BufferedWriter(out);

	for(int i=0; i<lines.size(); i++)
		{
		fichero.write((String)(lines.get(i)));
		fichero.newLine();
		}
	fichero.close();
	out.close();	
	}
	
}

