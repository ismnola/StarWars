package ui;

import model.People;
import model.Planet;
import model.Starship;
import java.util.List;

public class HtmlGenerator {
    public String generateHtml(List<?> data, String type) {
        StringBuilder html = new StringBuilder();
        
        // En-tête HTML
        html.append("<!DOCTYPE html>\n");
        html.append("<html lang=\"fr\">\n");
        html.append("<head>\n");
        html.append("    <meta charset=\"UTF-8\">\n");
        html.append("    <title>Star Wars API - ").append(type).append("</title>\n");
        html.append("    <style>\n");
        html.append("        body { font-family: Arial, sans-serif; margin: 20px; }\n");
        html.append("        .card { border: 1px solid #ddd; padding: 15px; margin-bottom: 20px; border-radius: 5px; }\n");
        html.append("        .header { color: #444; font-size: 18px; margin-bottom: 10px; }\n");
        html.append("        .details { color: #666; }\n");
        html.append("    </style>\n");
        html.append("</head>\n");
        html.append("<body>\n");

        // Générer le contenu selon le type
        switch (type) {
            case "people":
                for (Object person : data) {
                    People p = (People) person;
                    html.append("<div class=\"card\">\n");
                    html.append("<div class=\"header\">Nom: ").append(p.getName()).append("</div>\n");
                    html.append("<div class=\"details\">Taille: ").append(p.getHeight()).append("</div>\n");
                    html.append("<div class=\"details\">Masse: ").append(p.getMass()).append("</div>\n");
                    html.append("<div class=\"details\">Couleur de cheveux: ").append(p.getHairColor()).append("</div>\n");
                    html.append("<div class=\"details\">Couleur de peau: ").append(p.getSkinColor()).append("</div>\n");
                    html.append("<div class=\"details\">Couleur des yeux: ").append(p.getEyeColor()).append("</div>\n");
                    html.append("<div class=\"details\">Année de naissance: ").append(p.getBirthYear()).append("</div>\n");
                    html.append("<div class=\"details\">Genre: ").append(p.getGender()).append("</div>\n");
                    html.append("<div class=\"details\">Planète d'origine: ").append(p.getHomeworld()).append("</div>\n");
                    html.append("</div>\n");
                }
                break;
                
            case "planets":
                for (Object planet : data) {
                    Planet p = (Planet) planet;
                    html.append("<div class=\"card\">\n");
                    html.append("<div class=\"header\">").append(p.getName()).append("</div>\n");
                    html.append("<div class=\"details\">Diamètre: ").append(p.getDiameter()).append("</div>\n");
                    html.append("<div class=\"details\">Climat: ").append(p.getClimate()).append("</div>\n");
                    html.append("<div class=\"details\">Terrain: ").append(p.getTerrain()).append("</div>\n");
                    html.append("</div>\n");
                }
                break;
                
            case "starships":
                for (Object starship : data) {
                    Starship s = (Starship) starship;
                    html.append("<div class=\"card\">\n");
                    html.append("<div class=\"header\">").append(s.getName()).append("</div>\n");
                    html.append("<div class=\"details\">Modèle: ").append(s.getModel()).append("</div>\n");
                    html.append("<div class=\"details\">Classe: ").append(s.getStarshipClass()).append("</div>\n");
                    html.append("<div class=\"details\">Fabricant: ").append(s.getManufacturer()).append("</div>\n");
                    html.append("</div>\n");
                }
                break;
        }

        html.append("</body>\n");
        html.append("</html>\n");

        return html.toString();
    }
}
