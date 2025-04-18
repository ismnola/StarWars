package ui;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

// Import des modèles
import model.People;
import model.Planet;
import model.Starship;

public class DataFetcher {
    private static final String API_BASE_URL = "https://swapi.tech/api/";
    private final Gson gson = new Gson();

    // Méthode générique pour récupérer les données
    public <T> List<T> fetchData(String endpoint, String query, Class<T> clazz) {
        try {
            // Construction de l'URL
            String urlStr = API_BASE_URL + endpoint;
            if (query != null && !query.isEmpty()) {
                urlStr += "/?search=" + query;
            }

            // Connexion HTTP
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Lecture de la réponse
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String response = reader.lines().reduce("", (a, b) -> a + b);
            reader.close();

            // Parsing de la réponse JSON en fonction de l'endpoint
            switch (endpoint) {
                case "people":
                    PeopleResponse people = gson.fromJson(response, PeopleResponse.class);
                    return (List<T>) people.getResults();  // Cast vers le type générique
                case "planets":
                    PlanetsResponse planets = gson.fromJson(response, PlanetsResponse.class);
                    return (List<T>) planets.getResults();
                case "starships":
                    StarshipsResponse starships = gson.fromJson(response, StarshipsResponse.class);
                    return (List<T>) starships.getResults();
                default:
                    return new ArrayList<>();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    // Classes internes pour la réponse de l'API

    // Réponse pour "people"
    private static class PeopleResponse {
        private List<People> results;  // Changement de "result" en "results"
        public List<People> getResults() { return results; }
    }

    // Réponse pour "planets"
    private static class PlanetsResponse {
        private List<Planet> results;  // Changement de "result" en "results"
        public List<Planet> getResults() { return results; }
    }

    // Réponse pour "starships"
    private static class StarshipsResponse {
        private List<Starship> results;  // Changement de "result" en "results"
        public List<Starship> getResults() { return results; }
    }
}
