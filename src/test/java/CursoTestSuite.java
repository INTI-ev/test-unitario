

import general.SampleStaticRoutinesLargestParamTest;
import general.SampleStaticRoutinesTest;
import minefield.MineFieldTest;
import minefield.MineTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cobertura.CajaBlancaTest;
import dobles.OrderTest;

@RunWith(Suite.class)
@SuiteClasses( {
	SampleStaticRoutinesTest.class,
	SampleStaticRoutinesLargestParamTest.class,
	MineTest.class,
	MineFieldTest.class,
	OrderTest.class,
	CajaBlancaTest.class
} )
public class CursoTestSuite {

}
