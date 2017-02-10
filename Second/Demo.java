package Second;

public class Demo {
	public static void main(String[] args) {
	
		Employee workerPesho = new Employee("Pesho");
		Employee workerSasho = new Employee("Sasho");
		Employee workerSteve = new Employee(null);
		
		workerPesho.setHoursLeft(8);
		workerSasho.setHoursLeft(1);
		workerSteve.setHoursLeft(8);
		
		Task ImportPapers = new Task("Import papers", 2);
		Task ImportPapers2 = new Task("Import papers2", 2);
		Task takeABrake = new Task("Take a brake", 1);
		Task takeABrake2 = new Task("Take a brake2", 2);//sorry can't think of a work tasks

		workerSasho.setCurrentTask(ImportPapers2);
		workerPesho.setCurrentTask(takeABrake);
		workerSteve.setCurrentTask(takeABrake2);
		
		workerPesho.work();
		workerSteve.work();
		
		workerPesho.setCurrentTask(ImportPapers);
		workerPesho.work();
		
		workerSasho.showReport();
		workerPesho.showReport();
		workerSteve.showReport();
			
	}
}