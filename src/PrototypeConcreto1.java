//Classe concreta que implementa a interface Prototype
public class PrototypeConcreto1 implements Prototype {
    //Atributos da classe concreta1
    private String atributo1;
    private String atributo2;
    //Construtor da classe
    public PrototypeConcreto1() {
    }
    //Metodos publicos da classe (getter e setters)
    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    public String getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }

    //metodo clone() implementado da classe Prototype
    @Override
    public PrototypeConcreto1 clone(){
        PrototypeConcreto1 p1 = new PrototypeConcreto1();
        p1.setAtributo1(this.atributo1);
        p1.setAtributo2(this.atributo2);
        return p1;
    }
}
