/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ValidUpdate implements org.apache.thrift.TEnum {
  BOOK_NAME(0),
  CHAPTER_NAME(1),
  CHAPTER_INFO(2);

  private final int value;

  private ValidUpdate(int value) {
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
  public static ValidUpdate findByValue(int value) { 
    switch (value) {
      case 0:
        return BOOK_NAME;
      case 1:
        return CHAPTER_NAME;
      case 2:
        return CHAPTER_INFO;
      default:
        return null;
    }
  }
}
