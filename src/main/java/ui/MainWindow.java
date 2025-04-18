package ui;

import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.People;
import model.Planet;
import model.Starship;

public class MainWindow extends JFrame {
    private JEditorPane htmlPane;
    private JComboBox<String> accessPointCombo;
    private JTextField searchField;
    private JButton searchButton;
    private JScrollPane scrollPane;
    private DataFetcher dataFetcher;
    private HtmlGenerator htmlGenerator;

    public MainWindow() {
        setTitle("Star Wars API Viewer");
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeComponents();
        setupLayout();
        addListeners();
    }

    private void initializeComponents() {
        htmlPane = new JEditorPane();
        htmlPane.setEditable(false);
        htmlPane.setContentType("text/html");

        scrollPane = new JScrollPane(htmlPane);

        String[] accessPoints = {"people", "planets", "starships"};
        accessPointCombo = new JComboBox<>(accessPoints);

        searchField = new JTextField(20);
        searchButton = new JButton("Rechercher");

        dataFetcher = new DataFetcher();
        htmlGenerator = new HtmlGenerator();
    }

    private void setupLayout() {
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(accessPointCombo);
        topPanel.add(searchField);
        topPanel.add(searchButton);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void addListeners() {
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String accessPoint = (String) accessPointCombo.getSelectedItem();
                String query = searchField.getText();

                List<?> data = null;

                // Appel de fetchData avec le bon type en fonction de l'endpoint sélectionné
                switch (accessPoint) {
                    case "people":
                        data = dataFetcher.fetchData(accessPoint, query, People.class);
                        break;
                    case "planets":
                        data = dataFetcher.fetchData(accessPoint, query, Planet.class);
                        break;
                    case "starships":
                        data = dataFetcher.fetchData(accessPoint, query, Starship.class);
                        break;
                    default:
                        break;
                }

                if (data == null || data.isEmpty()) {
                    htmlPane.setText("<html><body><p>Aucune donnée trouvée.</p></body></html>");
                    return;
                }

                String html = htmlGenerator.generateHtml(data, accessPoint);
                htmlPane.setText(html);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow();
            window.setVisible(true);
        });
    }
}
