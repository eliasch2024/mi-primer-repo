public class Estudiante extends Persona {

    private int creditos;

    public Estudiante(String nombre, int edad) {
        super(nombre, edad);
        this. Creditos = 60;
    }
    
    public int getCreditos() {
        return this.Creditos;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Estudiante matriculado de "+Creditos+" créditos");
    
}