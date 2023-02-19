

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        List<Persona>crearLista=Utils.llenarValores(()->llenar(),10);
        crearLista.forEach(persona -> {
            if (persona != null) {
                System.out.println("NOMBRE: "+persona.getNombre()+" EDAD: "+persona.getEdad());
            }
        });
        System.out.println("---------------------------------------------------------");

        List<Object>elevarAlCuadrado=Utils.aplicar(crearLista,valor->Math.pow(valor.getEdad(),2));
        elevarAlCuadrado.forEach(elevar-> {
            if (elevar != null) {
                System.out.println(elevar);
            }
        });
        System.out.println("-------------------------------------------");


        List<Persona>filtar=Utils.filtar(crearLista,filtra->filtra.getEdad()>10);
        filtar.forEach(filtar2-> {
            if (filtar2 != null) {
                System.out.println("los nombres de las personas mayores a 10 son: "+filtar2.getNombre());
            }
        });
        System.out.println("----------------------------------------------------");

      List<Persona>listaPorNombre=Utils.lista(crearLista);
        System.out.println(listaPorNombre);
        System.out.println("---------------------------------------------------");


        InterfazFuncional interfazFuncional=(List<Persona>personaLis)->{
            int total=0;
            for (Persona persona:personaLis) {
                if (persona.getNombre()!=null){
                    total+=persona.getEdad();

                }
            }
            System.out.println("la suma total es: "+total);
            return 0;
        };
        System.out.println(interfazFuncional.sumar(crearLista));
        System.out.println("-----------------------------------");
    }


    public static Persona llenar(){
        String nombre= JOptionPane.showInputDialog("ingrese el nombre");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));
        return new Persona(nombre,edad);

    }



}