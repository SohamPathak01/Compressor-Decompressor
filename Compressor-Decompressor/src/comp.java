import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class comp {

    public static void method(File file) throws IOException{
        String fileDirectory=file.getParent();
        String filename=file.getName();
        filename+="Compressed.gz";

        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(fileDirectory+"/"+filename);
        GZIPOutputStream gzip=new GZIPOutputStream(fos);

        byte[] buffer=new byte[1024];
        int len;

        while((len=fis.read(buffer))!=-1){
            gzip.write(buffer, 0, len);
        }

        gzip.close();
        fos.close();
        fis.close();
        
    }

   // public static void main(String[] args) throws IOException{
     //   File path=new File("/Users/JAMY/OneDrive/Desktop/Compressor -  Decompressor/TestFile");
       // method(path);

    //}
    
}
