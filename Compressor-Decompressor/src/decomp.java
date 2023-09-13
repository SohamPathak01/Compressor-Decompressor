import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class decomp {

    public static void method(File file) throws IOException{
        String fileDirectory=file.getParent();
        String filename=file.getName();
        int n=filename.length()-13;
        filename="Decompressed-"+filename.substring(0, n);


        FileInputStream fis=new FileInputStream(file);
        GZIPInputStream gzip=new GZIPInputStream(fis);
        FileOutputStream fos=new FileOutputStream(fileDirectory+"/"+filename);

        byte[] buffer=new byte[1024];
        int len;

        while((len=gzip.read(buffer))!=-1){
            fos.write(buffer, 0, len); 
        }

        gzip.close();
        fos.close();
        fis.close();

    }
    
}
