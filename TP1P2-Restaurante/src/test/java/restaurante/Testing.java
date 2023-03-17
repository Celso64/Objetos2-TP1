package restaurante;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import modelo.ComarcaPlus;
import modelo.Cuenta;
import modelo.Mastercard;
import modelo.Producto;
import modelo.Tarjeta;
import modelo.TipoProducto;
import modelo.Viedma;
import modelo.Visa;

class Testing {

	private Tarjeta TarjetaDeCredito;

	@Test
	void ProbandoVisa() {

		TarjetaDeCredito = new Visa();
		Producto p = new Producto(TipoProducto.BEBIDA, 900);
		Cuenta c = new Cuenta();
		c.addProducto(p);
		Double precio = TarjetaDeCredito.pagarCuenta(c, Cuenta.PROPINA_MEDIA);

		assertEquals(899.19, precio);
	}

	@Test
	void ProbandoMasterCard() {
		TarjetaDeCredito = new Mastercard();
		Producto p = new Producto(TipoProducto.COMIDA, 900);
		Cuenta c = new Cuenta();
		c.addProducto(p);
		Double precio = TarjetaDeCredito.pagarCuenta(c, Cuenta.PROPINA_MEDIA);

		assertEquals(908.46, precio);
	}

	@Test
	void ProbandoComarcaPlus() {
		TarjetaDeCredito = new ComarcaPlus();
		Producto p = new Producto(TipoProducto.COMIDA, 900);
		Cuenta c = new Cuenta();
		c.addProducto(p);
		Double precio = TarjetaDeCredito.pagarCuenta(c, Cuenta.PROPINA_MEDIA);

		assertEquals(908.46, precio);
	}

	@Test
	void ProbandoViedma() {
		TarjetaDeCredito = new Viedma();
		Producto p = new Producto(TipoProducto.COMIDA, 900);
		Cuenta c = new Cuenta();
		c.addProducto(p);
		Double precio = TarjetaDeCredito.pagarCuenta(c, Cuenta.PROPINA_MEDIA);

		assertEquals(927.0, precio);
	}

}
