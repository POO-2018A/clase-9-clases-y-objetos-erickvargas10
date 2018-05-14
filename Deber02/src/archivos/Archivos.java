package Archivos;
import java.util.Scanner;
public class Archivos {
    private  String nombre ;
    private int fecha;
    private int peso;
    private String tipo;
    private String contenido;

    public Archivos(){}
    Archivos(String nombre, int fecha, int peso, String tipo, String contenido){

        this.nombre=nombre;
        this.fecha=fecha;
        this.peso=peso;
        this.tipo=tipo;
        this.contenido=contenido;
    }
//getters


    public String getNombre() {
        return nombre;
    }

    public int   getFecha() {
        return fecha;
    }

    public int getPeso() {
        return peso;
    }

    public String getTipo() {
        return tipo;
    }

    public String getContenido() {
        return contenido;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public static void main(String[] args){
        Scanner  scan = new Scanner(System.in);

        Archivos cp1= new Archivos();
        cp1.setNombre("Universidad");
        cp1.setFecha(20170710);
        cp1.setTipo("word, excel, power point, adobbe");
        cp1.setPeso(112);

        Archivos cp2= new Archivos();
        cp2.setNombre("Musica");
        cp2.setFecha(20150418);
        cp2.setTipo("mp3, mp4");
        cp2.setPeso(1214);

        Archivos cp3 = new Archivos();
        cp3.setNombre("imagenes");
        cp3.setFecha(20161211);
        cp3.setTipo("pdg");
        cp3.setPeso(345);


        System.out.println("Ingrese el contenido de los archivos en las carpetas");

        System.out.println(" Universidades");
        cp1.contenido=scan.next();

        System.out.println("Musica");
        cp2.contenido=scan.next();

        System.out.println("Imagenes");
        cp3.contenido=scan.next();

        System.out.print("el contenido de la carpeta "+cp1.nombre);
        System.out.print(" tiene archivos "+cp1.contenido +  "  con fecha de cracion " +cp1.fecha);
        System.out.print(" de tipo "+cp1.tipo);
        System.out.print(" y pesa "+cp1.peso +" mb");

        System.out.println();
        System.out.print("el contenido de la carpeta "+cp2.nombre);
        System.out.print(" tiene archivos "+cp2.contenido +" con fecha de cracion " +cp2.fecha);
        System.out.print(" de tipo "+cp2.tipo);
        System.out.print(" y pesa "+cp2.peso +" mb");

        System.out.println();
        System.out.print("el contenido de la carpeta "+cp3.nombre);
        System.out.print(" tiene archivos "+cp3.contenido +" con fecha de cracion " +cp3.fecha);
        System.out.print(" de tipo "+cp3.tipo);
        System.out.print(" y pesa "+cp3.peso +" mb");
    }

}

