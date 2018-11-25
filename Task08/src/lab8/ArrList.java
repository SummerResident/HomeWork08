package lab8;

import java.util.ArrayList;

public class ArrList {

	private ArrayList<DepositorInformation> depositors = new ArrayList<DepositorInformation>();

	public void addDepositor(DepositorInformation depositor) {
		this.depositors.add(depositor);
	}

	public void searchDepositors(String fio) {
		for (DepositorInformation depositorInformation : depositors) {
			if (depositorInformation.toString().contains(fio)) {
				System.out.println(depositorInformation);
			}
		}
	}

	public void withdrawalOfInformationAboutDepositorsOnaGivenAmount(int depositAmount) {

		for (DepositorInformation depositorInformation : depositors) {
			if (depositorInformation.getDepositAmount() > depositAmount) {
				System.out.println(depositorInformation);
			}
		}

	}

	public void removeDepositors(String fio) {
		for (int i = 0; i < depositors.size(); i++) {
			if (depositors.get(i).toString().contains(fio)) {
				depositors.remove(depositors.get(i));
			}
		}
	}

	public void searchDeoisitorsOfDuration(int duration) {
		for (DepositorInformation depositorInformation : depositors) {
			if (depositorInformation.getDureation() > duration) {
				System.out.println(depositorInformation);
			}
		}
	}

	public void showDepositors() {
		for (DepositorInformation depositorInformation : depositors) {
			System.out.println(depositorInformation);
			System.out.println("____________________________");
			System.out.println();
		}
	}

}
