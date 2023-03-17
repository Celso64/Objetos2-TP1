package restaurante;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import modelo.Bebida;
import modelo.ComarcaPlus;
import modelo.Comida;
import modelo.Cuenta;
import modelo.Mastercard;
import modelo.Producto;
import modelo.Tarjeta;
import modelo.Viedma;
import modelo.Visa;

class Testing {

	private Tarjeta tarjetaDeCredito;

	@Test
	void ProbandoVisa() {

		tarjetaDeCredito = new Visa();
		Producto p = new Bebida(900.0);
		Cuenta c = new Cuenta();
		c.addProducto(p);
		Double precio = tarjetaDeCredito.pagarCuenta(c, Cuenta.PROPINA_MEDIA);

		assertEquals(899.19, precio);
	}

	@Test
	void ProbandoMasterCard() {
		tarjetaDeCredito = new Mastercard();
		Producto p = new Comida(900.0);
		Cuenta c = new Cuenta();
		c.addProducto(p);
		Double precio = tarjetaDeCredito.pagarCuenta(c, Cuenta.PROPINA_MEDIA);

		assertEquals(908.46, precio);
	}

	@Test
	void ProbandoComarcaPlus() {
		tarjetaDeCredito = new ComarcaPlus();
		Producto p = new Comida(900.0);
		Cuenta c = new Cuenta();
		c.addProducto(p);
		Double precio = tarjetaDeCredito.pagarCuenta(c, Cuenta.PROPINA_MEDIA);

		assertEquals(908.46, precio);
	}

	@Test
	void ProbandoViedma() {
		tarjetaDeCredito = new Viedma();
		Producto p = new Comida(900.0);
		Cuenta c = new Cuenta();
		c.addProducto(p);
		Double precio = tarjetaDeCredito.pagarCuenta(c, Cuenta.PROPINA_MEDIA);

		assertEquals(927.0, precio);
	}

}
