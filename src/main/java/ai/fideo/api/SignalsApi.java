/*
 * Fideo API
 * Fideo Intelligence offers an identity intelligence product that protects the public good. - [Fideo Privacy Policy](https://www.fideo.ai/privacy-policy/)
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: support@fideo.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ai.fideo.api;

import ai.fideo.client.ApiCallback;
import ai.fideo.client.ApiClient;
import ai.fideo.client.ApiException;
import ai.fideo.client.ApiResponse;
import ai.fideo.client.Configuration;
import ai.fideo.client.Pair;
import ai.fideo.client.ProgressRequestBody;
import ai.fideo.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import ai.fideo.model.MultiFieldReq;
import ai.fideo.model.VerifySignalsPost200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SignalsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SignalsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SignalsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for verifySignalsPost
     * @param v  (optional)
     * @param multiFieldReq  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call verifySignalsPostCall(String v, MultiFieldReq multiFieldReq, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = multiFieldReq;

        // create path and map variables
        String localVarPath = "/verify.signals";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (v != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("v", v));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call verifySignalsPostValidateBeforeCall(String v, MultiFieldReq multiFieldReq, final ApiCallback _callback) throws ApiException {
        return verifySignalsPostCall(v, multiFieldReq, _callback);

    }

    /**
     * 
     * 
     * @param v  (optional)
     * @param multiFieldReq  (optional)
     * @return VerifySignalsPost200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public VerifySignalsPost200Response verifySignalsPost(String v, MultiFieldReq multiFieldReq) throws ApiException {
        ApiResponse<VerifySignalsPost200Response> localVarResp = verifySignalsPostWithHttpInfo(v, multiFieldReq);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param v  (optional)
     * @param multiFieldReq  (optional)
     * @return ApiResponse&lt;VerifySignalsPost200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VerifySignalsPost200Response> verifySignalsPostWithHttpInfo(String v, MultiFieldReq multiFieldReq) throws ApiException {
        okhttp3.Call localVarCall = verifySignalsPostValidateBeforeCall(v, multiFieldReq, null);
        Type localVarReturnType = new TypeToken<VerifySignalsPost200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param v  (optional)
     * @param multiFieldReq  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call verifySignalsPostAsync(String v, MultiFieldReq multiFieldReq, final ApiCallback<VerifySignalsPost200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = verifySignalsPostValidateBeforeCall(v, multiFieldReq, _callback);
        Type localVarReturnType = new TypeToken<VerifySignalsPost200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
