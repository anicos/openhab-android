/*
 * Copyright (c) 2010-2016, openHAB.org and others.
 *
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 */

package org.openhab.habdroid.model

import android.os.Parcelable

import kotlinx.android.parcel.Parcelize
import org.json.JSONException
import org.json.JSONObject

@Parcelize
data class LabeledValue internal constructor(val value: String, val label: String) : Parcelable

@Throws(JSONException::class)
fun JSONObject.toLabeledValue(keyName: String, valueName: String): LabeledValue {
    return LabeledValue(getString(keyName), getString(valueName))
}