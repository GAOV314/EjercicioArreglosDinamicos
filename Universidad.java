import java.util.ArrayList;

public class Universidad{
    private ArrayList<Sede>sedes = new ArrayList<Sede>();

    public Universidad() {
        Sede sede1 = new Sede();
    }

    public Universidad(ArrayList<Sede> sedes) {
        this.sedes = sedes;
    }

    public ArrayList<Sede> getSedes() {
        return sedes;
    }
    public void agregarSede(Sede sede2){
        sedes.add(sede2);
        System.out.println("Se ha agregado exitosamente la sede.");
    }
}

