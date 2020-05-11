public class OctObserver extends Observer {
    private Subject subject;
    public OctObserver(Subject subject){
        this.subject = subject;
        subject.add(this);
    }
    @Override
    public void update() {
        System.out.println(" " + Integer.toOctalString(subject.getState()));
    }
}
