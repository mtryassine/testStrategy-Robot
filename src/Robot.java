public class Robot {
    private String nom;
    private IBehaviour behaviour;
//Constructeur paramétrisé
    public Robot(String nom)
    {
        this.nom = nom;
    }

//Constructeur par défaut
    public Robot()
    {
        this.nom = "_sans_nom_";
    }
//Constructeur copieur
    public Robot(Robot robot)
    {
        this.nom = robot.nom;
    }

    public String getNom() {return nom;}

    public void setNom(String nom) {this.nom = nom;}

    public void setBehaviour(IBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void move()
    {
        behaviour.moveCommand();
    }

}
