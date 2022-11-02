package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.security.cert.X509Certificate;

public class inventoryPage {
    public static WebDriver driver;

    public inventoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement product;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement item1;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    private WebElement item2;

    @FindBy(xpath = "//a[.='2']")
    private WebElement container;
    @FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
    private WebElement removeone;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutItem;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continou;

    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement subTotal;

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement tax;

    @FindBy(xpath = "//div[@class='summary_total_label']")
    private WebElement total;

    @FindBy(xpath = "//button[@id='finish']")
    private WebElement finish;

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement complete;

    public void sortProduck(String sortproduct){
        product.click();
        Select a = new Select(product);
        a.selectByVisibleText(sortproduct);
    }
public void pickItem1 (){
        item1.click();
}
public void pickItem2 (){
        item2.click();
}
public void Shop(){
        container.click();
}
public void clean(){removeone.click();}
public void checkOut(){
        checkoutItem.click();
}
public void name1(String customer){
        firstName.sendKeys(customer);
}
public void name2(String customers){
        lastName.sendKeys(customers);
}
public void namepost(String post){
        postalCode.sendKeys(post);
}
public void next(){
        continou.click();
}
public String subItem(){
        return subTotal.getText();
}
public String taxLabel(){
        return tax.getText();
}
public String totalLabel(){
        return total.getText();
}
public void end(){
        finish.click();
}
public String  buyAgain(){
        return complete.getText();
}
}