

public class ClasePadre {

    protected int ruedas;
    protected String color;
    protected int volante;
   
    public void conducir(){
        System.out.println(ruedas);
    }

    public int getRuedas() {
        return ruedas;
    }

    public String getColor() {
        return color;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVolante(int volante) {
        this.volante = volante;
    }

    public int getVolante() {
        return volante;
    }
    

}


