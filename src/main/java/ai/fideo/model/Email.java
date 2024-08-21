/*
 * Fideo API
 * Fideo Intelligence offers an identity intelligence product that protects the public good. - [Fideo Privacy Policy](https://www.fideo.ai/privacy-policy/)
 *
 * The version of the OpenAPI document: 1.0.3
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
 * Email
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class Email {
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

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_MD5 = "md5";
  @SerializedName(SERIALIZED_NAME_MD5)
  private String md5;

  public static final String SERIALIZED_NAME_SHA1 = "sha1";
  @SerializedName(SERIALIZED_NAME_SHA1)
  private String sha1;

  public static final String SERIALIZED_NAME_SHA256 = "sha256";
  @SerializedName(SERIALIZED_NAME_SHA256)
  private String sha256;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_ACTIVITY = "activity";
  @SerializedName(SERIALIZED_NAME_ACTIVITY)
  private Double activity;

  public Email() {
  }

  public Email firstSeenMs(Long firstSeenMs) {
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


  public Email lastSeenMs(Long lastSeenMs) {
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


  public Email observations(Integer observations) {
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


  public Email confidence(Double confidence) {
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


  public Email value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public Email md5(String md5) {
    this.md5 = md5;
    return this;
  }

  /**
   * Get md5
   * @return md5
   */
  @javax.annotation.Nullable
  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }


  public Email sha1(String sha1) {
    this.sha1 = sha1;
    return this;
  }

  /**
   * Get sha1
   * @return sha1
   */
  @javax.annotation.Nullable
  public String getSha1() {
    return sha1;
  }

  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }


  public Email sha256(String sha256) {
    this.sha256 = sha256;
    return this;
  }

  /**
   * Get sha256
   * @return sha256
   */
  @javax.annotation.Nullable
  public String getSha256() {
    return sha256;
  }

  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }


  public Email label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  public Email activity(Double activity) {
    this.activity = activity;
    return this;
  }

  /**
   * Get activity
   * @return activity
   */
  @javax.annotation.Nullable
  public Double getActivity() {
    return activity;
  }

  public void setActivity(Double activity) {
    this.activity = activity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Email email = (Email) o;
    return Objects.equals(this.firstSeenMs, email.firstSeenMs) &&
        Objects.equals(this.lastSeenMs, email.lastSeenMs) &&
        Objects.equals(this.observations, email.observations) &&
        Objects.equals(this.confidence, email.confidence) &&
        Objects.equals(this.value, email.value) &&
        Objects.equals(this.md5, email.md5) &&
        Objects.equals(this.sha1, email.sha1) &&
        Objects.equals(this.sha256, email.sha256) &&
        Objects.equals(this.label, email.label) &&
        Objects.equals(this.activity, email.activity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstSeenMs, lastSeenMs, observations, confidence, value, md5, sha1, sha256, label, activity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Email {\n");
    sb.append("    firstSeenMs: ").append(toIndentedString(firstSeenMs)).append("\n");
    sb.append("    lastSeenMs: ").append(toIndentedString(lastSeenMs)).append("\n");
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
    sb.append("    sha1: ").append(toIndentedString(sha1)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("md5");
    openapiFields.add("sha1");
    openapiFields.add("sha256");
    openapiFields.add("label");
    openapiFields.add("activity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Email
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Email.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Email is not found in the empty JSON string", Email.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Email.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Email` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("md5") != null && !jsonObj.get("md5").isJsonNull()) && !jsonObj.get("md5").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `md5` to be a primitive type in the JSON string but got `%s`", jsonObj.get("md5").toString()));
      }
      if ((jsonObj.get("sha1") != null && !jsonObj.get("sha1").isJsonNull()) && !jsonObj.get("sha1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sha1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sha1").toString()));
      }
      if ((jsonObj.get("sha256") != null && !jsonObj.get("sha256").isJsonNull()) && !jsonObj.get("sha256").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sha256` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sha256").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Email.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Email' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Email> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Email.class));

       return (TypeAdapter<T>) new TypeAdapter<Email>() {
           @Override
           public void write(JsonWriter out, Email value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Email read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Email given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Email
   * @throws IOException if the JSON string is invalid with respect to Email
   */
  public static Email fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Email.class);
  }

  /**
   * Convert an instance of Email to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

