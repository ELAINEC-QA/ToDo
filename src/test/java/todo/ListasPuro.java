// toda class tem 1 pacote=conj de classes
package todo;

// 2- Bibliotecas= Métodos e funções prontos
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

// 3 - Classe
public class ListasPuro {
    //3.1- Atributos =Caracteristicas valores
    String url; // guardará o endereço do site alvo
    WebDriver driver; // objeto do selenum webDriver

    //3.2- Métodos ou funcionalidades = O que ele sabe fazer

    @Before
    public void inicializar() {
        //declarando o endereço do site alvo
        url = "https://todo.microsoft.com";

        //informando o local
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // instanciar o objeto selenium webDriver com o navegador chrome
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize(); // maximiza a janela do navegador
    }

    @After
    public void finalizar() {
        //driver.quit(); // destruir o objeto Selenium webDriver
    }

    @Test
    public void criarListaComTresItens() throws InterruptedException {
        driver.get(url);

        // pagina de login
        driver.findElement(By.id("mectrl_headerPicture")).click(); // clica no icone de sign In/ log In
        Thread.sleep(3000);
        driver.findElement(By.id("i0116")).sendKeys("cardosoe66@gmail.com"); // preeche/cola o e-mail
        driver.findElement(By.id("idSIButton9")).click(); // clica no botao proximo
        Thread.sleep(3000);
        driver.findElement(By.id("i0118")).sendKeys("EC06064321EC");// PREENCHE A COLA DA SENHA
        driver.findElement(By.id("idSIButton9")).click(); // clica no botao prox
        driver.findElement(By.id("idSIButton9")).click(); // clica no botao sim
        Thread.sleep(30000);

        // pagina de tarefas
        driver.findElement(By.id("baseAddInput-addList")).click(); // clika no elemento "nova Lista"
        driver.findElement(By.id("baseAddInput-addList")).clear(); // para limpar no elemento
        // driver.findElement(By.id("baseAddInput-addList")).sendKeys("Musicas");// cola a palavra musica

        // cria a lista musica
        driver.findElement(By.id("baseAddInput-addList")).sendKeys(Keys.chord("Musicas")); // soletra a palavra musica
        // Todo:implementa o print da tela
        driver.findElement(By.id("baseAddInput-addList")).sendKeys(Keys.ENTER);// preciona a tecla enter

        // adiciona 3 musicas a lista
        Thread.sleep(3000);
        driver.findElement(By.id("baseAddInput-addTask")).sendKeys("O Quereres" + Keys.ENTER);
        driver.findElement(By.id("baseAddInput-addTask")).sendKeys("Terra" + Keys.ENTER);
        driver.findElement(By.id("baseAddInput-addTask")).sendKeys("Me Gusta" + Keys.ENTER);


        // mudar o nome da lista para 'Minhas Músicas"
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("h2.listTitle")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input.chromeless")).clear();
        driver.findElement(By.cssSelector("input.chromeless")).sendKeys(Keys.chord("Minhas Musicas" + Keys.ENTER));



        // apagar a lista "Minhas Músicas"
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button.loadingButton")).click();
        Thread.sleep(3000);
        driver.findElement(new By.ByXPath("/html/body/div[2]/div/div/div/div/div/div[2]/ul/li[5]/button\n")).click();
        Thread.sleep(3000);
        driver.findElement(new By.ByXPath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/button[2]")).click();

    }

}