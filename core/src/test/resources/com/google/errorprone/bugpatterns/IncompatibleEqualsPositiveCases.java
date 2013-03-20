/*
 * Copyright 2012 Google Inc. All Rights Reserved.
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

package com.google.errorprone.bugpatterns;

/**
 * @author Bill Pugh (bill.pugh@gmail.com)
 */
public class IncompatibleEqualsPositiveCases {

    public boolean testEquality(String s, Integer i, Double d, Object a[]) {

        //BUG: Suggestion includes "false"
        if (i.equals(17L))
            return true;
       
        //BUG: Suggestion includes "false"
        if (s.equals(a))
            return true;
      
        
        //BUG: Suggestion includes "false"
        if (a.equals(s))
            return true;
        
        //BUG: Suggestion includes "false"
        if (i.equals((byte)17))
            return true;
        
        //BUG: Suggestion includes "false"
        if (s.equals(i))
            return true;
        
        //BUG: Suggestion includes "false"
        if (i.equals(d))
            return true;
        //BUG: Suggestion includes "false"
        if (d.equals(a))
            return true;


        return false;
    }

}
