package org.openapitools.api.factories;

import org.openapitools.api.SessionsApiService;
import org.openapitools.api.impl.SessionsApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-05-14T20:17:48.996+08:00[Asia/Taipei]")
public class SessionsApiServiceFactory {

    public static SessionsApiService getSessionsApi() {
        return SingletonIdentityFactory.sessionsApiService;
    }
}
