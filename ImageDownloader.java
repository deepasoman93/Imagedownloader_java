import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

 
public class ImageDownloader
{      
    public static void main(String[] args )
    {
        BufferedImage image =null;
        try{
 
            URL url =new URL("http://l1.yimg.com/t/frontpage/baba-ramdev-310511-60.jpg");

            // read and connect the url
            image = ImageIO.read(url);
            URLConnection urlConnection = url.openConnection();
            urlConnection.connect();
            
            // for get the size of the image 
            int file_size = urlConnection.getContentLength();
            System.out.println("Size of the image: "+ file_size);

 
            // for download jpg image
            ImageIO.write(image, "jpg",new File("/tmp/baba-ramdev.jpg"));
            
            
            // for get the height and weight of the image
            int height = image.getHeight();
            int width = image.getWidth();
            System.out.println("Height of the image : "+ height);
            System.out.println("Width of the image: "+ width);
 
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
