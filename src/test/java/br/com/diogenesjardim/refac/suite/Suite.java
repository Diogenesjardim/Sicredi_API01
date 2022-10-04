package br.com.diogenesjardim.refac.suite;



import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;


import br.com.diogenesjardim.AtualizaumaSimulaçãoTest;
import br.com.diogenesjardim.CadastroTest;
import br.com.diogenesjardim.DeletarSimulacaoTest;
import br.com.diogenesjardim.NovaSimulacaoTest;
import br.com.diogenesjardim.RestricaoTest;
import br.com.diogenesjardim.SimulacaoTest;
import br.com.diogenesjardim.setup.SetupTest;




@RunWith(org.junit.runners.Suite.class)
@SuiteClasses({
	RestricaoTest.class,
	CadastroTest.class,
	AtualizaumaSimulaçãoTest.class,
	NovaSimulacaoTest.class,
	SimulacaoTest.class,
	DeletarSimulacaoTest.class,
	
	
})


public class Suite extends SetupTest  {
	
	

}
