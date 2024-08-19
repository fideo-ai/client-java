/*
 * Fideo API
 * Fideo Intelligence offers an identity intelligence product that protects the public good. - [Fideo Privacy Policy](https://www.fideo.ai/privacy-policy/)
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: support@fideo.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ai.fideo.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ai.fideo.client.JSON;

/**
 * Demographics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Demographics {
  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private Integer age;

  public static final String SERIALIZED_NAME_AGE_RANGE = "ageRange";
  @SerializedName(SERIALIZED_NAME_AGE_RANGE)
  private String ageRange;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_LOCATION_GENERAL = "locationGeneral";
  @SerializedName(SERIALIZED_NAME_LOCATION_GENERAL)
  private String locationGeneral;

  public Demographics() {
  }

  public Demographics age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
   */
  @javax.annotation.Nullable
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }


  public Demographics ageRange(String ageRange) {
    this.ageRange = ageRange;
    return this;
  }

  /**
   * Get ageRange
   * @return ageRange
   */
  @javax.annotation.Nullable
  public String getAgeRange() {
    return ageRange;
  }

  public void setAgeRange(String ageRange) {
    this.ageRange = ageRange;
  }


  public Demographics gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  @javax.annotation.Nullable
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }


  public Demographics locationGeneral(String locationGeneral) {
    this.locationGeneral = locationGeneral;
    return this;
  }

  /**
   * Get locationGeneral
   * @return locationGeneral
   */
  @javax.annotation.Nullable
  public String getLocationGeneral() {
    return locationGeneral;
  }

  public void setLocationGeneral(String locationGeneral) {
    this.locationGeneral = locationGeneral;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Demographics demographics = (Demographics) o;
    return Objects.equals(this.age, demographics.age) &&
        Objects.equals(this.ageRange, demographics.ageRange) &&
        Objects.equals(this.gender, demographics.gender) &&
        Objects.equals(this.locationGeneral, demographics.locationGeneral);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, ageRange, gender, locationGeneral);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Demographics {\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    ageRange: ").append(toIndentedString(ageRange)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    locationGeneral: ").append(toIndentedString(locationGeneral)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("age");
    openapiFields.add("ageRange");
    openapiFields.add("gender");
    openapiFields.add("locationGeneral");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Demographics
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Demographics.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Demographics is not found in the empty JSON string", Demographics.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Demographics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Demographics` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ageRange") != null && !jsonObj.get("ageRange").isJsonNull()) && !jsonObj.get("ageRange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ageRange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ageRange").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("locationGeneral") != null && !jsonObj.get("locationGeneral").isJsonNull()) && !jsonObj.get("locationGeneral").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationGeneral` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationGeneral").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Demographics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Demographics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Demographics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Demographics.class));

       return (TypeAdapter<T>) new TypeAdapter<Demographics>() {
           @Override
           public void write(JsonWriter out, Demographics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Demographics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Demographics given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Demographics
   * @throws IOException if the JSON string is invalid with respect to Demographics
   */
  public static Demographics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Demographics.class);
  }

  /**
   * Convert an instance of Demographics to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

