
package createfile2;
import static com.sun.jmx.snmp.ThreadContext.contains;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class NewClass {
    
    public int numberReader(String motif) throws FileNotFoundException, IOException
{
 BufferedReader br= new BufferedReader( new FileReader("sequence.umd"));
 int lines=0, linesMotif=0;
 String read = br.readLine();
 while (read != null)
{
 if(read.spilt(","))[2].contains(motif)
{
 linesMotif += 1;
}
lines += 1;
} read=br.readLine();
return linesMotif;

    
    
}
}