package pom;

import org.openqa.selenium.By;

public class Login {
	public By SignIn = By.linkText("Sign In");
	public By mail = By.name("login[username]");
	public By Password = By.id("pass");
	public By signinbutton = By.id("send2");
	public By whatsnew = By.xpath("(//a[@class='level-top ui-corner-all'])[1]");
	public By jackets = By.linkText("Jackets");
	public By junojacket = By.xpath("(//a[@class='product-item-link'])[2]");
	public By size = By.xpath("//div[@id='option-label-size-143-item-168']");
	public By colour = By.xpath("//div[@id='option-label-color-93-item-57']");
	public By qty = By.xpath("//input[@class='input-text qty']");
	public By cart = By.xpath("//button[@id='product-addtocart-button']");
	

}
