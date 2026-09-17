# LensApi

All URIs are relative to *https://api.fideo.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**lensGraph**](LensApi.md#lensGraph) | **POST** /lens.graph | Query the Lens graph |


<a id="lensGraph"></a>
# **lensGraph**
> LensGraphResponse lensGraph(lensGraphRequest)

Query the Lens graph

Query raw or expanded Lens graph edges. Product and datapack entitlements are derived from the account contract, not from the request body.

### Example
```java
// Import classes:
import ai.fideo.client.ApiClient;
import ai.fideo.client.ApiException;
import ai.fideo.client.Configuration;
import ai.fideo.client.auth.*;
import ai.fideo.client.models.*;
import ai.fideo.api.LensApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fideo.ai");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LensApi apiInstance = new LensApi(defaultClient);
    LensGraphRequest lensGraphRequest = new LensGraphRequest(); // LensGraphRequest | 
    try {
      LensGraphResponse result = apiInstance.lensGraph(lensGraphRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LensApi#lensGraph");
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
| **lensGraphRequest** | [**LensGraphRequest**](LensGraphRequest.md)|  | [optional] |

### Return type

[**LensGraphResponse**](LensGraphResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  * X-Fideo-Limit -  <br>  * X-Fideo-Usage -  <br>  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |
| **429** | Lens usage limit reached |  * X-Fideo-Limit -  <br>  * X-Fideo-Usage -  <br>  |

