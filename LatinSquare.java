
import java.io.*;

public class LatinSquare 
{
	// Matrix that will be used to hold the Latin square matrix data
	Matrix M;
	
	/*
	 * Read a file as a square matrix
	 */
	public LatinSquare(String filename) throws IOException
	{
		// Open the file
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        
        // Read a row of text
        String line;
        int i = 0;
        while ((line = reader.readLine()) != null) 
        {
        	// Split the text by tab
            String[] parts = line.split("\t");
            
            // Create the matrix if we haven't from the number of parts
            if (M == null)
            {
            	M = new Matrix(parts.length, parts.length);
            }
            
            // Set the matrix from the line
            for (int j=0; j<parts.length; j++)
            {
            	double value = Double.parseDouble(parts[j]);
                M.setMatrixValue(i, j, value);
            }
            
            // Increment the line number
            i++;
        }
        
        reader.close();
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return M.toString();
	}
	
	/*
	 * Check if the row is a valid for a Latin square
	 */
	public boolean isRowLatin(int row)
	{
		return false;
	}
	
	/*
	 * Check if the column is valid for a Latin square
	 */
	public boolean isColumnLatin(int col)
	{
		return false;
	}
	
	/*
	 * Check if the matrix is a Latin square
	 */
	public boolean isLatin()
	{
		return false;
	}
}
