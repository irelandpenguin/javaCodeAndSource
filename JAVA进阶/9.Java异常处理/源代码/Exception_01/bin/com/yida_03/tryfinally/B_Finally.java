// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   B_Finally.java

package com.yida_03.tryfinally;

import java.io.PrintStream;

public class B_Finally
{

	public B_Finally()
	{
	}

	public static void main(String args[])
	{
		int s = test();
		System.out.println(s);
	}

	public static int test()
	{
		int a = 10;
		System.out.println(a / 0);
		a = 20;
		break MISSING_BLOCK_LABEL_35;
		ArithmeticException e;
		e;
		int i;
		a = 30;
		i = a;
		a = 40;
		return i;
		Exception exception;
		exception;
		a = 40;
		throw exception;
		a = 40;
		return a;
	}

	public static void test2()
	{
		System.out.println(10 / 0);
		break MISSING_BLOCK_LABEL_24;
		Exception exception;
		exception;
		System.out.println("释放资源");
		throw exception;
		System.out.println("释放资源");
		return;
	}

	public static void test3()
	{
		int a;
		int b;
		int arr[];
		a = 8;
		b = 0;
		arr = (new int[] {
			12, 1, 23
		});
		try
		{
			System.out.println(a / b);
			System.out.println(arr[3]);
		}
		catch (ArithmeticException arithmeticexception)
		{
			System.out.println("释放资源");
			break MISSING_BLOCK_LABEL_89;
		}
		catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
		{
			System.out.println("释放资源");
			break MISSING_BLOCK_LABEL_89;
		}
		break MISSING_BLOCK_LABEL_81;
		Exception exception;
		exception;
		System.out.println("释放资源");
		throw exception;
		System.out.println("释放资源");
	}
}
