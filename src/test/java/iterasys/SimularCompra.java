package iterasys;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SimularCompra {
    String url;// guardará o endereço do site alvo
    WebDriver driver; // objeto do selenum webDriver

    @Before
    public void inicializar() {
        //declarando o endereço do site alvo
        url = "https://iterasys.com.br/plataforma/home/index.php?action=initial"; //informando o local
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // instanciar o objeto selenium webDriver com o navegador chrome
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize(); // maximiza a janela do navegador//////
        //
    }
    @After
    public void finalizar() {
        //driver.quit(); // destruir o objeto Selenium webDriver
    }

    @Test
    public void SimularCompra () throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);
        driver.findElement(By.className("nav-menu-courses")).click(); // clica teste de software QA

        // pagina home p pesquisa
        driver.findElement(By.id("mectrl_headerPicture")).click();
        // clica no icone cursos
        driver.findElement(By.id("idSIButton9")).click(); // clicar teste de software e QA

        Thread.sleep(3000);
        driver.findElement(By.className("nav-menu-courses")).click(); // clica teste de software QA
        Thread.sleep(3000);

        driver.findElement(By.id("idSIButton9")).click(); // clica no botao matricula se
        Thread.sleep(30000);
    }
}
 //   }
        // pagina de tarefas
   //     driver.findElement(By.id("baseAddInput-addList")).click(); // clika no elemento "nova Lista"
   //     driver.findElement(By.id("baseAddInput-addList")).clear(); // para limpar no elemento
        // driver.findElement(By.id("baseAddInput-addList")).sendKeys("Musicas");// cola a palavra musica

        // cria a lista musica
  //      driver.findElement(By.id("baseAddInput-addList")).sendKeys(Keys.chord("Musicas")); // soletra a palavra musica
        // Todo:implementa o print da tela
 //       driver.findElement(By.id("baseAddInput-addList")).sendKeys(Keys.ENTER);// preciona a tecla enter

        // adiciona 3 musicas a lista
//        Thread.sleep(3000);
//        driver.findElement(By.id("baseAddInput-addTask")).sendKeys("O Quereres" + Keys.ENTER);
//        driver.findElement(By.id("baseAddInput-addTask")).sendKeys("Terra" + Keys.ENTER);
//        driver.findElement(By.id("baseAddInput-addTask")).sendKeys("Me Gusta" + Keys.ENTER);

 //   }

//}