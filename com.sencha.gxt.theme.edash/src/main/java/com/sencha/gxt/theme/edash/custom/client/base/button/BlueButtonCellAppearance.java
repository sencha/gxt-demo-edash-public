/**
 * Sencha GXT 1.0.0-SNAPSHOT - Sencha for GWT
 * Copyright (c) 2006-2018, Sencha Inc.
 *
 * licensing@sencha.com
 * http://www.sencha.com/products/gxt/license/
 *
 * ================================================================================
 * Commercial License
 * ================================================================================
 * This version of Sencha GXT is licensed commercially and is the appropriate
 * option for the vast majority of use cases.
 *
 * Please see the Sencha GXT Licensing page at:
 * http://www.sencha.com/products/gxt/license/
 *
 * For clarification or additional options, please contact:
 * licensing@sencha.com
 * ================================================================================
 *
 *
 *
 *
 *
 *
 *
 *
 * ================================================================================
 * Disclaimer
 * ================================================================================
 * THIS SOFTWARE IS DISTRIBUTED "AS-IS" WITHOUT ANY WARRANTIES, CONDITIONS AND
 * REPRESENTATIONS WHETHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE
 * IMPLIED WARRANTIES AND CONDITIONS OF MERCHANTABILITY, MERCHANTABLE QUALITY,
 * FITNESS FOR A PARTICULAR PURPOSE, DURABILITY, NON-INFRINGEMENT, PERFORMANCE AND
 * THOSE ARISING BY STATUTE OR FROM CUSTOM OR USAGE OF TRADE OR COURSE OF DEALING.
 * ================================================================================
 */
package com.sencha.gxt.theme.edash.custom.client.base.button;

import com.google.gwt.core.client.GWT;
import com.sencha.gxt.theme.edash.client.base.button.Css3ButtonCellAppearance;

public class BlueButtonCellAppearance<M> extends Css3ButtonCellAppearance<M> {

  interface Style extends Css3ButtonStyle {
  }

  interface Resources extends Css3ButtonResources {
    @Override
    @Source({"com/sencha/gxt/theme/edash/client/base/button/Css3ButtonCell.gss",
        "com/sencha/gxt/theme/edash/client/base/button/Css3ButtonCellToolBar.gss",
        "BlueButton.gss"})
    Style style();
  }

  public BlueButtonCellAppearance() {
    super(GWT.<Resources>create(Resources.class));
  }
}
