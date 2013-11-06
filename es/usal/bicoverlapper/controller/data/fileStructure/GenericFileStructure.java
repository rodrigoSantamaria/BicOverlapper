package es.usal.bicoverlapper.controller.data.fileStructure;

/**
 * Interface for reading/writing delimited files
 * 
 * @author Rodrigo Santamaria
 *
 */
public interface GenericFileStructure 
	{

	/**
	 * Reads a string field.
	 * @param file	path of the file to read
	 * @param row	row of the fiel to read
	 * @param column	column of the field to read
	 * @return	the string at the corresponding field position
	 */
	public String read(String file, int row, int column);
	
	/**
	 * Writes a string at the corresponding position
	 * @param file	path of the file to write
	 * @param row	row of the field to write
	 * @param column	column of the field to write
	 * @param value	text to write at the corresponding field position
	 */
	public void write(String file, int row, int column, String value);
	
	/**
	 * Writes an integer at the corresponding position
	 * @param file	path of the file to write
	 * @param row	row of the field to write
	 * @param column	column of the field to write
	 * @param value	text to write at the corresponding field position
	 */
	public void write(String file, int row, int column, int  value);
	
	/**
	 * Writes a double at the corresponding position
	 * @param file	path of the file to write
	 * @param row	row of the field to write
	 * @param column	column of the field to write
	 * @param value	text to write at the corresponding field position
	 */
	public void write(String file, int row, int column, double value);
	
	/**
	 * Writes a float at the corresponding position
	 * @param file	path of the file to write
	 * @param row	row of the field to write
	 * @param column	column of the field to write
	 * @param value	text to write at the corresponding field position
	 */
	public void write(String file, int row, int column, float value);
	}
