package Compostion;

public class PersonalComputer {
    private Case pcCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PersonalComputer(Case pcCase, Motherboard motherboard, Monitor monitor) {
        this.pcCase = pcCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }


    public void powerUp(){
        this.pcCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //Fancy graphics
        this.monitor.drawPixelAt(1000, 200, "yellow");
    }

}
