package com.darkos.depend

class Depend(
    val method: String,
    val depend: String
) {
    constructor(
        method: String,
        depend: IDepend
    ) : this(method, depend.full)
}