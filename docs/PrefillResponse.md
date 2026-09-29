

# PrefillResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sessionId** | **UUID** | UUIDv7 session identifier to send with reviewed identity data. |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**individual** | [**MultiFieldReqWithOptions**](MultiFieldReqWithOptions.md) | Resolved identity in the same multifield shape accepted by the follow-up Prefill request. The caller may review or edit these values and resubmit them with the returned sessionId. |  [optional] |
|**evaluation** | [**PrefillEvaluation**](PrefillEvaluation.md) | Risk score and Verify checks for resolved fields on an initial match, the original phone fields on an initial no-match, or the fields sent with a sessionId on a reviewed request. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| MATCH | &quot;match&quot; |
| NO_MATCH | &quot;no_match&quot; |



