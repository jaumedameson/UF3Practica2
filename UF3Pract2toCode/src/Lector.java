
import java.util.ArrayList;
import java.util.List;

public class Lector {

    private List <LlibreCopia> llibres_en_prestec;

    private final int MAXIM_LLIBRES = 3;

    public Lector(List <LlibreCopia> llibres_en_prestec) {
        llibres_en_prestec = new ArrayList();
    }

    public List <LlibreCopia> getLlibres_en_prestec() {
        return llibres_en_prestec;
    }

    public void setLlibres_en_prestec(LlibreCopia llibre) {
        if (llibres_en_prestec.size() < MAXIM_LLIBRES) {
            llibres_en_prestec.add(llibre);
        }
    }

}
