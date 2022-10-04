package br.com.diogenesjardim;

import static io.restassured.RestAssured.given;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.diogenesjardim.setup.SetupTest;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CadastroTest extends SetupTest {
	
	private static final String CADASTRO_USUARIO = "/v1/simulacoes";
	
	   
	    @Test
	    public void t0_0testDadoQueCadastroUsuarioQuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
	    	given()
            .body("{\n" +
               "  \"nome\": \"papito\",\n" +
               "  \"cpf\": 470932360709,\n" +
               "  \"email\": \"papito@email.com\",\n" +
               "  \"valor\": 2200,\n" +
               "  \"parcelas\": 3,\n" +
               "  \"seguro\": true\n" +
               "}")
      .when()
            .post(CADASTRO_USUARIO)
      .then()
            .log().all()
            .assertThat()
            .statusCode(201)
            .extract().path("id")
            ;

		       


		 
	 }
	 
	    @Test
	    public void t0_1testDadoQueCadastroUsuario01QuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
		 given()
              .body("{\n" +
                 "  \"nome\": \"joao\",\n" +
                 "  \"cpf\": 470932360769,\n" +
                 "  \"email\": \"papito@email.com\",\n" +
                 "  \"valor\": 2200,\n" +
                 "  \"parcelas\": 3,\n" +
                 "  \"seguro\": true\n" +
                 "}")
              
        .when()
              .post(CADASTRO_USUARIO)
        .then()
              .log().all()
              .assertThat()
              .statusCode(201)
              .extract().path("id")
              ;


}
	 
	    @Test
	    public void t0_2testDadoQueCadastroUsuario02QuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
		 
		 given()
              .body("{\n" +
                 "  \"nome\": \"Pedro\",\n" +
                 "  \"cpf\": 450932360798,\n" +
                 "  \"email\": \"pedro@email.com\",\n" +
                 "  \"valor\": 8200,\n" +
                 "  \"parcelas\": 3,\n" +
                 "  \"seguro\": true\n" +
                 "}")
            
         .when()
              .post(CADASTRO_USUARIO)
              .then()
              .log().all()
              .assertThat()
              .statusCode(201)
              .extract().path("id")
              ;

}
	 
	    @Test
	    public void t0_3testDadoQueCadastroUsuario03QuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
		 
		 given()
              .body("{\n" +
                 "  \"nome\": \"Gabril\",\n" +
                 "  \"cpf\": 340932360009,\n" +
                 "  \"email\": \"biel@email.com\",\n" +
                 "  \"valor\": 6700,\n" +
                 "  \"parcelas\": 3,\n" +
                 "  \"seguro\": true\n" +
                 "}")
             
        .when()
              .post(CADASTRO_USUARIO)
        .then()
              .log().all()
              .assertThat()
              .statusCode(201)
              .extract().path("id")
              
              ;

}
	 
	    @Test
	    public void t0_4testDadoQueCadastroUsuario04QuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
		 
		 given()
              .body("{\n" +
                 "  \"nome\": \"Araujo\",\n" +
                 "  \"cpf\": 834932360419,\n" +
                 "  \"email\": \"araujo@email.com\",\n" +
                 "  \"valor\": 7200,\n" +
                 "  \"parcelas\": 3,\n" +
                 "  \"seguro\": true\n" +
                 "}")
            
        .when()
              .post(CADASTRO_USUARIO)
        .then()
              .log().all()
              .assertThat()
              .statusCode(201)
              .extract().path("id")
              
              ;
	 }
	 
	 
	    @Test
	    public void t0_5testDadoQueCadastroUsuario05QuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
		 
		 given()
               .body("{\n" +
                 "  \"nome\": \"gabi\",\n" +
                 "  \"cpf\": 880932360028,\n" +
                 "  \"email\": \"gabi@email.com\",\n" +
                 "  \"valor\": 9200,\n" +
                 "  \"parcelas\": 2,\n" +
                 "  \"seguro\": true\n" +
                 "}")
              
         .when()
               .post(CADASTRO_USUARIO)
         .then()
               .log().all()
               .assertThat()
               .statusCode(201)
               .extract().path("id")
               
               ;
	 }
	 
	    @Test
	    public void t0_6testDadoQueCadastroUsuario06QuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
		 
		 given()
         .body("{\n" +
                 "  \"nome\": \"david\",\n" +
                 "  \"cpf\": 8809323611138,\n" +
                 "  \"email\": \"pedro@email.com\",\n" +
                 "  \"valor\": 4200,\n" +
                 "  \"parcelas\": 2,\n" +
                 "  \"seguro\": true\n" +
                 "}")
       
         .when()
         .post(CADASTRO_USUARIO)
         .then()
         .log().all()
         .assertThat()
         .statusCode(201)
         .extract().path("id")
         
         ;
	 }
	 
	 
	    @Test
	    public void t0_7testDadoQueCadastroUsuario07QuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
		 
		 given()
               .body("{\n" +
                 "  \"nome\": \"Ezequias\",\n" +
                 "  \"cpf\": 110932360178,\n" +
                 "  \"email\": \"zequias@email.com\",\n" +
                 "  \"valor\": 6200,\n" +
                 "  \"parcelas\": 3,\n" +
                 "  \"seguro\": true\n" +
                 "}")
               
        .when()
              .post(CADASTRO_USUARIO)
        .then()
              .log().all()
              .assertThat()
              .statusCode(201)
              .extract().path("id")
              
              ;

		 
	 }
	 
	    @Test
	    public void t0_8testDadoQueCadastroUsuario08QuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
		 
		 
		 given()
               .body("{\n" +
                 "  \"nome\": \"Sandro\",\n" +
                 "  \"cpf\": 660932360018,\n" +
                 "  \"email\": \"sadro@email.com\",\n" +
                 "  \"valor\": 7800,\n" +
                 "  \"parcelas\": 2,\n" +
                 "  \"seguro\": true\n" +
                 "}")
             
        .when()
              .post(CADASTRO_USUARIO)
        .then()
              .log().all()
              .assertThat()
              .statusCode(201)
              .extract().path("id")
              
              ;
	 }   
	 
	    
	    @Test
	    public void t0_9testDadoQueCadastroUsuario09QuandoPreenchoAsiInformacoesEntaoValidoStatusCode201() {
		 
		 
		 given()
               .body("{\n" +
                 "  \"nome\": \"Silmara\",\n" +
                 "  \"cpf\": 660932368889,\n" +
                 "  \"email\": \"sadro@email.com\",\n" +
                 "  \"valor\": 7800,\n" +
                 "  \"parcelas\": 2,\n" +
                 "  \"seguro\": true\n" +
                 "}")
              
        .when()
              .post(CADASTRO_USUARIO)
        .then()
              .log().all()
              .assertThat()
              .statusCode(201)
              .extract().path("id")
              
              ;
	 }   
	 
	 
	 }
	 
	 
	 


	 

