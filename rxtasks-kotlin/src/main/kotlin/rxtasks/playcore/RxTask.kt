@file:Suppress("NOTHING_TO_INLINE")

package rxtasks.playcore

import com.google.android.play.core.tasks.Task
import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Single

inline fun <T> Task<T>.completes()
        : Completable
        = RxTask.completes { this }

inline fun <T> Task<T>.single()
        : Single<T>
        = RxTask.single { this }

inline fun <T> Task<T>.maybe()
        : Maybe<T>
        = RxTask.maybe { this }

