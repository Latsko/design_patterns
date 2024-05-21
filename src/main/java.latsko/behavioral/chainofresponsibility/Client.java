package behavioral.chainofresponsibility;

import java.time.LocalDate;

public class Client {

	public static void main(String[] args) {
		LeaveApplication leaveApplication = LeaveApplication.getBuilder()
				.withType(LeaveApplication.Type.Sick)
				.from(LocalDate.now()).to(LocalDate.now().plusDays(10))
				.build();
		System.out.println(leaveApplication);
		System.out.println("****************************************************");

		LeaveApprover approver = createChain();
		approver.processLeaveApplication(leaveApplication);
		System.out.println(leaveApplication);
	}

	private static LeaveApprover createChain() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead lead = new ProjectLead(manager);
		return lead;
	}
}
