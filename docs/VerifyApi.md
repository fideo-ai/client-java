# VerifyApi

All URIs are relative to *https://api.fullcontact.com/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**verifyMatchPost**](VerifyApi.md#verifyMatchPost) | **POST** /verify.match |  |


<a id="verifyMatchPost"></a>
# **verifyMatchPost**
> MatchResponse verifyMatchPost(multiFieldReq)



### Example
```java
// Import classes:
import ai.fideo.client.ApiClient;
import ai.fideo.client.ApiException;
import ai.fideo.client.Configuration;
import ai.fideo.client.auth.*;
import ai.fideo.client.models.*;
import ai.fideo.api.VerifyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fullcontact.com/v3");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    VerifyApi apiInstance = new VerifyApi(defaultClient);
    MultiFieldReq multiFieldReq = new MultiFieldReq(); // MultiFieldReq | 
    try {
      MatchResponse result = apiInstance.verifyMatchPost(multiFieldReq);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifyApi#verifyMatchPost");
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
| **multiFieldReq** | [**MultiFieldReq**](MultiFieldReq.md)|  | [optional] |

### Return type

[**MatchResponse**](MatchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

