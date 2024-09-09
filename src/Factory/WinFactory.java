package Factory;

public class WinFactory implements Factory {
    public WinButton createButton(){
        return new WinButton();
    }
    public WinPanel createPanel(){
        return new WinPanel();

    }
}
