package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class FrobeniusTest {

  @ParameterizedTest
  @CsvFileSource(resources = "mcnugget-data.csv", numLinesToSkip = 1)
  void isMcNugget(int value, boolean expected) {
    assertEquals(expected, Frobenius.isMcNugget(value));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "general-mcnugget-data.csv", numLinesToSkip = 1)
  void isGeneralMcNugget(int value, int[] packSizes, boolean expected) {
    assertEquals(expected, Frobenius.isGeneralMcNugget(value, packSizes));
  }
}

