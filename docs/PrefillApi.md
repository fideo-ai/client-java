# PrefillApi

All URIs are relative to *https://api.fideo.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**prefill**](PrefillApi.md#prefill) | **POST** /prefill | Resolve or evaluate onboarding identity fields |


<a id="prefill"></a>
# **prefill**
> PrefillResponse prefill(multiFieldReqWithOptions)

Resolve or evaluate onboarding identity fields

The customer is responsible for proving phone possession before the initial request. Omit sessionId to resolve identity fields from a phone. Send the returned sessionId with reviewed or edited identity fields to receive a Verify evaluation. Recent session IDs are reused; valid session IDs older than 10 minutes start a new session.

### Example
```java
// Import classes:
import ai.fideo.client.ApiClient;
import ai.fideo.client.ApiException;
import ai.fideo.client.Configuration;
import ai.fideo.client.auth.*;
import ai.fideo.client.models.*;
import ai.fideo.api.PrefillApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fideo.ai");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PrefillApi apiInstance = new PrefillApi(defaultClient);
    MultiFieldReqWithOptions multiFieldReqWithOptions = new MultiFieldReqWithOptions(); // MultiFieldReqWithOptions | 
    try {
      PrefillResponse result = apiInstance.prefill(multiFieldReqWithOptions);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrefillApi#prefill");
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
| **multiFieldReqWithOptions** | [**MultiFieldReqWithOptions**](MultiFieldReqWithOptions.md)|  | |

### Return type

[**PrefillResponse**](PrefillResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Prefill match, no-match, or reviewed identity evaluation |  * X-Fideo-Limit -  <br>  * X-Fideo-Usage -  <br>  |
| **400** | Invalid request or malformed Prefill session ID |  -  |
| **403** | Prefill product unavailable |  -  |
| **410** | Claimed or deleted data |  -  |
| **429** | Prefill trial request limit reached |  * X-Fideo-Limit -  <br>  * X-Fideo-Usage -  <br>  |

