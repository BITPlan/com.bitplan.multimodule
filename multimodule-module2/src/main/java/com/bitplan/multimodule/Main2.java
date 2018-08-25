/**
 * Copyright (c) 2018 BITPlan GmbH
 *
 * http://www.bitplan.com
 *
 * This file is part of the Opensource project at:
 * https://github.com/BITPlan/com.bitplan.multimodule
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
package com.bitplan.multimodule;

/**
 * just a dummy main routine
 * @author wf
 *
 */
public class Main2 extends Main1 {
  public static boolean called=false;
  /**
   * 
   */
  public void callit(String args[]) {
    super.callit(args);
    called=true;
  }
 
  /**
   * callable from command line
   * @param args
   */
  public static void main(String args[]) {
    Main main2=new Main2();
    main2.callit(args);
  }
}
