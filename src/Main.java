public class Main {
    public static void main(String[] args) {

// un objet robot
// changer sont comportement tout en gardant l'instance du robot

// robot Abstrait

// robot Agressif
// robot Normal
// robot Defensif
// -------------------------------------

//1- probleme : changer le comportement en dynamique
// r1 = new robotAgressif ()
// r1 = new robotNormal

// Ajouter un quatrieme comportent : robot Soutien

        // 2- nouvelle classe (RobotSoutien extends Robot) fortement couplé


// *********** Avantage ::: Design pattern strategy

        //couplage faible : RobotSoutien implements Istrategy
// Istrategy setrategy :: robot. setStrategy(new RobotSoutien())
// Istrategy setrategy ::robot.setStrategy(new RobotNormal())

// SOLID : Open (a l'extention) / Close (a la modification) principle


        Robot r1 = new Robot("robot1");

        r1.setBehaviour(new AgressifBehaviour());
        r1.move();

        r1.setBehaviour(new NormalBehaviour());
        r1.move();

        r1.setBehaviour(new DefensifBehaviour());
        r1.move();



    }
}