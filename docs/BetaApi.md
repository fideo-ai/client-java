# BetaApi

All URIs are relative to *https://api.fideo.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**betaSignalsPatternsSummaryPost**](BetaApi.md#betaSignalsPatternsSummaryPost) | **POST** /beta/signals/patterns/summary | Get signal patterns summary |
| [**betaSignalsPatternsTimeseriesPost**](BetaApi.md#betaSignalsPatternsTimeseriesPost) | **POST** /beta/signals/patterns/timeseries | Get signal patterns timeseries |


<a id="betaSignalsPatternsSummaryPost"></a>
# **betaSignalsPatternsSummaryPost**
> SignalPatternRecencyResponse betaSignalsPatternsSummaryPost(signalPatternsRequest)

Get signal patterns summary

Returns summaries of ALL intervals (hour through year) for an email in the request

### Example
```java
// Import classes:
import ai.fideo.client.ApiClient;
import ai.fideo.client.ApiException;
import ai.fideo.client.Configuration;
import ai.fideo.client.auth.*;
import ai.fideo.client.models.*;
import ai.fideo.api.BetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fideo.ai");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BetaApi apiInstance = new BetaApi(defaultClient);
    SignalPatternsRequest signalPatternsRequest = new SignalPatternsRequest(); // SignalPatternsRequest | 
    try {
      SignalPatternRecencyResponse result = apiInstance.betaSignalsPatternsSummaryPost(signalPatternsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BetaApi#betaSignalsPatternsSummaryPost");
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
| **signalPatternsRequest** | [**SignalPatternsRequest**](SignalPatternsRequest.md)|  | [optional] |

### Return type

[**SignalPatternRecencyResponse**](SignalPatternRecencyResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |

<a id="betaSignalsPatternsTimeseriesPost"></a>
# **betaSignalsPatternsTimeseriesPost**
> Map&lt;String, SignalPatternResponseUnit&gt; betaSignalsPatternsTimeseriesPost(signalPatternsRequest)

Get signal patterns timeseries

Returns timeseries details for signal patterns

### Example
```java
// Import classes:
import ai.fideo.client.ApiClient;
import ai.fideo.client.ApiException;
import ai.fideo.client.Configuration;
import ai.fideo.client.auth.*;
import ai.fideo.client.models.*;
import ai.fideo.api.BetaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fideo.ai");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BetaApi apiInstance = new BetaApi(defaultClient);
    SignalPatternsRequest signalPatternsRequest = new SignalPatternsRequest(); // SignalPatternsRequest | 
    try {
      Map<String, SignalPatternResponseUnit> result = apiInstance.betaSignalsPatternsTimeseriesPost(signalPatternsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BetaApi#betaSignalsPatternsTimeseriesPost");
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
| **signalPatternsRequest** | [**SignalPatternsRequest**](SignalPatternsRequest.md)|  | [optional] |

### Return type

[**Map&lt;String, SignalPatternResponseUnit&gt;**](SignalPatternResponseUnit.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad request |  -  |
| **403** | Forbidden |  -  |

