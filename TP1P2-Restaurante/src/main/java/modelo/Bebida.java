package modelo;

public class Bebida extends Producto {

	public Bebida(Double valor) {
		super.valor = valor;
	}

	@Override
	public Double devolvarValor(Integer descuento) {
		return (this.valor + this.valor * (descuento / 100));
	}
}
