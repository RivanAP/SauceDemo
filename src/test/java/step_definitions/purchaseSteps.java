package step_definitions;

import com.example.LoginPage;
import com.example.inventoryPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class purchaseSteps {
    private WebDriver webDriver;

    public purchaseSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }
@Then("User sort product by \"(.*)\"")
    public void selectProduct(String product){
        inventoryPage inventory = new inventoryPage(webDriver);
        inventory.sortProduck(product);
}
@Then("User Select item")
    public void selectitem(){
        inventoryPage inventory = new inventoryPage(webDriver);
        inventory.pickItem1();
        inventory.pickItem2();
}
@Then("User get to shopping")
    public void shopping(){
        inventoryPage inventory = new inventoryPage(webDriver);
        inventory.Shop();
}
@Then("User remove one item")
    public void removeitem(){
        inventoryPage inventory = new inventoryPage(webDriver);
        inventory.clean();}
@Then("User continou Shopping")
    public void nextStep(){
        inventoryPage inventory = new inventoryPage(webDriver);
        inventory.checkOut();
}
@Then("User insert name \"(.*)\" last name \"(.*)\" and posecode \"(.*)\"")
    public void insertName(String fname ,String lName,String pCode) {
        inventoryPage inventory = new inventoryPage(webDriver);
        inventory.name1(fname);
        inventory.name2(lName);
        inventory.namepost(pCode);
}
@Then("User get to nominal price")
    public void nominal(){
        inventoryPage inventory = new inventoryPage(webDriver);
        inventory.next();
}
@Then("User can see subtotal\"(.*)\"")
    public void subtotal(String subitem){
        inventoryPage inventory = new inventoryPage(webDriver);
        inventory.subItem();
        Assert.assertEquals(subitem, inventory.subItem());
}
@Then("User can see tax\"(.*)\"")
    public void totaltax(String tTax){
        inventoryPage inventory = new inventoryPage(webDriver);
        inventory.taxLabel();
        Assert.assertEquals(tTax, inventory.taxLabel());
}
@Then("User can see total payment\"(.*)\"")
    public void payment(String buyitem){
        inventoryPage inventory = new inventoryPage(webDriver);
        inventory.totalLabel();
        Assert.assertEquals(buyitem, inventory.totalLabel());
}
@Then("User Continou to payment")
    public void continouPayment(){
        inventoryPage inventory = new inventoryPage(webDriver);
        inventory.end();
}
@Then("User Succes shopping and will see\"(.*)\"")
    public void Succes (String succesbuy){
        inventoryPage inventory = new inventoryPage(webDriver);
        inventory.buyAgain();
        Assert.assertEquals(succesbuy, inventory.buyAgain());
    }
}
