package gb.J1Less1;

public class Team
{
    String teamName;
    TeamMember[] members;

    public Team(String teamName, TeamMember[] members) {
        this.teamName = teamName;
        this.members = members;
    }

    void TeamInfo(TeamMember[] members)
    {
        for(int i =0; i< members.length;i++)
        {
            System.out.println(members[i].memberName);
        }
    }

    void WhoPassedCourse(TeamMember[] members)
    {
        for(int i =0; i< members.length;i++)
        {
            if(members[i].coursePassed)
            {
                System.out.println(members[i].memberName);
            }
        }
    }
}
