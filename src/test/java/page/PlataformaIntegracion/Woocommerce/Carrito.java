package page.PlataformaIntegracion.Woocommerce;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Carrito extends BasePage {
    private By btnVerCarrito = By.xpath("//a[contains(text(),'Ver') and @tabindex='1']");

    private By seleccionarEnvioClasico = By.xpath("(//input[@name=\"shipping_method[0]\"])[4]");
    private By btnFinalizarCompra = By.xpath("//a[@class='checkout-button button alt wc-forward']");

    public Carrito(WebDriver driver) {
        super(driver);
    }
    public void verCarrito(){

        click(btnVerCarrito);
        click(seleccionarEnvioClasico);
        click(btnFinalizarCompra);
        System.out.println("Se visualiza el carrito");
    }

}
