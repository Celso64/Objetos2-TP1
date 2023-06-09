package restaurante;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import modelo.Bebida;
import modelo.ComarcaPlus;
import modelo.Comida;
import modelo.Cuenta;
import modelo.Mastercard;
import modelo.Tarjeta;
import modelo.Viedma;
import modelo.Visa;

class Testing {

	private Tarjeta tarjetaDeCredito;

	@Test
	void ProbandoVisa() {

		tarjetaDeCredito = new Visa();
		Bebida bebida = new Bebida(900.0);
		Cuenta cuenta = new Cuenta();
		cuenta.addProducto(bebida);
		Double precio = tarjetaDeCredito.pagarCuenta(cuenta, Cuenta.PROPINA_MEDIA);

		assertEquals(899.19, precio);
	}

	@Test
	void ProbandoMasterCard() {
		tarjetaDeCredito = new Mastercard();
		Comida comida = new Comida(900.0);
		Cuenta cuenta = new Cuenta();
		cuenta.addProducto(comida);
		Double precio = tarjetaDeCredito.pagarCuenta(cuenta, Cuenta.PROPINA_MEDIA);

		assertEquals(908.46, precio);
	}

	@Test
	void ProbandoComarcaPlus() {
		tarjetaDeCredito = new ComarcaPlus();
		Comida comida = new Comida(900.0);
		Cuenta cuenta = new Cuenta();
		cuenta.addProducto(comida);
		Double precio = tarjetaDeCredito.pagarCuenta(cuenta, Cuenta.PROPINA_MEDIA);

		assertEquals(908.46, precio);
	}

	@Test
	void ProbandoViedma() {
		tarjetaDeCredito = new Viedma();
		Comida comida = new Comida(900.0);
		Cuenta cuenta = new Cuenta();
		cuenta.addProducto(comida);
		Double precio = tarjetaDeCredito.pagarCuenta(cuenta, Cuenta.PROPINA_MEDIA);

		assertEquals(927.0, precio);
	}

}
