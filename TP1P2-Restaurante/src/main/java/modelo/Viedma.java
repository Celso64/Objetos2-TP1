package modelo;

import java.util.ArrayList;
import java.util.List;

public class Viedma implements Tarjeta {

	@Override
	public Double pagarCuenta(Cuenta cuenta, Integer propina) {

		List<Double> lista = new ArrayList<>();

		cuenta.getValores().forEach(x -> lista.add((double) x.valor()));

		Double precio = 0.0;

		precio = lista.stream().reduce(0.0, (x, y) -> x + y);
		precio *= (1 + propina / 100.0);

		return precio;
	}

}
