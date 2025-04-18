package model;

public class Planet {
    private String name;

    // Constructeur
    public Planet(String name) {
        this.name = name;
    }

    // Getters
    public String getName() { return name; }

    // Setters
    public void setName(String name) { this.name = name; }

    // Méthode toString pour faciliter l'affichage
    @Override
    public String toString() {
        return "Planet{name='" + name + "'}";
    }
}
