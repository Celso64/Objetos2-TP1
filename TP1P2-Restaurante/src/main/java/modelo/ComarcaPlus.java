package modelo;

import java.util.List;

public class ComarcaPlus implements Tarjeta {

	private final Integer DESCUENTO_COMIDA = 0;
	private final Integer DESCUENTO_BEBIDA = 0;
	private final Integer DESCUENTO = 2;

	public Integer getDESCUENTO_COMIDA() {
		return DESCUENTO_COMIDA;
	}

	public Integer getDESCUENTO_BEBIDA() {
		return DESCUENTO_BEBIDA;
	}

	public Integer getDESCUENTO() {
		return DESCUENTO;
	}

	@Override
	public Double pagarCuenta(Cuenta cuenta, Integer propina) {
		List<Producto> lista = cuenta.getValores();
		Double precio = 0.0;
		for (Producto p : lista) {
			precio += p.devolverValor(DESCUENTO);
		}
		precio *= (1.0 + (double) propina / 100.0);
		return precio;
	}

}
