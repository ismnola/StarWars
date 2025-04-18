package model;

import java.util.List;

public class People {
    private String uid;
    private String name;
    private String url;

    // Constructeur
    public People(String uid, String name, String height, String mass, String hair_color, 
                  String skin_color, String eye_color, String birth_year, String gender, 
                  String homeworld, List<String> films, List<String> species, 
                  List<String> vehicles, List<String> starships, String url) {
        this.uid = uid;
        this.name = name;
        this.url = url;
    }

    // Getters
    public String getUid() { return uid; }
    public String getName() { return name; }
    public String getUrl() { return url; }

    // Setters
    public void setUid(String uid) { this.uid = uid; }
    public void setName(String name) { this.name = name; }
    public void setUrl(String url) { this.url = url; }

    // Méthode toString pour faciliter l'affichage
    @Override
    public String toString() {
        return "People{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}