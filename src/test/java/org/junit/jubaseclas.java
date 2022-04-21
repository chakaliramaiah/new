package org.junit;

import java.util.Date;

public class jubaseclas {
	@BeforeClass
public static void beforeclass() {
		System.out.println("Browser configuration");
		}
	@AfterClass
	public static void afterclss() {
		System.out.println("close Browser");
	}
	@Before
	public void EachMethod() {
		Date d = new Date();
		System.out.println("Start Time:"+d);	
	}
	@Test
	public void tc1() {
		System.out.println("tc1");
			}
	@Test
	public void tc2() {
		System.out.println("tc2");
	}
	private void Sysout() {
System.out.println();	

}
}