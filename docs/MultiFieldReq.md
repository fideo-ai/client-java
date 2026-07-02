

# MultiFieldReq


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**twitter** | **String** |  |  [optional] |
|**linkedin** | **String** |  |  [optional] |
|**recordId** | **String** |  |  [optional] |
|**personId** | **String** |  |  [optional] |
|**partnerId** | **String** |  |  [optional] |
|**location** | [**LocationReq**](LocationReq.md) |  |  [optional] |
|**avatar** | **String** |  |  [optional] |
|**website** | **String** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**organization** | **String** |  |  [optional] |
|**emails** | **List&lt;String&gt;** |  |  [optional] |
|**phones** | **List&lt;String&gt;** |  |  [optional] |
|**ssn** | **String** | Singular shortcut for one SSN value. Internally equivalent to ssns with one item. |  [optional] |
|**ssns** | **List&lt;String&gt;** | Full SSN values as digits/dashes or SHA-256 hex digests. Verify accepts at most one. |  [optional] |
|**profiles** | [**List&lt;SocialProfileReq&gt;**](SocialProfileReq.md) |  |  [optional] |
|**maids** | **List&lt;String&gt;** |  |  [optional] |
|**name** | [**PersonNameReq**](PersonNameReq.md) |  |  [optional] |
|**partnerKeys** | **Map&lt;String, String&gt;** |  |  [optional] |
|**liNonid** | **String** |  |  [optional] |
|**panoramaId** | **String** |  |  [optional] |
|**generatePid** | **Boolean** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**phone** | **String** |  |  [optional] |
|**profile** | [**SocialProfileReq**](SocialProfileReq.md) |  |  [optional] |
|**maid** | **String** |  |  [optional] |



