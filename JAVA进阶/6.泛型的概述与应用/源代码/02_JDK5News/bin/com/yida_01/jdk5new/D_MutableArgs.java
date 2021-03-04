// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   D_MutableArgs.java

package com.yida_01.jdk5new;

import java.io.PrintStream;

public class D_MutableArgs
{

	public D_MutableArgs()
	{
	}

	public static void main(String args[])
	{
		int a = 10;
		int b = 20;
		int result = sum(new int[] {
			a, b
		});
		System.out.println((new StringBuilder("result=")).append(result).toString());
		int x = 12;
		int y = 90;
		int result2 = sum(new int[] {
			x, y, 10
		});
		System.out.println((new StringBuilder("result=")).append(result2).toString());
		int m = 0;
		int n = 9;
		int result3 = sum(new int[] {
			m, n, 10, 20
		});
		System.out.println((new StringBuilder("result=")).append(result3).toString());
	}

	public static transient int sum(int args[])
	{
		int s = 0;
		int ai[];
		int j = (ai = args).length;
		for (int i = 0; i < j; i++)
		{
			int num = ai[i];
			s += num;
		}

		return s;
	}
}
