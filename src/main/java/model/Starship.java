package model;

public class Starship {
    private String name;

    // Constructeur
    public Starship(String name) {
        this.name = name;
    }

    // Getters
    public String getName() { return name; }

    // Setters
    public void setName(String name) { this.name = name; }

    // Méthode toString pour faciliter l'affichage
    @Override
    public String toString() {
        return "Starship{name='" + name + "'}";
    }

    // Optionnel: Méthode pour valider le nom, si nécessaire (exemple de validation)
    public boolean isValidName() {
        return name != null && !name.isEmpty();
    }
}
