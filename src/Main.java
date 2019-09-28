public class Main {
    public static void main(String[] args) {
        // Criação do objeto p1 do tipo da classe PrototypeConcreto1
        PrototypeConcreto1 p1 = new PrototypeConcreto1();
        p1.setAtributo1("Nome");
        p1.setAtributo2("Idade");

        //Criação do objeto p2 do tipo da classe PrototypeConcreto2
        PrototypeConcreto2 p2 = new PrototypeConcreto2();
        p2.setAtributo3("Endereço");
        p2.setAtributo4("Complemento");

        /* agora que a coisa fica interessante
        imagina que tu queira criar um novo objeto do tipo PrototypeConcreto1
        so que esse novo objeto terá os mesmos atributos do primeiro objeto
        ao inves de instaciar de novo o objeto, tu vai
        apenas criar uma copia de um objeto existente (no caso, Luan, o objeto p1)
        Nesse caso, tu cria um novo objeto com os atributos já settados
        pra isso tu vai usar o metodo clone() das duas classes concretas
        */

        //Utilizando o metodo clone do objeto p1 para criar uma nova copia dentro do objeto p1clone
        PrototypeConcreto1 p1Clone = p1.clone();
        //criando um clone o objeto p2
        PrototypeConcreto2 p2Clone = p2.clone();

        /* No caso de cima, eu criei dois objetos da classe
        PrototypeConcreta1  da Classe PrototypeConcreta2
         */
        //Mostrando os atributos da classe PrototypeConcreto1
        System.out.println(p1.getAtributo1());
        System.out.println(p1.getAtributo2());

        //Mostrando os atributos da classe PrototypeConcreta2
        System.out.println(p2.getAtributo3());
        System.out.println(p2.getAtributo4());

        /*Mostrando os atributos dos novos objetos, que são clones
        Lembrando que eu não settei os atributos nesse codigo
         */
        //Mostrando Atributos do Primeiro clone
        System.out.println(p1Clone.getAtributo1());
        System.out.println(p1Clone.getAtributo2());
        //Mostrando Atributos do segundo clone
        System.out.println(p2Clone.getAtributo3());
        System.out.println(p2Clone.getAtributo4());
        //Fica mais interassante se tu rodar em debbug

    }
}
