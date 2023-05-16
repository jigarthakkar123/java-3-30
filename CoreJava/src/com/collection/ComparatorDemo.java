package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo implements Comparator<Emp>{

	public int compare(Emp e1, Emp e2) {
		int value=0;
		if(e1.getSal()>e2.getSal())
		{
			value=-1;
		}
		else if(e1.getSal()<e2.getSal())
		{
			value=1;
		}
		else if(e1.getSal()==e2.getSal())
		{
			value=0;
		}
		return value;
	}
	public static void main(String[] args) {
		ArrayList<Emp> list=new ArrayList<>();
		
		Emp e1=new Emp();
		e1.setEid(1);
		e1.setEname("Harsh");
		e1.setSal(15000);
		
		Emp e2=new Emp();
		e2.setEid(2);
		e2.setEname("Anjali");
		e2.setSal(20000);
		
		Emp e3=new Emp();
		e3.setEid(3);
		e3.setEname("Archana");
		e3.setSal(30000);
		
		Emp e4=new Emp();
		e4.setEid(4);
		e4.setEname("Heer");
		e4.setSal(8000);
		
		Emp e5=new Emp();
		e5.setEid(5);
		e5.setEname("Shradhha");
		e5.setSal(10000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Collections.sort(list, new ComparatorDemo());
		for(Emp e:list)
		{
			System.out.println("EID : "+e.getEid()+" ENAME : "+e.getEname()+" SALARY : "+e.getSal());
		}
	}
	
}
