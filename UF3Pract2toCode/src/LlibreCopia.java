
public class LlibreCopia extends Llibre {

    private int ID;

    private String localitzacio;

    public LlibreCopia(String nom, String tipus, String editorial, int any, 
            String autor, int ID, String localitzacio) {
        super(nom, tipus, editorial, any, autor);
        this.ID = ID;
        this.localitzacio = localitzacio;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLocalitzacio() {
        return localitzacio;
    }

    public void setLocalitzacio(String localitzacio) {
        this.localitzacio = localitzacio;
    }

}
