package com.devops.hotelreservation.assignment;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

  // @InjectMocks annotation is used to create and inject the mock object
  @InjectMocks
  UserServiceImpl userServiceImpl = new UserServiceImpl();

  // @Mock annotation is used to create the mock object to be injected
  @Mock
  UserService userService;

  @Test
   public void testAdd(){
      //add the behavior of calc service to add two numbers
      when(UserService.findUserByEmail(shwetagln66@gmail.com)).thenReturn(null);
   }
}
