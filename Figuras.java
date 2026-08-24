public abstract class Figuras implements Calculable {
/*esta primera clase sirve para definir los metodos y caracteristicas que van a poder ser heredadas por las otras clases :b
 */
    // Característica que todas las figuras tienen
    protected Punto[] vertices;

    // Métodos que todas las figuras tienen q poder realizar
    @Override
    public abstract double calcularArea();

    @Override
    public abstract double calcularPerimetro();
}

