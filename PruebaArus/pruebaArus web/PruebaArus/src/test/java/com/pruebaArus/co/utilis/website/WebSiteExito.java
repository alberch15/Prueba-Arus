package com.pruebaArus.co.utilis.website;

import com.pruebaArus.co.pages.ExitoPage;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSiteExito {



    @Steps(shared = true)
    PageObject pruebaArus;

    @Step("Navegar al sitio web")
    public void navigateTo(String url){
        pruebaArus.setDefaultBaseUrl(url);
        pruebaArus.open();
    }
}
