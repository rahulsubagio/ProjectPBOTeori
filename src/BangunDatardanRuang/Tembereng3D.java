package BangunDatardanRuang;

public class Tembereng3D extends Bola{

    private double tinggi;

    public Tembereng3D(double jari, double tinggi){
        super(jari);
        this.tinggi = tinggi;
    }

    @Override
    public double getLuasPermukaan() {
        double LuasTembereng = super.getLuasPermukaan() * tinggi;
        return LuasTembereng;
    }

    @Override
    public double getVolume() {
        double VolumeTembereng = (Math.PI * Math.pow(tinggi, 2) * (3 * super.getJari() - tinggi))/3;
        return VolumeTembereng;
    }
}
