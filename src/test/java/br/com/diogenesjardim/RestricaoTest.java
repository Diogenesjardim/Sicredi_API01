package br.com.diogenesjardim;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import br.com.diogenesjardim.setup.SetupTest;


public class RestricaoTest extends SetupTest {
	
	private static final String CONSULATR_UMA_RESTRICAO_CPF = "/v1/restricoes/97093236014";
	private static final String CONSULATR_UMA_RESTRICAO01_CPF = "/v1/restricoes/60094146012";
	private static final String CONSULATR_UMA_RESTRICAO02_CPF = "/v1/restricoes/84809766080";
	private static final String CONSULATR_UMA_RESTRICAO03_CPF = "/v1/restricoes/62648716050";
	private static final String CONSULATR_UMA_RESTRICAO04_CPF = "/v1/restricoes/26276298085";
	private static final String CONSULATR_UMA_RESTRICAO05_CPF = "/v1/restricoes/01317496094";
	private static final String CONSULATR_UMA_RESTRICAO06_CPF = "/v1/restricoes/55856777050";
	private static final String CONSULATR_UMA_RESTRICAO07_CPF = "/v1/restricoes/19626829001";
	private static final String CONSULATR_UMA_RESTRICAO08_CPF = "/v1/restricoes/24094592008";
	private static final String CONSULATR_UMA_RESTRICAO09_CPF = "/v1/restricoes/58063164083";
	
	
	@Test
	public void ConsultaUmaRestrição() {
		given()
		      .log().all()
		.when()
		      .get(CONSULATR_UMA_RESTRICAO_CPF)
		.then()
		     .log().all()
		     .statusCode(200)
		     .body("mensagem", is("O CPF 97093236014 tem problema"))
		     ;
		
	 
	}
	
	@Test
	public void ConsultaUmaRestrição01() {
		given()
		
		.when()
		      .get(CONSULATR_UMA_RESTRICAO01_CPF)
		.then()
		     .log().all()
		     .statusCode(200)
		     .body("mensagem", is("O CPF 60094146012 tem problema"))
		     ;

}
	
	@Test
	public void ConsultaUmaRestrição02() {
		given()
		//      .log().all()
		.when()
		      .get(CONSULATR_UMA_RESTRICAO02_CPF)
		.then()
		     .log().all()
		     .statusCode(200)
		     .body("mensagem", is("O CPF 84809766080 tem problema"))
		     ;
}
	
	@Test
	public void ConsultaUmaRestrição03() {
		given()
		//      .log().all()
		.when()
		      .get(CONSULATR_UMA_RESTRICAO03_CPF)
		.then()
		     .log().all()
		     .statusCode(200)
		     .body("mensagem", is("O CPF 62648716050 tem problema"))
		     ;
}
	
	@Test
	public void ConsultaUmaRestrição04() {
		given()
		//      .log().all()
		.when()
		      .get(CONSULATR_UMA_RESTRICAO04_CPF)
		.then()
		     .log().all()
		     .statusCode(200)
		     .body("mensagem", is("O CPF 26276298085 tem problema"))
		     ;
}
	
	@Test
	public void ConsultaUmaRestrição05() {
		given()
		//      .log().all()
		.when()
		      .get(CONSULATR_UMA_RESTRICAO05_CPF)
		.then()
		     .log().all()
		     .statusCode(200)
		     .body("mensagem", is("O CPF 01317496094 tem problema"))
		     ;
	
}
	
	@Test
	public void ConsultaUmaRestrição06() {
		given()
		//      .log().all()
		.when()
		      .get(CONSULATR_UMA_RESTRICAO06_CPF)
		.then()
		     .log().all()
		     .statusCode(200)
		     .body("mensagem", is("O CPF 55856777050 tem problema"))
		     ;
		
	}
		
		@Test
		public void ConsultaUmaRestrição07() {
			given()
			//      .log().all()
			.when()
			      .get(CONSULATR_UMA_RESTRICAO07_CPF)
			.then()
			     .log().all()
			     .statusCode(200)
			     .body("mensagem", is("O CPF 19626829001 tem problema"))
			     ;
			
		}
			
			@Test
			public void ConsultaUmaRestrição08() {
				given()
				//      .log().all()
				.when()
				      .get(CONSULATR_UMA_RESTRICAO08_CPF)
				.then()
				     .log().all()
				     .statusCode(200)
				     .body("mensagem", is("O CPF 24094592008 tem problema"))
				     ;
				
				
			}
				@Test
				public void ConsultaUmaRestrição09() {
					given()
					//      .log().all()
					.when()
					      .get(CONSULATR_UMA_RESTRICAO09_CPF)
					.then()
					     .log().all()
					     .statusCode(200)
					     .body("mensagem", is("O CPF 58063164083 tem problema"))
					     ;
					
				}
				
				
}