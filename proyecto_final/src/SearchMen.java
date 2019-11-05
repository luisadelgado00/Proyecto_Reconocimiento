
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class SearchMen {
    
    public void arch(String x){
        int cont = 0;
        String path="C:\\Users\\luisa\\Pictures\\imagenes proyecto\\Criminals\\Male";
        String File;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
    
        for (int i = 0; i < listOfFiles.length; i++) {
            File=listOfFiles[i].getName();
            if (File.toLowerCase().contains(x.toLowerCase())) {
                CrearArchivo arch = new CrearArchivo();
                arch.generarPDF("Resultado busqueda Criminal", "El criminal, fue encontrado busque en la carpeta destino, la imagen correspondiente"
                        + "al mismo, verifique que corresponda, se encontro al criminal: ", "Policia General de la Nacion \n Este archivo es de calidad privada, no se tienen derechos para difundirlo", "C:\\Users\\luisa\\Pictures\\imagenes proyecto\\destino\\vrkmrvis.pdf");  
                Path orig = Paths.get("C:\\Users\\luisa\\Pictures\\imagenes proyecto\\Criminals\\Male\\"+File);
                Path dest = Paths.get("C:\\Users\\luisa\\Pictures\\imagenes proyecto\\destino");
                try {
                    Files.copy(orig, dest.resolve(orig.getFileName()));
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Este criminal fue encontrado en una busqueda anterior. ");
                }
                cont = cont+1;
            } else if(cont==0){
                CrearArchivo arch = new CrearArchivo();
                arch.generarPDF("Resultado busqueda Criminal", "El criminal,¡NO! fue encontrado"
                        + "GRACIAS POR AYUDAR A SU PAIS", "Policia General de la Nacion \n Este archivo es de calidad privada, no se tienen derechos para difundirlo", "C:\\Users\\luisa\\Pictures\\imagenes proyecto\\destino\\vrkmrvis.pdf");
            }
        }
    }
}
