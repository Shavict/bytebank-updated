package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;




public class TestOrdenarLista {
	

	public static void main(String[] args) {
		
		Cuenta cc1 = new CuentaCorriente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNombre("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Cuenta ca2 = new CuentaAhorros(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNombre("Guilermo");
		ca2.setTitular(clienteCC2);
		ca2.deposita(444.0);

		Cuenta cc3 = new CuentaCorriente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNombre("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Cuenta ca4 = new CuentaAhorros(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNombre("Ana");
		ca4.setTitular(clienteCC4);
		ca4.deposita(222.0);

		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(ca2);
		lista.add(cc3);
		lista.add(ca4);
	
		System.out.println("Antes de Ordenar");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		//lista.sort((Cuenta o1, Cuenta o2)-> 
		//		 Integer.compare(o1.getNumero(), o2.getNumero())
			
		);
				
		
		System.out.println("Despues de Ordenar");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
				
		Collections.sort(lista, (c1, c2)->
			 c1.getTitular().getNombre()
					.compareTo(c2.getTitular().getNombre())
		);
		
		
		System.out.println("Despues de Ordenar por nombre titular");
	//	for (Cuenta cuenta : lista) {
		//	System.out.println(cuenta);
	//	}
		
		lista.forEach(cuenta -> System.out.println(cuenta));
	}
}
		
			
			
	

	







	






	

