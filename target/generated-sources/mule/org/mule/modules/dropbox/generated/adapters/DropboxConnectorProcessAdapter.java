
package org.mule.modules.dropbox.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.dropbox.DropboxConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>DropboxConnectorProcessAdapter</code> is a wrapper around {@link DropboxConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-09-16T03:41:38-07:00", comments = "Build UNNAMED.2793.f49b6c7")
public abstract class DropboxConnectorProcessAdapter
    extends DropboxConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<DropboxConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, DropboxConnectorCapabilitiesAdapter> getProcessTemplate() {
        final DropboxConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,DropboxConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, DropboxConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, DropboxConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
