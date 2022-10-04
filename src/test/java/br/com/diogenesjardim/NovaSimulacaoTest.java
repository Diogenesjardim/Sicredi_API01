package br.com.diogenesjardim;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import br.com.diogenesjardim.setup.SetupTest;


public class NovaSimulacaoTest extends SetupTest {
	
	private static final String INSERIR_UMA_NOVA_SIMULACAO = "/v1/simulacoes";
	
	
	@Test
    public void Insereumanovasimulação() {
               given()
                     .body("{\n" +
                        "  \"nome\": \"Froripa\",\n" +
                        "  \"cpf\":84093236077,\n" +
                        "  \"email\": \"fro@email.com\",\n" +
                        "  \"valor\": 3200,\n" +
                        "  \"parcelas\": 2,\n" +
                        "  \"seguro\": true\n" +
                        "}")
               .when()
                     .post(INSERIR_UMA_NOVA_SIMULACAO)
               .then()
                     .statusCode(201)
                     .log().all();

    }

    @Test
    public void Insereumanovasimulação01() {
                given()
                      .body("{\n" +
                        "  \"nome\": \"gugu\",\n" +
                        "  \"cpf\":3409323607,\n" +
                        "  \"email\": \"gu@email.com\",\n" +
                        "  \"valor\": 3300,\n" +
                        "  \"parcelas\": 2,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                
                .when()
                      .post(INSERIR_UMA_NOVA_SIMULACAO)
                .then()
                      .statusCode(201)
                      .log().all();

    }

    @Test
    public void Insereumanovasimulação02() {
                given()
                      .body("{\n" +
                        "  \"nome\": \"Rafael\",\n" +
                        "  \"cpf\":5609323607,\n" +
                        "  \"email\": \"fael@email.com\",\n" +
                        "  \"valor\": 2200,\n" +
                        "  \"parcelas\": 2,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                     
                .when()
                      .post(INSERIR_UMA_NOVA_SIMULACAO)
                .then()
                      .statusCode(201)
                      .log().all();

    }

    @Test
    public void Insereumanovasimulação03() {
                given()
                      .body("{\n" +
                        "  \"nome\": \"\",\n" +
                        "  \"cpf\":,\n" +
                        "  \"email\": \"fael@email.com\",\n" +
                        "  \"valor\": 2200,\n" +
                        "  \"parcelas\": 2,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                      
                .when()
                      .post(INSERIR_UMA_NOVA_SIMULACAO)
                .then()
                      .statusCode(400)
                      .log().all();

    }
    @Test
    public void Insereumanovasimulação005() {
                given()
                      .body("{\n" +
                        "  \"nome\": \"vania\",\n" +
                        "  \"cpf\":77093236077,\n" +
                        "  \"email\": \"vani@email.com\",\n" +
                        "  \"valor\": 3200,\n" +
                        "  \"parcelas\": 2,\n" +
                        "  \"seguro\": true\n" +
                        "}")
                   
                .when()
                      .post(INSERIR_UMA_NOVA_SIMULACAO)
                .then()
                      .statusCode(201)
                      .log().all();


    }
	

}
