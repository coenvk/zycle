package com.coenvk.android.zycle.ktx

import com.coenvk.android.zycle.condition.Condition
import com.coenvk.android.zycle.condition.observer.Observer

operator fun Condition.plusAssign(observer: Observer) =
    registerObserver(observer)

operator fun Condition.minusAssign(observer: Observer) =
    registerObserver(observer)