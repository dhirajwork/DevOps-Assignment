package com.devops.hotelreservation.assignment;
import com.devops.hotelreservation.assignment.validation.EmailValidator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.validation.ClockProvider;
import javax.validation.ConstraintValidatorContext;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class AssignmentApplicationTests {
   @Test
   void contextLoads() {
   }
   @Test
   void testValidEmail(){
      EmailValidator ev = new EmailValidator();
      assertEquals(ev.isValid("abcxyz@test.com", new ConstraintValidatorContext() {
         @Override
         public void disableDefaultConstraintViolation() {
         }
         @Override
         public String getDefaultConstraintMessageTemplate() {
            return null;
         }
         @Override
         public ClockProvider getClockProvider() {
            return null;
         }
         @Override
         public ConstraintViolationBuilder buildConstraintViolationWithTemplate(String messageTemplate) {
            return null;
         }
         @Override
         public <T> T unwrap(Class<T> type) {
            return null;
         }
      }),true);
   }
}