/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.edwin.my;

/**
 *
 * @author edwin
 */
public class AxisTWB {
	/**
	 * 提供了一个说Hello的服务
	 * @return
	 */
	public String sayHello(String name){
		return "Hello "+name;
	}
	
	/**
	 * 提供了一个做加法的服务
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a,int b){
		return a + b;
	}
	
}

