package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	public static final Integer PROPINA_BAJA = 2;
	public static final Integer PROPINA_MEDIA = 3;
	public static final Integer PROPINA_ALTA = 5;

	private List<Producto> valores;

	public Cuenta() {
		this.valores = new ArrayList<Producto>();
	}

	public void addProducto(Producto p) {
		this.valores.add(p);
	}

	public List<Producto> getValores() {
		return valores;
	}

}
