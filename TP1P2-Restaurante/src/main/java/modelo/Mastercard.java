package modelo;

import java.util.List;

public class Mastercard implements Tarjeta {

	private final Integer DESCUENTO_COMIDA = 2;

	@Override
	public Double pagarCuenta(Cuenta cuenta, Integer propina) {
		List<Producto> lista = cuenta.getValores();
		Double precio = 0.0;
		for (Producto p : lista) {
			if (p.tipo().toString() == TipoProducto.COMIDA.toString()) {
				precio += p.valor() - p.valor() * (DESCUENTO_COMIDA / 100.0);
			} else if (p.tipo().toString() == TipoProducto.BEBIDA.toString()) {
				precio += p.valor();
			}
		}
		precio *= (1 + propina / 100.0);
		return precio;
	}

}
