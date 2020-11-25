/*
 * BRP Update API
 * Met deze API kun je opvragen welke door jou gevolgde personen zijn gewijzigd in de BRP. Je kunt je abonneren op een persoon die je wilt volgen, en je kunt opvragen welke personen door jou worden gevolgd. Je kunt deze API gebruiken in combinatie met de BRP bevragen API, bijvoorbeeld om lokale kopiegegevens actueel te houden.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.BadRequestFoutbericht;
import org.openapitools.client.model.Foutbericht;
import org.openapitools.client.model.GewijzigdepersonenHalCollectie;
import java.time.LocalDate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RaadplegenGewijzigdePersonenApi {
    private ApiClient localVarApiClient;

    public RaadplegenGewijzigdePersonenApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RaadplegenGewijzigdePersonenApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getGewijzigdePersonen
     * @param vanaf Alleen personen waarbij gegevens zijn gewijzigd op of na deze datum worden geleverd. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 0 </td><td> Er is een onverwachte fout opgetreden </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getGewijzigdePersonenCall(LocalDate vanaf, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/wijzigingen";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (vanaf != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("vanaf", vanaf));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/hal+json", "application/problem+json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getGewijzigdePersonenValidateBeforeCall(LocalDate vanaf, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getGewijzigdePersonenCall(vanaf, _callback);
        return localVarCall;

    }

    /**
     * Raadplegen personen met gewijzigde gegevens
     * Opvragen lijst met burgerservicenummers van personen waarop in de gegevens een wijziging is aangebracht. 
     * @param vanaf Alleen personen waarbij gegevens zijn gewijzigd op of na deze datum worden geleverd. (optional)
     * @return GewijzigdepersonenHalCollectie
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 0 </td><td> Er is een onverwachte fout opgetreden </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public GewijzigdepersonenHalCollectie getGewijzigdePersonen(LocalDate vanaf) throws ApiException {
        ApiResponse<GewijzigdepersonenHalCollectie> localVarResp = getGewijzigdePersonenWithHttpInfo(vanaf);
        return localVarResp.getData();
    }

    /**
     * Raadplegen personen met gewijzigde gegevens
     * Opvragen lijst met burgerservicenummers van personen waarop in de gegevens een wijziging is aangebracht. 
     * @param vanaf Alleen personen waarbij gegevens zijn gewijzigd op of na deze datum worden geleverd. (optional)
     * @return ApiResponse&lt;GewijzigdepersonenHalCollectie&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 0 </td><td> Er is een onverwachte fout opgetreden </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<GewijzigdepersonenHalCollectie> getGewijzigdePersonenWithHttpInfo(LocalDate vanaf) throws ApiException {
        okhttp3.Call localVarCall = getGewijzigdePersonenValidateBeforeCall(vanaf, null);
        Type localVarReturnType = new TypeToken<GewijzigdepersonenHalCollectie>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Raadplegen personen met gewijzigde gegevens (asynchronously)
     * Opvragen lijst met burgerservicenummers van personen waarop in de gegevens een wijziging is aangebracht. 
     * @param vanaf Alleen personen waarbij gegevens zijn gewijzigd op of na deze datum worden geleverd. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * api-version -  <br>  * warning -  <br>  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  * api-version -  <br>  </td></tr>
        <tr><td> 0 </td><td> Er is een onverwachte fout opgetreden </td><td>  * api-version -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getGewijzigdePersonenAsync(LocalDate vanaf, final ApiCallback<GewijzigdepersonenHalCollectie> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGewijzigdePersonenValidateBeforeCall(vanaf, _callback);
        Type localVarReturnType = new TypeToken<GewijzigdepersonenHalCollectie>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
