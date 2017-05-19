package kadai;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void test1() {
		IntToEng ite = new IntToEng();
		String s = "nineteen";
		String t = ite.translateEng(19);
		assertThat(t,is(s));
	}
	@Test
	public void test2(){
		IntToEng ite = new IntToEng();
		String s = "twenty";
		String t = ite.translateEng(20);
		assertThat(t,is(s));
	}
	@Test
	public void test3(){
		IntToEng ite = new IntToEng();
		String s = "forty two";
		String t = ite.translateEng(42);
		assertThat(t,is(s));
	}
	@Test
	public void test4(){
		IntToEng ite = new IntToEng();
		String s = "one hundred";
		String t = ite.translateEng(100);
		assertThat(t,is(s));
	}
	@Test
	public void test5(){
		IntToEng ite = new IntToEng();
		String s = "one hundred one";
		String t = ite.translateEng1(101);
		assertThat(t,is(s));
	}
	@Test
	public void test6(){
		IntToEng ite = new IntToEng();
		String s = "one hundred eleven";
		String t = ite.translateEng1(111);
		assertThat(t,is(s));
	}
	@Test
	public void test7(){
		IntToEng ite = new IntToEng();
		String s = "one thousand";
		String t = ite.translateEng1(1000);
		assertThat(t,is(s));
	}
	@Test
	public void test8(){
		IntToEng ite = new IntToEng();
		String s = "one";
		String t = ite.translateEng(1);
		assertThat(t,is(s));
	}
	/*
 	@Test
	public void snakeToCamelcaseのテストその1() {
	SnakeCamelUtil scu = new SnakeCamelUtil();
	String expected = "Abc";
	String actual  = scu.snakeToCamelcase("abc");
	assertThat(actual, is(expected));
	System.out.println(actual);
}
 */
	
}
