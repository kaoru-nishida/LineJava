/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum VerificationResult implements org.apache.thrift.TEnum {
  FAILED(0),
  OK_NOT_REGISTERED_YET(1),
  OK_REGISTERED_WITH_SAME_DEVICE(2),
  OK_REGISTERED_WITH_ANOTHER_DEVICE(3);

  private final int value;

  private VerificationResult(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static VerificationResult findByValue(int value) { 
    switch (value) {
      case 0:
        return FAILED;
      case 1:
        return OK_NOT_REGISTERED_YET;
      case 2:
        return OK_REGISTERED_WITH_SAME_DEVICE;
      case 3:
        return OK_REGISTERED_WITH_ANOTHER_DEVICE;
      default:
        return null;
    }
  }
}