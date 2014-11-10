/*
 * Copyright  2000-2004 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.phenix.pct;

public class ProgressV114 extends ProgressV11 {

    public String getIncrementalProcedure() {
        return "pct/v11/silentIncDump114.p";
    }

    public String getDumpUsersProcedure() {
        return "pct/v11/dmpUsers113.p";
    }

    public String getLoadUsersProcedure() {
        return "pct/v11/loadUsers113.p";
    }

    public String getLoadSchemaProcedure() {
        return "pct/v11/loadSch.p";
    }

}
