package com.dividenz.billing.domain;

import org.springframework.data.repository.CrudRepository;

import com.dividenz.billing.infrastructure.Event;



// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface EventRepository extends CrudRepository<Event, Integer> {

}