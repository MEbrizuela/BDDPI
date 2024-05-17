package page.PlataformaIntegracion.Woocommerce;

import framework.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut extends BasePage {

    private By btnRealizaPedido = By.xpath("//button[@value='Realizar el pedido' and @data-value='Realizar el pedido']");
    private By totalDeArriba = By.xpath("(//span[@class='woocommerce-Price-amount amount'])[3]");
    private By totalDeAbajo = By.xpath("(//span[@class='woocommerce-Price-amount amount'])[14]");
    private By numeroPedido = By.xpath("//*[@class='woocommerce-order-overview__order order' and strong]");
    private By correoUsLocator = By.xpath("//*[@class='woocommerce-order-overview__email email' and strong]");
    private By fechaLocator = By.xpath("//*[@class='woocommerce-order-overview__date date' and strong]");


    public CheckOut(WebDriver driver) {
        super(driver);
    }

    public void mostrarDatosDelPedido(){
        String NpedidoTienda =  extraerNumeros(numeroPedido);
        String FechaPedido = getText(fechaLocator);
        String CorreoUser = getText(correoUsLocator);
        String Total =  getText(totalDeArriba);
        System.out.println("--------------------------------"+
                "\nDatos del Checkout: \n" + NpedidoTienda + "\n"
                + FechaPedido + "\n" + CorreoUser + "\n" + Total +
                "\n--------------------------------");

    }

    public void checkTienda(){
        waitForSeconds(2);
        click(btnRealizaPedido);
        waitForSeconds(2);
        mostrarDatosDelPedido();
    }

}


