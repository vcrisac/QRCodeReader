package QrCodeUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

import static QrCodeUtils.QRCodeReader.decodeQRCodeFromAnImageOnURL;

public class QRCodeFromWebPage {

    public static void read() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baeldung.com/java-generating-barcodes-qr-codes");

        String imgUrl = driver.findElement(By.xpath("//a[contains(@href, 'qrcode')]//img")).getAttribute("src");
        String decodedText = decodeQRCodeFromAnImageOnURL(imgUrl);

        if (decodedText == null) {
            System.out.println("No QR Code found on the image on the web page");
        } else {
            System.out.println("Decoded text from web image: \n" + decodedText);
        }

        driver.quit();

    }

}
