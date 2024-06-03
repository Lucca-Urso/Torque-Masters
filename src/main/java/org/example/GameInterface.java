import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class GameInterface extends JFrame implements ActionListener {
    JPanel menuPanel;
    JPanel carPanel;
    JPanel exhibitionPanel;
    JPanel settingsPanel;

    CardLayout cardLayout;

    PixelatedButton dataBaseButton;
    PixelatedButton menuButton;
    PixelatedButton exitButton;

    PixelatedButton engineButton;

    PixelatedButton brakesButton;
    PixelatedButton popularBrakes;
    PixelatedButton sportBrakes;
    PixelatedButton raceBrakes;
    PixelatedButton ceramicBrakes;

    PixelatedButton tiresButton;
    PixelatedButton popularTires;
    PixelatedButton sportTires;
    PixelatedButton raceTires;
    PixelatedButton ceramicTires;

    PixelatedButton chassisButton;
    PixelatedButton suvChassis; 
    PixelatedButton sedanChassis;
    PixelatedButton sportChassis;
    PixelatedButton hatchbackChassis;
    PixelatedButton coupeChassis;

    PixelatedButton suspensionButton;
    PixelatedButton popularSuspension;
    PixelatedButton sportSuspension;
    PixelatedButton raceSuspension;
    PixelatedButton rallySuspension;

    PixelatedButton bodyPaintButton;
    PixelatedButton colorRed;
    PixelatedButton colorBlue;
    PixelatedButton colorYellow;
    PixelatedButton colorBlack;
    
    Color appColor = new Color(13, 6, 40);
    Color buttonColor = new Color(103, 124, 163);

    class PixelatedButton extends JButton {
        public PixelatedButton(String label) {
            super(label);
            this.setFont(new Font("Monospaced", Font.BOLD, 16));
            this.setForeground(Color.BLACK);
            this.setFocusPainted(false);
            this.setBorderPainted(false);
            this.setContentAreaFilled(false);
            this.setOpaque(false);
            this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }

        @Override
        protected void paintComponent(Graphics g) {
            if (getModel().isPressed()) {
                g.setColor(new Color(91, 85, 136));
            } else {
                g.setColor(new Color(91, 85, 136));
            }
            g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
            super.paintComponent(g);
        }

        @Override
        protected void paintBorder(Graphics g) {
            g.setColor(Color.BLACK);
            g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
        }
    }

    GameInterface() {
        // Card Layout
        cardLayout = new CardLayout();
        menuPanel = new JPanel(cardLayout);
        menuPanel.setBackground(buttonColor);

        // Settings Panel
        settingsPanel = new JPanel();
        settingsPanel.setBackground(appColor);
        settingsPanel.setPreferredSize(new Dimension(900, 75));
        settingsPanel.setLayout(new FlowLayout(0, 150, 25));

        // Exhibition Panel
        exhibitionPanel = new JPanel();
        exhibitionPanel.setBackground(Color.BLACK);
        exhibitionPanel.setPreferredSize(new Dimension(900, 425));

        // Button Panel
        carPanel = new JPanel();
        carPanel.setBackground(buttonColor);
        carPanel.setLayout(new FlowLayout(0, 35, 75));
        carPanel.setPreferredSize(new Dimension(900, 175));

//-----------------------------------------------------Car Components Panels-----------------------------------------------------------------------

        // Engine Panel
        JPanel enginePanel = new JPanel();
        enginePanel.setBackground(buttonColor);
        enginePanel.setLayout(new FlowLayout(0, 40, 75));
        enginePanel.setPreferredSize(new Dimension(900, 175));

        engineButton = new PixelatedButton("Engine");

        // Brakes Panel
        JPanel brakesPanel = new JPanel();
        brakesPanel.setBackground(buttonColor);
        brakesPanel.setLayout(new FlowLayout(0, 90, 75));
        brakesPanel.setPreferredSize(new Dimension(900, 175));

        brakesButton = new PixelatedButton("Brakes");

        popularBrakes = new PixelatedButton("Popular");
        sportBrakes = new PixelatedButton("Esportivo");
        raceBrakes = new PixelatedButton("Corrida");
        ceramicBrakes = new PixelatedButton("Ceramica");

        brakesPanel.add(popularBrakes);
        brakesPanel.add(sportBrakes);
        brakesPanel.add(raceBrakes);
        brakesPanel.add(ceramicBrakes);

        // Tires Panel
        JPanel tiresPanel = new JPanel();
        tiresPanel.setBackground(buttonColor);
        tiresPanel.setLayout(new FlowLayout(0, 90, 75));
        tiresPanel.setPreferredSize(new Dimension(900, 175));

        tiresButton = new PixelatedButton("Tires");

        popularTires = new PixelatedButton("Popular");
        sportTires = new PixelatedButton("Esportivo");
        raceTires = new PixelatedButton("Corrida");
        ceramicTires = new PixelatedButton("Ceramica");

        tiresPanel.add(popularTires);
        tiresPanel.add(sportTires);
        tiresPanel.add(raceTires);
        tiresPanel.add(ceramicTires);

        // Chassis Panel
        JPanel chassisPanel = new JPanel();
        chassisPanel.setBackground(buttonColor);
        chassisPanel.setLayout(new FlowLayout(0, 75, 75));
        chassisPanel.setPreferredSize(new Dimension(900, 175));

        chassisButton = new PixelatedButton("Chassis");

        suvChassis = new PixelatedButton("SUV");
        sedanChassis = new PixelatedButton("Sedan");
        sportChassis = new PixelatedButton("Sport");
        hatchbackChassis = new PixelatedButton("HatchBack");
        coupeChassis = new PixelatedButton("Coupe");

        chassisPanel.add(suvChassis);
        chassisPanel.add(sedanChassis);
        chassisPanel.add(sportChassis);
        chassisPanel.add(hatchbackChassis);
        chassisPanel.add(coupeChassis);
        
        // Suspension Panel
        JPanel suspensionPanel = new JPanel();
        suspensionPanel.setBackground(buttonColor);
        suspensionPanel.setLayout(new FlowLayout(0, 90, 75));
        suspensionPanel.setPreferredSize(new Dimension(900, 175));

        suspensionButton = new PixelatedButton("Suspension");

        popularSuspension = new PixelatedButton("Popular");
        sportSuspension = new PixelatedButton("Esportivo");
        raceSuspension = new PixelatedButton("Corrida");
        rallySuspension = new PixelatedButton("Rally");

        suspensionPanel.add(popularSuspension);
        suspensionPanel.add(sportSuspension);
        suspensionPanel.add(raceSuspension);
        suspensionPanel.add(rallySuspension);

        // Body Paint Panel
        JPanel bodyPaintPanel = new JPanel();
        bodyPaintPanel.setBackground(buttonColor);
        bodyPaintPanel.setLayout(new FlowLayout(0, 90, 75));
        bodyPaintPanel.setPreferredSize(new Dimension(900, 175));

        bodyPaintButton = new PixelatedButton("Body Paint");

        colorRed = new PixelatedButton("Vermelho");
        colorYellow = new PixelatedButton("Amarelo");
        colorBlue = new PixelatedButton("Azul");
        colorBlack = new PixelatedButton("Preto");

        bodyPaintPanel.add(colorRed);
        bodyPaintPanel.add(colorYellow);
        bodyPaintPanel.add(colorBlue);
        bodyPaintPanel.add(colorBlack);

        // Buttons
        dataBaseButton = new PixelatedButton("Data Base");
        menuButton = new PixelatedButton("Menu");
        exitButton = new PixelatedButton("Exit");

        // Add buttons to panels
        settingsPanel.add(dataBaseButton);
        settingsPanel.add(menuButton);
        settingsPanel.add(exitButton);

        carPanel.add(engineButton);
        carPanel.add(brakesButton);
        carPanel.add(tiresButton);
        carPanel.add(chassisButton);
        carPanel.add(suspensionButton);
        carPanel.add(bodyPaintButton);

        // Action Listeners
        dataBaseButton.addActionListener(this);
        menuButton.addActionListener(this);
        exitButton.addActionListener(this);
        engineButton.addActionListener(this);
        brakesButton.addActionListener(this);
        tiresButton.addActionListener(this);
        chassisButton.addActionListener(this);
        suspensionButton.addActionListener(this);
        bodyPaintButton.addActionListener(this);
        
        // Add panels to CardLayout
        menuPanel.add(carPanel, "carPanel");
        menuPanel.add(enginePanel, "enginePanel");
        menuPanel.add(brakesPanel, "brakesPanel");
        menuPanel.add(tiresPanel, "tiresPanel");
        menuPanel.add(chassisPanel, "chassisPanel");
        menuPanel.add(suspensionPanel, "suspensionPanel");
        menuPanel.add(bodyPaintPanel, "bodyPaintPanel");

        // Game window
        this.setLayout(new BorderLayout());

        this.add(settingsPanel, BorderLayout.NORTH);
        this.add(exhibitionPanel, BorderLayout.CENTER);
        this.add(menuPanel, BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(900, 700);
        this.setResizable(false);
        this.setTitle("Torque Masters");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GameInterface();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == dataBaseButton) {
            System.out.println("Working");
        }

        if (e.getSource() == menuButton) {
            cardLayout.show(menuPanel, "carPanel");
        }

        if (e.getSource() == exitButton) {
            System.exit(1);
        }

        if (e.getSource() == engineButton) {
            cardLayout.show(menuPanel, "enginePanel");
        }

        if (e.getSource() == brakesButton) {
            cardLayout.show(menuPanel, "brakesPanel");
        }

        if (e.getSource() == tiresButton) {
            cardLayout.show(menuPanel, "tiresPanel");
        }

        if (e.getSource() == chassisButton) {
            cardLayout.show(menuPanel, "chassisPanel");
        }

        if (e.getSource() == suspensionButton) {
            cardLayout.show(menuPanel, "suspensionPanel");
        }

        if (e.getSource() == bodyPaintButton) {
            cardLayout.show(menuPanel, "bodyPaintPanel");
        }
    }
}