package tam_cdp.preselection_tasks.part2.avialines_inprogress.tours;

public class RelaxPurpose extends Tour {

	public RelaxPurpose(int numberOfDays, Food food, Transport transport) {
		super(numberOfDays, food, transport);
	}

	@Override
	public void rest() {
		System.out.println("I rest for relax.");
	}

}
