package page.PlataformaIntegracion.Woocommerce;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Home extends BasePage {

    private By menuGroceries = By.xpath("(//a[@class='menu-link'])[2]");

    private By btnAgregarAcarrito = By.xpath("//button[@type='submit']");

    public Home(WebDriver driver) {
        super(driver);
    }

    public void agregarAlCarrito() {
        for (int i = 1; i <= 1; i++) {
            String productoLocator = "(//a[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[" + i + "]";
            click(menuGroceries);
            click(By.xpath(productoLocator));
            click(btnAgregarAcarrito);
        }

        System.out.println("Se agregaron todos los productos al carrito");
    }
}
