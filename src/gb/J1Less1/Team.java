package gb.J1Less1;

public class Team
{
    String teamName;
    TeamMember[] members;

    public Team(String teamName, TeamMember[] members)
    {
        this.teamName = teamName;
        this.members = members;
    }

    void TeamInfo(TeamMember[] members)
    {
        for(int i =0; i< members.length;i++)
        {
            System.out.println(members[i].getMemberName());
        }
    }

    void WhoPassedCourse(TeamMember[] members, Course course)
    {
        for(int i =0; i< members.length;i++)
        {
            if(members[i].getNumOfBarrierPassed() == course.barriers.length)
            {
                System.out.println(members[i].getMemberName() + " passed course");
            }
        }
    }
}
