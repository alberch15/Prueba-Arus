package com.pruebaArus.co.pages;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ExitoPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"__next\"]/header/section/div/div[1]/button")
    protected WebElementFacade menu_exito;

    @FindBy(xpath = "//*[@id=\"__next\"]/header/aside/ul/section[1]/div/li[1]/div/div/p")
    protected WebElementFacade categoria_exito;

    @FindBy(xpath = "//*[@id=\"column-1\"]/li/ul/li[2]/a")
    protected WebElementFacade subcategoria_exito;

    @FindBy(xpath = "//button[span[text()='Agregar']]")
    protected  List<WebElement> elementos;

    @FindBy(className = "QuantitySelectorDefault_plus__7TM3c")
    protected List<WebElement> plus;







}
