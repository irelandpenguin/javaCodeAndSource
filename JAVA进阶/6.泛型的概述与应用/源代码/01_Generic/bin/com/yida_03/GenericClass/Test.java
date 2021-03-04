// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Test.java

package com.yida_03.GenericClass;

import java.io.PrintStream;

// Referenced classes of package com.yida_03.GenericClass:
//			GenericClass

public class Test
{

	public Test()
	{
	}

	public static void main(String args[])
	{
		GenericClass gt = new GenericClass();
		gt.setObj("hello");
		String s = (String)gt.getObj();
		System.out.println(s);
		System.out.println("------");
		GenericClass gtt = new GenericClass();
		gtt.setObj(Integer.valueOf(100));
		Integer i = (Integer)gtt.getObj();
		System.out.println(i);
		System.out.println("------");
		GenericClass gt2 = new GenericClass(new Character('A'), "Œ‚æ©", 35);
		System.out.println((new StringBuilder()).append(gt2.getObj()).append("---").append(gt2.getName()).append("---").append(gt2.getAge()).toString());
		System.out.println(gt2);
		System.out.println("------");
		GenericClass gt3 = new GenericClass(Double.valueOf(3.1400000000000001D), "¿Ó¡¨Ω‹", 56);
		System.out.println((new StringBuilder()).append(gt3.getObj()).append("---").append(gt3.getName()).append("---").append(gt3.getAge()).toString());
		System.out.println(gt3);
	}
}
