package model;

import java.util.List;

public class People {
    private String uid;
    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private String homeworld;
    private List<String> films;
    private List<String> species;
    private List<String> vehicles;
    private List<String> starships;
    private String url;

    // Constructeur
    public People(String uid, String name, String height, String mass, String hair_color, 
                  String skin_color, String eye_color, String birth_year, String gender, 
                  String homeworld, List<String> films, List<String> species, 
                  List<String> vehicles, List<String> starships, String url) {
        this.uid = uid;
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hair_color = hair_color;
        this.skin_color = skin_color;
        this.eye_color = eye_color;
        this.birth_year = birth_year;
        this.gender = gender;
        this.homeworld = homeworld;
        this.films = films;
        this.species = species;
        this.vehicles = vehicles;
        this.starships = starships;
        this.url = url;
    }

    // Getters
    public String getUid() { return uid; }
    public String getName() { return name; }
    public String getHeight() { return height; }
    public String getMass() { return mass; }
    public String getHairColor() { return hair_color; }
    public String getSkinColor() { return skin_color; }
    public String getEyeColor() { return eye_color; }
    public String getBirthYear() { return birth_year; }
    public String getGender() { return gender; }
    public String getHomeworld() { return homeworld; }
    public List<String> getFilms() { return films; }
    public List<String> getSpecies() { return species; }
    public List<String> getVehicles() { return vehicles; }
    public List<String> getStarships() { return starships; }
    public String getUrl() { return url; }

    // Setters
    public void setUid(String uid) { this.uid = uid; }
    public void setName(String name) { this.name = name; }
    public void setHeight(String height) { this.height = height; }
    public void setMass(String mass) { this.mass = mass; }
    public void setHairColor(String hair_color) { this.hair_color = hair_color; }
    public void setSkinColor(String skin_color) { this.skin_color = skin_color; }
    public void setEyeColor(String eye_color) { this.eye_color = eye_color; }
    public void setBirthYear(String birth_year) { this.birth_year = birth_year; }
    public void setGender(String gender) { this.gender = gender; }
    public void setHomeworld(String homeworld) { this.homeworld = homeworld; }
    public void setFilms(List<String> films) { this.films = films; }
    public void setSpecies(List<String> species) { this.species = species; }
    public void setVehicles(List<String> vehicles) { this.vehicles = vehicles; }
    public void setStarships(List<String> starships) { this.starships = starships; }
    public void setUrl(String url) { this.url = url; }

    // Méthode toString pour faciliter l'affichage
    @Override
    public String toString() {
        return "People{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", mass='" + mass + '\'' +
                ", hair_color='" + hair_color + '\'' +
                ", skin_color='" + skin_color + '\'' +
                ", eye_color='" + eye_color + '\'' +
                ", birth_year='" + birth_year + '\'' +
                ", gender='" + gender + '\'' +
                ", homeworld='" + homeworld + '\'' +
                ", films=" + films +
                ", species=" + species +
                ", vehicles=" + vehicles +
                ", starships=" + starships +
                ", url='" + url + '\'' +
                '}';
    }
}