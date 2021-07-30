package com.example.demo.service;

import com.example.demo.domain.Coche;

public class CocheFactory {
	
	private static final String ELECTRICO = "electrico";
	private static final String GASOLINA = "gasolina";
	private static final String HIDROGENO = "hidrogeno";

	private CocheFactory() {}

	public static Coche creaCocheTipo(String tipo) {
				
		return switch (tipo) {
			case ELECTRICO -> CochesFacade.creaCocheElectrico1();
			case GASOLINA -> CochesFacade.creaCocheGasolina2();
			case HIDROGENO -> CochesFacade.creaCocheHibrido2();

			default -> throw new IllegalArgumentException("Unexpected value: " + tipo);
		};
	}
}
