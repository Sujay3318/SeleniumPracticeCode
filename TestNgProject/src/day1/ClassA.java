package day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassA {

	@Test(priority = 1)
	public void Test1() {
		System.out.println("test1");
	}

	@Test
	public void Test2() {
		System.out.println("test2");
	}

	@Test(priority = -1)
	public void Test3() {
		System.out.println("test3");
	}

	@Test(dataProvider = "getdata")
	public void getdatatomethod(int id, String name) {
		System.out.println("id =" + id + "name " + name);
	}

	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[3][2];
		data[0][0] = 1;
		data[0][1] = "sujay";
		data[1][0] = 2;
		data[1][1] = "jay";
		data[2][0] = 3;
		data[2][1] = "suyash";
		return data;
	}

	@Test(enabled = false)
	public void Test4() {
		System.out.println("test3");
	}

	@Test
	public void Test5() {
		System.out.println("test5");
	}

	@Test(dependsOnMethods = "Test5")
	public void Test6() {
		System.out.println("test6");
	}

	@Test(groups = "{smoke}")
	public void Test7() {
		System.out.println("test6");
	}

	@Test(groups = "{smoke}")
	public void Test8() {
		
		HashMap<String, String>map=new HashMap<String, String>();
		
		HashMap<String, String>map1=new HashMap<String, String>();
		Object[][] ob= new Object[][] {  {map} , {map1}  };
		//Object[][] ob= new Object[][] {  {map,1} , {map1,2}  };
		System.out.println(ob.length);
		System.out.println(ob[1].length);
		System.out.println(ob[0][0]);
		System.out.println(ob[1][0]);
	}
	
	@Test(groups = "{smoke}")
	public void Test9() {
		
		HashMap<String, String>map=new HashMap<String, String>();
		
		HashMap<String, String>map1=new HashMap<String, String>();
		
		List<HashMap<String, String>> listHashmap=new ArrayList<HashMap<String, String>>() ;
		listHashmap.add(map);
		listHashmap.add(map1);
		Object[][] ob= new Object[][] {{listHashmap}  };
	
		System.out.println(ob.length);
		//System.out.println(ob[1].length);
		System.out.println(ob[0][0]);
		
	}
}
