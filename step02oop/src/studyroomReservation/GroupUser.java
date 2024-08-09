package studyroomReservation;

public class GroupUser extends User{
	int numberOfMember;

	public GroupUser(String name, String phone, int numberOfMember) {
		super(name, phone);
		this.numberOfMember = numberOfMember;
	}

}
