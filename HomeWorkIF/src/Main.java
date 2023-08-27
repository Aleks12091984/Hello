import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        /*int score=0;    // Количество правильных ответов
        int answer;    // Ответы пользователя
        System.out.println("Столица Испании: ");
        System.out.println("1. Стамбул;");
        System.out.println("2. Мадрид;");
        System.out.println("3. Токио;");
        System.out.println("4. Нью-Йорк;");     // Добить с лекции + калькулятор
        System.out.print("Ваш ответ: ");
        answer = kb.nextInt();
        if(answer == 2){
            System.out.println("Правильно");
            score++;
        }
        else{
            System.out.println("Ответ неверный");
        }

        System.out.println("Самая близкая планета к солнцу: ");
        System.out.println("1. Меркурий;");
        System.out.println("2. Венера;");
        System.out.println("3. Земля;");
        System.out.println("4. Марс;");
        System.out.print("Ваш ответ: ");
        answer = kb.nextInt();
        if(answer == 1){
            System.out.println("Правильно");
            score++;
        }
        else{
            System.out.println("Ответ неверный");
        }

        System.out.println("Какая группа крови самая редкая: ");
        System.out.println("1. I;");
        System.out.println("2. II;");
        System.out.println("3. III;");
        System.out.println("4. IV;");
        System.out.print("Ваш ответ: ");
        answer = kb.nextInt();
        if(answer == 4){
            System.out.println("Правильно");
            score++;
        }
        else{
            System.out.println("Ответ неверный");
        }

        System.out.println("Вы набрали %d очков". formatted(score));*/

        int a;
        int b;
        int c = 0;
        char s;  // Sign - знак операции
        System.out.print("Введите первое число: ");
        a = kb.nextInt();

        System.out.print("Введите операцию: ");
        s = kb.next().charAt(0);

        System.out.print("Введите второе число: ");
        b = kb.nextInt();


       /*if(s == '+'){

           c = a + b;
       }
       else if(s == '-'){
           c=a-b;
       }
       else if(s == '*'){
           c=a*b;
       }
       else if(s == '/'){
           c=a/b;
       }
       else{
           c = Integer.MIN_VALUE;
           System.out.println("Error: No operation");
       }*/

        switch(s){
            case '+' : c = a + b; break;
            case '-' : c = a - b; break;
            case '*' : c = a * b; break;
            case '/' : c = a / b; break;
        }
        System.out.printf("%d %c %d = %d", a, s, b, c);


        }

    }

       