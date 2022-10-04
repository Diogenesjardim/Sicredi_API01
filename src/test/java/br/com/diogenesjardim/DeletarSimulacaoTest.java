package br.com.diogenesjardim;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import br.com.diogenesjardim.setup.SetupTest;



public class DeletarSimulacaoTest extends SetupTest {
	
	private static final String DELETA_SIMULACAO_CPF = "/v1/simulacoes/470932360709";
	
	@Test
    public void testDadoQueDeletoUmUsuarioQuandoPreenchoAsiInformacoesEntaoValidoStatusCode200(){
         given()
               .log().all()
         .when()
               .delete(DELETA_SIMULACAO_CPF)
         .then()
               .statusCode(200)
               .log().all()
               
         ;


}
	
}