import QrCodeUtils.QRCodeFromLocalPic;
import QrCodeUtils.QRCodeFromWebPage;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        QRCodeFromLocalPic.read();

        QRCodeFromWebPage.read();
    }
}
