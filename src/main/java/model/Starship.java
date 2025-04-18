package model;

public class Starship {
    private String name;
    private String model;
    private String starship_class;
    private String manufacturer;

    // Constructeur
    public Starship(String name, String model, String starship_class, String manufacturer) {
        this.name = name;
        this.model = model;
        this.starship_class = starship_class;
        this.manufacturer = manufacturer;
    }

    // Getters
    public String getName() { return name; }
    public String getModel() { return model; }
    public String getStarshipClass() { return starship_class; }
    public String getManufacturer() { return manufacturer; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setModel(String model) { this.model = model; }
    public void setStarshipClass(String starship_class) { this.starship_class = starship_class; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    // Méthode toString pour faciliter l'affichage
    @Override
    public String toString() {
        return "Starship{name='" + name + "', model='" + model + "', starship_class='" + starship_class + "', manufacturer='" + manufacturer + "'}";
    }

    // Optionnel: Méthode pour valider le nom, si nécessaire (exemple de validation)
    public boolean isValidName() {
        return name != null && !name.isEmpty();
    }
}
