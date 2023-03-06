public class Main{
	public static void main(String[] args){
		User user = new User("Bob");

        UserReportAble userReportAble = new ReportUser(user);
        userReportAble.report();

        UserSaveAble userSaveAble = new Persister(user);
        userSaveAble.save();

	}
}