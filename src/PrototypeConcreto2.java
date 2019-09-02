// classe que implementaa classe Prototype
public class PrototypeConcreto2 implements Prototype {
    private String atributo3;
    private String atributo4;

    public PrototypeConcreto2() {
    }

    public String getAtributo3() {
        return atributo3;
    }

    public void setAtributo3(String atributo3) {
        this.atributo3 = atributo3;
    }

    public String getAtributo4() {
        return atributo4;
    }

    public void setAtributo4(String atributo4) {
        this.atributo4 = atributo4;
    }

    @Override
    public PrototypeConcreto2 clone() {
        PrototypeConcreto2 p2 = new PrototypeConcreto2();
        p2.setAtributo3(this.atributo3);
        p2.setAtributo4(this.atributo4);
        return p2;
    }
}
