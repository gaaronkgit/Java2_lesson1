package gb.J1Less1;

public class Course
{
    Barrier[] barriers;

    public Course(Barrier[] barriers)
    {
        this.barriers = barriers;
    }

    void doIt(Team team)
    {
        for(int tm = 0; tm< team.members.length; tm++)
        {
            for (int b = 0; b < barriers.length; b++)
            {
                CourseOfMember(team.members[tm],true);

            }
        }
    }

    private void CourseOfMember(TeamMember member, boolean isPassed)
    {
        if(isPassed)
        {
            member.SetBarrierPassed();
        }
    }
}
