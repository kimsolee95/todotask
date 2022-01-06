package com.taskagile.domain.model.user;

import org.springframework.stereotype.Component;

/**
 * User registration domain service
 */
@Component
public class RegistrationManagement {

  private UserRepository repository;

  public RegistrationManagement(UserRepository repository) {
    this.repository = repository;

  }
}
