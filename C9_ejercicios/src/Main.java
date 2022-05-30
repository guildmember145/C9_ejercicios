public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nombre = "Pepe";
        cliente.edad = 50;
        cliente.telefono = 464645654;
        cliente.credito =200;

        System.out.println("Nombre:"+cliente.nombre+"\n"+"Edad:"+cliente.edad+"\n"+"Telefono:"+cliente.telefono+"\n"+"Credito:"+cliente.credito);
        System.out.println("*********************************************************************");

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Jorge";
        trabajador.edad = 30;
        trabajador.telefono =496208984;
        trabajador.salario = 2500;

        System.out.println("Nombre:"+trabajador.nombre+"\n"+"Edad:"+trabajador.edad+"\n"+"Telefono:"+trabajador.telefono+"\n"+"Salario:"+trabajador.salario);

    }
}


class Persona{
     String nombre;
     int telefono;
     int edad;

}


class Cliente extends Persona {
    int credito;

}

class Trabajador extends Persona{
    int salario;
}