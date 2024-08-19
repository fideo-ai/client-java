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
 * IpAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class IpAddress {
  public static final String SERIALIZED_NAME_FIRST_SEEN_MS = "firstSeenMs";
  @SerializedName(SERIALIZED_NAME_FIRST_SEEN_MS)
  private Long firstSeenMs;

  public static final String SERIALIZED_NAME_LAST_SEEN_MS = "lastSeenMs";
  @SerializedName(SERIALIZED_NAME_LAST_SEEN_MS)
  private Long lastSeenMs;

  public static final String SERIALIZED_NAME_OBSERVATIONS = "observations";
  @SerializedName(SERIALIZED_NAME_OBSERVATIONS)
  private Integer observations;

  public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private Double confidence;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public IpAddress() {
  }

  public IpAddress firstSeenMs(Long firstSeenMs) {
    this.firstSeenMs = firstSeenMs;
    return this;
  }

  /**
   * Get firstSeenMs
   * @return firstSeenMs
   */
  @javax.annotation.Nullable
  public Long getFirstSeenMs() {
    return firstSeenMs;
  }

  public void setFirstSeenMs(Long firstSeenMs) {
    this.firstSeenMs = firstSeenMs;
  }


  public IpAddress lastSeenMs(Long lastSeenMs) {
    this.lastSeenMs = lastSeenMs;
    return this;
  }

  /**
   * Get lastSeenMs
   * @return lastSeenMs
   */
  @javax.annotation.Nullable
  public Long getLastSeenMs() {
    return lastSeenMs;
  }

  public void setLastSeenMs(Long lastSeenMs) {
    this.lastSeenMs = lastSeenMs;
  }


  public IpAddress observations(Integer observations) {
    this.observations = observations;
    return this;
  }

  /**
   * Get observations
   * @return observations
   */
  @javax.annotation.Nullable
  public Integer getObservations() {
    return observations;
  }

  public void setObservations(Integer observations) {
    this.observations = observations;
  }


  public IpAddress confidence(Double confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Get confidence
   * @return confidence
   */
  @javax.annotation.Nullable
  public Double getConfidence() {
    return confidence;
  }

  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }


  public IpAddress id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddress ipAddress = (IpAddress) o;
    return Objects.equals(this.firstSeenMs, ipAddress.firstSeenMs) &&
        Objects.equals(this.lastSeenMs, ipAddress.lastSeenMs) &&
        Objects.equals(this.observations, ipAddress.observations) &&
        Objects.equals(this.confidence, ipAddress.confidence) &&
        Objects.equals(this.id, ipAddress.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstSeenMs, lastSeenMs, observations, confidence, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddress {\n");
    sb.append("    firstSeenMs: ").append(toIndentedString(firstSeenMs)).append("\n");
    sb.append("    lastSeenMs: ").append(toIndentedString(lastSeenMs)).append("\n");
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("firstSeenMs");
    openapiFields.add("lastSeenMs");
    openapiFields.add("observations");
    openapiFields.add("confidence");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IpAddress
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IpAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IpAddress is not found in the empty JSON string", IpAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IpAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IpAddress` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IpAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IpAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IpAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IpAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<IpAddress>() {
           @Override
           public void write(JsonWriter out, IpAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IpAddress read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IpAddress given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IpAddress
   * @throws IOException if the JSON string is invalid with respect to IpAddress
   */
  public static IpAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IpAddress.class);
  }

  /**
   * Convert an instance of IpAddress to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

