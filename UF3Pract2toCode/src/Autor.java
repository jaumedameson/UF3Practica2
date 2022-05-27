
import java.time.LocalDate;
import java.util.List;

public class Autor {

    private String nom;

    private String nacionalitat;

    private LocalDate data_naixement;

    private List llibresEscrits;

    public Autor(String nom, String nacionalitat, LocalDate data_naixement, List llibresEscrits) {
        this.nom = nom;
        this.nacionalitat = nacionalitat;
        this.data_naixement = data_naixement;
        this.llibresEscrits = llibresEscrits;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }

    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }

    public LocalDate getData_naixement() {
        return data_naixement;
    }

    public void setData_naixement(LocalDate data_naixement) {
        this.data_naixement = data_naixement;
    }

    public List getLlibresEscrits() {
        return llibresEscrits;
    }

    public void setLlibresEscrits(List llibresEscrits) {
        this.llibresEscrits = llibresEscrits;
    }

}
