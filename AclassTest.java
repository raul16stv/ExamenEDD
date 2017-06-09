import static org.junit.Assert.*;

import java.awt.Button;
import java.awt.Point;
import java.awt.PointerInfo;

import javax.swing.JFrame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
@RunWith(org.mockito.junit.MockitoJUnitRunner.class)
public class AclassTest {
	Aclass a= new Aclass();
	@Mock
	Aclass b;
	@Mock
	Button boton;
	@Mock
	JFrame frame;
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
		int x1=100;
		int y1=200;
		
		Point esperado= new Point(1, 2);
		Point esperado2= new Point(100, 200);
		Point casodecero= new Point(0,0);
		
		assertEquals(esperado, a.locate(x, y));
		assertEquals(esperado2, a.locate(x1, y1));
		try {
			assertEquals(casodecero, a.locate(0, 0));
		} catch (Exception e) {

		}
	}
	
	public void Mockito1Test(){
	Button boton;
	Point punto= new Point(10, 10);
	
	
	
	}
	public void Mockito2Test(){
		Mockito.when(b.mockito2(frame, boton)).thenReturn(1);
		
	}
	}


