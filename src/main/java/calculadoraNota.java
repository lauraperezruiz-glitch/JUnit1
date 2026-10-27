public class calculadoraNota {
    public static double calcularMedia(
            double a, double b, double c, double d, double e) {
        return (a + b + c + d + e) / 5;
    }
    public static double calcularNotaFinal(
            double examen, double practicas) {
        double parteExamen = examen * 0.6;
        double partePracticas = practicas * 0.4;
        return parteExamen + partePracticas;
    }
}