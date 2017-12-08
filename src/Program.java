public class Program {
    public static void main(String[] args) {
        
        MetodosOrd ordenar = new MetodosOrd();
        
        int vector1[] = {5, 6, 3, 44, 22, 1};
        int vector2[] = {55, 4, 43, 44, 2, 10};

        System.out.println("Arreglo original");
        ordenar.mostrarArreglos(vector1);
        System.out.println("Arreglo ordenado con burbuja 1");
        ordenar.burbuja1(vector1);
        ordenar.mostrarArreglos(vector1);

        System.out.println();

        System.out.println("Arreglo original");
        ordenar.mostrarArreglos(vector2);
        System.out.println("Arreglo ordenado con burbuja 2");
        ordenar.burbuja1(vector2);
        ordenar.mostrarArreglos(vector2);

        System.out.println("Arreglo orginal");
        ordenar.mostrarArreglos(vector2);
        ordenar.radix(vector2);

    }
}
