import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class calculadoraNotaTest {
    @Test
    void mediaDeTresNotas() {
        double resultado =
                calculadoraNota.calcularMedia(6, 8, 10, 9, 7);
        assertEquals(8.0, resultado, 0.0001);
    }
    @Test
    void notaFinalCorrecta() {
        double resultado =
                calculadoraNota.calcularNotaFinal(7, 9);
        assertEquals(7.8, resultado, 0.0001);
    }
    @Test
    void notaFinalSinPracticas() {
        double resultado =
                calculadoraNota.calcularNotaFinal(10, 0);
        assertEquals(6.0, resultado, 0.0001);
    }

    @Test
    void notaFinalSinExamen() {
        double resultado =
                calculadoraNota.calcularNotaFinal(0, 10);
        assertEquals(4.0, resultado, 0.0001);
    }
}