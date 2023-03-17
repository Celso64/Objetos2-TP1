package modelo;

public class Comida extends Producto {

	public Comida(Double valor) {
		super.valor = valor;
	}

	@Override
	public Double devolvarValor(Integer descuento) {
		return (this.valor + this.valor * (descuento / 100));
	}

}
