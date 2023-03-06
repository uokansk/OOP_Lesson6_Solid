public class ReportUser implements UserReportAble{
    private User user;

    public ReportUser(User user) {
        this.user = user;
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}
