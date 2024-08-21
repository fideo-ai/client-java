# SignalsApi

All URIs are relative to *https://api.fullcontact.com/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**verifySignalsPost**](SignalsApi.md#verifySignalsPost) | **POST** /verify.signals |  |


<a id="verifySignalsPost"></a>
# **verifySignalsPost**
> VerifySignalsPost200Response verifySignalsPost(v, multiFieldReqWithOptions)



### Example
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
    defaultClient.setBasePath("https://api.fullcontact.com/v3");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SignalsApi apiInstance = new SignalsApi(defaultClient);
    String v = "v_example"; // String | 
    MultiFieldReqWithOptions multiFieldReqWithOptions = new MultiFieldReqWithOptions(); // MultiFieldReqWithOptions | 
    try {
      VerifySignalsPost200Response result = apiInstance.verifySignalsPost(v, multiFieldReqWithOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SignalsApi#verifySignalsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **v** | **String**|  | [optional] |
| **multiFieldReqWithOptions** | [**MultiFieldReqWithOptions**](MultiFieldReqWithOptions.md)|  | [optional] |

### Return type

[**VerifySignalsPost200Response**](VerifySignalsPost200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

