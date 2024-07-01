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
import ai.fideo.model.Alias;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * NameWithAlias
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class NameWithAlias {
  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  private String first;

  public static final String SERIALIZED_NAME_LAST = "last";
  @SerializedName(SERIALIZED_NAME_LAST)
  private String last;

  public static final String SERIALIZED_NAME_MIDDLE = "middle";
  @SerializedName(SERIALIZED_NAME_MIDDLE)
  private String middle;

  public static final String SERIALIZED_NAME_GIVEN_NAME = "givenName";
  @SerializedName(SERIALIZED_NAME_GIVEN_NAME)
  private String givenName;

  public static final String SERIALIZED_NAME_FAMILY_NAME = "familyName";
  @SerializedName(SERIALIZED_NAME_FAMILY_NAME)
  private String familyName;

  public static final String SERIALIZED_NAME_ALIASES = "aliases";
  @SerializedName(SERIALIZED_NAME_ALIASES)
  private List<Alias> aliases = new ArrayList<>();

  public NameWithAlias() {
  }

  public NameWithAlias first(String first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @javax.annotation.Nullable
  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }


  public NameWithAlias last(String last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @javax.annotation.Nullable
  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }


  public NameWithAlias middle(String middle) {
    this.middle = middle;
    return this;
  }

   /**
   * Get middle
   * @return middle
  **/
  @javax.annotation.Nullable
  public String getMiddle() {
    return middle;
  }

  public void setMiddle(String middle) {
    this.middle = middle;
  }


  public NameWithAlias givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * Get givenName
   * @return givenName
  **/
  @javax.annotation.Nullable
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public NameWithAlias familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * Get familyName
   * @return familyName
  **/
  @javax.annotation.Nullable
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public NameWithAlias aliases(List<Alias> aliases) {
    this.aliases = aliases;
    return this;
  }

  public NameWithAlias addAliasesItem(Alias aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Get aliases
   * @return aliases
  **/
  @javax.annotation.Nullable
  public List<Alias> getAliases() {
    return aliases;
  }

  public void setAliases(List<Alias> aliases) {
    this.aliases = aliases;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameWithAlias nameWithAlias = (NameWithAlias) o;
    return Objects.equals(this.first, nameWithAlias.first) &&
        Objects.equals(this.last, nameWithAlias.last) &&
        Objects.equals(this.middle, nameWithAlias.middle) &&
        Objects.equals(this.givenName, nameWithAlias.givenName) &&
        Objects.equals(this.familyName, nameWithAlias.familyName) &&
        Objects.equals(this.aliases, nameWithAlias.aliases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, last, middle, givenName, familyName, aliases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameWithAlias {\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    middle: ").append(toIndentedString(middle)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
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
    openapiFields.add("first");
    openapiFields.add("last");
    openapiFields.add("middle");
    openapiFields.add("givenName");
    openapiFields.add("familyName");
    openapiFields.add("aliases");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NameWithAlias
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NameWithAlias.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NameWithAlias is not found in the empty JSON string", NameWithAlias.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NameWithAlias.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NameWithAlias` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("first") != null && !jsonObj.get("first").isJsonNull()) && !jsonObj.get("first").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first").toString()));
      }
      if ((jsonObj.get("last") != null && !jsonObj.get("last").isJsonNull()) && !jsonObj.get("last").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last").toString()));
      }
      if ((jsonObj.get("middle") != null && !jsonObj.get("middle").isJsonNull()) && !jsonObj.get("middle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middle").toString()));
      }
      if ((jsonObj.get("givenName") != null && !jsonObj.get("givenName").isJsonNull()) && !jsonObj.get("givenName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `givenName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("givenName").toString()));
      }
      if ((jsonObj.get("familyName") != null && !jsonObj.get("familyName").isJsonNull()) && !jsonObj.get("familyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `familyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("familyName").toString()));
      }
      if (jsonObj.get("aliases") != null && !jsonObj.get("aliases").isJsonNull()) {
        JsonArray jsonArrayaliases = jsonObj.getAsJsonArray("aliases");
        if (jsonArrayaliases != null) {
          // ensure the json data is an array
          if (!jsonObj.get("aliases").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `aliases` to be an array in the JSON string but got `%s`", jsonObj.get("aliases").toString()));
          }

          // validate the optional field `aliases` (array)
          for (int i = 0; i < jsonArrayaliases.size(); i++) {
            Alias.validateJsonElement(jsonArrayaliases.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NameWithAlias.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NameWithAlias' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NameWithAlias> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NameWithAlias.class));

       return (TypeAdapter<T>) new TypeAdapter<NameWithAlias>() {
           @Override
           public void write(JsonWriter out, NameWithAlias value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NameWithAlias read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NameWithAlias given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NameWithAlias
  * @throws IOException if the JSON string is invalid with respect to NameWithAlias
  */
  public static NameWithAlias fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NameWithAlias.class);
  }

 /**
  * Convert an instance of NameWithAlias to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
