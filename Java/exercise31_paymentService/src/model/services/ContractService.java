package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService ops;
		
	public ContractService(OnlinePaymentService ops) {
		this.ops = ops;
	}

	public void processContract(Contract contract, int months) {
					
		for (int i = 1; i <= months; i++) {
						
			double installmentAmount = contract.getTotalValue() / months;
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(contract.getDate());
			cal.add(Calendar.MONTH, i);
			Date dueDate = cal.getTime();
				
			double interest = installmentAmount + ops.interest(installmentAmount, i);
			double total = interest + ops.paymentFee(interest);
				
			contract.addInstallment(new Installment(dueDate, total));
		}
		
	}
	
}
