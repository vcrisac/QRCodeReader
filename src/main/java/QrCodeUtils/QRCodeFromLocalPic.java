package QrCodeUtils;

import java.io.File;
import java.io.IOException;

import static QrCodeUtils.QRCodeReader.decodeQRCodeFromAnImage;

public class QRCodeFromLocalPic {
    public static void read() {
        try {
            File file = new File("./baeldung.png");
            String decodedText = decodeQRCodeFromAnImage(file);
            if(decodedText == null) {
                System.out.println("No QR Code found on them locally stored image");
            } else {
                System.out.println("Decoded text from local image: \n" + decodedText);
            }
        } catch (IOException e) {
            System.out.println("Could not decode QR Code from local image, IOException :: " + e.getMessage());
        }
    }
}
