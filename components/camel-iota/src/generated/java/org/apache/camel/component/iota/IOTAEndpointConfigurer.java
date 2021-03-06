/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.iota;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class IOTAEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        IOTAEndpoint target = (IOTAEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "depth": target.setDepth(property(camelContext, java.lang.Integer.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "minweightmagnitude":
        case "minWeightMagnitude": target.setMinWeightMagnitude(property(camelContext, java.lang.Integer.class, value)); return true;
        case "operation": target.setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "securitylevel":
        case "securityLevel": target.setSecurityLevel(property(camelContext, java.lang.Integer.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tag": target.setTag(property(camelContext, java.lang.String.class, value)); return true;
        case "url": target.setUrl(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("depth", java.lang.Integer.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("minWeightMagnitude", java.lang.Integer.class);
        answer.put("operation", java.lang.String.class);
        answer.put("securityLevel", java.lang.Integer.class);
        answer.put("synchronous", boolean.class);
        answer.put("tag", java.lang.String.class);
        answer.put("url", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        IOTAEndpoint target = (IOTAEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "depth": return target.getDepth();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "minweightmagnitude":
        case "minWeightMagnitude": return target.getMinWeightMagnitude();
        case "operation": return target.getOperation();
        case "securitylevel":
        case "securityLevel": return target.getSecurityLevel();
        case "synchronous": return target.isSynchronous();
        case "tag": return target.getTag();
        case "url": return target.getUrl();
        default: return null;
        }
    }
}

