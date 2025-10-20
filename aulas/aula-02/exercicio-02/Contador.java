public class Contador{
    //Construtor
    public Contador(){
        totalObjetos ++;
    }

    //Atributos
    protected static int totalObjetos;

    //Metodos
    public static void totalObjetos(){
        System.out.printf("Total de objetos instanciados (do tipo Contador): %d\n", totalObjetos);
    }

    public static void main(String[] args){
        //Instanciar alguns objetos
        Contador tempContador;
        for(int i = 0; i < 1000000; i++){
            tempContador = new Contador();
        }

        //Exbir a quantiade de objetos instanciados
        Contador.totalObjetos();
    }
}