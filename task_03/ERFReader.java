package task_03;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ERFReader {
	public String getContents(String path) { // Reads the file and returns it's contents in a string.
		String contents = "";
		BufferedReader in = null;
		try{
			in = new BufferedReader(new FileReader(path)); //open stream to file
			try {
				String line = "";
				while ((line = in.readLine()) != null) { // Iterates through each line in the document and adds them to the output string
					contents = contents + line + "\r";
				}
			}
			catch(IOException e) {
				System.out.println("Error while reading the file");
			}
			finally {
				in.close(); // Close the file stream when finished reading it.
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch (IOException e) {
			System.out.println("File could not be opened or closed");
		}
		return contents;
	}
}