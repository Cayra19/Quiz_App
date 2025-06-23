import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1, "Favourite Language", "Java", "Python", "C", "Cpp", "Java");
        questions[1] = new Question(2, "size of int", "2", "6", "4", "8", "4");
        questions[2] = new Question(3, "size of double", "2", "6", "4", "8", "8");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
    }

    String ans[] = new String[5];

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
//        System.out.println(q.getQue()); //getting qns only like favourite language,etc.
//        System.out.println(q); //Question{id=2, que='size of int', op1='2', op2='6', op3='4', op4='8', answer='4'}
            System.out.println("Question No.: " + q.getId());
            System.out.println(q.getQue());
            System.out.println(q.getOp1());
            System.out.println(q.getOp2());
            System.out.println(q.getOp3());
            System.out.println(q.getOp4());
            Scanner sc = new Scanner(System.in);
            ans[i] = sc.nextLine();
            i++;
        }
        System.out.println("Your answers are as: ");
        for (String s : ans) System.out.println(s);
    }

    public static void main(String[] args) {

    }
}
