import static org.junit.Assert.*;

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

}
