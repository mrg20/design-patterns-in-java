package customexam;

public interface EinaVisitor {
    void visit(EspasaFusta espasa);
    void visit(EspasaDiamant espasa);
    void visit(PicFusta pic);
    void visit(PicDiamant pic);
}
