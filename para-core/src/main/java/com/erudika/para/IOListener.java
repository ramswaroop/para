/*
 * Copyright 2013-2016 Erudika. http://erudika.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For issues and patches go to: https://github.com/erudika
 */
package com.erudika.para;

import java.lang.reflect.Method;

/**
 * Called after an object is created/read/updated/deleted by the {@link com.erudika.para.persistence.DAO}.
 * @author Alex Bogdanovski [alex@erudika.com]
 */
public interface IOListener {

	/**
	 * Called after an I/O (CRUD) operation has occurred.
	 * @param method the method which was invoked before this
	 * @param result the result of the IO operation
	 */
	void onInvoke(Method method, Object result);

}