package es.usal.bicoverlapper.controller.data.fileStructure;

import java.util.LinkedList;

import es.usal.bicoverlapper.controller.data.manager.CompleteFileManager;

/**
 * Class to read and write from a delimited text file
 * @author Rodrigo Santamaria
 *
 */
public class FileStructure implements GenericFileStructure
	{
	
	private char delimitador;
	private String nombreFichero=null;
	private LinkedList<String> fichero=null;
	
	/**
	 * Builds the FileStructure
	 * @param path	path of the file to manage
	 * @param del	delimiter used for fields
	 */
	public FileStructure(String path, char del)
		{
		nombreFichero=path;
		delimitador=del;
		try{
			fichero=CompleteFileManager.readFile(nombreFichero);
		}catch(Exception e){System.err.println(e.getStackTrace()); System.exit(1);}
		}
	
	/**
	 * Returns the number of rows in the file
	 * @return	the number of rows in the file
	 */
	public int numberOfRows()
		{
		int n=0;
		try{
		while(CompleteFileManager.readString(fichero, n, 0, delimitador)!=null)	n++;
		}catch(Exception e){System.err.println(e.getStackTrace()); System.exit(1);}
		return n;
		}
	
	/**
	 * Returns the number of columns in the file
	 * @return	the number of columns in the file
	 */
	public int numberOfCols()
		{
		int n=0;
		try{
		while(CompleteFileManager.readString(fichero, 0, n, delimitador)!=null)	n++;
		}catch(Exception e){System.err.println(e.getStackTrace()); System.exit(1);}
		return n;
		}
	
	public String read(String fich, int fila, int columna)
		{
		String devolver="";
		try{
		//*Utilizamos el ejercicio tres de clases para almacenar el fichero en una lista enlazada.	
		LinkedList<String> fichero=CompleteFileManager.readFile(fich);
	        
		//*Utilizamos el ejercicio tres de clases para tomar el campo.
		devolver=CompleteFileManager.readString(fichero, fila, columna, delimitador);
		
		}catch(Exception e){System.err.println("Error en SeisDelimitado.leer: "+e.getMessage());}
		return devolver;		
		}
	
	/**
	 * Reads a field as a float
	 * @param row	row of the field
	 * @param column	column of the field
	 * @return	float value for the requested field
	 */
	public float readFloat(int row, int column)
		{
		float devolver=-1;
		try{
		devolver=CompleteFileManager.readFloat(fichero, row, column, delimitador);
		}catch(Exception e){System.err.println("Error en SeisDelimitado.leer: "+e.getMessage());}
		return devolver;		
		}
	
	/**
	 * Reads a field as an integer
	 * @param row	row of the field
	 * @param column	column of the field
	 * @return	float value for the requested field
	 */
	public int readInt(int row, int column)
		{
		int devolver=-1;
		try{
		devolver=CompleteFileManager.readInt(fichero, row, column, delimitador);
		}catch(Exception e){System.err.println("Error en SeisDelimitado.leer: "+e.getMessage());}
		return devolver;		
		}
	
	/**
	 * Reads the fields in a row as a vector of integers
	 * @param row	row to read
	 * @return	LinkedList of Integers, each one from a field in the row
	 */
	public LinkedList<Integer> readIntRow(int row)
		{
		LinkedList<Integer> devolver=new LinkedList<Integer>();
		boolean fin=false;
		int numero=-1;
		int columna=0;
		while(!fin)
			{
			try{
			numero=CompleteFileManager.readInt(fichero, row, columna++, delimitador);
			}catch(Exception e){e.printStackTrace();}
			if(numero>0) devolver.add(numero-1);//OJO!!!: Arreglo provisional porque R me trae listas en 1,n y yo quiero en 0,n-1 teniendo en cuenta como lee el GraphMLReader
			else		fin=true;
			}
		return devolver;
		}

	/**
	 * Reads the fields in the row as a vector of strings
	 * @param row	row to read
	 * @return	LinkedList of Strings, each one from a field in the row
	 */
	public LinkedList<String> readRow(int row)
		{
		LinkedList<String> devolver=new LinkedList<String>();
		boolean fin=false;
		String texto=null;
		int columna=0;
		while(!fin)
			{
			try{
			texto=CompleteFileManager.readString(fichero, row, columna++, delimitador);
			}catch(Exception e){System.err.println(e.getMessage());}
			if(texto!=null && texto.length()>0) devolver.add(texto);
			else		fin=true;
			}
		return devolver;
		}

	public void write(String fich, int row, int column, String value)
		{
		try{
		CompleteFileManager.writeString(fichero,row,column,value,delimitador);
		CompleteFileManager.writeFile(fich, fichero);
		}catch(Exception e){System.err.println(e.getMessage());}
		}
	
	public void write(String file, int row, int column, int  value){}

	public void write(String file, int row, int column, double value){}

	public void write(String file, int row, int column, float value){}
	}
