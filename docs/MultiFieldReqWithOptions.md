

# MultiFieldReqWithOptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**infer** | **Boolean** |  |  [optional] |
|**confidence** | **String** |  |  [optional] |
|**birthday** | **String** |  |  [optional] |
|**ipAddress** | **String** |  |  [optional] |
|**sessionId** | **UUID** | Optional UUIDv7 session identifier. A recent valid value reuses an existing verify session and returns 200; omitted, blank, or old values create a new session and return 201. |  [optional] |
|**patternInterval** | [**PatternIntervalEnum**](#PatternIntervalEnum) | Optional signal-pattern interval to decorate signal email responses |  [optional] |
|**countries** | **List&lt;String&gt;** |  |  [optional] |
|**excludedCountries** | **List&lt;String&gt;** |  |  [optional] |



## Enum: PatternIntervalEnum

| Name | Value |
|---- | -----|
| HOUR | &quot;hour&quot; |
| DAY | &quot;day&quot; |
| WEEK | &quot;week&quot; |
| MONTH | &quot;month&quot; |
| _6MONTHS | &quot;6months&quot; |
| YEAR | &quot;year&quot; |



