/*
 * Fideo API
 * Fideo Intelligence offers an identity intelligence product that protects the public good. - [Fideo Privacy Policy](https://www.fideo.ai/privacy-policy/)
 *
 * The version of the OpenAPI document: 1.0.4
 * Contact: support@fideo.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ai.fideo.model;

import java.util.Objects;
import ai.fideo.model.Demographics;
import ai.fideo.model.Economic;
import ai.fideo.model.Education;
import ai.fideo.model.Email;
import ai.fideo.model.Employment;
import ai.fideo.model.IpAddress;
import ai.fideo.model.Location;
import ai.fideo.model.NameWithAlias;
import ai.fideo.model.Phone;
import ai.fideo.model.Photo;
import ai.fideo.model.SignalsResponseV0;
import ai.fideo.model.SignalsResponseV20240424;
import ai.fideo.model.SocialProfileDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import ai.fideo.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
public class SignalsPost200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SignalsPost200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SignalsPost200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SignalsPost200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SignalsResponseV0> adapterSignalsResponseV0 = gson.getDelegateAdapter(this, TypeToken.get(SignalsResponseV0.class));
            final TypeAdapter<SignalsResponseV20240424> adapterSignalsResponseV20240424 = gson.getDelegateAdapter(this, TypeToken.get(SignalsResponseV20240424.class));

            return (TypeAdapter<T>) new TypeAdapter<SignalsPost200Response>() {
                @Override
                public void write(JsonWriter out, SignalsPost200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `SignalsResponseV0`
                    if (value.getActualInstance() instanceof SignalsResponseV0) {
                        JsonElement element = adapterSignalsResponseV0.toJsonTree((SignalsResponseV0)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `SignalsResponseV20240424`
                    if (value.getActualInstance() instanceof SignalsResponseV20240424) {
                        JsonElement element = adapterSignalsResponseV20240424.toJsonTree((SignalsResponseV20240424)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: SignalsResponseV0, SignalsResponseV20240424");
                }

                @Override
                public SignalsPost200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize SignalsResponseV0
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SignalsResponseV0.validateJsonElement(jsonElement);
                        actualAdapter = adapterSignalsResponseV0;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SignalsResponseV0'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SignalsResponseV0 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SignalsResponseV0'", e);
                    }
                    // deserialize SignalsResponseV20240424
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SignalsResponseV20240424.validateJsonElement(jsonElement);
                        actualAdapter = adapterSignalsResponseV20240424;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SignalsResponseV20240424'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SignalsResponseV20240424 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SignalsResponseV20240424'", e);
                    }

                    if (match == 1) {
                        SignalsPost200Response ret = new SignalsPost200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for SignalsPost200Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public SignalsPost200Response() {
        super("oneOf", Boolean.FALSE);
    }

    public SignalsPost200Response(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SignalsResponseV0", SignalsResponseV0.class);
        schemas.put("SignalsResponseV20240424", SignalsResponseV20240424.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return SignalsPost200Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * SignalsResponseV0, SignalsResponseV20240424
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof SignalsResponseV0) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SignalsResponseV20240424) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be SignalsResponseV0, SignalsResponseV20240424");
    }

    /**
     * Get the actual instance, which can be the following:
     * SignalsResponseV0, SignalsResponseV20240424
     *
     * @return The actual instance (SignalsResponseV0, SignalsResponseV20240424)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SignalsResponseV0`. If the actual instance is not `SignalsResponseV0`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SignalsResponseV0`
     * @throws ClassCastException if the instance is not `SignalsResponseV0`
     */
    public SignalsResponseV0 getSignalsResponseV0() throws ClassCastException {
        return (SignalsResponseV0)super.getActualInstance();
    }
    /**
     * Get the actual instance of `SignalsResponseV20240424`. If the actual instance is not `SignalsResponseV20240424`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SignalsResponseV20240424`
     * @throws ClassCastException if the instance is not `SignalsResponseV20240424`
     */
    public SignalsResponseV20240424 getSignalsResponseV20240424() throws ClassCastException {
        return (SignalsResponseV20240424)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SignalsPost200Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with SignalsResponseV0
        try {
            SignalsResponseV0.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for SignalsResponseV0 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with SignalsResponseV20240424
        try {
            SignalsResponseV20240424.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for SignalsResponseV20240424 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for SignalsPost200Response with oneOf schemas: SignalsResponseV0, SignalsResponseV20240424. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of SignalsPost200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SignalsPost200Response
     * @throws IOException if the JSON string is invalid with respect to SignalsPost200Response
     */
    public static SignalsPost200Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SignalsPost200Response.class);
    }

    /**
     * Convert an instance of SignalsPost200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
