package gb.J1Less1;

public class TeamMember
{
    private String memberName;
    private int numOfBarrierPassed = 0;

    public TeamMember(String memberName)
    {
        this.memberName = memberName;
    }

    public void SetBarrierPassed()
    {
        numOfBarrierPassed++;
    }

    public String getMemberName()
    {
        return memberName;
    }

    public int getNumOfBarrierPassed()
    {
        return numOfBarrierPassed;
    }
}
