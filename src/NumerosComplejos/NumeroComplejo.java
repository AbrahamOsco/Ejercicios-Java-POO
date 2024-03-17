package NumerosComplejos;

public class NumeroComplejo {
    private double partReal;
    private double partImg;
    public NumeroComplejo(double partReal, double partImg) {
        this.partReal = partReal;
        this.partImg = partImg;
    }
    public double getPartReal() {
        return partReal;
    }

    public double getPartImg() {
        return partImg;
    }
    public NumeroComplejo sumar(NumeroComplejo numComplejo2) {
        double parteRealSum = this.partReal + numComplejo2.partReal;
        double parteImgSum = this.partImg + numComplejo2.partImg;
        NumeroComplejo nuevoNumeroSumado = new NumeroComplejo(parteRealSum, parteImgSum);
        return nuevoNumeroSumado;
    }

    public double getModulo() {
        double sumaCuadrados =  Math.pow(this.partReal, 2) + Math.pow(this.partImg, 2);
        return Math.sqrt(sumaCuadrados);
    }

    public void incrementar(double factor) {
        this.partReal *= factor;
        this.partImg  *= factor;
    }
}
