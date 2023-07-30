package com.franciscode.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franciscode.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
