package com.axonivy.utils.metaproc.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.environment.IvyTest;

@IvyTest
class SampleIvyTest{
  
  @Test
  public void useIvy(){
    Ivy.log().info("hi from JUnit");
    assertThat(true).as("I can use Ivy API facade in tests").isTrue();
  }
}
