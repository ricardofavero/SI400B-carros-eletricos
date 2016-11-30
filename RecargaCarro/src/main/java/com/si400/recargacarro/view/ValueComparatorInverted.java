package com.si400.recargacarro.view;

import java.util.Comparator;
import java.util.Map;

/*
    UNICAMP - Faculdade de Tecnologia
    Disciplina SI400 - Programação Orientada a Objetos II (2016)

    Autores:
    Ricardo Favero       157161
    Fernanda Gravena     159702
    Isadora Fonseca      155815
    Marcela Magossi      156521 
 */

public class ValueComparatorInverted implements Comparator {
	Map map;
 
	public ValueComparatorInverted(Map map) {
		this.map = map;
	}
 
        @Override
	public int compare(Object keyA, Object keyB) {
		Comparable valueA = (Comparable) map.get(keyA);
		Comparable valueB = (Comparable) map.get(keyB);
		return valueA.compareTo(valueB);
	}
}