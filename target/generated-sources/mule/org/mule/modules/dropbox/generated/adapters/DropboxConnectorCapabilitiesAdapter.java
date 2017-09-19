
package org.mule.modules.dropbox.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.dropbox.DropboxConnector;


/**
 * A <code>DropboxConnectorCapabilitiesAdapter</code> is a wrapper around {@link DropboxConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-16T03:41:38-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public abstract class DropboxConnectorCapabilitiesAdapter
    extends DropboxConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
