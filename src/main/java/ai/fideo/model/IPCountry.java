/*
 * Fideo API
 * This is a representation of the Fideo API based on the OpenAPI 3.0 specification.  You can find out more about Swagger at [https://swagger.io](https://swagger.io). Some useful links: - [Fideo Privacy Policy](https://www.fideo.ai/privacy-policy/)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@fideo.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ai.fideo.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets IPCountry
 */
@JsonAdapter(IPCountry.Adapter.class)
public enum IPCountry {
  
  DOMESTIC("DOMESTIC"),
  
  FOREIGN("FOREIGN"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  IPCountry(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IPCountry fromValue(String value) {
    for (IPCountry b : IPCountry.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<IPCountry> {
    @Override
    public void write(final JsonWriter jsonWriter, final IPCountry enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IPCountry read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IPCountry.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    IPCountry.fromValue(value);
  }
}
