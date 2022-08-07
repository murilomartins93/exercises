package model.services;

import java.util.List;

public class CalculationService<T> {

	public static <T extends Comparable<? super T>> T max(List<T> list) {
// O método max do tipo T, irá trabalhar com qualquer classe do tipo <T>, 
//	que implemente a classe comparable<T>, ou qualquer superclasse de produto
		
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}

}
