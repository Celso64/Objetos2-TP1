package modelo;

import java.util.List;

public class ComarcaPlus implements Tarjeta {

	private final Integer DESCUENTO = 2;

	@Override
	public Double pagarCuenta(Cuenta cuenta, Integer propina) {
		List<Producto> lista = cuenta.getValores();
		Double precio = 0.0;
		for (Producto p : lista) {
			precio += p.valor() - p.valor() * (DESCUENTO / 100.0);
		}
		precio *= (1 + propina / 100.0);
		return precio;
	}

}
