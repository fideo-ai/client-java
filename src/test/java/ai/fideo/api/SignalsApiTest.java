/*
 * Fideo API
 * Fideo Intelligence offers an identity intelligence product that protects the public good. - [Fideo Privacy Policy](https://www.fideo.ai/privacy-policy/)
 *
 * The version of the OpenAPI document: 1.0.4
 * Contact: support@fideo.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ai.fideo.api;

import ai.fideo.client.ApiException;
import ai.fideo.model.MultiFieldReqWithOptions;
import ai.fideo.model.SignalsPost200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SignalsApi
 */
@Disabled
public class SignalsApiTest {

    private final SignalsApi api = new SignalsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void signalsPostTest() throws ApiException {
        String v = null;
        MultiFieldReqWithOptions multiFieldReqWithOptions = null;
        SignalsPost200Response response = api.signalsPost(v, multiFieldReqWithOptions);
        // TODO: test validations
    }

}
