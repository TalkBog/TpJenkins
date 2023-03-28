package ex_un;

public class Book {
    private String titre;
    private String auteur;
    private String datePublication;

    public Book(String titre, String auteur, String datePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.datePublication = datePublication;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }
}
