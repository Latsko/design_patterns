package structural.flyweight;

import structural.flyweight.ErrorMessageFactory.ErrorType;

public class Client {

	public static void main(String[] args) {
		SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(ErrorType.GenericSystemError);
		System.out.println(msg1.getText("4038"));

		UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedMessage("1024");
		System.out.println(msg2.getText(null));
	}

}
