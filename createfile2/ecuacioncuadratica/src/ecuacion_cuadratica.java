import java.util.Scanner;
public class ecuacion_cuadratica {
Scanner lea = new Scanner (System.in);
public static void main (String[]args) {
ecuacion_cuadratica object = new ecuacion_cuadratica();
object.banner();
object.solucion();
}
public void banner() {
System.out.println ("###################");
System.out.println ("solucion de ecuacions cuadraticas ax+bx+c ");
System.out.println (“# —————————————————– #”);
System.out.println (“# Compiler: javac ecuacion_cuadratica.java #”);
System.out.println (“# modo uso: java ecuacion_cuadratica #”);
System.out.println (“# =-=-=-=-=-=-=-=- Coded by @r4z0r_bl4ck -=-=-=-=-=-=-= #”);
System.out.println (“#########################################################”);
}
public void solucion() {
double a,b,c,discriminante,x1,x2;
System.out.println (“Ingrese El Coeficiente de A”);
a = lea.nextDouble();
System.out.println (“Ingrese El Coeficiente de B”);
b = lea.nextDouble();
System.out.println (“Ingrese El Coeficiente de C”);
c = lea.nextDouble();
discriminante = ((b*b)-(4*(a*c)));
if (discriminante < 0) {
System.out.println ("La Ecuacion No Tiene Soluciones Reales");
}
if (discriminante == 0) {
System.out.println (“La ecuacion tiene solo una raiz real”);
x1 = (-b)/(2*a);
System.out.println (“La Solucion es, X1=X2 : ” +x1);
}
if (discriminante > 0) {
System.out.println ("La ecuacion tiene dos raizes reales");
x1 = (-b)+Math.sqrt(discriminante)/(2*a);
x2 = (-b)-Math.sqrt(discriminante)/(2*a);
System.out.println ("La Solucion es, X1 = " +x1+ " y, X2 = " +x2);
}
}
}