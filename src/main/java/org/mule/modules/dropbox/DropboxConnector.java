package org.mule.modules.dropbox;

import org.mule.api.annotations.oauth.OAuthPostAuthorization;  
import org.mule.api.annotations.oauth.OAuthProtected;
import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import java.io.IOException;
import org.mule.api.annotations.ReconnectOn;
import org.mule.api.annotations.rest.HttpMethod;
import org.mule.api.annotations.rest.RestCall;
import org.mule.api.annotations.rest.RestUriParam;

import org.mule.modules.dropbox.config.ConnectorConfig;

@Connector(name="dropbox", schemaVersion="1.0", friendlyName="Dropbox", minMuleVersion="3.8")
public abstract class DropboxConnector {

    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     *
     * @param friend Name of a friend we want to greet
     * @return The greeting and reply to the selected friend.
     * @throws IOException Comment for Exception
     */
    @Processor
    @OAuthProtected
    @ReconnectOn(exceptions = { Exception.class })
    @RestCall(uri="https://api.dropboxapi.com/2/file_requests/get", method=HttpMethod.GET)
    public abstract void greet(@RestUriParam("friend") String friend) throws IOException;  

    @OAuthPostAuthorization
    public void postAuthorize() {
        //This method is called after authorization finishes. Remove if not required 
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}