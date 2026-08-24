public class triangulo extends Figuras{

    public triangulo(Punto[] vertices) {
        this.vertices = vertices;
    }

    @Override
    public double calcularArea() {
        double x1 = vertices[0].x;
        double y1 = vertices[0].y;

        double x2 = vertices[1].x;
        double y2 = vertices[1].y;

        double x3 = vertices[2].x;
        double y3 = vertices[2].y;

        double resultado = x1 * (y2 - y3)
                         + x2 * (y3 - y1)
                         + x3 * (y1 - y2);

        if (resultado < 0) {
            resultado = -resultado;
        }

        return resultado / 2;
    }
/* bueno al no poder usar maths.abs como variable que me devuelva el absoluto 
utilice if pq es donde mas conocimiento tenia por y basicamente dice que si el 
resutado es negativo hay q cambiarle e signo
*/
    @Override
    public double calcularPerimetro() {
        double lado1 = distancia(vertices[0], vertices[1]);
        double lado2 = distancia(vertices[1], vertices[2]);
        double lado3 = distancia(vertices[2], vertices[0]);

        return lado1 + lado2 + lado3;
    }

    private double distancia(Punto p1, Punto p2) {
        double dx = p2.x - p1.x;
        double dy = p2.y - p1.y;

        return Math.sqrt(dx * dx + dy * dy); //n pq no nos deja usar math.abs, algo malvadillo d su
    }
}