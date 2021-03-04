// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   C_Integer.java

package com.yida_01;

import java.io.PrintStream;

public class C_Integer
{

	public C_Integer()
	{
	}

	public static void main(String args[])
	{
		Integer i = Integer.valueOf(100);
		i = Integer.valueOf(i.intValue() + 20);
		System.out.println((new StringBuilder("i:")).append(i).toString());
	}
}
