package br.com.diogenesjardim;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import br.com.diogenesjardim.setup.SetupTest;


public class AtualizaumaSimulaçãoTest extends SetupTest {
	
	private static final String ATUALIZAR_CPF = "/v1/simulacoes/470932360709";
	private static final String ATUALIZAR01_CPF = "/v1/simulacoes/470932360769";
	private static final String ATUALIZAR02_CPF = "/v1/simulacoes/450932360798";
	private static final String ATUALIZAR03_CPF = "/v1/simulacoes/340932360009";
	private static final String ATUALIZAR04_CPF = "/v1/simulacoes/834932360419";
	private static final String ATUALIZAR05_CPF = "/v1/simulacoes/880932360028";
	
	

	

	   @Test
	    public void AtualizarCpfTest() {
	               given()
	                     .body("{\n" +
	                        "  \"nome\": \"Fulano de Tal\",\n" +
	                        "  \"cpf\": 470932360709,\n" +
	                        "  \"email\": \"email@email.com\",\n" +
	                        "  \"valor\": 1200,\n" +
	                        "  \"parcelas\": 3,\n" +
	                        "  \"seguro\": true\n" +
	                        "}")
	               .when()
	                     .put(ATUALIZAR_CPF)
	                     .then()
	                     .log().all()
	                     .statusCode(200);


	    }

	    @Test
	    public void AtualizarCp01fTest() {
	               given()
	                     .body("{\n" +
	                        "  \"nome\": \"Bruna\",\n" +
	                        "  \"cpf\": 470932360769 ,\n" +
	                        "  \"email\": \"email@email.com\",\n" +
	                        "  \"valor\": 1200,\n" +
	                        "  \"parcelas\": 3,\n" +
	                        "  \"seguro\": true\n" +
	                        "}")
	               .when()
	                     .put(ATUALIZAR01_CPF)
	               .then()
	                     .statusCode(200)
	                     .log().all();


	    }

	    @Test
	    public void AtualizarCp02fTest() {
	               given()
	                     .body("{\n" +
	                        "  \"nome\": \"Rodrigo\",\n" +
	                        "  \"cpf\": 450932360798 ,\n" +
	                        "  \"email\": \"email@email.com\",\n" +
	                        "  \"valor\": 1200,\n" +
	                        "  \"parcelas\": 3,\n" +
	                        "  \"seguro\": true\n" +
	                        "}")
	                .when()
	                      .put(ATUALIZAR02_CPF)
	                .then()
	                      .statusCode(200)
	                      .log().all();


	    }

	    @Test
	    public void Atualizar03CpfTest() {
	               given()
	                     .body("{\n" +
	                        "  \"nome\": \"Edson\",\n" +
	                        "  \"cpf\": 340932360009 ,\n" +
	                        "  \"email\": \"email@email.com\",\n" +
	                        "  \"valor\": 1200,\n" +
	                        "  \"parcelas\": 3,\n" +
	                        "  \"seguro\": true\n" +
	                        "}")
	                .when()
	                     .put(ATUALIZAR03_CPF)
	                .then()
	                     .statusCode(200)
	                     .log().all();


	    }

	    @Test
	    public void Atualizar04CpfTest() {
	               given()
	                     .body("{\n" +
	                        "  \"nome\": \"Issac\",\n" +
	                        "  \"cpf\":834932360419 ,\n" +
	                        "  \"email\": \"email@email.com\",\n" +
	                        "  \"valor\": 1200,\n" +
	                        "  \"parcelas\": 3,\n" +
	                        "  \"seguro\": true\n" +
	                        "}")
	                .when()
	                     .put(ATUALIZAR04_CPF)
	                .then()
	                     .statusCode(200)
	                     .log().all();


	    }

	    @Test
	    public void Atualizar05CpfTest() {
	               given()
	                    .body("{\n" +
	                        "  \"nome\": \"David\",\n" +
	                        "  \"cpf\":880932360028,\n" +
	                        "  \"email\": \"email@email.com\",\n" +
	                        "  \"valor\": 1200,\n" +
	                        "  \"parcelas\": 3,\n" +
	                        "  \"seguro\": true\n" +
	                        "}")
	              .when()
	                    .put(ATUALIZAR05_CPF)
	              .then()
	                    .statusCode(200)
	                    .log().all();


	    }

}
