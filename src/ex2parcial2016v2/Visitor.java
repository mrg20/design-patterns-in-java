package ex2parcial2016v2;

public interface Visitor {
    void visit(Leaf leaf);//Modificar a referencia no retornant un int
    void visit(Composite composite);
}
