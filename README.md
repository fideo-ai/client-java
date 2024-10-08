# client-java

Fideo API
- API version: 1.0.4
  - Generator version: 7.8.0

Fideo Intelligence offers an identity intelligence product that protects the public good.
- [Fideo Privacy Policy](https://www.fideo.ai/privacy-policy/)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>ai.fideo</groupId>
  <artifactId>client-java</artifactId>
  <version>1.0.4</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'client-java' jar has been published to maven central.
    mavenLocal()       // Needed if the 'client-java' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "ai.fideo:client-java:1.0.4"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/client-java-1.0.4.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import ai.fideo.client.ApiClient;
import ai.fideo.client.ApiException;
import ai.fideo.client.Configuration;
import ai.fideo.client.auth.*;
import ai.fideo.client.models.*;
import ai.fideo.api.SignalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fideo.ai");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SignalsApi apiInstance = new SignalsApi(defaultClient);
    String v = "v_example"; // String | 
    MultiFieldReqWithOptions multiFieldReqWithOptions = new MultiFieldReqWithOptions(); // MultiFieldReqWithOptions | 
    try {
      SignalsPost200Response result = apiInstance.signalsPost(v, multiFieldReqWithOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignalsApi#signalsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.fideo.ai*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SignalsApi* | [**signalsPost**](docs/SignalsApi.md#signalsPost) | **POST** /signals | 
*VerifyApi* | [**verifyPost**](docs/VerifyApi.md#verifyPost) | **POST** /verify | 


## Documentation for Models

 - [Alias](docs/Alias.md)
 - [Demographics](docs/Demographics.md)
 - [Economic](docs/Economic.md)
 - [Education](docs/Education.md)
 - [EducationDate](docs/EducationDate.md)
 - [Email](docs/Email.md)
 - [Employment](docs/Employment.md)
 - [EmploymentDate](docs/EmploymentDate.md)
 - [Evidence](docs/Evidence.md)
 - [IPCountry](docs/IPCountry.md)
 - [IpAddress](docs/IpAddress.md)
 - [Location](docs/Location.md)
 - [LocationReq](docs/LocationReq.md)
 - [LocationType](docs/LocationType.md)
 - [MultiFieldReq](docs/MultiFieldReq.md)
 - [MultiFieldReqWithOptions](docs/MultiFieldReqWithOptions.md)
 - [Name](docs/Name.md)
 - [NameWithAlias](docs/NameWithAlias.md)
 - [PersonNameReq](docs/PersonNameReq.md)
 - [Phone](docs/Phone.md)
 - [Photo](docs/Photo.md)
 - [ScoreDetails](docs/ScoreDetails.md)
 - [SignalsPost200Response](docs/SignalsPost200Response.md)
 - [SignalsResponseV0](docs/SignalsResponseV0.md)
 - [SignalsResponseV20240424](docs/SignalsResponseV20240424.md)
 - [SocialProfileDetails](docs/SocialProfileDetails.md)
 - [SocialProfileReq](docs/SocialProfileReq.md)
 - [SocialProfileUrls](docs/SocialProfileUrls.md)
 - [VerifyResponse](docs/VerifyResponse.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="bearerAuth"></a>
### bearerAuth

- **Type**: HTTP Bearer Token authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@fideo.ai

