class Fibonacci {
    public static void main(String args[]){
        System.out.println("Exibindo os 30 primeiros elementos da sequência fibonnaci:");
        
        //Chamando e exibindo o metodo 30 vezes
        for(int i = 1; i <= 30; i++){
            System.out.println(recFibonacci(i));
        }
    }

    //Implementacao do metodo fibonacci recursivo
    private static int recFibonacci(int num){
        if (num == 1 || num == 2){
            return 1;
        }
        else{
            return recFibonacci(num - 2) + recFibonacci(num - 1);
        }
    }
}
