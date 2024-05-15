package page.PlataformaIntegracion.Woocommerce;

import framework.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut extends BasePage {

    private By btnRealizaPedido = By.xpath("//button[@value='Realizar el pedido' and @data-value='Realizar el pedido']");

//    private By btnFinalizaCompra = By.xpath("//a[@class='checkout-button button alt wc-forward']");
    private By totalDeArriba = By.xpath("(//span[@class='woocommerce-Price-amount amount'])[3]");
    private By totalDeAbajo = By.xpath("(//span[@class='woocommerce-Price-amount amount'])[14]");

    public CheckOut(WebDriver driver) {
        super(driver);
    }

    public void validarTotales(){

        clickWithRetry(btnRealizaPedido);
        waitForSeconds(2);
        comparadorTexto(totalDeArriba,totalDeAbajo);


    }

}
