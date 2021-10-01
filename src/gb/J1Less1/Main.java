package gb.J1Less1;

public class Main {

    public static void main(String[] args)
    {
        TeamMember []members = new TeamMember[4];
        members[0] = new TeamMember("Ivanov Ivan");
        members[1] = new TeamMember("Ptrov Petr");
        members[2] = new TeamMember("Sergeev Sergei");
        members[3] = new TeamMember("Antonov Anton");

        Team team = new Team("SuperWinners",members);

        Barrier[] barriers = new Barrier[4];
        barriers[0].setName("b1");
        barriers[1].setName("b2");
        barriers[2].setName("b3");
        barriers[3].setName("b4");

        Course course = new Course(barriers);
        course.doIt(team);


    }
}
