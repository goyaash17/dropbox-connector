
package org.mule.modules.dropbox.oauth;

import java.io.Serializable;
import javax.annotation.Generated;
import org.mule.api.store.ObjectStore;
import org.mule.common.security.oauth.OAuthState;
import org.mule.modules.dropbox.adapters.DropboxConnectorOAuth2Adapter;
import org.mule.modules.dropbox.config.ConnectorConfig;
import org.mule.security.oauth.BaseOAuthClientFactory;
import org.mule.security.oauth.OAuth2Adapter;
import org.mule.security.oauth.OAuth2Manager;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-16T03:41:38-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class DropboxConnectorOAuthClientFactory
    extends BaseOAuthClientFactory
{

    private DropboxConnectorOAuthManager oauthManager;

    public DropboxConnectorOAuthClientFactory(OAuth2Manager<OAuth2Adapter> oauthManager, ObjectStore<Serializable> objectStore) {
        super(oauthManager, objectStore);
        this.oauthManager = (DropboxConnectorOAuthManager) oauthManager;
    }

    @Override
    protected Class<? extends OAuth2Adapter> getAdapterClass() {
        return (org.mule.modules.dropbox.adapters.DropboxConnectorRestClientAdapter.class);
    }

    @Override
    protected void setCustomAdapterProperties(OAuth2Adapter adapter, OAuthState state) {
        DropboxConnectorOAuth2Adapter connector = ((DropboxConnectorOAuth2Adapter) adapter);
        ((ConnectorConfig) connector.getConfig()).setGreeting(oauthManager.getGreeting());
        ((ConnectorConfig) connector.getConfig()).setReply(oauthManager.getReply());
    }

    @Override
    protected void setCustomStateProperties(OAuth2Adapter adapter, OAuthState state) {
        DropboxConnectorOAuth2Adapter connector = ((DropboxConnectorOAuth2Adapter) adapter);
    }

}
