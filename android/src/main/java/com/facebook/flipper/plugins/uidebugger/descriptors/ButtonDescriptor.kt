/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.flipper.plugins.uidebugger.descriptors

import android.widget.Button

class ButtonDescriptor : AbstractChainedDescriptor<Button>() {
  override fun init() {}

  override fun onGetId(button: Button): String {
    return Integer.toString(System.identityHashCode(button))
  }

  override fun onGetName(button: Button): String {
    return button.javaClass.simpleName
  }

  override fun onGetData(button: Button, builder: MutableMap<String, Any?>) {}

  override fun onGetChildren(button: Button, children: MutableList<Any>) {}
}
