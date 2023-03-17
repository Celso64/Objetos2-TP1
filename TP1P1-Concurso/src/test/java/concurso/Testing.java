package concurso;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import objetos.Concurso;
import objetos.Participante;

class Testing {

	@Test
	void elParticipanteSeAgregoEnFecha() {
		Concurso c = new Concurso(10);
		Participante p = new Participante("JUAN");

		c.sumarParticipante(p);

		assertEquals(p.getPuntos(), 0);

	}

	@Test
	void elParticipanteSeAgregoElPrimerDia() {
		Concurso c = new Concurso(LocalDate.now(), 10);
		Participante p = new Participante("JUAN");

		c.sumarParticipante(p);

		assertEquals(p.getPuntos(), 10);

	}

	@Test
	void elParticipanteSeAgregoFueraDeFecha() {
		Concurso c = new Concurso(LocalDate.of(2023, 1, 10), 10);
		Participante p = new Participante("JUAN");

		Exception exception = assertThrows(RuntimeException.class, () -> {
			c.sumarParticipante(p);
		});

		String msjEsperado = "Plazo Vencido";
		String msjActual = exception.getMessage();

		assertTrue(msjEsperado.contains(msjActual));

	}

//	@Test
//	void elParticipanteEsta() {
//		Concurso c = new Concurso(LocalDate.of(2023, 3, 10), 10);
//		Participante p = new Participante("JUAN");
//
//		c.sumarParticipante(p);
//
//		c.getPuntosParticipantes(new Participante("JUAN"));
//	}

}
