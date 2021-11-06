
package lab4p2_franciscovilleda_12111170;
public class Zonas {
    private String nombre;
    private int size;
    private int x;
    private int y;

    public Zonas() {
    }

    public Zonas(String nombre, int size, int x, int y) throws Exception{
        this.nombre = nombre;
        this.setSize(size);
        this.setX(x);
        this.setY(y);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) throws Exception{
        if(size > 300 || size < 100){
            throw new Exception("El tamaño debe estar entre 100 y 300");
        }
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) throws Exception{
        if(x > 100 || x < 0){
            throw new Exception("El rango de x es 0 - 100");
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws Exception{
        if(y > 100 || y < 0){
            throw new Exception("El rango de y es 0 - 100");
        }
        this.y = y;
    }

    @Override
    public String toString() {
        return "Zona " + nombre + " " + size + " (" + x + ", " + y + ") ";
    }
    
}
