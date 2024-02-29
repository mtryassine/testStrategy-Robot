public class NormalBehaviour implements IBehaviour {
    @Override
    public int moveCommand() {
        System.out.println("Normal Behaviour ");
        return 2;
    }
}
