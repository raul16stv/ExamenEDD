import static org.junit.Assert.*;

import java.awt.Point;
import java.awt.PointerInfo;

import org.junit.Test;

public class AclassTest {
	Aclass a= new Aclass();

	@Test
	public void concatTest(){
		String esperado1="hola";
		String esperado2="adios";
		String esperado3="enchufe";
		String esperado4="bombilla";
		
		
		
		assertEquals(esperado1, a.concat(true, "HO","LA"));
		assertEquals(esperado2, a.concat(true, "a","dios"));
		assertEquals(esperado3, a.concat(true, "enc","hufe"));
		assertEquals(esperado4, a.concat(true, "bombi","lla"));
		try {
		assertEquals(null, a.concat(true,null,null));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void locateTest(){
		int x=1;
		int y=2;
		double esperado=(1.2);
		assertEquals(0, a.locate(x, y));
		try {
			assertEquals(1, a.locate(0, 0));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
