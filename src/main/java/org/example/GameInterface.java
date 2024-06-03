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
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class GameInterface extends JFrame implements ActionListener {
    JPanel menuPanel;
    JPanel carPanel;
    CustomPanel exhibitionPanel;
    JPanel settingsPanel;

    CardLayout cardLayout;

    PixelatedButton dataBaseButton;
    PixelatedButton menuButton;
    PixelatedButton exitButton;

    PixelatedButton engineButton;
        PixelatedButton engineType;
            PixelatedButton inlineEngine;
            PixelatedButton boxerEngine;
            PixelatedButton VEngine;
                PixelatedButton threeCylinders;
                PixelatedButton fourCylindersInline;
                PixelatedButton fourCylindersBoxer;
                PixelatedButton fiveCylinders;
                PixelatedButton sixCylindersBoxer;
                PixelatedButton sixCylindersV;
                PixelatedButton eightCylinders;
                PixelatedButton tenCylinders;
                PixelatedButton twelveCylinders;
        PixelatedButton cylinders;
            PixelatedButton firstCylinder;
            PixelatedButton secondCylinder;
            PixelatedButton thirdCylinder;
            PixelatedButton fourthCylinder;
            PixelatedButton fifthCylinder;
            PixelatedButton sixthCylinder;
            PixelatedButton seventhCylinder;
        PixelatedButton aspiration;
            PixelatedButton naturalAspiration;
            PixelatedButton turboCompressor;
            PixelatedButton superCompressor;
        PixelatedButton fuel;
            PixelatedButton gasFuel;
            PixelatedButton dieselFuel;
        PixelatedButton engineMaterial;
            PixelatedButton moltedIron;
            PixelatedButton aluminiumAlloy;
            PixelatedButton titaniumAlloy;
        PixelatedButton traction;
            PixelatedButton rearTraction;
            PixelatedButton frontTraction;
            PixelatedButton integralTraction;

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

    public class CustomPanel extends JPanel {
    private Image backgroundImage;

    public CustomPanel(String imagePath) {
        try {
            backgroundImage = new ImageIcon(imagePath).getImage();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Erro ao carregar a imagem" + e.getMessage());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
        }
    }
}

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
        exhibitionPanel = new CustomPanel("C:\\Users\\Urso\\OneDrive\\Documents\\Programas Computação\\Programas Java\\Torque-Masters\\images\\Garagem_pixelada.jpg");
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
        enginePanel.setLayout(new FlowLayout(0, 15, 75));
        enginePanel.setPreferredSize(new Dimension(900, 175));

        engineButton = new PixelatedButton("Motor");

        JPanel engineTypePanel = new JPanel();
        engineTypePanel.setBackground(buttonColor);
        engineTypePanel.setLayout(new FlowLayout(0, 150, 75));
        engineTypePanel.setPreferredSize(new Dimension(900, 175));

        engineType = new PixelatedButton("Tipo de Motor");

        threeCylinders = new PixelatedButton("3");
        fourCylindersInline = new PixelatedButton("4");
        fourCylindersBoxer = new PixelatedButton("4");
        fiveCylinders = new PixelatedButton("5");
        sixCylindersBoxer = new PixelatedButton("6");
        sixCylindersV = new PixelatedButton("6");
        eightCylinders = new PixelatedButton("8");
        tenCylinders = new PixelatedButton("10");
        twelveCylinders = new PixelatedButton("12");

        JPanel inlinePanel = new JPanel();
        inlinePanel.setBackground(buttonColor);
        inlinePanel.setLayout(new FlowLayout(0, 185, 75));
        inlinePanel.setPreferredSize(new Dimension(900, 175));

        inlineEngine = new PixelatedButton("Em Linha");

        inlinePanel.add(threeCylinders);
        inlinePanel.add(fourCylindersInline);
        inlinePanel.add(fiveCylinders);

        JPanel boxerPanel = new JPanel();
        boxerPanel.setBackground(buttonColor);
        boxerPanel.setLayout(new FlowLayout(0, 260, 75));
        boxerPanel.setPreferredSize(new Dimension(900, 175));

        boxerEngine = new PixelatedButton("Boxer");

        boxerPanel.add(fourCylindersBoxer);
        boxerPanel.add(sixCylindersBoxer);

        JPanel VPanel = new JPanel();
        VPanel.setBackground(buttonColor);
        VPanel.setLayout(new FlowLayout(0, 140, 75));
        VPanel.setPreferredSize(new Dimension(900, 175));

        VEngine = new PixelatedButton("V");

        VPanel.add(sixCylindersV);
        VPanel.add(eightCylinders);
        VPanel.add(tenCylinders);
        VPanel.add(twelveCylinders);

        engineTypePanel.add(inlineEngine);
        engineTypePanel.add(boxerEngine);
        engineTypePanel.add(VEngine);

        JPanel cylindersPanel = new JPanel();
        cylindersPanel.setBackground(buttonColor);
        cylindersPanel.setLayout(new FlowLayout(0, 55, 75));
        cylindersPanel.setPreferredSize(new Dimension(900, 175));

        cylinders = new PixelatedButton("Cilindradas");

        firstCylinder = new PixelatedButton("1.0");
        secondCylinder = new PixelatedButton("1.6");
        thirdCylinder = new PixelatedButton("2.0");
        fourthCylinder = new PixelatedButton("2.4");
        fifthCylinder = new PixelatedButton("3.0");
        sixthCylinder = new PixelatedButton("3.6");
        seventhCylinder = new PixelatedButton("4.2");

        cylindersPanel.add(firstCylinder);
        cylindersPanel.add(secondCylinder);
        cylindersPanel.add(thirdCylinder);
        cylindersPanel.add(fourthCylinder);
        cylindersPanel.add(fifthCylinder);
        cylindersPanel.add(sixthCylinder);
        cylindersPanel.add(seventhCylinder);

        JPanel aspirationPanel = new JPanel();
        aspirationPanel.setBackground(buttonColor);
        aspirationPanel.setLayout(new FlowLayout(0, 60, 75));
        aspirationPanel.setPreferredSize(new Dimension(900, 175));

        aspiration = new PixelatedButton("Aspiração");

        naturalAspiration = new PixelatedButton("Aspirado Naturalmente");
        turboCompressor = new PixelatedButton("Turbo Compressor");
        superCompressor = new PixelatedButton("Super Compressor");

        aspirationPanel.add(naturalAspiration);
        aspirationPanel.add(turboCompressor);
        aspirationPanel.add(superCompressor);
        
        JPanel fuelPanel = new JPanel();
        fuelPanel.setBackground(buttonColor);
        fuelPanel.setLayout(new FlowLayout(0, 225, 75));
        fuelPanel.setPreferredSize(new Dimension(900, 175));

        fuel = new PixelatedButton("Combustivel");

        gasFuel = new PixelatedButton("Gasolina");
        dieselFuel = new PixelatedButton("Diesel");

        fuelPanel.add(gasFuel);
        fuelPanel.add(dieselFuel);

        JPanel engineMaterialPanel = new JPanel();
        engineMaterialPanel.setBackground(buttonColor);
        engineMaterialPanel.setLayout(new FlowLayout(0, 80, 75));
        engineMaterialPanel.setPreferredSize(new Dimension(900, 175));

        engineMaterial = new PixelatedButton("Material");

        moltedIron = new PixelatedButton("Ferro Fundido");
        aluminiumAlloy = new PixelatedButton("Liga de Aluminio");
        titaniumAlloy = new PixelatedButton("Liga de Titanio");

        engineMaterialPanel.add(moltedIron);
        engineMaterialPanel.add(aluminiumAlloy);
        engineMaterialPanel.add(titaniumAlloy);

        JPanel tractionPanel = new JPanel();
        tractionPanel.setBackground(buttonColor);
        tractionPanel.setLayout(new FlowLayout(0, 135, 75));
        tractionPanel.setPreferredSize(new Dimension(900, 175));

        traction = new PixelatedButton("Tração");

        rearTraction = new PixelatedButton("Traseira");
        frontTraction = new PixelatedButton("Dianteira");
        integralTraction = new PixelatedButton("Integral");

        tractionPanel.add(rearTraction);
        tractionPanel.add(frontTraction);
        tractionPanel.add(integralTraction);

        enginePanel.add(engineType);
        enginePanel.add(cylinders);
        enginePanel.add(aspiration);
        enginePanel.add(fuel);
        enginePanel.add(engineMaterial);
        enginePanel.add(traction);

        // Brakes Panel
        JPanel brakesPanel = new JPanel();
        brakesPanel.setBackground(buttonColor);
        brakesPanel.setLayout(new FlowLayout(0, 90, 75));
        brakesPanel.setPreferredSize(new Dimension(900, 175));

        brakesButton = new PixelatedButton("Freios");

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

        tiresButton = new PixelatedButton("Rodas");

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

        chassisButton = new PixelatedButton("Chassi");

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

        suspensionButton = new PixelatedButton("Suspenssão");

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

        bodyPaintButton = new PixelatedButton("Pintura");

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
        engineType.addActionListener(this);
            inlineEngine.addActionListener(this);
            boxerEngine.addActionListener(this);
            VEngine.addActionListener(this);
        cylinders.addActionListener(this);
        aspiration.addActionListener(this);
        fuel.addActionListener(this);
        engineMaterial.addActionListener(this);
        traction.addActionListener(this);
        brakesButton.addActionListener(this);
        tiresButton.addActionListener(this);
        chassisButton.addActionListener(this);
        suspensionButton.addActionListener(this);
        bodyPaintButton.addActionListener(this);
        
        // Add panels to CardLayout
        menuPanel.add(carPanel, "carPanel");
        menuPanel.add(enginePanel, "enginePanel");
        menuPanel.add(engineTypePanel, "engineType");
            menuPanel.add(inlinePanel, "inline");
            menuPanel.add(boxerPanel, "boxer");
            menuPanel.add(VPanel, "V");
        menuPanel.add(cylindersPanel, "cylinders");
        menuPanel.add(aspirationPanel, "aspiration");
        menuPanel.add(fuelPanel, "fuel");
        menuPanel.add(engineMaterialPanel, "engineMaterial");
        menuPanel.add(tractionPanel, "traction");
        
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

        if (e.getSource() == engineType) {
            cardLayout.show(menuPanel, "engineType");
        }

        if (e.getSource() == inlineEngine) {
            cardLayout.show(menuPanel, "inline");
        }
        
        if (e.getSource() == boxerEngine) {
            cardLayout.show(menuPanel, "boxer");
        }

        if (e.getSource() == VEngine) {
            cardLayout.show(menuPanel, "V");
        }

        if (e.getSource() == cylinders) {
            cardLayout.show(menuPanel, "cylinders");
        }

        if (e.getSource() == aspiration) {
            cardLayout.show(menuPanel, "aspiration");
        }

        if (e.getSource() == fuel) {
            cardLayout.show(menuPanel, "fuel");
        }

        if (e.getSource() == engineMaterial) {
            cardLayout.show(menuPanel, "engineMaterial");
        }

        if (e.getSource() == traction) {
            cardLayout.show(menuPanel, "traction");
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