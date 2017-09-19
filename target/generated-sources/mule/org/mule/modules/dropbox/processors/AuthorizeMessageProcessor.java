
package org.mule.modules.dropbox.processors;

import java.util.regex.Pattern;
import javax.annotation.Generated;
import org.mule.modules.dropbox.oauth.DropboxConnectorOAuthManager;
import org.mule.security.oauth.processor.BaseOAuth2AuthorizeMessageProcessor;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-16T03:41:38-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public class AuthorizeMessageProcessor
    extends BaseOAuth2AuthorizeMessageProcessor<DropboxConnectorOAuthManager>
{

    private final static Pattern AUTH_CODE_PATTERN = Pattern.compile("code=([^&]+)");

    @Override
    protected String getAuthCodeRegex() {
        return AUTH_CODE_PATTERN.pattern();
    }

    @Override
    protected Class<DropboxConnectorOAuthManager> getOAuthManagerClass() {
        return DropboxConnectorOAuthManager.class;
    }

}
