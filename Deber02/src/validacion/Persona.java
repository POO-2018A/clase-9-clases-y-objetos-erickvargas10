package cedula ;
import java.util.Scanner;

public class Persona {

private String nombre;
private String numeroCedula;
private Boolean validacion;

public  Persona(){}

Persona (String nombre,String  numeroCedula) {
this.nombre =nombre ;
this.numeroCedula=numeroCedula;
}

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public void setNumeroCedula(String numeroCedula) {
  if (validacion(numeroCedula)){
   this.numeroCedula=numeroCedula;
  }else{
   System.out.println("Cedula no valida");
  }
 }

 public String getNombre() {
  return nombre;
 }

 public String getNumeroCedula() {
  return numeroCedula;
 }

 private  Boolean  validacion (String  numeroCedula){
  int arreglo   []={2,1,2,1,2,1,2,1,2};
  int ced []={};//ingresar cedula;
  int suma=0;//suma de digitos
  int a=0;
  int m=0;

  for (int i=0;i<9;i++){
   ced[i]=ced[i]*arreglo[i];
   if(ced[i]>10 || ced[i]==10){
    ced[i]=ced[i]-9;
   }
   a=a+ced[i];
   suma=a;
  }
  //funcion decena superior
  System.out.println();
  while (suma%10!=0) {
   a++;
  }

  suma= a-suma;

  //Comparacion ultimo digito de cedula
  System.out.println("El ultimo digito de su cedula es el: "+suma);
  if(suma == m){
   return true;
  }
  return false;
 }
 public static void main(String [] args) {
  Scanner lector= new Scanner (System.in);
  Persona p= new Persona();
  System.out.println("Ingrese su nuombre: ");
  p.nombre=lector.nextLine();
  System.out.println("Ingrese su numero de cedula: ");
  p.numeroCedula  = lector.nextLine();
  System.out.println(p.nombre+" su numero de cedula es: "+p.numeroCedula);
  p.setNumeroCedula(p.numeroCedula);
 }

}




