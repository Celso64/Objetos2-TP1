package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	public static final Integer PROPINA_BAJA = 2;
	public static final Integer PROPINA_MEDIA = 3;
	public static final Integer PROPINA_ALTA = 5;

	private List<Comida> comidas;
	private List<Bebida> bebidas;

	public Cuenta() {
		this.bebidas = new ArrayList<Bebida>();
		this.comidas = new ArrayList<Comida>();
	}

	public void addProducto(Comida c) {
		this.comidas.add(c);
	}

	public void addProducto(Bebida b) {
		this.bebidas.add(b);
	}

	public Double getValor(Integer descuentoBebida, Integer descuentoComida, Integer propina) {

		Double res = 0.0;

		for (Bebida b : bebidas) {
			res += b.devolverValor(descuentoBebida);
		}

		for (Comida c : comidas) {
			res += c.devolverValor(descuentoComida);
		}

		return res * (1.0 + (double) propina / 100.0);
	}

}
