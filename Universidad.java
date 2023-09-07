import java.util.ArrayList;

public class Universidad{
    private ArrayList<Sede>sedes = new ArrayList<Sede>();

    public Universidad() {
        Sede sede1 = new Sede();
    }

    public Universidad(ArrayList<Sede> sedes) {
        this.sedes = sedes;
    }

       
}

