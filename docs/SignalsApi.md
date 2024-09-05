# SignalsApi

All URIs are relative to *https://api.fideo.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**signalsPost**](SignalsApi.md#signalsPost) | **POST** /signals |  |


<a id="signalsPost"></a>
# **signalsPost**
> SignalsPost200Response signalsPost(v, multiFieldReqWithOptions)



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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **v** | **String**|  | [optional] |
| **multiFieldReqWithOptions** | [**MultiFieldReqWithOptions**](MultiFieldReqWithOptions.md)|  | [optional] |

### Return type

[**SignalsPost200Response**](SignalsPost200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

