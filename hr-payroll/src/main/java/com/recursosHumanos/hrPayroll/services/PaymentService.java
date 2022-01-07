package com.recursosHumanos.hrPayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recursosHumanos.hrPayroll.entities.Payment;
import com.recursosHumanos.hrPayroll.entities.Worker;
import com.recursosHumanos.hrPayroll.feignClients.WorkerFeignClients;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClients workerFeignClient;

	public Payment getPayment(long workerId, int days) {

		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
