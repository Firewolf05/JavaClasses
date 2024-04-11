package JavaClasses.class5;

public class Student implements IRaiseHand,IGiveExam {
    @Override
    public void raiseHand(String question) {
        System.out.println("can i ask a question please? "+question);
    }

    @Override
    public void speak() {

    }

    @Override
    public void giveExam() {

    }
}
