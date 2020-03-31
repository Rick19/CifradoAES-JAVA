package cifradoaes;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Autor:   Rick
 * Detalle: Encriptado por algoritmo AES
 */
public class CifradoAES {
    public static void main(String[] args) {
        
        final String clave = "SrRick!";
        String cadena_original = "www.rickstechnology.com.mx";
        
        try {

            Encriptador encriptador = new Encriptador();


            String cadema_encriptada = encriptador.encriptar(cadena_original, clave);
            String desencriptado = encriptador.desencriptar(cadema_encriptada, clave);

            // Imprimimos los resultados
            System.out.println("Cadena Original: " + cadena_original);
            System.out.println("Cadena Encriptada     : " + cadema_encriptada);
            System.out.println("Desencriptado  : " + desencriptado);

        } catch (UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(Encriptador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
