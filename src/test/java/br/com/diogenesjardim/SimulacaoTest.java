package br.com.diogenesjardim;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import br.com.diogenesjardim.setup.SetupTest;



public class SimulacaoTest extends SetupTest {
	
	private static final String CONSULTAR_TODOS_USUARIOS = "/v1/simulacoes";
	
	
	
	 @Test
	    public void  testDadoQueConsultoTodosUsuariosQuandoPreenchoAsInformacoesEntaoValidoStatusCode200() {
		 
		  given()
          .when()
               .get(CONSULTAR_TODOS_USUARIOS)
          .then()
               .log().all();

	 }

	
	}


