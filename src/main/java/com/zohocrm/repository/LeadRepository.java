package com.zohocrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.zohocrm.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
