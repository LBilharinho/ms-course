package com.recursosHumanos.hrWorker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recursosHumanos.hrWorker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
