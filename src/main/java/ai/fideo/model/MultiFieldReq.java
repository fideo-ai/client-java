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
import ai.fideo.model.LocationReq;
import ai.fideo.model.PersonNameReq;
import ai.fideo.model.SocialProfileReq;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * MultiFieldReq
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class MultiFieldReq {
  public static final String SERIALIZED_NAME_TWITTER = "twitter";
  @SerializedName(SERIALIZED_NAME_TWITTER)
  private String twitter;

  public static final String SERIALIZED_NAME_LINKEDIN = "linkedin";
  @SerializedName(SERIALIZED_NAME_LINKEDIN)
  private String linkedin;

  public static final String SERIALIZED_NAME_RECORD_ID = "recordId";
  @SerializedName(SERIALIZED_NAME_RECORD_ID)
  private String recordId;

  public static final String SERIALIZED_NAME_PERSON_ID = "personId";
  @SerializedName(SERIALIZED_NAME_PERSON_ID)
  private String personId;

  public static final String SERIALIZED_NAME_PARTNER_ID = "partnerId";
  @SerializedName(SERIALIZED_NAME_PARTNER_ID)
  private String partnerId;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private LocationReq location;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private String avatar;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ORGANIZATION = "organization";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION)
  private String organization;

  public static final String SERIALIZED_NAME_EMAILS = "emails";
  @SerializedName(SERIALIZED_NAME_EMAILS)
  private List<String> emails = new ArrayList<>();

  public static final String SERIALIZED_NAME_PHONES = "phones";
  @SerializedName(SERIALIZED_NAME_PHONES)
  private List<String> phones = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROFILES = "profiles";
  @SerializedName(SERIALIZED_NAME_PROFILES)
  private List<SocialProfileReq> profiles = new ArrayList<>();

  public static final String SERIALIZED_NAME_MAIDS = "maids";
  @SerializedName(SERIALIZED_NAME_MAIDS)
  private List<String> maids = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private PersonNameReq name;

  public static final String SERIALIZED_NAME_PARTNER_KEYS = "partnerKeys";
  @SerializedName(SERIALIZED_NAME_PARTNER_KEYS)
  private Map<String, String> partnerKeys = new HashMap<>();

  public static final String SERIALIZED_NAME_LI_NONID = "li_nonid";
  @SerializedName(SERIALIZED_NAME_LI_NONID)
  private String liNonid;

  public static final String SERIALIZED_NAME_PANORAMA_ID = "panoramaId";
  @SerializedName(SERIALIZED_NAME_PANORAMA_ID)
  private String panoramaId;

  public static final String SERIALIZED_NAME_PLACEKEY = "placekey";
  @SerializedName(SERIALIZED_NAME_PLACEKEY)
  private String placekey;

  public static final String SERIALIZED_NAME_GENERATE_PID = "generatePid";
  @SerializedName(SERIALIZED_NAME_GENERATE_PID)
  private Boolean generatePid;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private SocialProfileReq profile;

  public static final String SERIALIZED_NAME_MAID = "maid";
  @SerializedName(SERIALIZED_NAME_MAID)
  private String maid;

  public static final String SERIALIZED_NAME_INFER = "infer";
  @SerializedName(SERIALIZED_NAME_INFER)
  private Boolean infer;

  public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private String confidence;

  public static final String SERIALIZED_NAME_BIRTHDAY = "birthday";
  @SerializedName(SERIALIZED_NAME_BIRTHDAY)
  private String birthday;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ipAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public MultiFieldReq() {
  }

  public MultiFieldReq twitter(String twitter) {
    this.twitter = twitter;
    return this;
  }

   /**
   * Get twitter
   * @return twitter
  **/
  @javax.annotation.Nullable
  public String getTwitter() {
    return twitter;
  }

  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }


  public MultiFieldReq linkedin(String linkedin) {
    this.linkedin = linkedin;
    return this;
  }

   /**
   * Get linkedin
   * @return linkedin
  **/
  @javax.annotation.Nullable
  public String getLinkedin() {
    return linkedin;
  }

  public void setLinkedin(String linkedin) {
    this.linkedin = linkedin;
  }


  public MultiFieldReq recordId(String recordId) {
    this.recordId = recordId;
    return this;
  }

   /**
   * Get recordId
   * @return recordId
  **/
  @javax.annotation.Nullable
  public String getRecordId() {
    return recordId;
  }

  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }


  public MultiFieldReq personId(String personId) {
    this.personId = personId;
    return this;
  }

   /**
   * Get personId
   * @return personId
  **/
  @javax.annotation.Nullable
  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }


  public MultiFieldReq partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Get partnerId
   * @return partnerId
  **/
  @javax.annotation.Nullable
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  public MultiFieldReq location(LocationReq location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  public LocationReq getLocation() {
    return location;
  }

  public void setLocation(LocationReq location) {
    this.location = location;
  }


  public MultiFieldReq avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @javax.annotation.Nullable
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  public MultiFieldReq website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @javax.annotation.Nullable
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  public MultiFieldReq title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public MultiFieldReq organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @javax.annotation.Nullable
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }


  public MultiFieldReq emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public MultiFieldReq addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @javax.annotation.Nullable
  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
  }


  public MultiFieldReq phones(List<String> phones) {
    this.phones = phones;
    return this;
  }

  public MultiFieldReq addPhonesItem(String phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<>();
    }
    this.phones.add(phonesItem);
    return this;
  }

   /**
   * Get phones
   * @return phones
  **/
  @javax.annotation.Nullable
  public List<String> getPhones() {
    return phones;
  }

  public void setPhones(List<String> phones) {
    this.phones = phones;
  }


  public MultiFieldReq profiles(List<SocialProfileReq> profiles) {
    this.profiles = profiles;
    return this;
  }

  public MultiFieldReq addProfilesItem(SocialProfileReq profilesItem) {
    if (this.profiles == null) {
      this.profiles = new ArrayList<>();
    }
    this.profiles.add(profilesItem);
    return this;
  }

   /**
   * Get profiles
   * @return profiles
  **/
  @javax.annotation.Nullable
  public List<SocialProfileReq> getProfiles() {
    return profiles;
  }

  public void setProfiles(List<SocialProfileReq> profiles) {
    this.profiles = profiles;
  }


  public MultiFieldReq maids(List<String> maids) {
    this.maids = maids;
    return this;
  }

  public MultiFieldReq addMaidsItem(String maidsItem) {
    if (this.maids == null) {
      this.maids = new ArrayList<>();
    }
    this.maids.add(maidsItem);
    return this;
  }

   /**
   * Get maids
   * @return maids
  **/
  @javax.annotation.Nullable
  public List<String> getMaids() {
    return maids;
  }

  public void setMaids(List<String> maids) {
    this.maids = maids;
  }


  public MultiFieldReq name(PersonNameReq name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public PersonNameReq getName() {
    return name;
  }

  public void setName(PersonNameReq name) {
    this.name = name;
  }


  public MultiFieldReq partnerKeys(Map<String, String> partnerKeys) {
    this.partnerKeys = partnerKeys;
    return this;
  }

  public MultiFieldReq putPartnerKeysItem(String key, String partnerKeysItem) {
    if (this.partnerKeys == null) {
      this.partnerKeys = new HashMap<>();
    }
    this.partnerKeys.put(key, partnerKeysItem);
    return this;
  }

   /**
   * Get partnerKeys
   * @return partnerKeys
  **/
  @javax.annotation.Nullable
  public Map<String, String> getPartnerKeys() {
    return partnerKeys;
  }

  public void setPartnerKeys(Map<String, String> partnerKeys) {
    this.partnerKeys = partnerKeys;
  }


  public MultiFieldReq liNonid(String liNonid) {
    this.liNonid = liNonid;
    return this;
  }

   /**
   * Get liNonid
   * @return liNonid
  **/
  @javax.annotation.Nullable
  public String getLiNonid() {
    return liNonid;
  }

  public void setLiNonid(String liNonid) {
    this.liNonid = liNonid;
  }


  public MultiFieldReq panoramaId(String panoramaId) {
    this.panoramaId = panoramaId;
    return this;
  }

   /**
   * Get panoramaId
   * @return panoramaId
  **/
  @javax.annotation.Nullable
  public String getPanoramaId() {
    return panoramaId;
  }

  public void setPanoramaId(String panoramaId) {
    this.panoramaId = panoramaId;
  }


  public MultiFieldReq placekey(String placekey) {
    this.placekey = placekey;
    return this;
  }

   /**
   * Get placekey
   * @return placekey
  **/
  @javax.annotation.Nullable
  public String getPlacekey() {
    return placekey;
  }

  public void setPlacekey(String placekey) {
    this.placekey = placekey;
  }


  public MultiFieldReq generatePid(Boolean generatePid) {
    this.generatePid = generatePid;
    return this;
  }

   /**
   * Get generatePid
   * @return generatePid
  **/
  @javax.annotation.Nullable
  public Boolean getGeneratePid() {
    return generatePid;
  }

  public void setGeneratePid(Boolean generatePid) {
    this.generatePid = generatePid;
  }


  public MultiFieldReq email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public MultiFieldReq phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public MultiFieldReq profile(SocialProfileReq profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @javax.annotation.Nullable
  public SocialProfileReq getProfile() {
    return profile;
  }

  public void setProfile(SocialProfileReq profile) {
    this.profile = profile;
  }


  public MultiFieldReq maid(String maid) {
    this.maid = maid;
    return this;
  }

   /**
   * Get maid
   * @return maid
  **/
  @javax.annotation.Nullable
  public String getMaid() {
    return maid;
  }

  public void setMaid(String maid) {
    this.maid = maid;
  }


  public MultiFieldReq infer(Boolean infer) {
    this.infer = infer;
    return this;
  }

   /**
   * Get infer
   * @return infer
  **/
  @javax.annotation.Nullable
  public Boolean getInfer() {
    return infer;
  }

  public void setInfer(Boolean infer) {
    this.infer = infer;
  }


  public MultiFieldReq confidence(String confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @javax.annotation.Nullable
  public String getConfidence() {
    return confidence;
  }

  public void setConfidence(String confidence) {
    this.confidence = confidence;
  }


  public MultiFieldReq birthday(String birthday) {
    this.birthday = birthday;
    return this;
  }

   /**
   * Get birthday
   * @return birthday
  **/
  @javax.annotation.Nullable
  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }


  public MultiFieldReq ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiFieldReq multiFieldReq = (MultiFieldReq) o;
    return Objects.equals(this.twitter, multiFieldReq.twitter) &&
        Objects.equals(this.linkedin, multiFieldReq.linkedin) &&
        Objects.equals(this.recordId, multiFieldReq.recordId) &&
        Objects.equals(this.personId, multiFieldReq.personId) &&
        Objects.equals(this.partnerId, multiFieldReq.partnerId) &&
        Objects.equals(this.location, multiFieldReq.location) &&
        Objects.equals(this.avatar, multiFieldReq.avatar) &&
        Objects.equals(this.website, multiFieldReq.website) &&
        Objects.equals(this.title, multiFieldReq.title) &&
        Objects.equals(this.organization, multiFieldReq.organization) &&
        Objects.equals(this.emails, multiFieldReq.emails) &&
        Objects.equals(this.phones, multiFieldReq.phones) &&
        Objects.equals(this.profiles, multiFieldReq.profiles) &&
        Objects.equals(this.maids, multiFieldReq.maids) &&
        Objects.equals(this.name, multiFieldReq.name) &&
        Objects.equals(this.partnerKeys, multiFieldReq.partnerKeys) &&
        Objects.equals(this.liNonid, multiFieldReq.liNonid) &&
        Objects.equals(this.panoramaId, multiFieldReq.panoramaId) &&
        Objects.equals(this.placekey, multiFieldReq.placekey) &&
        Objects.equals(this.generatePid, multiFieldReq.generatePid) &&
        Objects.equals(this.email, multiFieldReq.email) &&
        Objects.equals(this.phone, multiFieldReq.phone) &&
        Objects.equals(this.profile, multiFieldReq.profile) &&
        Objects.equals(this.maid, multiFieldReq.maid) &&
        Objects.equals(this.infer, multiFieldReq.infer) &&
        Objects.equals(this.confidence, multiFieldReq.confidence) &&
        Objects.equals(this.birthday, multiFieldReq.birthday) &&
        Objects.equals(this.ipAddress, multiFieldReq.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(twitter, linkedin, recordId, personId, partnerId, location, avatar, website, title, organization, emails, phones, profiles, maids, name, partnerKeys, liNonid, panoramaId, placekey, generatePid, email, phone, profile, maid, infer, confidence, birthday, ipAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiFieldReq {\n");
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    linkedin: ").append(toIndentedString(linkedin)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    maids: ").append(toIndentedString(maids)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    partnerKeys: ").append(toIndentedString(partnerKeys)).append("\n");
    sb.append("    liNonid: ").append(toIndentedString(liNonid)).append("\n");
    sb.append("    panoramaId: ").append(toIndentedString(panoramaId)).append("\n");
    sb.append("    placekey: ").append(toIndentedString(placekey)).append("\n");
    sb.append("    generatePid: ").append(toIndentedString(generatePid)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    maid: ").append(toIndentedString(maid)).append("\n");
    sb.append("    infer: ").append(toIndentedString(infer)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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
    openapiFields.add("twitter");
    openapiFields.add("linkedin");
    openapiFields.add("recordId");
    openapiFields.add("personId");
    openapiFields.add("partnerId");
    openapiFields.add("location");
    openapiFields.add("avatar");
    openapiFields.add("website");
    openapiFields.add("title");
    openapiFields.add("organization");
    openapiFields.add("emails");
    openapiFields.add("phones");
    openapiFields.add("profiles");
    openapiFields.add("maids");
    openapiFields.add("name");
    openapiFields.add("partnerKeys");
    openapiFields.add("li_nonid");
    openapiFields.add("panoramaId");
    openapiFields.add("placekey");
    openapiFields.add("generatePid");
    openapiFields.add("email");
    openapiFields.add("phone");
    openapiFields.add("profile");
    openapiFields.add("maid");
    openapiFields.add("infer");
    openapiFields.add("confidence");
    openapiFields.add("birthday");
    openapiFields.add("ipAddress");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MultiFieldReq
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MultiFieldReq.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MultiFieldReq is not found in the empty JSON string", MultiFieldReq.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MultiFieldReq.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MultiFieldReq` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("twitter") != null && !jsonObj.get("twitter").isJsonNull()) && !jsonObj.get("twitter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twitter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twitter").toString()));
      }
      if ((jsonObj.get("linkedin") != null && !jsonObj.get("linkedin").isJsonNull()) && !jsonObj.get("linkedin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linkedin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linkedin").toString()));
      }
      if ((jsonObj.get("recordId") != null && !jsonObj.get("recordId").isJsonNull()) && !jsonObj.get("recordId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recordId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recordId").toString()));
      }
      if ((jsonObj.get("personId") != null && !jsonObj.get("personId").isJsonNull()) && !jsonObj.get("personId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `personId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("personId").toString()));
      }
      if ((jsonObj.get("partnerId") != null && !jsonObj.get("partnerId").isJsonNull()) && !jsonObj.get("partnerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerId").toString()));
      }
      // validate the optional field `location`
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) {
        LocationReq.validateJsonElement(jsonObj.get("location"));
      }
      if ((jsonObj.get("avatar") != null && !jsonObj.get("avatar").isJsonNull()) && !jsonObj.get("avatar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar").toString()));
      }
      if ((jsonObj.get("website") != null && !jsonObj.get("website").isJsonNull()) && !jsonObj.get("website").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `website` to be a primitive type in the JSON string but got `%s`", jsonObj.get("website").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("organization") != null && !jsonObj.get("organization").isJsonNull()) && !jsonObj.get("organization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organization").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("emails") != null && !jsonObj.get("emails").isJsonNull() && !jsonObj.get("emails").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `emails` to be an array in the JSON string but got `%s`", jsonObj.get("emails").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("phones") != null && !jsonObj.get("phones").isJsonNull() && !jsonObj.get("phones").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `phones` to be an array in the JSON string but got `%s`", jsonObj.get("phones").toString()));
      }
      if (jsonObj.get("profiles") != null && !jsonObj.get("profiles").isJsonNull()) {
        JsonArray jsonArrayprofiles = jsonObj.getAsJsonArray("profiles");
        if (jsonArrayprofiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("profiles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `profiles` to be an array in the JSON string but got `%s`", jsonObj.get("profiles").toString()));
          }

          // validate the optional field `profiles` (array)
          for (int i = 0; i < jsonArrayprofiles.size(); i++) {
            SocialProfileReq.validateJsonElement(jsonArrayprofiles.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("maids") != null && !jsonObj.get("maids").isJsonNull() && !jsonObj.get("maids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `maids` to be an array in the JSON string but got `%s`", jsonObj.get("maids").toString()));
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        PersonNameReq.validateJsonElement(jsonObj.get("name"));
      }
      if ((jsonObj.get("li_nonid") != null && !jsonObj.get("li_nonid").isJsonNull()) && !jsonObj.get("li_nonid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `li_nonid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("li_nonid").toString()));
      }
      if ((jsonObj.get("panoramaId") != null && !jsonObj.get("panoramaId").isJsonNull()) && !jsonObj.get("panoramaId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `panoramaId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("panoramaId").toString()));
      }
      if ((jsonObj.get("placekey") != null && !jsonObj.get("placekey").isJsonNull()) && !jsonObj.get("placekey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `placekey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("placekey").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      // validate the optional field `profile`
      if (jsonObj.get("profile") != null && !jsonObj.get("profile").isJsonNull()) {
        SocialProfileReq.validateJsonElement(jsonObj.get("profile"));
      }
      if ((jsonObj.get("maid") != null && !jsonObj.get("maid").isJsonNull()) && !jsonObj.get("maid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maid").toString()));
      }
      if ((jsonObj.get("confidence") != null && !jsonObj.get("confidence").isJsonNull()) && !jsonObj.get("confidence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confidence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confidence").toString()));
      }
      if ((jsonObj.get("birthday") != null && !jsonObj.get("birthday").isJsonNull()) && !jsonObj.get("birthday").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `birthday` to be a primitive type in the JSON string but got `%s`", jsonObj.get("birthday").toString()));
      }
      if ((jsonObj.get("ipAddress") != null && !jsonObj.get("ipAddress").isJsonNull()) && !jsonObj.get("ipAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipAddress").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MultiFieldReq.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MultiFieldReq' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MultiFieldReq> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MultiFieldReq.class));

       return (TypeAdapter<T>) new TypeAdapter<MultiFieldReq>() {
           @Override
           public void write(JsonWriter out, MultiFieldReq value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MultiFieldReq read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MultiFieldReq given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MultiFieldReq
  * @throws IOException if the JSON string is invalid with respect to MultiFieldReq
  */
  public static MultiFieldReq fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MultiFieldReq.class);
  }

 /**
  * Convert an instance of MultiFieldReq to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
