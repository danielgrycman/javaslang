/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javax.util.function;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import javaslang.CheckedFunction2;

@FunctionalInterface
public interface CheckedShortObjPredicate<U> extends CheckedFunction2<Short, U, Boolean> {

    static final long serialVersionUID = 1L;

    boolean test(short value, U u) throws Throwable;

    @Override
    default Boolean apply(Short value, U u) throws Throwable {
        return test(value, u);
    }

}