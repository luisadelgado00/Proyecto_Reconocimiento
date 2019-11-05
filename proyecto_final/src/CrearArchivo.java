
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
//import java.io.IOException;
import javax.imageio.ImageIO;
//import javax.swing.JFileChooser;



public class CrearArchivo {
   String cadena;
   private Font fuenteBold = new Font(Font.FontFamily.COURIER, 10, Font.BOLD);
   private Font fuenteNormal = new Font(Font.FontFamily.COURIER, 8, Font.NORMAL);
   private Font fuenteItalic = new Font(Font.FontFamily.COURIER, 10, Font.ITALIC);
   
   public void generarPDF(String header, String info, String footer, String salida){
       try {
           Document doc = new Document(PageSize.A4, 35, 35, 10, 10);
           PdfWriter.getInstance(doc, new FileOutputStream(salida));
           Robot robot = new Robot();
           Rectangle rec = new Rectangle(380,17,500,450);
           BufferedImage image = robot.createScreenCapture(rec);
           File folder = new File("C:\\Users\\luisa\\Pictures\\imagenes proyecto\\destino\\imagen.png");
           ImageIO.write(image, "png", folder);
           doc.open();
           doc.add(getHeader(header));
           Image imagen =Image.getInstance("C:\\Users\\luisa\\Pictures\\imagenes proyecto\\destino\\imagen.png");
           imagen.scaleAbsolute(200, 200);
           imagen.setAlignment(Element.ALIGN_CENTER);
           doc.add(imagen);
           doc.add(getInfo(info));
           doc.add(getFooter(footer));
           doc.close();
           
       } catch (Exception e) {
       }    
       
   }
   private Paragraph getHeader(String texto){
       Paragraph p= new Paragraph();
       Chunk c = new Chunk();
       p.setAlignment(Element.ALIGN_CENTER);
       c.append(texto);
       c.setFont(fuenteBold);
       p.add(c);
       return p;
   }
   private Paragraph getInfo(String texto){
       Paragraph p= new Paragraph();
       Chunk c = new Chunk();
       p.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
       c.append(texto);
       c.setFont(fuenteNormal);
       p.add(c);
       return p;
   }
   private Paragraph getFooter(String texto){
       Paragraph p= new Paragraph();
       Chunk c = new Chunk();
       p.setAlignment(Element.ALIGN_LEFT);
       c.append(texto);
       c.setFont(fuenteItalic);
       p.add(c);
       return p;
   }

   
   
    /*public void imagen(String x) throws IOException, DocumentException{
       try{
        Robot robot = new Robot();
        Rectangle rec = new Rectangle(380,17,500,450);
        FileOutputStream archivo = new FileOutputStream(x+"hola.pfd");
        Document doc = new Document();
        doc.open();
           BufferedImage image = robot.createScreenCapture(rec);
           //File folder = new File("C:\\Users\\luisa\\Pictures\\imagenes proyecto\\destino\\imagen.png");
           //ImageIO.write(image, "png", folder);
           Image imagencita = image;
           
            PdfWriter.getInstance(doc, archivo);
            
            doc.addTitle("Criminal");
            doc.add(imagencita);
            doc.close();
        }catch(AWTException e){
           System.out.println("Error al crear la captura de pantalla");
        }
        
         */
    }
   

