/**    / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javax.util.function;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import javaslang.CheckedFunction1;

@FunctionalInterface
public interface CheckedByteUnaryOperator extends CheckedFunction1<Byte, Byte> {

    static final long serialVersionUID = 1L;

    byte applyAsByte(byte value) throws Throwable;

    @Override
    default Byte apply(Byte value) throws Throwable {
        return applyAsByte(value);
    }

    static ByteUnaryOperator identity() {
        return v -> v;
    }
}