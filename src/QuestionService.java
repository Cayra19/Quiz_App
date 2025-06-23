public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1, "Favourite Language", "Java", "Python", "C", "Cpp", "Java");
        questions[1] = new Question(2, "size of int", "2", "6", "4", "8", "4");
        questions[2] = new Question(3, "size of double", "2", "6", "4", "8", "8");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8",  "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");


    }


    public void displayQuestions() {
        for(Question q:questions)
//        System.out.println(q.getQue()); //getting qns only like favourite language,etc.
            System.out.println(q); //Question{id=2, que='size of int', op1='2', op2='6', op3='4', op4='8', answer='4'}
    }

    public static void main(String[] args) {

    }
}
