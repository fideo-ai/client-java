

# SignalPatternsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | Email address to get signal patterns for |  |
|**interval** | [**IntervalEnum**](#IntervalEnum) | Time interval for timeseries data (used only for timeseries endpoint) |  [optional] |
|**count** | **Integer** | Number of data points to return (used only for timeseries endpoint) |  [optional] |



## Enum: IntervalEnum

| Name | Value |
|---- | -----|
| MINUTE | &quot;minute&quot; |
| HOUR | &quot;hour&quot; |
| DAY | &quot;day&quot; |
| MONTH | &quot;month&quot; |



