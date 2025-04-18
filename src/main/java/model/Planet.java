package model;

public class Planet {
    private String name;
    private String diameter;
    private String climate;
    private String terrain;

    // Constructeur
    public Planet(String name, String diameter, String climate, String terrain) {
        this.name = name;
        this.diameter = diameter;
        this.climate = climate;
        this.terrain = terrain;
    }

    // Getters
    public String getName() { return name; }
    public String getDiameter() { return diameter; }
    public String getClimate() { return climate; }
    public String getTerrain() { return terrain; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setDiameter(String diameter) { this.diameter = diameter; }
    public void setClimate(String climate) { this.climate = climate; }
    public void setTerrain(String terrain) { this.terrain = terrain; }

    // Méthode toString pour faciliter l'affichage
    @Override
    public String toString() {
        return "Planet{name='" + name + "', diameter='" + diameter + "', climate='" + climate + "', terrain='" + terrain + "'}";
    }

    // Optionnel: Méthode pour valider le diamètre, si nécessaire (exemple de validation)
    public boolean isValidDiameter() {
        try {
            Double.parseDouble(diameter);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
