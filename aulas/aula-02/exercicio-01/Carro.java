
public class Carro{
    int id;
    String marca;
    String modelo;
    int ano;
    
    public void exibirInfo(){
        System.out.printf("INFORMAÇÕES DO CARRO:\nMarca: %s \nModelo: %s \nAno:%d\n",this.marca, this.modelo, this.ano);
    }

    public static void main(String args[]){
        //Instanciar objetos e inicializar atributos
        Carro carro1 = new Carro();
        carro1.marca = "Jeep";
        carro1.modelo = "Renegade";
        carro1.ano = 2024;
    
        Carro carro2 = new Carro();
        carro2.marca = "Ford";
        carro2.modelo = "Mustang";
        carro2.ano = 2025;

        //Exibir informações com o metodo
        carro1.exibirInfo();
        System.out.println("");
        carro2.exibirInfo();
    }
    
}