import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Utils {


    public static <T> List<T> llenarValores(Supplier<T> supplier, int cantidad) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            result.add(supplier.get());
        }
        return result;

    }   public static <T,R> List<R> aplicar(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for(T valor: list){
            result.add(function.apply(valor));
        }
        return result;
    }



    public static <T, R> List<R> filtar(List<T> list, Predicate<T> validacion) {
        List<R> result = new ArrayList<>();
        for (T valor : list) {
            if (validacion.test(valor)) {
                result.add((R) valor);
            }
        }
        return result;
    }

    public static List<Persona> lista(List<Persona> list){
        list.stream().forEach(persona-> {
            if (persona != null && persona.getNombre().equals("samuel")) {
                System.out.println("su edad es: "+persona.getEdad());
            }
        });
        return list;
    }


   }
