public class TiposEVariaveis {
    public static void main(String[] args) {
        byte idade = 123;
        short ano = 2023;
        int cep = 2177033; 
        // // caso uma variável CEP comece com "0", provavelmente deva ser do tipo string
        long cpf = 17131708593L;
        // // caso comece com "0", precisa ser de outro tipo
        float pi = 3.14F;
        // // obrigatorio possuir "F" ao final do valor
        double salario = 1320.23; 

        int value = 5;
        value = 10;

        System.out.println(value);

        final double NUM = 3.14;
        // NUM = 1.0;
        System.out.println(NUM);
 
    }
}
