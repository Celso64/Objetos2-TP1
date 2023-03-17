package objetos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concurso {

	private LocalDate fechaInicio;
	private Integer plazo;
	private List<Participante> participantes;

	public Concurso(Integer plazo) {
		this.fechaInicio = LocalDate.now();
		this.plazo = plazo;
		this.participantes = new ArrayList<Participante>();
	}

	public Concurso(LocalDate fecha, Integer plazo) {
		this.fechaInicio = fecha;
		this.plazo = plazo;
		this.participantes = new ArrayList<Participante>();
	}

	public void sumarParticipante(Participante p) {
		LocalDate hoy = LocalDate.now();
		if (hoy.isAfter(fechaInicio.plusDays(this.plazo))) {
			throw new RuntimeException("Plazo Vencido");
		}
		if (hoy.isEqual(fechaInicio)) {
			p.sumarPuntos(10);
		}
		this.participantes.add(p);
	}

	public Integer getPuntosParticipantes(String nombre) {
		for (Participante p : this.participantes) {
			if (p.equals(new Participante(nombre))) {
				return p.getPuntos();
			}
		}
		return 0;
	}

}
