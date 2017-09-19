
package org.mule.modules.dropbox.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MetadataAware;
import org.mule.modules.dropbox.DropboxConnector;


/**
 * A <code>DropboxConnectorMetadataAdapter</code> is a wrapper around {@link DropboxConnector } that adds support for querying metadata about the extension.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-16T03:41:38-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public abstract class DropboxConnectorMetadataAdapter
    extends DropboxConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "Dropbox";
    private final static String MODULE_VERSION = "1.0.0-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.9.0";
    private final static String DEVKIT_BUILD = "UNNAMED.2793.f49b6c7";
    private final static String MIN_MULE_VERSION = "3.5.0";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

    public String getMinMuleVersion() {
        return MIN_MULE_VERSION;
    }

}
