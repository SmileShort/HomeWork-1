package geekbrains.HomeWork;

public class Main {

    public static void main(String[] args) {

    Team team = new Team("Nord", new String[]{"Kevin", "Maks", "Mary", "Sally", "Rick"});
    Course course = new Course(new String[]{"Приодаление барьеров", "Прохождение конусов", "Попадание в мишень", "Прыжки в мешках", "Заплыв на 100 метров"});

    System.out.println("Участники команды: ");
    team.teamMember();
    System.out.println();

    System.out.println("Предстоящие препятсвия: ");
    course.courseId();
    System.out.println();

    System.out.println("Результаты пройденных препятствий:");
    course.doIt(team.getTeamPersonalName());

    team.result(course.getCourse());


    }
}
