package powerRanger;
//Classe Base

public class PowerRanger {
    String name;

    public PowerRanger(String name) {
        this.name = name;
        ;
    }

    public void morfar() {
        System.out.println(name + "...it's morphing time...");
    }

}

class PowerRangerVerde extends PowerRanger {
    public PowerRangerVerde(String name) {
        super(name);
    }

    @Override // Sobreposição
    public void morfar() {
        System.out.println("\n" + name + " .... says: Dragonzord!\n");
    }

}

class PowerRangerPreto extends PowerRanger {
    public PowerRangerPreto(String name) {
        super(name);
    }

    @Override // Sobreposição
    public void morfar() {
        System.out.println("\n" + name +" .... says: Mastodon!\n");
    }

}

class PowerRangerRosa extends PowerRanger {
    public PowerRangerRosa(String name) {
        super(name);
    }

    @Override // Sobreposição
    public void morfar() {
        System.out.println("\n" + name +" .... says: Pterodactly!\n");
    }

}

class PowerRangerAzul extends PowerRanger {
    public PowerRangerAzul(String name) {
        super(name);
    }

    @Override // Sobreposição
    public void morfar() {
        System.out.println("\n" + name +" .... says: Tricerapots !\n");
    }

}

class PowerRangerAmarelo extends PowerRanger {
    public PowerRangerAmarelo(String name) {
        super(name);
    }

    @Override // Sobreposição
    public void morfar() {
        System.out.println("\n" + name +" .... says: Saber Tooth Tiger\n");
    }

}

class PowerRangerVermelho extends PowerRanger {
    public PowerRangerVermelho(String name) {
        super(name);
    }

    @Override // Sobreposição
    public void morfar() {
        System.out.println("\n" + name +" .... says: Tyrannosaurus!\n");
    }

}
