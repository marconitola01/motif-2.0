
package createfile2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public final  class file {
    public file() throws IOException {
    {
     
        BufferedWriter bw = new BufferedWriter(new FileWriter("sequences.umd"));
        for (int i=0; i<1000;i++)
        {
            bw.write(createExperimentalRead());
        }
        bw.flush();
    }
    
   
    public String createExperimentalRead()
    {
        String read = "";
        Random rd = new Random();
        int number1 = Math.abs(rd.nextInt());
        int length = 5 + rd.nextInt(26);
        
        read = number1 + ","+(number1+length) + "," + createSequences(length);
        return read;
    }

    
    public String createSequences(int length)
    {
        
        String sequence = "";
        Random rd=new Random();
        for(int i =0; i < length;i++)
        {
            switch(rd.nextInt(4))
            {
                case 0:
                { sequence +="A";} break;
                case 1:
                { sequence +="C";} break;
                case 2:
                { sequence +="G";} break;
                case 3:
                { sequence +="T";} break;
            }
        }
        return sequence;
    }
    
    


public static void main(String[]args) throws IOException {
file cf = new file();
}
}


public int numberReader(String motif)
{
 BufferedReader br= BufferedRreader( new FileReader("sequence.umd"));
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
