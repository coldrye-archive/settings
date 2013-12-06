/*
 * Copyright 2013 axn software UG
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.axnsoftware.settings.impl;

import de.axnsoftware.settings.IBackingStore;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 * TODO:document
 *
 * Note: Currently unused, serves as an integration example for
 * java.util.prefs.Preferences
 *
 * @author Carsten Klein "cklein" <carsten.klein@axn-software.de>
 * @since 1.0.0
 */
public class PreferencesBackingStoreWrapperImpl implements IBackingStore {

    private final String storagePath;
    private Preferences preferences;

    public PreferencesBackingStoreWrapperImpl(final String storagePath) {
        this.storagePath = storagePath;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteProperties() throws BackingStoreException {
        if (null == this.preferences) {
            throw new IllegalStateException("TODO:preferences have not been loaded.");
        }
        this.preferences.clear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean getBoolean(String key) {
        throw new UnsupportedOperationException("not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte getByte(String key) {
        throw new UnsupportedOperationException("not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Character getCharacter(String key) {
        throw new UnsupportedOperationException("not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double getDouble(String key) {
        throw new UnsupportedOperationException("not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float getFloat(String key) {
        throw new UnsupportedOperationException("not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer getInteger(String key) {
        throw new UnsupportedOperationException("not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long getLong(String key) {
        throw new UnsupportedOperationException("not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object getProperties() {
        if (null == this.preferences) {
            throw new IllegalStateException("TODO:preferences have not been loaded.");
        }
        return this.preferences;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short getShort(String key) {
        throw new UnsupportedOperationException("not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getString(String key) {
        throw new UnsupportedOperationException("not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<String> keySet() throws BackingStoreException {
        if (null == this.preferences) {
            throw new IllegalStateException("TODO:preferences have not been loaded.");
        }
        Set<String> result = new HashSet<>();
        result.addAll(Arrays.asList(this.preferences.keys()));
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void loadProperties() throws BackingStoreException {
        this.preferences = Preferences.userRoot().node(this.storagePath);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setBoolean(String key, Object value) {
        throw new UnsupportedOperationException("not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setByte(String key, Byte value) {
        throw new UnsupportedOperationException("not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setCharacter(String key, Character value) {
        throw new UnsupportedOperationException("not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setDouble(String key, Double value) {
        throw new UnsupportedOperationException("not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setFloat(String key, Float value) {
        throw new UnsupportedOperationException("not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setInteger(String key, Integer value) {
        throw new UnsupportedOperationException("not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setLong(String key, Long value) {
        throw new UnsupportedOperationException("not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setShort(String key, Short value) {
        throw new UnsupportedOperationException("not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setString(String key, String value) {
        throw new UnsupportedOperationException("not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void storeProperties() throws BackingStoreException {
        if (null == this.preferences) {
            throw new IllegalStateException("TODO:preferences have not been loaded.");
        }
        this.preferences.sync();
    }
}