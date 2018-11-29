package com.jd.jsr107Cache;

import javax.cache.CacheManager;
import javax.cache.configuration.OptionalFeature;
import javax.cache.spi.CachingProvider;
import java.net.URI;
import java.util.Properties;

public class testCacheProvider implements CachingProvider {
    @Override
    public CacheManager getCacheManager(URI uri, ClassLoader classLoader, Properties properties) {
        return null;
    }

    @Override
    public ClassLoader getDefaultClassLoader() {
        return null;
    }

    @Override
    public URI getDefaultURI() {
        return null;
    }

    @Override
    public Properties getDefaultProperties() {
        return null;
    }

    @Override
    public CacheManager getCacheManager(URI uri, ClassLoader classLoader) {
        return null;
    }

    @Override
    public CacheManager getCacheManager() {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void close(ClassLoader classLoader) {

    }

    @Override
    public void close(URI uri, ClassLoader classLoader) {

    }

    @Override
    public boolean isSupported(OptionalFeature optionalFeature) {
        return false;
    }
}
